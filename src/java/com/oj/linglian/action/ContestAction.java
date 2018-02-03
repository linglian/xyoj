/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.action;

import com.oj.linglian.factory.IServletFactory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.ServletUtil;

/**
 *
 * @author lol
 */
@WebServlet(name = "ContestAction", urlPatterns = {"/ContestAction"}, initParams = {
    @WebInitParam(name = "action_factory", value = "com.oj.linglian.factoryImpl.IContestFactoryImpl"),
    @WebInitParam(name = "getList_from", value = "index.jsp"),
    @WebInitParam(name = "getList_to", value = "contestList.jsp"),
    @WebInitParam(name = "push_from", value = "pushContest.jsp"),
    @WebInitParam(name = "push_to", value = "coderList.jsp"),
    @WebInitParam(name = "get_from", value = "ContestAction?method=getAllList"),
    @WebInitParam(name = "get_to", value = "contest.jsp"),
    @WebInitParam(name = "login_from", value = "login.jsp"),
    @WebInitParam(name = "login_to", value = "index.jsp")})
public class ContestAction extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            if (request.getSession().getAttribute("identity") == null) {
                request.getSession().setAttribute("info", "请先登录！");
                ServletUtil.redirect(request, response, "login.jsp");
                return;
            }
            String method = request.getParameter("method");
            IServletFactory isf;
            isf = (IServletFactory) Class.forName(
                    this.getServletConfig().getInitParameter("action_factory"))
                    .newInstance();
            isf.doThing(request, response, this, method);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
