/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.factoryImpl;

import com.linglian.util.ServletUtil;
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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    public void doThing(HttpServletRequest request, HttpServletResponse response, HttpServlet serlvet, String factoryName) throws ServletException, IOException {
        if ("getAllList".equals(factoryName)) {
            this.doGetList(request, response, serlvet);
        } else if ("get".equals(factoryName)) {
            this.doGet(request, response, serlvet);
        } else if ("push".equals(factoryName)) {
            this.doPush(request, response, serlvet);
        }
    }

    public void doPush(HttpServletRequest request, HttpServletResponse response, HttpServlet serlvet) throws ServletException, IOException {
        String codes = request.getParameter("codes");
        if (codes == null || "".equals(codes)) {
            request.getSession().setAttribute("info", "代码不能为空！");
            ServletUtil.redirect(request, response, "index.jsp");
        } else {
            Question q = (Question) request.getSession().getAttribute("question");
            User user = (User) request.getSession().getAttribute("identity");
            Coder coder = new Coder.CoderBuilder()
                    .setUserId(user.getUserId())
                    .setQuestionId(q.getQuestionId())
                    .setCode(codes)
                    .setTime(String.valueOf(new Date().getTime()))
                    .setStatus("0")
                    .build();
            if (ics.insertCoder(coder) == 0) {
                System.out.println("Insert---" + coder + "更新失败");
            }
            user.setLastCode(codes);
            user.setLastQuestionId(q.getQuestionId());
            if (ius.updateUser(user) == 0) {
                System.out.println("Push---" + user + "更新失败");
            }
            XYOJQueue.getInstance().push(coder);
            q.setMainPeople(StringUtil.addInt(q.getMainPeople(), "1"));
            if (qis.updateQuestion(q) == 0) {
                System.out.println("Push---" + q + "更新失败");
            }
            ServletUtil.redirect(request, response, "CoderAction?method=getAllList");
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response, HttpServlet serlvet) throws ServletException, IOException {
        String cid = request.getParameter("coderId");
        if ("".equals(cid)) {
            request.getSession().removeAttribute("coder");
            request.getSession().setAttribute("info", "非法操作");
            ServletUtil.redirect(request, response, "CoderAction?method=getAllList");
        } else {
            Coder c = ics.queryCoderById(cid);
            request.getSession().setAttribute("coder", c);
            request.getSession().setAttribute("showQuestion", qis.queryQuestion(c.getQuestionId()));
            ServletUtil.forward(request, response, "coder.jsp");
        }
    }

    public void doGetAll(HttpServletRequest request, HttpServletResponse response, HttpServlet serlvet) throws ServletException, IOException {
        if (new Date().getTime() - time >= speedTime || request.getServletContext().getAttribute("coderList") == null) {
            request.getServletContext().setAttribute("coderList", ics.queryAllCoder());
            List t = (List) request.getServletContext().getAttribute("coderList");
            size = t.size();
            time = new Date().getTime();
            IStatusService iss = new IStatusServiceImpl();
            List<Status> tList = new ArrayList();
            for (int i = -6; i < 3; i++) {
                tList.add(iss.getStatus(String.valueOf(i)));
            }
            request.getServletContext().setAttribute("coderStatus", tList);
        }
    }

    public void doGetList(HttpServletRequest request, HttpServletResponse response, HttpServlet serlvet) throws ServletException, IOException {
        this.doGetAll(request, response, serlvet);
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
        ServletUtil.forward(request, response, serlvet, "getList_to");
    }
}
