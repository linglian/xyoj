<%-- 
    Document   : index
    Created on : 2017-9-26, 10:48:03
    Author     : lol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>向阳小队专版OJ</title>
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/modules/layer/default/layer.css" />
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>
                <script src="${pageContext.request.contextPath}/js/pipei.js"></script>
                <c:if test="${empty sessionScope.identity}">
                    <c:set var="info" value="尚未登录，请登录!" scope="session" />
                    <c:redirect url="login.jsp" />
                </c:if>
                <c:if test="${not empty sessionScope.identity.lastQuestionId && empty sessionScope.question}">
                    <c:set var="info" value="正在获取题目" scope="session" />
                    <c:redirect url="QuestionAction?method=chose&questionId=${sessionScope.identity.lastQuestionId}" />
                </c:if>
                <c:if test="${empty sessionScope.question}">
                    <c:set var="info" value="尚未选择题目，请先选择题目!" scope="session" />
                    <c:redirect url="QuestionAction?method=getList&questionPage=1&questionLimit=10" />
                </c:if>
        </head>
        <body>
                <c:import url="top.jsp" />
                <div class="layui-bg-white" align="center"><a href="QuestionAction?method=get&questionId=${sessionScope.question.questionId}"><p style="font-size: 36px; color: black">当前题目: No.${sessionScope.question.questionId} ${sessionScope.question.title}</p></a></div>
                <div class="layui-anim layui-anim-fadein">
                        <form id="coderForm" action="CoderAction?method=push" method="POST">
                                <textarea id="codes" name="codes" class="layui-textarea layui-bg-black" onkeydown="return noNumbers(event)">${sessionScope.identity.lastCode}</textarea>
                                <div class="layui-bg-black">
                                        <ul class="leftul">  
                                                <li><button class="layui-btn layui-btn-big layui-btn-normal" type="submit">确认提交</button></li>
                                        </ul>
                                        <hr class="layui-bg-black">
                                </div>
                        </form>
                </div>
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
