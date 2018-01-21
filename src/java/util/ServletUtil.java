package util;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;

public class ServletUtil {

    private ServletUtil() {

    }

    /**
     * 转发（forward）给指定页面
     *
     * @param request
     * @param response
     * @param page
     * @throws ServletException
     * @throws IOException
     */
    public static void forward(HttpServletRequest request,
            HttpServletResponse response, String page) throws ServletException,
            IOException {
        System.out.println(request.getServletPath() + "转发到" + page);
        request.getRequestDispatcher(page).forward(request, response);
    }

    public static void forward(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName) throws ServletException, IOException {
        forward(request, response,
                servlet.getServletConfig().getInitParameter(parameterName));
    }

    /**
     * 跳转（red）给指定页面
     *
     * @param request
     * @param response
     * @param page
     * @throws ServletException
     * @throws IOException
     */
    public static void redirect(HttpServletRequest request,
            HttpServletResponse response, String page) throws ServletException,
            IOException {
        System.out.println(request.getServletPath() + "跳转到" + page);
        response.sendRedirect(page);
    }

    public static void redirect(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName) throws ServletException, IOException {
        redirect(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName));
    }

    // <editor-fold defaultstate="collapsed" desc="私有函数">         
    /**
     * 判断二个对象是否相等
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean equalOfObject(Object a, Object b) {
        if (a == b) {
            return true;
        }
        if (a == null) {
            a = "";
        }
        if (b == null) {
            b = "";
        }
        if (b.equals(a.toString())) {
            return true;
        }
        return false;
    }

    /**
     * 判断a是否大于b
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean isBigOfObject(Object a, Object b) {
        if (a == null) {
            a = "0";
        }
        if (b == null) {
            b = "0";
        }
        if (StringUtil.isBigInt(a.toString(), b.toString())) {
            return true;
        }
        return false;
    }

    /**
     * 判断a是否小于b
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean isSmallOfObject(Object a, Object b) {
        if (a == null) {
            a = "0";
        }
        if (b == null) {
            b = "0";
        }
        if (StringUtil.isSmallInt(a.toString(), b.toString())) {
            return true;
        }
        return false;
    }

    /**
     * 判断二个对象是否为一种类
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean equalOfClass(Object a, Object b) {
        return equalOfClass(a, b.getClass());
    }

    /**
     * 判断二个对象是否为一种类
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean equalOfClass(Object a, Class b) {
        if (a == null) {
            return false;
        }
        if (b == null) {
            return false;
        }
        if (b.isInstance(a)) {
            return true;
        }
        return false;
    }

    /**
     * 判断对象是否为另一个对象的类、子类（根据Servlet初始化参数跳转页面）
     *
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param obj
     * @param alert
     * @param clazz
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private static <T> boolean checkClassOfObject(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj, String alert, Class<T> clazz)
            throws ServletException, IOException {
        return checkClassOfObject(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName), obj, alert, clazz);
    }

    /**
     * 判断对象是否为另一个对象的类、子类（根据绝对路径跳转）
     *
     * @param request
     * @param response
     * @param page
     * @param obj
     * @param alert
     * @param clazz
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private static <T> boolean checkClassOfObject(HttpServletRequest request,
            HttpServletResponse response, String page, Object obj,
            String alert, Class<T> clazz) throws ServletException, IOException {
        if (!equalOfClass(obj, clazz)) {
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return false;
        }
        return true;
    }

    /**
     * 判断对象是否为空（null、""，根据Servlet初始化参数跳转页面）
     *
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param obj
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private static boolean checkNullOfObject(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj, String alert)
            throws ServletException, IOException {
        return checkNullOfObject(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName), obj, alert);
    }

    /**
     * 判断对象是否为空（null、""，根据绝对路径跳转）
     *
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param obj
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private static boolean checkNullOfObject(HttpServletRequest request,
            HttpServletResponse response, String page, Object obj, String alert)
            throws ServletException, IOException {
        if (equalOfObject(obj, null)) {
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return false;
        }
        return true;
    }

    private static boolean checkEqualOfObject(HttpServletRequest request,
            HttpServletResponse response, String page,
            Object obj1, Object obj2, String alert,
            boolean flag) throws ServletException, IOException {
        // 相等情况与选择的相等时
        if (equalOfObject(obj1, obj2) == flag) {
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return false;
        } else {
            return true;
        }
    }

    private static boolean checkEqualOfObject(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj1, Object obj2,
            String alert, boolean flag) throws ServletException, IOException {
        return checkEqualOfObject(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName), obj1, obj2, alert, flag);
    }

    private static boolean checkEqualOfClass(HttpServletRequest request,
            HttpServletResponse response, String page,
            Object obj1, Object obj2, String alert,
            boolean flag) throws ServletException, IOException {
        // 相等情况与选择的相等时
        if (equalOfClass(obj1, obj2.getClass()) == flag) {
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return false;
        } else { //其他情况
            return true;
        }
    }

    private static boolean checkEqualOfClass(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj1, Object obj2,
            String alert, boolean flag) throws ServletException, IOException {
        return checkEqualOfClass(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName), obj1, obj2, alert, flag);
    }

    private static boolean checkIsBigOfObject(HttpServletRequest request,
            HttpServletResponse response, String page,
            Object obj1, Object obj2, String alert,
            boolean flag) throws ServletException, IOException {
        // 相等，且选择相等时执行跳转，执行跳转成功
        if (isBigOfObject(obj1, obj2) == flag) {
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return false;
        } else { //不相等，且选择相等时执行跳转的时候，执行跳转失败，返回false
            return true;
        }
    }

    private static boolean checkIsBigOfObject(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj1, Object obj2,
            String alert, boolean flag) throws ServletException, IOException {
        return checkIsBigOfObject(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName), obj1, obj2, alert, flag);
    }

    private static boolean checkIsSmallOfObject(HttpServletRequest request,
            HttpServletResponse response, String page, Object obj1, Object obj2,
            String alert, boolean flag) throws ServletException, IOException {
        // 相等，且选择相等时执行跳转，执行跳转成功
        if (isSmallOfObject(obj1, obj2.getClass()) == flag) {
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return false;
        } else { //不相等，且选择相等时执行跳转的时候，执行跳转失败，返回false
            return true;
        }
    }

    private static boolean checkIsSmallOfObject(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj1, Object obj2,
            String alert, boolean flag) throws ServletException, IOException {
        return checkIsSmallOfObject(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName), obj1, obj2, alert, flag);
    }

    // </editor-fold>  
    // <editor-fold defaultstate="collapsed" desc="公有函数">      
    /**
     * 判断Session是否为空（根据Servlet初始化参数跳转页面）
     *
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static boolean checkNullOfSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String paramName, String alert)
            throws ServletException, IOException {
        return checkNullOfObject(request, response, servlet, parameterName,
                request.getSession().getAttribute(paramName), alert);
    }

    /**
     * 判断session是否为空（根据绝对路径跳转）
     *
     * @param request
     * @param response
     * @param page
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static boolean checkNullOfSes(HttpServletRequest request,
            HttpServletResponse response, String page, String paramName,
            String alert) throws ServletException, IOException {
        return checkNullOfObject(request, response, page, request.getSession()
                .getAttribute(paramName), alert);
    }

    /**
     * 判断Parameter是否为空（根据Servlet初始化参数跳转页面）
     *
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static boolean checkNullOfPar(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String paramName, String alert)
            throws ServletException, IOException {
        return checkNullOfObject(request, response, servlet, parameterName,
                request.getParameter(paramName), alert);
    }

    /**
     * 判断Parameter是否为空（根据绝对路径跳转）
     *
     * @param request
     * @param response
     * @param page
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static boolean checkNullOfPar(HttpServletRequest request,
            HttpServletResponse response, String page, String paramName,
            String alert) throws ServletException, IOException {
        return checkNullOfObject(request, response, page,
                request.getParameter(paramName), alert);
    }

    /**
     * 判断Session是否为Class（根据Servlet初始化参数跳转页面）
     *
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static <T> boolean checkClassOfSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String paramName, String alert, Class<T> clazz)
            throws ServletException, IOException {
        return checkClassOfObject(request, response, servlet, parameterName,
                request.getSession().getAttribute(paramName), alert, clazz);
    }

    /**
     * 判断Session是否为Class（根据绝对路径跳转）
     *
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static <T> boolean checkClassOfSes(HttpServletRequest request,
            HttpServletResponse response, String page, String paramName,
            String alert, Class<T> clazz) throws ServletException, IOException {
        return checkClassOfObject(request, response, page, request.getSession()
                .getAttribute(paramName), alert, clazz);
    }

    /**
     * 判断Parameter是否为Class（根据绝对路径跳转）
     *
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static <T> boolean checkClassOfPar(HttpServletRequest request,
            HttpServletResponse response, String page, String paramName,
            String alert, Class<T> clazz) throws ServletException, IOException {
        return checkClassOfObject(request, response, page,
                request.getParameter(paramName), alert, clazz);
    }

    /**
     * 判断Parameter是否为Class（根据Servlet初始化参数跳转页面）
     *
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static <T> boolean checkClassOfPar(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String paramName, String alert, Class<T> clazz)
            throws ServletException, IOException {
        return checkClassOfObject(request, response, servlet, parameterName,
                request.getParameter(paramName), alert, clazz);
    }

    public static boolean equalObjectOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfObject(request,
                response, servlet, parameterName, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean equalObjectOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfObject(request,
                response, page, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean equalClassOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfClass(request,
                response, page, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean equalClassOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfClass(request,
                response, servlet, parameterName, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean equalObjectOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfObject(request,
                response, page, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean equalObjectOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfObject(request,
                response, servlet, parameterName, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean equalClassOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfClass(request,
                response, page, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean equalClassOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfClass(request,
                response, servlet, parameterName, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean equalObjectOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfObject(request,
                response, page, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    public static boolean equalObjectOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfObject(request,
                response, servlet, parameterName, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    public static boolean equalClassOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfClass(request,
                response, page, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    public static boolean equalClassOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfClass(request,
                response, servlet, parameterName, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    public static boolean isBigObjectOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsBigOfObject(request,
                response, servlet, parameterName, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean isBigObjectOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsBigOfObject(request,
                response, servlet, parameterName, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean isBigObjectOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsBigOfObject(request,
                response, servlet, parameterName, request.getSession().getAttribute(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean isBigObjectOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsBigOfObject(request,
                response, page, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean isBigObjectOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsBigOfObject(request,
                response, page, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean isBigObjectOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsBigOfObject(request,
                response, page, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    public static boolean isSmallObjectOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsSmallOfObject(request,
                response, servlet, parameterName, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean isSmallObjectOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsSmallOfObject(request,
                response, servlet, parameterName, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean isSmallObjectOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsSmallOfObject(request,
                response, servlet, parameterName, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    public static boolean isSmallObjectOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsSmallOfObject(request,
                response, page, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean isSmallObjectOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsSmallOfObject(request,
                response, page, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean isSmallObjectOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsSmallOfObject(request,
                response, page, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    // </editor-fold>   

    /**
     *
     * 数据库增、删、改操作验证
     */
    public static void checkdata(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String responsename, int ispass)
            throws ServletException, IOException {
        if (ispass == 0) {
            request.getSession().setAttribute("info", responsename + "失败");
            ServletUtil.redirect(request, response, servlet, parameterName);
        } else {
            request.getSession().setAttribute("info", responsename + "成功");
            ServletUtil.redirect(request, response, servlet, parameterName);
        }
    }

    public static void checkdata(HttpServletRequest request,
            HttpServletResponse response, String page, String responsename, int ispass)
            throws ServletException, IOException {
        if (ispass == 0) {
            request.getSession().setAttribute("info", responsename + "失败");
            ServletUtil.redirect(request, response, page);
        } else {
            request.getSession().setAttribute("info", responsename + "成功");
            ServletUtil.redirect(request, response, page);
        }
    }
    public static boolean dataOfSetSesRredirect(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String rightPar, String badPart, String alert, Object obj, String param)
            throws ServletException, IOException {
        if (obj == null) {
            request.getSession().setAttribute("info", alert + "失败");
            ServletUtil.redirect(request, response, servlet, badPart);
            return false;
        } else {
            request.getSession().setAttribute(param, obj);
            request.getSession().setAttribute("info", alert + "成功");
            ServletUtil.redirect(request, response, servlet, rightPar);
            return true;
        }
    }

    public static boolean dataOfSetReqRedirect(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String rightPar, String badPart, String alert, Object obj, String param)
            throws ServletException, IOException {
        if (obj == null) {
            request.getSession().setAttribute("info", alert + "失败");
            ServletUtil.redirect(request, response, servlet, badPart);
            return false;
        } else {
            request.setAttribute(param, obj);
            request.getSession().setAttribute("info", alert + "成功");
            ServletUtil.redirect(request, response, servlet, rightPar);
            return true;
        }
    }

    public static boolean dataOfSetSesForward(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String rightPar, String badPart, String alert, Object obj, String param)
            throws ServletException, IOException {
        if (obj == null) {
            request.getSession().setAttribute("info", alert + "失败");
            ServletUtil.redirect(request, response, servlet, badPart);
            return false;
        } else {
            request.getSession().setAttribute(param, obj);
            request.getSession().setAttribute("info", alert + "成功");
            ServletUtil.forward(request, response, servlet, rightPar);
            return true;
        }
    }

    public static boolean dataOfSetReqForward(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String rightPar, String badPart, String alert, Object obj, String param)
            throws ServletException, IOException {
        if (obj == null) {
            request.getSession().setAttribute("info", alert + "失败");
            ServletUtil.redirect(request, response, servlet, badPart);
            return false;
        } else {
            request.setAttribute(param, obj);
            request.getSession().setAttribute("info", alert + "成功");
            ServletUtil.forward(request, response, servlet, rightPar);
            return true;
        }
    }

    public static String updateFile(HttpServletRequest request,
            HttpServletResponse response, String path, String format) throws ServletException, IOException {
        //定义上载文件的最大字节
        int MAX_SIZE = 102400 * 102400;
        // 创建根路径的保存变量
        String rootPath;
        //声明文件读入类
        DataInputStream in = null;
        FileOutputStream fileOut = null;
        //创建文件的保存目录
        String realPath = request.getServletContext().getRealPath("") + "/" + path;
        //取得客户端上传的数据类型
        String contentType = request.getContentType();
        try {
            if (contentType.indexOf("multipart/form-data") >= 0) {
                //读入上传的数据
                in = new DataInputStream(request.getInputStream());
                int formDataLength = request.getContentLength();
                if (formDataLength > MAX_SIZE) {
                    throw new ServletException("上传的文件字节数不可以超过" + MAX_SIZE + "---" + formDataLength);
                }
                //保存上传文件的数据
                byte dataBytes[] = new byte[formDataLength];
                int byteRead = 0;
                int totalBytesRead = 0;
                //上传的数据保存在byte数组
                while (totalBytesRead < formDataLength) {
                    byteRead = in.read(dataBytes, totalBytesRead, formDataLength);
                    totalBytesRead += byteRead;
                }
                //根据byte数组创建字符串
                String file2 = new String(dataBytes, "UTF-8");
                String file = new String(dataBytes);
                //取得上传的数据的文件名
                String saveFile = file2.substring(file2.indexOf("filename=\"") + 10);
                saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
                saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1, saveFile.indexOf("\""));
                if (format != null) {
                    String[] formats = format.split(",");
                    boolean flag = true;
                    for (String s : formats) {
                        if (saveFile.endsWith(s)) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        return null;
                    }
                }
                int lastIndex = contentType.lastIndexOf("=");
                //取得数据的分隔字符串
                String boundary = contentType.substring(lastIndex + 1, contentType.length());
                //创建保存路径的文件名
                String fileName = realPath + saveFile;
                int pos;
                pos = file.indexOf("filename=\"");
                pos = file.indexOf("\n", pos) + 1;
                pos = file.indexOf("\n", pos) + 1;
                pos = file.indexOf("\n", pos) + 1;
                int boundaryLocation = file.indexOf(boundary, pos) - 4;
                //取得文件数据的开始的位置
                int startPos = ((file.substring(0, pos)).getBytes()).length;
                System.out.println((char) dataBytes[startPos]);
                //取得文件数据的结束的位置
                int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;
                 //检查上载文件是否存在
                /*
                 File checkFile = new File(fileName);
                 if (checkFile.exists()) {
                 out.println("<p>" + saveFile + "文件已经存在.</p>");
                 }
                 */
                //检查上载文件的目录是否存在
                File fileDir = new File(realPath, "UTF-8");
                if (!fileDir.exists()) {
                    fileDir.mkdirs();
                }
                //创建文件的写出类
                fileOut = new FileOutputStream(fileName);
                System.out.println(fileName);
                //保存文件的数据
                fileOut.write(dataBytes, startPos, (endPos - startPos));
                return fileName;
            } else {
                String content = request.getContentType();
                throw new ServletException("传的数据类型不是multipart/form-data---" + content);
            }
        } catch (Exception ex) {
            throw new ServletException(ex.getMessage());
        } finally {
            fileOut.close();
        }
    }
    
    
}
