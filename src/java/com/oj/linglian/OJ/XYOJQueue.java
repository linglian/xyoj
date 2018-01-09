/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.OJ;

import com.oj.linglian.entity.Coder;
import com.oj.linglian.entity.Question;
import com.oj.linglian.entity.User;
import com.oj.linglian.service.ICoderService;
import com.oj.linglian.service.IQuestionService;
import com.oj.linglian.service.IUserService;
import com.oj.linglian.serviceImpl.ICoderServiceImpl;
import com.oj.linglian.serviceImpl.IQuestionServiceImpl;
import com.oj.linglian.serviceImpl.IUserServiceImpl;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
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

    public synchronized void setList(List<Coder> list) {
        this.now.set(0);
        this.list = list;
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
                    now.set(tempList.size());
                    break;
                }
                coder = XYOJ.getIns().getResult(new Coder.CoderBuilder(coder), null, new Date().getTime()).build();
                if ("1".equals(coder.getStatus())) {
                    IUserService ius = new IUserServiceImpl();
                    User user = ius.queryUser(coder.getUserId());
                    if (user.getPassQuestions() == null) {
                        user.setPassQuestions(coder.getQuestionId());
                        IQuestionService iqs = new IQuestionServiceImpl();
                        Question q = iqs.queryQuestion(coder.getQuestionId());
                        user.setScore(StringUtil.addInt(user.getScore(), q.getScore()));
                        ius.updateUser(user);
                    } else {
                        String[] passQ = user.getPassQuestions().split(",");
                        boolean isHas = false;
                        for (String str : passQ) {
                            if (str.equals(coder.getQuestionId())) {
                                isHas = true;
                                break;
                            }
                        }
                        if (!isHas) {
                            user.setPassQuestions(user.getPassQuestions() + "," + coder.getQuestionId());
                            IQuestionService iqs = new IQuestionServiceImpl();
                            Question q = iqs.queryQuestion(coder.getQuestionId());
                            user.setScore(StringUtil.addInt(user.getScore(), q.getScore()));
                            ius.updateUser(user);
                            q.setRightPeople(StringUtil.addInt(q.getRightPeople(), "1"));
                            if (iqs.updateQuestion(q) == 0) {
                                System.out.println(q + "\n更新失败");
                            }
                        }
                    }
                }
                if (ics.updateCoder(coder) == 0) {
                    System.out.println(coder + "\n更新失败");
                }
                now.addAndGet(1);
            }
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
