/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.factoryImpl;

import com.linglian.util.ServletUtil;
import com.oj.linglian.entity.User;
import com.oj.linglian.factory.IServletFactory;
import com.oj.linglian.service.IUserService;
import com.oj.linglian.serviceImpl.IUserServiceImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lol
 */
public class IUserFactoryImpl implements IServletFactory {

    @Override
    public void doThing(HttpServletRequest request, HttpServletResponse response, HttpServlet serlvet, String factoryName) throws ServletException, IOException {
        if ("login".equals(factoryName)) {
            this.doLogin(request, response, serlvet);
        }
    }

    protected void doLogin(HttpServletRequest request,
            HttpServletResponse response, HttpServlet serlvet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        System.out.println(userId);
        if ("".equals(userId)) {
            request.getSession().setAttribute("info", "账号不能为空!");
            ServletUtil.redirect(request, response, serlvet, "login_from");
        } else if ("".equals(password)) {
            request.getSession().setAttribute("info", "密码不能为空!");
            ServletUtil.redirect(request, response, serlvet, "login_from");
        } else {
            IUserService ius = new IUserServiceImpl();
            User user = ius.queryUser(userId, password);
            if (user == null) {
                request.getSession().setAttribute("info", "账号或者密码错误!");
                ServletUtil.redirect(request, response, serlvet, "login_from");
            } else {
                request.getSession().setAttribute("identity", user);
                request.getSession().setAttribute("info", "登录成功!");
                ServletUtil.redirect(request, response, serlvet, "login_to");
            }
        }
    }

}
