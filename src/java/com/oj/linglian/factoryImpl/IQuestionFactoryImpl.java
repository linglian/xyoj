/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.factoryImpl;

import util.ServletUtil;
import com.oj.linglian.entity.Question;
import com.oj.linglian.entity.User;
import com.oj.linglian.factory.IServletFactory;
import com.oj.linglian.service.IQuestionService;
import com.oj.linglian.serviceImpl.IQuestionServiceImpl;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.ServletCheckBuilder;

/**
 *
 * @author lol
 */
public class IQuestionFactoryImpl implements IServletFactory {

    IQuestionService qis = null;
    private static long time = new Date().getTime();
    private static int size = 0;
    private static long speedTime = 1000;

    public IQuestionFactoryImpl() {
        qis = new IQuestionServiceImpl();
    }

    public static long getTime() {
        return time;
    }

    public static void setTime(long time) {
        IQuestionFactoryImpl.time = time;
    }

    public static long getSpeedTime() {
        return speedTime;
    }

    public static void setSpeedTime(long speedTime) {
        IQuestionFactoryImpl.speedTime = speedTime;
    }

    @Override
    public void doThing(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet, String factoryName) throws ServletException, IOException {
        if ("getAll".equals(factoryName)) {
            this.doGetAll(request, response, servlet);
        } else if ("getList".equals(factoryName)) {
            this.doGetList(request, response, servlet);
        } else if ("get".equals(factoryName)) {
            this.doGet(request, response, servlet);
        } else if ("chose".equals(factoryName)) {
            this.doChose(request, response, servlet);
        }
    }

    /**
     * 选择题目
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException 
     */
    public void doChose(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "get_from")
                .addNp("questionId", "问题编号不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            String qid = request.getParameter("questionId");
            Question q = qis.getQuestionOfQuestionId(qid);
            if (q == null || Long.parseLong(q.getEndTime()) - new Date().getTime() <= 0) {
                request.getSession().removeAttribute("question");
                request.getSession().setAttribute("info", "No. " + q.getQuestionId() + " " + q.getTitle() + "已经不能挑战了");
                ServletUtil.redirect(request, response, "QuestionAction?method=getList");
            } else {
                User user = (User) request.getSession().getAttribute("identity");
                user.setLastQuestionId(qid);
                request.getSession().setAttribute("question", q);
                request.getSession().setAttribute("info", "选择成功！");
                ServletUtil.redirect(request, response, "index.jsp");
            }
        }
    }

    /**
     * 获取题目详情
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException 
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "get_from")
                .addNp("questionId", "问题编号不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            String qid = request.getParameter("questionId");
            request.getSession().setAttribute("showQuestion", qis.getQuestionOfQuestionId(qid));
            ServletUtil.forward(request, response, servlet, "get_from");
        }
    }

    /**
     * 获取全部题目
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException 
     */
    public void doGetAll(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws ServletException, IOException {
        if (new Date().getTime() - time >= speedTime || request.getServletContext().getAttribute("questionList") == null) {
            request.getServletContext().setAttribute("questionList", qis.getQuestions(new Question()));
            List t = (List) request.getServletContext().getAttribute("questionList");
            size = t.size();
            time = new Date().getTime();
        }
    }

    /**
     * 获取分页题目
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException 
     */
    public void doGetList(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws ServletException, IOException {
        this.doGetAll(request, response, servlet);
        int limit = 10;
        int page = 1;
        // 设置每页显示数量
        if ("".equals(request.getParameter("questionLimit"))) {
            request.setAttribute("questionLimit", "10");
        } else {
            try {
                limit = Integer.parseInt(request.getParameter("questionLimit"));
            } catch (Exception e) {

            }
            request.getSession().setAttribute("questionLimit", limit);
        }
        // 设置当前页面
        if ("".equals(request.getParameter("questionPage"))) {
            request.setAttribute("questionPage", "1");
        } else {
            try {
                page = Integer.parseInt(request.getParameter("questionPage"));
                page = Math.min(page, size / limit + 1);
            } catch (Exception e) {

            }
            request.getSession().setAttribute("questionPage", page);
        }
        ServletUtil.forward(request, response, servlet, "getList_to");
    }
}
