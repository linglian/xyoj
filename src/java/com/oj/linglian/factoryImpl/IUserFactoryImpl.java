/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.factoryImpl;

import com.oj.linglian.entity.Coder;
import com.oj.linglian.entity.Status;
import util.ServletUtil;
import com.oj.linglian.entity.User;
import com.oj.linglian.factory.IServletFactory;
import com.oj.linglian.service.ICoderService;
import com.oj.linglian.service.IStatusService;
import com.oj.linglian.service.IUserService;
import com.oj.linglian.serviceImpl.ICoderServiceImpl;
import com.oj.linglian.serviceImpl.IStatusServiceImpl;
import com.oj.linglian.serviceImpl.IUserServiceImpl;
import db.DBUtil;
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

/**
 *
 * @author lol
 */
public class IUserFactoryImpl implements IServletFactory {

    IUserService ius = new IUserServiceImpl();
    ICoderService ics = new ICoderServiceImpl();

    @Override
    public void doThing(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet, String factoryName) throws ServletException, IOException {
        if ("login".equals(factoryName)) {
            this.doLogin(request, response, servlet);
        } else if ("get".equals(factoryName)) {
            this.doGet(request, response, servlet);
        } else if ("logout".equals(factoryName)) {
            this.doLogout(request, response, servlet);
        }
    }

    protected void doLogout(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "login_from")
                .addNs("identity", "请重新登录")
                .build();
        if (tMap != null) {
            request.getSession().removeAttribute("identity");
            request.getSession().setAttribute("info", "退出成功");
            ServletUtil.redirect(request, response, servlet, "login_from");
        }
    }
     protected void doGet(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "login_from")
                .addNp("userId", "用户编号不能为空")
                .addNs("identity", "请重新登录")
                .build();
        if (tMap != null) {
            int page = 1;
            int limit = 10;

            User user = ius.getUserOfUserId(tMap.get("par_userId").toString());
            request.getSession().setAttribute("user", user);
            Coder c = new Coder();
            c.setUserId(user.getUserId());
            List<Coder> l = ics.getCoders(c);
            int size = l.size();
            request.getSession().setAttribute("coderSize", size);
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
            List<Coder> list = DBUtil.getObjectLimit("coder", "coderId", c, (page - 1) * limit, limit);
            if (list != null && list.size() == 0) {
                list = null;
            }
            request.getSession().setAttribute("coders", list);
            String qStr = user.getPassQuestions();
            String[] strs = null;
            if (qStr != null) {
                strs = qStr.split(",");
            }
            request.getSession().setAttribute("questions", strs);
            ServletUtil.forward(request, response, "userInfo.jsp");
        }
    }

    /**
     * 登录
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doLogin(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "login_from")
                .addNp("userId", "用户编号不能为空")
                .addNp("password", "密码不能为空")
                .build();
        if (tMap != null) {
            String userId = request.getParameter("userId");
            String password = request.getParameter("password");
            User user = ius.getUserOfUserIdAndPassword(userId, password);
            if (user == null) {
                request.getSession().setAttribute("info", "账号或者密码错误!");
                ServletUtil.redirect(request, response, servlet, "login_from");
            } else {
                request.getSession().setAttribute("identity", user);
                request.getSession().setAttribute("info", "登录成功!");
                ServletUtil.redirect(request, response, servlet, "login_to");
            }
        }
    }

}
