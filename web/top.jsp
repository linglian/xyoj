<%-- 
    Document   : pushQuestion
    Created on : 2018-1-21, 17:25:59
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
                <link rel="stylesheet" href="layui/css/layui.css"  media="all">
                <link rel = "stylesheet" type = "text/css" href = "css/index.css"/>
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/modules/layer/default/layer.css" />
                <link rel="stylesheet" href="${pageContext.request.contextPath}/res/layui/css/layui.css">
                <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/global.css">
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>
                <c:if test="${not empty info}">
                    <script>layer.msg('${info}')</script>
                    <c:remove var="info" />
                </c:if>
        </head>
        <body>
                <div class="fly-header layui-bg-black">
                        <div class="layui-container">
                                <a class="fly-logo" href="${pageContext.request.contextPath}/index.jsp">
                                        <img src="${pageContext.request.contextPath}/img/logo4.png" style="height: 38px;padding-left:-10px;" alt="logo">
                                </a>
                                <ul class="layui-nav fly-nav layui-hide-xs">
                                        <li class="layui-nav-item layui-this">
                                                <a href="${pageContext.request.contextPath}/QuestionAction?method=getList&questionPage=1&questionLimit=10"><i class="iconfont icon-jiaoliu"></i>题库</a>
                                        </li>
                                        <li class="layui-nav-item">
                                                <a  href="${pageContext.request.contextPath}/CoderAction?method=getAllList"><i class="iconfont icon-iconmingxinganli"></i>代码</a>
                                        </li>
                                        <li class="layui-nav-item">
                                                <a  href="${pageContext.request.contextPath}/ContestAction?method=getAllList"><i class="iconfont icon-fabu"></i>竞赛</a>
                                        </li>
                                        <c:if test="${identity.lvl == -99}">
                                            <li class="layui-nav-item">
                                                    <a href="${pageContext.request.contextPath}/pushQuestion.jsp"><i class="iconfont icon-shezhi"></i>提交题目</a>
                                            </li>
                                        </c:if>
                                        <c:if test="${identity.lvl == -99}">
                                            <li class="layui-nav-item">
                                                    <a href="${pageContext.request.contextPath}/pushContest.jsp"><i class="iconfont icon-sousuo"></i>提交竞赛</a>
                                            </li>
                                        </c:if>
                                </ul>

                                <ul class="layui-nav fly-nav-user">
                                        <c:if test="${empty identity}">
                                            <!-- 未登入的状态 -->

                                            <li class="layui-nav-item">
                                                    <a class="iconfont icon-touxiang layui-hide-xs" href="${pageContext.request.contextPath}/login.html"></a>
                                            </li>
                                            <li class="layui-nav-item">
                                                    <a href="${pageContext.request.contextPath}/login.html">登入</a>
                                            </li>
                                        </c:if>

                                        <c:if test="${not empty identity}">
                                            <!-- 登入后的状态 -->
                                            <li class="layui-nav-item">
                                                    <a class="fly-nav-avatar" href="${pageContext.request.contextPath}/UserAction?method=get&userId=${identity.userId}">
                                                            <cite class="layui-hide-xs">${identity.userId}</cite>
                                                            <img src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516606181057&di=47fa0f209e644726c3c68e3a832c8254&imgtype=0&src=http%3A%2F%2Fimg1.3lian.com%2F2015%2Fa2%2F226%2Fd%2F311.jpg">
                                                    </a>
                                                    <dl class="layui-nav-child">
                                                            <dd><a href="${pageContext.request.contextPath}/UserAction?method=get&userId=${identity.userId}"><i class="layui-icon" style="margin-left: 2px; font-size: 22px;">&#xe68e;</i>我的主页</a></dd>
                                                            <hr style="margin: 5px 0;">
                                                            <dd><a href="${pageContext.request.contextPath}/UserAction?method=logout" style="text-align: center;">退出</a></dd>
                                                    </dl>
                                            </li>

                                        </c:if>
                                </ul>
                        </div>
                </div>
        </body>
</html>
