/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.factoryImpl;

import util.ServletUtil;
import com.oj.linglian.entity.User;
import com.oj.linglian.factory.IServletFactory;
import com.oj.linglian.service.IUserService;
import com.oj.linglian.serviceImpl.IUserServiceImpl;
import java.io.IOException;
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

    @Override
    public void doThing(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet, String factoryName) throws ServletException, IOException {
        if ("login".equals(factoryName)) {
            this.doLogin(request, response, servlet);
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
            IUserService ius = new IUserServiceImpl();
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
