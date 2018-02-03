/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.OJ;

import com.oj.linglian.entity.Coder;
import com.oj.linglian.entity.Checker;
import com.oj.linglian.entity.CoderBuilder;
import com.oj.linglian.entity.Contest;
import com.oj.linglian.entity.Question;
import com.oj.linglian.entity.Rank;
import com.oj.linglian.entity.User;
import com.oj.linglian.service.ICoderService;
import com.oj.linglian.service.ICheckerService;
import com.oj.linglian.service.IContestService;
import com.oj.linglian.service.IQuestionService;
import com.oj.linglian.service.IRankService;
import com.oj.linglian.service.IUserService;
import com.oj.linglian.serviceImpl.ICoderServiceImpl;
import com.oj.linglian.serviceImpl.ICheckerServiceImpl;
import com.oj.linglian.serviceImpl.IContestServiceImpl;
import com.oj.linglian.serviceImpl.IQuestionServiceImpl;
import com.oj.linglian.serviceImpl.IRankServiceImpl;
import com.oj.linglian.serviceImpl.IUserServiceImpl;
import db.DBUtil;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import util.StringUtil;

/**
 *
 * @author lol
 */
public final class XYOJQueue extends Thread {

    private List<Coder> list;
    private AtomicInteger now;
    ICoderService ics = null;

    private static XYOJQueue ins = null;

    public static XYOJQueue getInstance() {
        if (ins == null) {
            ins = new XYOJQueue();
        }
        return ins;
    }

    private XYOJQueue() {
        list = new LinkedList();
        now = new AtomicInteger();
        ics = new ICoderServiceImpl();
        this.start();
    }

    public Object[] getCoders() {
        return list.toArray();
    }

    public synchronized void push(Coder coder) {
        list.add(coder);
    }

    public void clear() {
        this.list.clear();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            while (now.get() < list.size()) {
                List<Coder> tempList = this.list;
                Coder coder = tempList.get(now.get());
                if (coder.getCoderId() == null || (coder.getStatus() != null && !"0".equals(coder.getStatus()))) {
                    break;
                }
                ICheckerService iiaus = new ICheckerServiceImpl();
                List<Checker> qList = iiaus.getCheckersOfQuestionId(coder.getQuestionId());
                if (!ics.getCoderOfCoderId(coder.getCoderId()).getStatus().equals("0")) {
                    continue;
                }
                coder = XYOJ.getIns().getResult(new CoderBuilder(coder), qList, new Date().getTime()).build();
                if (!ics.getCoderOfCoderId(coder.getCoderId()).getStatus().equals("0")) {
                    continue;
                }
                // 如果代码结果正确，则执行
                if ("1".equals(coder.getStatus())) {
                    // 更新代码状态，防止重复处理
                    ics.updateOfCoderId(coder, coder.getCoderId());
                    // 初始化Service
                    IUserService ius = new IUserServiceImpl();
                    IQuestionService iqs = new IQuestionServiceImpl();
                    IRankService irs = new IRankServiceImpl();
                    IContestService ics = new IContestServiceImpl();
                    // 获得用户、题
                    User user = ius.getUserOfUserId(coder.getUserId());
                    Question q = iqs.getQuestionOfQuestionId(coder.getQuestionId());
                    Map<String, String> passQMap = new HashMap();
                    // 判断是否为空
                    if (user.getPassQuestions() == null || "".equals(user.getPassQuestions())) {
                        user.setPassQuestions(coder.getQuestionId());
                        user.setScore(StringUtil.addInt(user.getScore(), q.getScore()));
                    } else {
                        // 将用户通过的题目id提取出来
                        String[] passQ = user.getPassQuestions().split(",");
                        for (String str : passQ) {
                            passQMap.put(str, str);
                        }
                        // 判断是否做过
                        if (!passQMap.containsKey(q.getQuestionId())) {
                            user.setPassQuestions(user.getPassQuestions() + "," + coder.getQuestionId());
                            user.setScore(StringUtil.addInt(user.getScore(), q.getScore()));
                        }
                    }
                    // 判断第一个通过的
                    if (q.getUserId() == null || "".equals(q.getUserId())) {
                        q.setUserId(user.getUserId());
                    }
                    // 判断是否是比赛题
                    if (q.getContestId() != null && !"".equals(q.getContestId())) {
                        Contest contest = ics.getContestOfContestId(q.getContestId());
                        Rank r = irs.getRankOfContestIdAndUserId(q.getContestId(), user.getUserId());
                        // 判断该用户是否第一次参加该比赛并成功作对一道题
                        if (r == null) {
                            r = new Rank();
                            r.setContestId(q.getContestId());
                            r.setUserId(user.getUserId());
                            r.setTime("0");
                            r.setScore("0");
                            // 计算分值
                            r.setTime(StringUtil.addLong(r.getTime(), StringUtil.subLong(coder.getStartTime(), contest.getStartTime())));
                            r.setScore(StringUtil.addInt(r.getScore(), q.getScore()));
                            r.setPass(q.getQuestionId());
                            irs.insert(r);
                        } else if (!passQMap.containsKey(q.getQuestionId())) {
                            // 计算分值
                            r = irs.getRankOfContestIdAndUserId(q.getContestId(), user.getUserId());
                            r.setTime(StringUtil.addLong(r.getTime(), StringUtil.subLong(coder.getStartTime(), contest.getStartTime())));
                            r.setScore(StringUtil.addInt(r.getScore(), q.getScore()));
                            r.setPass(r.getPass() + "," + q.getQuestionId());
                            irs.updateOfRankId(r, r.getRankId());
                        }
                    }
                    // 加分和更新
                    ius.updateOfUserId(user, user.getUserId());
                    q.setRightPeople(StringUtil.addInt(q.getRightPeople(), "1"));
                    if (iqs.updateOfQuestionId(q, q.getQuestionId()) == 0) {
                        System.out.println(q + "\n更新失败");
                    }
                }
                if (ics.updateOfCoderId(coder, coder.getCoderId()) == 0) {
                    System.out.println(coder + "\n更新失败");
                }
                now.addAndGet(1);
            }
            Coder coder = new Coder();
            coder.setStatus("0");
            now.set(0);
            list = DBUtil.getObjectLimit("coder", "coderId", coder, 0, 100);
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        String s = "123,124,125,126";
        String[] t = s.split(",");
        for (String st : t) {
            System.out.println(st);
        }
        /*
         final String code = "#include<iostream> \n"
         + "#include<string>\n"
         + "\n"
         + "using namespace std;\n"
         + "\n"
         + "int main() {\n"
         + "    int ss = 5;\n"
         + "    cout << ss + 10 << endl;\n"
         + "    return 0;\n"
         + "}";
         final XYOJQueue q = new XYOJQueue();
         Runnable b = new Runnable() {

         @Override
         public void run() {
         q.push(new Coder.CoderBuilder().setCode(code).setTime(String.valueOf(new Date().getTime())).build());
         }

         };
         for (int i = 0; i < 5; i++) {
         Thread t = new Thread(b);
         t.start();
         }
         Thread.sleep(10000);
         System.out.println(q.list);
         */
    }

}
