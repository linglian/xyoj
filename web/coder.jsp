<%-- 
    Document   : coder
    Created on : 2018-1-9, 22:00:34
    Author     : lol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>向阳小队专版OJ</title>
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/modules/layer/default/layer.css" />
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>
                <c:if test="${empty sessionScope.identity}">
                    <c:set var="info" value="尚未登录，请登录!" scope="session" />
                    <c:redirect url="login.jsp" />
                </c:if>
                <c:if test="${empty sessionScope.coder}">
                    <c:set var="info" value="未选择提交记录，请选择提交记录!" scope="session" />
                    <c:redirect url="CoderAction?method=getAllList&coderPage=1&coderLimit=10" />
                </c:if>
        </head>
        <body>
                <c:import url="top.jsp" />
                <fieldset class="layui-elem-field layui-field-title">
                        <legend>
                                <a href="QuestionAction?method=get&questionId=${sessionScope.coder.questionId}" style="font-size: 24px; color: #01AAED;">No.${sessionScope.coder.questionId} ${sessionScope.showQuestion.title}</a>
                                <font style="color:#FF5722; font-size: 12px;">By. ${sessionScope.coder.userId}</font>
                        </legend>
                        <div class="layui-tab layui-tab-card">
                                <ul class="layui-tab-title">
                                        <li class="layui-this">代码详情</li>
                                        <li>题目详情</li>
                                        <li>交流专区</li>
                                </ul>
                                <div class="layui-tab-content">
                                        <div class="layui-tab-item layui-show">
                                                <legend><b>代码</b></legend>
                                                <div class="layui-field-box">
                                                        <pre>${sessionScope.coder.code}</pre>
                                                </div>
                                                <legend><b>代码输出结果</b></legend>
                                                <div class="layui-field-box">
                                                        <pre>${coder.result}</pre>
                                                </div>
                                        </div>
                                        <div class="layui-tab-item">
                                                <fieldset class="layui-elem-field">
                                                        <legend><b>题目要求</b></legend>
                                                        <div class="layui-field-box">
                                                                ${sessionScope.showQuestion.body}
                                                        </div>
                                                </fieldset>
                                                <fieldset class="layui-elem-field">
                                                        <legend><b>输入格式</b></legend>
                                                        <div class="layui-field-box">
                                                                ${sessionScope.showQuestion.inputFormat}
                                                        </div>
                                                </fieldset>
                                                <fieldset class="layui-elem-field">
                                                        <legend><b>输出格式</b></legend>
                                                        <div class="layui-field-box">
                                                                ${sessionScope.showQuestion.outputFormat}
                                                        </div>
                                                </fieldset>
                                                <fieldset class="layui-elem-field">
                                                        <legend><b>输入样例</b></legend>
                                                        <div class="layui-field-box">
                                                                <pre>${sessionScope.showQuestion.inputTest}</pre>
                                                        </div>
                                                </fieldset>
                                                <fieldset class="layui-elem-field">
                                                        <legend><b>输出样例</b></legend>
                                                        <div class="layui-field-box">
                                                                <pre>${sessionScope.showQuestion.outputTest}</pre>
                                                        </div>
                                                </fieldset>
                                        </div>
                                        <div class="layui-tab-item">
                                                正在研发
                                        </div>
                                </div>
                        </div>
                </fieldset>
                <script>
                    //注意：导航 依赖 element 模块，否则无法进行功能性操作
                    layui.use('element', function () {
                        var element = layui.element;

                        //…
                    });
                    layui.use('code', function () {
                        layui.code(); //实际使用时，执行该方法即可。而此处注释是因为修饰器在别的js中已经执行过了
                    });
                </script>
        </body>
</html>
