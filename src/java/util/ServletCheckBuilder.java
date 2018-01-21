package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCheckBuilder {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpServlet servlet;
    private String defaultRedirectParameterName = null;
    private Map<String, Object> m = null;
    private Map<String, List<Checker>> listMap = null;
    private List<Checker> checkNullListOfPar; // 检测是否为空的表
    private List<Checker> checkNullListOfSes; // 检测是否为空的表
    private List<Checker> checkClassListOfPar; // 检测是否为某个类的表
    private List<Checker> checkClassListOfSes; // 检测是否为某个类的表
    private List<Checker> checkEqualListOfParAndPar; // 检测Par和Par之间是否相等
    private List<Checker> checkEqualListOfParAndSes; // 检测Par和Ses之间是否相等
    private List<Checker> checkEqualListOfSesAndSes; // 检测Ses和Ses之间是否相等
    private List<Checker> checkEqualClassListOfParAndPar; // 检测Par和Par之间的类是否相等
    private List<Checker> checkEqualClassListOfParAndSes; // 检测Par和Ses之间的类是否相等
    private List<Checker> checkEqualClassListOfSesAndSes; // 检测Ses和Ses之间的类是否相等
    private List<Checker> checkIsBigListOfParAndPar; // 检测Par和Par之间是否大于
    private List<Checker> checkIsBigListOfParAndSes; // 检测Par和Ses之间是否大于
    private List<Checker> checkIsBigListOfSesAndSes; // 检测Ses和Ses之间是否大于
    private List<Checker> checkIsSmallListOfParAndPar; // 检测Par和Par之间是否小于
    private List<Checker> checkIsSmallListOfParAndSes; // 检测Par和Ses之间是否小于
    private List<Checker> checkIsSmallListOfSesAndSes; // 检测Ses和Ses之间是否小于

    public ServletCheckBuilder(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet, String defaultRedirectParameterName) {
        this.request = request;
        this.response = response;
        this.servlet = servlet;
        this.defaultRedirectParameterName = defaultRedirectParameterName;
        listMap = new HashMap();
        checkNullListOfPar = new ArrayList();
        listMap.put("checkNullListOfPar", checkNullListOfPar);
        checkNullListOfSes = new ArrayList();
        listMap.put("checkNullListOfSes", checkNullListOfSes);
        checkClassListOfPar = new ArrayList();
        listMap.put("checkClassListOfPar", checkClassListOfPar);
        checkClassListOfSes = new ArrayList();
        listMap.put("checkClassListOfSes", checkClassListOfSes);
        checkEqualListOfParAndPar = new ArrayList();
        listMap.put("checkEqualListOfParAndPar", checkEqualListOfParAndPar);
        checkEqualListOfParAndSes = new ArrayList();
        listMap.put("checkEqualListOfParAndSes", checkEqualListOfParAndSes);
        checkEqualListOfSesAndSes = new ArrayList();
        listMap.put("checkEqualListOfSesAndSes", checkEqualListOfSesAndSes);
        checkEqualClassListOfParAndPar = new ArrayList();
        listMap.put("checkEqualClassListOfParAndPar", checkEqualClassListOfParAndPar);
        checkEqualClassListOfParAndSes = new ArrayList();
        listMap.put("checkEqualClassListOfParAndSes", checkEqualClassListOfParAndSes);
        checkEqualClassListOfSesAndSes = new ArrayList();
        listMap.put("checkEqualClassListOfSesAndSes", checkEqualClassListOfSesAndSes);
        checkIsBigListOfParAndPar = new ArrayList();
        listMap.put("checkIsBigListOfParAndPar", checkIsBigListOfParAndPar);
        checkIsBigListOfParAndSes = new ArrayList();
        listMap.put("checkIsBigListOfParAndSes", checkIsBigListOfParAndSes);
        checkIsBigListOfSesAndSes = new ArrayList();
        listMap.put("checkIsBigListOfSesAndSes", checkIsBigListOfSesAndSes);
        checkIsSmallListOfParAndPar = new ArrayList();
        listMap.put("checkIsSmallListOfParAndPar", checkIsSmallListOfParAndPar);
        checkIsSmallListOfParAndSes = new ArrayList();
        listMap.put("checkIsSmallListOfParAndSes", checkIsSmallListOfParAndSes);
        checkIsSmallListOfSesAndSes = new ArrayList();
        listMap.put("checkIsSmallListOfSesAndSes", checkIsSmallListOfSesAndSes);
        m = new HashMap();
    }

    public void setDefaultParam(String param) {
        this.defaultRedirectParameterName = param;
    }

    // <editor-fold defaultstate="collapsed" desc="公有函数">    
    private void add(String listName, Checker c) {
        listMap.get(listName).add(c);
    }

    public ServletCheckBuilder addNp(String par, String alert, String parameter) {
        add("checkNullListOfPar", new Checker(par, alert, parameter));
        return this;
    }

    public ServletCheckBuilder addNp(String par, String alert) {
        return addNp(par, alert, defaultRedirectParameterName);
    }

    public ServletCheckBuilder addNs(String ses, String alert, String parameter) {
        add("checkNullListOfSes", new Checker(ses, alert, parameter));
        return this;
    }

    public ServletCheckBuilder addNs(String ses, String alert) {
        return addNs(ses, alert, defaultRedirectParameterName);
    }

    public ServletCheckBuilder addCp(String par, String alert, Class clazz, String parameter) {
        add("checkClassListOfPar", new Checker(par, alert, parameter, clazz));
        return this;
    }

    public ServletCheckBuilder addCp(String par, String alert, Class clazz) {
        return addCp(par, alert, clazz, defaultRedirectParameterName);
    }

    public ServletCheckBuilder addCs(String ses, String alert, Class clazz, String parameter) {
        add("checkClassListOfSes", new Checker(ses, alert, parameter));
        return this;
    }

    public ServletCheckBuilder addCs(String ses, String alert, Class clazz) {
        return addCs(ses, alert, clazz, defaultRedirectParameterName);
    }

    public ServletCheckBuilder addEpp(String par1, String par2, String alert, String parameter, boolean flag) {
        add("checkEqualListOfParAndPar", new Checker(par1, par2, alert, parameter, flag));
        return this;
    }

    public ServletCheckBuilder addEpp(String par1, String par2, String alert) {
        return addEpp(par1, par2, alert, defaultRedirectParameterName, true);
    }

    public ServletCheckBuilder addEpp(String par1, String par2, String alert, boolean flag) {
        return addEpp(par1, par2, alert, defaultRedirectParameterName, flag);
    }

    public ServletCheckBuilder addEps(String par, String ses, String alert, String parameter, boolean flag) {
        add("checkEqualListOfParAndSes", new Checker(par, ses, alert, parameter, flag));
        return this;
    }

    public ServletCheckBuilder addEps(String par, String ses, String alert, boolean flag) {
        return addEps(par, ses, alert, defaultRedirectParameterName, flag);
    }

    public ServletCheckBuilder addEps(String par, String ses, String alert) {
        return addEps(par, ses, alert, defaultRedirectParameterName, true);
    }

    public ServletCheckBuilder addEss(String ses1, String ses2, String alert, String parameter, boolean flag) {
        add("checkEqualListOfSesAndSes", new Checker(ses1, ses2, alert, parameter, flag));
        return this;
    }

    public ServletCheckBuilder addEss(String ses1, String ses2, String alert, boolean flag) {
        return addEss(ses1, ses2, alert, defaultRedirectParameterName, flag);
    }

    public ServletCheckBuilder addEss(String ses1, String ses2, String alert) {
        return addEss(ses1, ses2, alert, defaultRedirectParameterName, true);
    }

    public ServletCheckBuilder addCpp(String par1, String par2, String alert, String parameter, boolean flag) {
        add("checkEqualClassListOfParAndPar", new Checker(par1, par2, alert, parameter, flag));
        return this;
    }

    public ServletCheckBuilder addCpp(String par1, String par2, String alert, boolean flag) {
        return addCpp(par1, par2, alert, defaultRedirectParameterName, flag);
    }

    public ServletCheckBuilder addCpp(String par1, String par2, String alert) {
        return addCpp(par1, par2, alert, defaultRedirectParameterName, true);
    }

    public ServletCheckBuilder addCps(String par, String ses, String alert, String parameter, boolean flag) {
        add("checkEqualClassListOfParAndSes", new Checker(par, ses, alert, parameter, flag));
        return this;
    }

    public ServletCheckBuilder addCps(String par, String ses, String alert, boolean flag) {
        return addCps(par, ses, alert, defaultRedirectParameterName, flag);
    }

    public ServletCheckBuilder addCps(String par, String ses, String alert) {
        return addCps(par, ses, alert, defaultRedirectParameterName, true);
    }

    public ServletCheckBuilder addCss(String ses1, String ses2, String alert, String parameter, boolean flag) {
        add("checkEqualClassListOfSesAndSes", new Checker(ses1, ses2, alert, parameter, flag));
        return this;
    }

    public ServletCheckBuilder addCss(String ses1, String ses2, String alert, boolean flag) {
        return addCss(ses1, ses2, alert, defaultRedirectParameterName, flag);
    }

    public ServletCheckBuilder addCss(String ses1, String ses2, String alert) {
        return addCss(ses1, ses2, alert, defaultRedirectParameterName, true);
    }

    public ServletCheckBuilder addBpp(String par1, String par2, String alert, String parameter) {
        add("checkIsBigListOfParAndPar", new Checker(par1, par2, alert, parameter));
        return this;
    }

    public ServletCheckBuilder addBpp(String par1, String par2, String alert) {
        return addBpp(par1, par2, alert, defaultRedirectParameterName);
    }

    public ServletCheckBuilder addBps(String par, String ses, String alert, String parameter) {
        add("checkIsBigListOfParAndSes", new Checker(par, ses, alert, parameter));
        return this;
    }

    public ServletCheckBuilder addBps(String par, String ses, String alert) {
        return addBps(par, ses, alert, defaultRedirectParameterName);
    }

    public ServletCheckBuilder addBss(String ses1, String ses2, String alert, String parameter) {
        add("checkIsBigListOfSesAndSes", new Checker(ses1, ses2, alert, parameter));
        return this;
    }

    public ServletCheckBuilder addBss(String ses1, String ses2, String alert) {
        return addBss(ses1, ses2, alert, defaultRedirectParameterName);
    }

    public ServletCheckBuilder addSpp(String par1, String par2, String alert, String parameter) {
        add("checkIsSmallListOfParAndPar", new Checker(par1, par2, alert, parameter));
        return this;
    }

    public ServletCheckBuilder addSpp(String par1, String par2, String alert) {
        return addSpp(par1, par2, alert, defaultRedirectParameterName);
    }

    public ServletCheckBuilder addSps(String par, String ses, String alert, String parameter) {
        add("checkIsSmallListOfParAndSes", new Checker(par, ses, alert, parameter));
        return this;
    }

    public ServletCheckBuilder addSps(String par, String ses, String alert) {
        return addSps(par, ses, alert, defaultRedirectParameterName);
    }

    public ServletCheckBuilder addSss(String ses1, String ses2, String alert, String parameter) {
        add("checkIsSmallListOfSesAndSes", new Checker(ses1, ses2, alert, parameter));
        return this;
    }

    public ServletCheckBuilder addSss(String ses1, String ses2, String alert) {
        return addSss(ses1, ses2, alert, defaultRedirectParameterName);
    }

    // </editor-fold>   
    // <editor-fold defaultstate="collapsed" desc="私有函数"> 
    private void putMapOfSes(Checker c) {
        if (!m.containsKey("ses_" + c.param)) {
            m.put("ses_" + c.param, request.getSession().getAttribute(c.param));
        }
    }

    private void putMapOfPar(Checker c) {
        if (!m.containsKey("par_" + c.param)) {
            m.put("par_" + c.param, request.getParameter(c.param));
        }
    }

    private void putMapOfParAndPar(Checker c) {
        if (!m.containsKey("par_" + c.param)) {
            m.put("par_" + c.param, request.getParameter(c.param));
        }
        if (!m.containsKey("par_" + c.param)) {
            m.put("par_" + c.param2, request.getParameter(c.param2));
        }
    }

    private void putMapOfParAndSes(Checker c) {
        if (!m.containsKey("par_" + c.param)) {
            m.put("par_" + c.param, request.getParameter(c.param));
        }
        if (!m.containsKey("ses_" + c.param)) {
            m.put("ses_" + c.param2, request.getSession().getAttribute(c.param2));
        }
    }

    private void putMapOfSesAndSes(Checker c) {
        if (!m.containsKey("ses_" + c.param)) {
            m.put("ses_" + c.param, request.getSession().getAttribute(c.param));
        }
        if (!m.containsKey("par_" + c.param)) {
            m.put("ses_" + c.param2, request.getSession().getAttribute(c.param2));
        }
    }

    /**
     * 检查Par表是否为空
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkNullListOfPar() throws ServletException, IOException {
        for (Checker c : checkNullListOfPar) {
            putMapOfPar(c);
            if (!ServletUtil.checkNullOfPar(request, response, servlet,
                    c.parameterName, c.param, c.alert)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Ses表是否为空
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkNullListOfSes() throws ServletException, IOException {
        for (Checker c : checkNullListOfSes) {
            putMapOfSes(c);
            if (!ServletUtil.checkNullOfSes(request, response, servlet,
                    c.parameterName, c.param, c.alert)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Par表是否为某个类
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkClassListOfPar() throws ServletException, IOException {
        for (Checker c : checkClassListOfPar) {
            putMapOfPar(c);
            if (!ServletUtil.checkClassOfPar(request, response, servlet,
                    c.parameterName, c.param, c.alert, c.claszz)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Ses表是否为某个类
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkClassListOfSes() throws ServletException, IOException {
        for (Checker c : checkClassListOfSes) {
            putMapOfSes(c);
            if (!ServletUtil.checkClassOfSes(request, response, servlet,
                    c.parameterName, c.param, c.alert, c.claszz)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Par表和Par表中是否相等
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkEqualListOfParAndPar() throws ServletException, IOException {
        for (Checker c : checkEqualListOfParAndPar) {
            putMapOfParAndPar(c);
            if (!ServletUtil.equalObjectOfParAndPar(request, response, servlet,
                    c.parameterName, c.param, c.param2, c.alert, c.flag)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Par表和Sex表中是否相等
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkEqualListOfParAndSes() throws ServletException, IOException {
        for (Checker c : checkEqualListOfParAndSes) {
            putMapOfParAndSes(c);
            if (!ServletUtil.equalObjectOfParAndSes(request, response, servlet,
                    c.parameterName, c.param, c.param2, c.alert, c.flag)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Ses表和Sex表中是否相等
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkEqualListOfSesAndSes() throws ServletException, IOException {
        for (Checker c : checkEqualListOfSesAndSes) {
            putMapOfSesAndSes(c);
            if (!ServletUtil.equalObjectOfSesAndSes(request, response, servlet,
                    c.parameterName, c.param, c.param2, c.alert, c.flag)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Par表和Par表类是否相等
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkEqualClassListOfParAndPar() throws ServletException, IOException {
        for (Checker c : checkEqualClassListOfParAndPar) {
            putMapOfParAndPar(c);
            if (!ServletUtil.equalClassOfParAndPar(request, response, servlet,
                    c.parameterName, c.param, c.param2, c.alert, c.flag)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Par表和Sex表类是否相等
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkEqualClassListOfParAndSes() throws ServletException, IOException {
        for (Checker c : checkEqualClassListOfParAndSes) {
            putMapOfParAndSes(c);
            if (!ServletUtil.equalClassOfParAndSes(request, response, servlet,
                    c.parameterName, c.param, c.param2, c.alert, c.flag)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Ses表和Ses表类是否相等
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkEqualClassListOfSesAndSes() throws ServletException, IOException {
        for (Checker c : checkEqualClassListOfSesAndSes) {
            putMapOfSesAndSes(c);
            if (!ServletUtil.equalClassOfSesAndSes(request, response, servlet,
                    c.parameterName, c.param, c.param2, c.alert, c.flag)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Par表和Ses表中是否大于
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkIsBigListOfParAndSes() throws ServletException, IOException {
        for (Checker c : checkIsBigListOfParAndSes) {
            putMapOfParAndSes(c);
            if (!ServletUtil.isBigObjectOfParAndSes(request, response, servlet,
                    c.parameterName, c.param, c.param2, c.alert, true)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Ses表和Ses表中是否大于
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkIsBigListOfSesAndSes() throws ServletException, IOException {
        for (Checker c : checkIsBigListOfSesAndSes) {
            putMapOfSesAndSes(c);
            if (!ServletUtil.isBigObjectOfSesAndSes(request, response, servlet,
                    c.parameterName, c.param, c.param2, c.alert, true)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Par表和Par表中是否大于
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkIsBigListOfParAndPar() throws ServletException, IOException {
        for (Checker c : checkIsBigListOfParAndPar) {
            putMapOfParAndPar(c);
            if (!ServletUtil.isBigObjectOfParAndPar(request, response, servlet,
                    c.parameterName, c.param, c.param2, c.alert, true)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Par表和Ses表中是否小于
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkIsSmallListOfParAndSes() throws ServletException, IOException {
        for (Checker c : checkIsSmallListOfParAndSes) {
            putMapOfParAndSes(c);
            if (!ServletUtil.isSmallObjectOfParAndSes(request, response, servlet,
                    c.parameterName, c.param, c.param2, c.alert, true)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Ses表和Ses表中是否小于
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkIsSmallListOfSesAndSes() throws ServletException, IOException {
        for (Checker c : checkIsSmallListOfSesAndSes) {
            putMapOfSesAndSes(c);
            if (!ServletUtil.isSmallObjectOfSesAndSes(request, response, servlet,
                    c.parameterName, c.param, c.param2, c.alert, true)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查Par表和Par表中是否小于
     *
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private boolean checkIsSmallListOfParAndPar() throws ServletException, IOException {
        for (Checker c : checkIsSmallListOfParAndPar) {
            putMapOfParAndPar(c);
            if (!ServletUtil.isSmallObjectOfParAndPar(request, response, servlet,
                    c.parameterName, c.param, c.param2, c.alert, true)) {
                return false;
            }
        }
        return true;
    }

    // </editor-fold>   
    /**
     * 返回Map，键为作用域_属性名 例如session_userId，值为从作用域取出的值
     *
     * @return 通过则返回map，否则返回null
     */
    public Map<String, Object> build() throws ServletException, IOException {
        if (!checkNullListOfPar()) {
            return null;
        }
        if (!checkNullListOfSes()) {
            return null;
        }
        if (!checkClassListOfPar()) {
            return null;
        }
        if (!checkClassListOfSes()) {
            return null;
        }
        if (!checkEqualListOfParAndPar()) {
            return null;
        }
        if (!checkEqualListOfParAndSes()) {
            return null;
        }
        if (!checkEqualListOfSesAndSes()) {
            return null;
        }
        if (!checkEqualClassListOfParAndPar()) {
            return null;
        }
        if (!checkEqualClassListOfParAndSes()) {
            return null;
        }
        if (!checkEqualClassListOfSesAndSes()) {
            return null;
        }
        if (!checkIsBigListOfParAndPar()) {
            return null;
        }
        if (!checkIsBigListOfParAndSes()) {
            return null;
        }
        if (!checkIsBigListOfSesAndSes()) {
            return null;
        }
        if (!checkIsSmallListOfParAndPar()) {
            return null;
        }
        if (!checkIsSmallListOfParAndSes()) {
            return null;
        }
        if (!checkIsSmallListOfSesAndSes()) {
            return null;
        }
        return m;
    }

    // 参数
    private class Checker<T> {

        public String param;
        public String param2;
        public String alert;
        public String parameterName;
        public boolean flag;
        public Class<T> claszz;

        public Checker(String param, String alert, String parameterName) {
            this.param = param;
            this.alert = alert;
            this.parameterName = parameterName;
        }

        public Checker(String param, String alert, String parameterName, Class<T> classz) {
            this.param = param;
            this.alert = alert;
            this.parameterName = parameterName;
            this.claszz = classz;
        }

        public Checker(String param, String param2, String alert, String parameterName) {
            this.param = param;
            this.param2 = param2;
            this.alert = alert;
            this.parameterName = parameterName;
        }

        public Checker(String param, String param2, String alert, String parameterName, boolean flag) {
            this.param = param;
            this.param2 = param2;
            this.flag = flag;
            this.alert = alert;
            this.parameterName = parameterName;
        }

        @Override
        public String toString() {
            return "Checker{" + "param=" + param + ", param2=" + param2 + ", alert=" + alert + ", parameterName=" + parameterName + ", flag=" + flag + ", claszz=" + claszz + '}';
        }

    }
}
