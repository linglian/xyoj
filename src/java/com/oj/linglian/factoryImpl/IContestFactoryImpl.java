/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.factoryImpl;

import com.oj.linglian.entity.Checker;
import com.oj.linglian.entity.Contest;
import com.oj.linglian.entity.Question;
import com.oj.linglian.entity.Rank;
import com.oj.linglian.entity.User;
import com.oj.linglian.factory.IServletFactory;
import com.oj.linglian.service.ICheckerService;
import com.oj.linglian.service.IContestService;
import com.oj.linglian.service.IQuestionService;
import com.oj.linglian.service.IRankService;
import com.oj.linglian.serviceImpl.ICheckerServiceImpl;
import com.oj.linglian.serviceImpl.IContestServiceImpl;
import com.oj.linglian.serviceImpl.IQuestionServiceImpl;
import com.oj.linglian.serviceImpl.IRankServiceImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.MapUtil;
import util.ServletCheckBuilder;
import util.ServletUtil;
import util.StringUtil;

/**
 *
 * @author lol
 */
public class IContestFactoryImpl implements IServletFactory {

    ICheckerService icrs = new ICheckerServiceImpl();
    IContestService ics = new IContestServiceImpl();
    IQuestionService iqs = new IQuestionServiceImpl();
    IRankService irs = new IRankServiceImpl();

    @Override
    public void doThing(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet, String method) throws ServletException, IOException {
        if ("getAllList".equals(method)) {
            this.doGetList(request, response, servlet);
        } else if ("get".equals(method)) {
            this.doGet(request, response, servlet);
        } else if ("push".equals(method)) {
            this.doPush(request, response, servlet);
        }
    }

    public void doPush(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "push_from")
                .addNp("title", "标题不能为空")
                .addNp("body", "介绍不能为空")
                .addNp("qNumber", "题目数量不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            if ("-99".equals(user.getLvl())) {
                Map<String, String> m = MapUtil.soss(tMap);
                Contest c = new Contest();
                c.setTitle(m.get("par_title"));
                c.setBody(m.get("par_body"));
                // 获取限制时间
                if (request.getParameter("isSetTime") != null) {
                    c.setStartTime(request.getParameter("startTime"));
                    c.setEndTime(request.getParameter("endTime"));
                } else {
                    c.setStartTime("0");
                    c.setEndTime(String.valueOf(Long.MAX_VALUE));
                }
                // 更新，并获取id
                ics.insert(c);
                c = ics.getContest(c);
                // 获取题目列表
                int n = Integer.parseInt(m.get("par_qNumber"));
                List<Question> list = new ArrayList();
                for (int i = 0; i < n; i++) {
                    String q = request.getParameter("question_" + String.valueOf(i));
                    Question question = iqs.getQuestionOfQuestionId(q);
                    List<Checker> cList = icrs.getCheckersOfQuestionId(question.getQuestionId());
                    question.setQuestionId(null);
                    question.setStartTime(c.getStartTime());
                    question.setEndTime(c.getEndTime());
                    question.setContestId(c.getContestId());
                    iqs.insert(question);
                    question = iqs.getQuestion(question);
                    for (Checker cr : cList) {
                        cr.setCheckerId(null);
                        cr.setQuestionId(question.getQuestionId());
                        icrs.insert(cr);
                    }
                    list.add(question);
                }
                String questions = "";
                for (Question q : list) {
                    if ("".equals(questions)) {
                        questions = q.getQuestionId();
                    } else {
                        questions += "," + q.getQuestionId();
                    }
                }
                c.setQuestionIds(questions);
                ics.updateOfContestId(c, c.getContestId());
                request.getSession().setAttribute("info", "举办成功!");
                ServletUtil.redirect(request, response, servlet, "getList_to");
            } else {
                request.getSession().setAttribute("info", "权限不足!");
                ServletUtil.redirect(request, response, servlet, "login_from");
            }
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "get_from")
                .addNp("contestId", "比赛编号不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            String qid = request.getParameter("questionId");
            Contest c = ics.getContestOfContestId(tMap.get("par_contestId").toString());
            if (StringUtil.isSmallLong(c.getEndTime(), String.valueOf(new Date().getTime()))) {
                request.getSession().setAttribute("info", "竞赛已经结束");
                ServletUtil.forward(request, response, servlet, "get_from");
            } else {
                List<Rank> list = irs.getRanksOfContestId(c.getContestId());
                request.getSession().setAttribute("contestRank", list);
                request.getSession().setAttribute("contest", c);
                ServletUtil.forward(request, response, servlet, "get_to");
            }
        }
    }

    public void doGetList(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet) throws ServletException, IOException {
        int limit = 10;
        int page = 1;
        int size = ics.getContests(new Contest()).size();
        request.getSession().setAttribute("contestLimit", limit);
        if ("".equals(request.getParameter("contestLimit"))) {
            request.setAttribute("contestLimit", "10");
        } else {
            try {
                limit = Integer.parseInt(request.getParameter("contestLimit"));
            } catch (Exception e) {

            }
            request.getSession().setAttribute("contestLimit", limit);
        }
        if ("".equals(request.getParameter("contestPage"))) {
            request.setAttribute("contestPage", "1");
        } else {
            try {
                page = Integer.parseInt(request.getParameter("contestPage"));
                page = Math.min(page, size / limit + 1);
            } catch (Exception e) {

            }
            request.getSession().setAttribute("contestPage", page);
        }
        ServletUtil.forward(request, response, servlet, "getList_to");
    }
}
