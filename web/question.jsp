<%-- 
    Document   : question
    Created on : 2018-1-9, 13:42:53
    Author     : lol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>向阳小队专版OJ</title>
                <link rel="stylesheet" href="layui/css/layui.css"  media="all">
                <link rel = "stylesheet" type = "text/css" href = "css/index.css"/>
                <script src="http://cdn.bootcss.com/jquery/1.12.3/jquery.min.js"></script> <!-- 你必须先引入jQuery1.8或以上版本 -->
                <script src="layer/layer.js"></script>
                <script src="layui/layui.js"></script>
                <c:if test="${not empty info}">
                    <script>layer.msg('${info}')</script>
                    <c:remove var="info" />
                </c:if>
                <c:if test="${empty sessionScope.identity}">
                    <c:set var="info" value="尚未登录，请登录!" scope="session" />
                    <c:redirect url="login.jsp" />
                </c:if>
                <c:if test="${empty sessionScope.showQuestion}">
                    <c:set var="info" value="尚未选择题目，请重新选择题目!" scope="session" />
                    <c:redirect url="QuestionAction?method=getList&questionPage=1&questionLimit=10" />
                </c:if>
                <script>
                    $(document).ready(function () {
                        function updateTime()
                        {
                            var time = parseInt($("#time").html());
                            if (time) {
                                $("#time").html(time - 1);
                                time = $("#time").html();
                                time = parseInt(time);
                                var hour = parseInt(time / 3600);
                                var minute = parseInt((time - hour * 3600) / 60);
                                var second = parseInt(time % 60);
                                $("#date").html(hour + "小时" + minute + "分" + second + "秒");
                            }
                        }
                        updateTime();
                        window.setInterval(updateTime, 1000);
                    });
                </script>
        </head>
        <body class="layui-bg-gray">
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
                <fieldset class="layui-elem-field layui-field-title">
                        <legend><font style="font-size: 36px;">No.${sessionScope.showQuestion.questionId} ${sessionScope.showQuestion.title} <i class="layui-icon" style="font-size: 20px; color: #FFB800;">${sessionScope.showQuestion.score}&#xe65e;</i></font>
                                <c:choose>  
                                    <c:when test="${sessionScope.showQuestion.endTime - date > 0 && sessionScope.showQuestion.endTime - date < 1000 * 60 * 60 * 24 *365}">
                                        <span id="date" style='color: #FF5722;'></span>
                                        <span  id="time" hidden="true">${(sessionScope.showQuestion.endTime - date) / 1000}</span>
                                        <a href="QuestionAction?method=chose&questionId=${sessionScope.showQuestion.questionId}">
                                                <button class="layui-btn layui-btn-danger"><i class="layui-icon">&#xe600;</i> 挑战</button>
                                        </a>
                                    </c:when>  
                                    <c:otherwise>
                                        <c:choose>  
                                            <c:when test="${sessionScope.showQuestion.endTime - date >= 1000 * 60 * 60 * 24 *365}">
                                                （彭倩最好了）
                                                <a href="QuestionAction?method=chose&questionId=${sessionScope.showQuestion.questionId}">
                                                        <button class="layui-btn layui-btn-danger"><i class="layui-icon">&#xe600;</i> 挑战</button>
                                                </a>
                                            </c:when>  
                                            <c:otherwise>
                                                （已经结束）
                                                <button class="layui-btn layui-btn-disabled"><i class="layui-icon">&#xe600;</i> 挑战</button></a>
                                            </c:otherwise>  
                                        </c:choose>
                                    </c:otherwise>  
                                </c:choose>
                        </legend>
                        <div class="layui-tab layui-tab-card">
                                <ul class="layui-tab-title">
                                        <li class="layui-this">题目详情</li>
                                                <c:if test="${not empty sessionScope.showQuestion.demoCode && sessionScope.showQuestion.endTime - date <= 0}">
                                                <li>样例代码</li>
                                                </c:if>
                                        <li>交流专区</li>
                                </ul>
                                <div class="layui-tab-content">
                                        <div class="layui-tab-item layui-show">
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
                                                                <pre class="layui-code" lay-title="C++" lay-skin="notepad">${sessionScope.showQuestion.inputTest}</pre>
                                                        </div>
                                                </fieldset>
                                                <fieldset class="layui-elem-field">
                                                        <legend><b>输出样例</b></legend>
                                                        <div class="layui-field-box">
                                                                <pre class="layui-code" lay-title="C++" lay-skin="notepad">${sessionScope.showQuestion.outputTest}</pre>
                                                        </div>
                                                </fieldset>
                                        </div>
                                        <c:if test="${not empty sessionScope.showQuestion.demoCode}">
                                            <div class="layui-tab-item">
                                                    <pre class="layui-code" lay-title="C++" lay-skin="notepad">${sessionScope.showQuestion.demoCode}</pre>
                                            </div>
                                        </c:if>
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
