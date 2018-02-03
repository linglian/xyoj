/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import com.oj.linglian.entity.Coder;
import com.oj.linglian.entity.Contest;
import com.oj.linglian.entity.Question;
import com.oj.linglian.entity.Status;
import com.oj.linglian.entity.User;
import com.oj.linglian.service.IContestService;
import com.oj.linglian.service.IQuestionService;
import com.oj.linglian.service.IStatusService;
import com.oj.linglian.service.IUserService;
import com.oj.linglian.serviceImpl.IContestServiceImpl;
import com.oj.linglian.serviceImpl.IQuestionServiceImpl;
import com.oj.linglian.serviceImpl.IStatusServiceImpl;
import com.oj.linglian.serviceImpl.IUserServiceImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lol
 */
public class ContextFilter implements Filter {

    private static long time = new Date().getTime();
    private static long speedTime = 1000;

    @Override
    public void init(FilterConfig fc) throws ServletException {

    }

    public void getAll(HttpServletRequest request) {
        if (new Date().getTime() - time >= speedTime) {
            // 获取所有用户
            IUserService ius = new IUserServiceImpl();
            List<User> list = ius.getUsers(new User());
            Map<String, User> m = new HashMap();
            if (list != null) {
                for (User u : list) {
                    m.put(u.getUserId(), u);
                }
            }
            request.getServletContext().setAttribute("userMap", m);
            // 获取所有题目
            IQuestionService iqs = new IQuestionServiceImpl();
            List<Question> qList = iqs.getQuestions(new Question());
            Map<String, Question> qm = new HashMap();
            if (qList != null) {
                for (Question q : qList) {
                    qm.put(q.getQuestionId(), q);
                }
            }
            request.getServletContext().setAttribute("questionMap", qm);
            // 获得所有竞赛(List和Map形式)
            IContestService ics = new IContestServiceImpl();
            List<Contest> cList = ics.getContests(new Contest());
            Map<String, Contest> cm = new HashMap();
            Map<String, List<String> > cmm = new HashMap();
            if (cList != null) {
                for (Contest c : cList) {
                    cm.put(c.getContestId(), c);
                    String[] strs = new String[0];
                    if (c.getQuestionIds() != null) {
                        strs = c.getQuestionIds().split(",");
                    }
                    List<String> sList = new ArrayList();
                    for (String s : strs) {
                        sList.add(s);
                    }
                    cmm.put(c.getContestId(), sList);
                }
            }
            request.getServletContext().setAttribute("contestList", cList);
            request.getServletContext().setAttribute("contestMap", cm);
            request.getServletContext().setAttribute("CQMap", cmm);
        }
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        request.getSession().setAttribute("date", new Date().getTime());
        getAll(request);
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        req.setAttribute("date", new Date().getTime());
        resp.setContentType("text/html; charset=UTF-8");
        
        fc.doFilter(req, resp);
    }

    @Override
    public void destroy() {

    }

}
