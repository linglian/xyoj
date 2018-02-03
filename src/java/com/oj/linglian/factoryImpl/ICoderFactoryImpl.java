/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.factoryImpl;

import util.ServletUtil;
import com.oj.linglian.OJ.XYOJQueue;
import com.oj.linglian.entity.Coder;
import com.oj.linglian.entity.Question;
import com.oj.linglian.entity.Status;
import com.oj.linglian.entity.User;
import com.oj.linglian.factory.IServletFactory;
import com.oj.linglian.service.ICoderService;
import com.oj.linglian.service.IQuestionService;
import com.oj.linglian.service.IStatusService;
import com.oj.linglian.service.IUserService;
import com.oj.linglian.serviceImpl.ICoderServiceImpl;
import com.oj.linglian.serviceImpl.IQuestionServiceImpl;
import com.oj.linglian.serviceImpl.IStatusServiceImpl;
import com.oj.linglian.serviceImpl.IUserServiceImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.ServletCheckBuilder;
import util.StringUtil;

/**
 *
 * @author lol
 */
public class ICoderFactoryImpl implements IServletFactory {

    IQuestionService qis = null;
    ICoderService ics = null;
    IUserService ius = null;
    private static long time = new Date().getTime();
    private static int size = 0;
    private static long speedTime = 1000;

    public ICoderFactoryImpl() {
        qis = new IQuestionServiceImpl();
        ics = new ICoderServiceImpl();
        ius = new IUserServiceImpl();
    }

    public static long getTime() {
        return time;
    }

    public static void setTime(long time) {
        ICoderFactoryImpl.time = time;
    }

    public static long getSpeedTime() {
        return speedTime;
    }

    public static void setSpeedTime(long speedTime) {
        ICoderFactoryImpl.speedTime = speedTime;
    }

    @Override
    public void doThing(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet, String factoryName) throws ServletException, IOException {
        if ("getAllList".equals(factoryName)) {
            this.doGetList(request, response, servlet);
        } else if ("get".equals(factoryName)) {
            this.doGet(request, response, servlet);
        } else if ("push".equals(factoryName)) {
            this.doPush(request, response, servlet);
        }
    }

    /**
     * 提交代码
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    public void doPush(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "push_from")
                .addNp("codes", "代码不能为空")
                .addNs("question", "问题不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            String codes = tMap.get("par_codes").toString();
            Question q = (Question) request.getSession().getAttribute("question");
            q = qis.getQuestionOfQuestionId(q.getQuestionId());
            User user = (User) request.getSession().getAttribute("identity");
            Coder coder = new Coder();
            coder.setUserId(user.getUserId());
            coder.setQuestionId(q.getQuestionId());
            coder.setCode(codes);
            coder.setTime(String.valueOf(new Date().getTime()));
            coder.setStatus("0");
            if (ics.insert(coder) == 0) {
                System.out.println("Insert---" + coder + "更新失败");
            }
            user.setLastCode(codes);
            user.setLastQuestionId(q.getQuestionId());
            if (ius.updateOfUserId(user, user.getUserId()) == 0) {
                System.out.println("Push---" + user + "更新失败");
            }
            q.setMainPeople(StringUtil.addInt(q.getMainPeople(), "1"));
            if (qis.updateOfQuestionId(q, q.getQuestionId()) == 0) {
                System.out.println("Push---" + q + "更新失败");
            }
            ServletUtil.redirect(request, response, "CoderAction?method=getAllList");
        }
    }

    /**
     * 根据编号获取代码
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "get_from")
                .addNp("coderId", "代码编号不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            String cid = request.getParameter("coderId");
            Coder c = ics.getCoderOfCoderId(cid);
            User user = (User) tMap.get("ses_identity");
            Question q = qis.getQuestionOfQuestionId(c.getQuestionId());
            if (user.getUserId().equals(c.getUserId()) || StringUtil.isSmallLong(q.getEndTime(), String.valueOf(new Date().getTime()))) {
                request.getSession().setAttribute("coder", c);
                request.getSession().setAttribute("showQuestion", q);
                ServletUtil.forward(request, response, servlet, "get_to");
            } else {
                request.getSession().setAttribute("info", "现在还不能查看别人代码");
                ServletUtil.forward(request, response, servlet, "get_from");
            }
        }
    }

    /**
     * 获取全部代码
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    public void doGetAll(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws ServletException, IOException {
        if (new Date().getTime() - time >= speedTime || request.getServletContext().getAttribute("coderList") == null) {
            request.getServletContext().setAttribute("coderList", ics.getCoders(new Coder()));
            List t = (List) request.getServletContext().getAttribute("coderList");
            size = t.size();
            time = new Date().getTime();
            IStatusService iss = new IStatusServiceImpl();
            List<Status> tList = new ArrayList();
            for (int i = -6; i < 3; i++) {
                tList.add(iss.getStatusOfStatusId(String.valueOf(i)));
            }
            request.getServletContext().setAttribute("coderStatus", tList);
        }
    }

    /**
     * 获取分页代码
     *
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
        if ("".equals(request.getParameter("coderLimit"))) {
            request.setAttribute("coderLimit", "10");
        } else {
            try {
                limit = Integer.parseInt(request.getParameter("coderLimit"));
            } catch (Exception e) {

            }
            request.getSession().setAttribute("coderLimit", limit);
        }
        if ("".equals(request.getParameter("coderPage"))) {
            request.setAttribute("coderPage", "1");
        } else {
            try {
                page = Integer.parseInt(request.getParameter("coderPage"));
                page = Math.min(page, size / limit + 1);
            } catch (Exception e) {

            }
            request.getSession().setAttribute("coderPage", page);
        }
        ServletUtil.forward(request, response, servlet, "getList_to");
    }
}
