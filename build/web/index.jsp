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
                <link rel="stylesheet" href="layui/css/layui.css"  media="all">
                <link rel = "stylesheet" type = "text/css" href = "css/index.css"/>
                <script src="http://cdn.bootcss.com/jquery/1.12.3/jquery.min.js"></script> <!-- 你必须先引入jQuery1.8或以上版本 -->
                <script src="layer/layer.js"></script>
                <script src="js/pipei.js"></script>
                <script src="layui/layui.js"></script>
                <c:if test="${not empty info}">
                    <script>layer.msg('${info}')</script>
                    <c:remove var="info" />
                </c:if>
                <c:if test="${empty sessionScope.identity}">
                    <c:set var="info" value="尚未登录，请登录!" scope="session" />
                    <c:redirect url="login.jsp" />
                </c:if>
                <c:if test="${not empty sessionScope.identity.lastQuestionId && empty sessionScope.question}">
                    <c:set var="info" value="尚未登录，请登录!" scope="session" />
                    <c:redirect url="QuestionAction?method=chose&questionId=${sessionScope.identity.lastQuestionId}" />
                </c:if>
                <c:if test="${empty sessionScope.question}">
                    <c:set var="info" value="尚未选择题目，请先选择题目!" scope="session" />
                    <c:redirect url="QuestionAction?method=getList&questionPage=1&questionLimit=10" />
                </c:if>
        </head>
        <body>
                <ul class="layui-nav">
                        <li class="layui-nav-item">
                                <a href="index.jsp">首页</a>
                        </li>
                        <li class="layui-nav-item">
                                <a href="">个人中心<span class="layui-badge-dot"></span></a>
                        </li>
                        <li class="layui-nav-item">
                                <a href=""><img src="http://t.cn/RCzsdCq" class="layui-nav-img">我</a>
                                <dl class="layui-nav-child">
                                        <dd><a href="javascript:;">修改信息</a></dd>
                                        <dd><a href="javascript:;">安全管理</a></dd>
                                        <dd><a href="javascript:;">退出</a></dd>
                                </dl>
                        </li>
                </ul>
                <div class="layui-bg-white" align="center"><a href="QuestionAction?method=get&questionId=${sessionScope.question.questionId}"><p style="font-size: 36px; color: black">当前题目: No.${sessionScope.question.questionId} ${sessionScope.question.title}</p></a></div>
                <div class="layui-anim layui-anim-fadein">
                        <form id="coderForm" action="CoderAction?method=push" method="POST">
                                <textarea id="codes" name="codes" class="layui-textarea layui-bg-black" onkeydown="return noNumbers(event)">${sessionScope.identity.lastCode}</textarea>
                                <div class="layui-bg-black">
                                        <ul class="leftul">  
                                                <li><button class="layui-btn layui-btn-big layui-btn-normal" type="submit">确认提交</button></li>
                                                <li><a class="layui-btn layui-btn-big" href="QuestionAction?method=get&questionId=${sessionScope.question.questionId}">查看详情</a></li>
                                                <li><a class="layui-btn layui-btn-big layui-btn-danger" href="QuestionAction?method=getList&questionPage=1&questionLimit=10">题目列表</a></li>
                                                <li><a class="layui-btn layui-btn-big layui-btn-warm" href="CoderAction?method=getAllList">提交记录</a></li>
                                        </ul>
                                        <hr class="layui-bg-black">
                                </div>
                                <div class="down layui-bg-black">
                                        <ul class="leftul2">
                                                <li><a href="#" class="layui-btn layui-btn-mini layui-btn-primary" onclick="showHelpInput()">输入样例</a>
                                                        <textarea id="inputTest" name="inputTest" class="layui-textarea layui-bg-black">${sessionScope["inputTest"]}</textarea></li>
                                                <li><a href="#" class="layui-btn layui-btn-mini layui-btn-primary" onclick="showHelpOutput()">输出样例</a>
                                                        <textarea id="outputTest" name="outputTest" class="layui-textarea layui-bg-black">${sessionScope["outputTest"]}</textarea></li>
                                        </ul>
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
