<%-- 
    Document   : contest
    Created on : 2018-1-22, 15:00:26
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
                <link rel="stylesheet" href="${pageContext.request.contextPath}/res/layui/css/layui.css">
                <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/global.css">
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>
        </head>
        <body>
                <c:import url="top.jsp" />
                <c:if test="${empty contest}">
                    <c:set var="info" value="未选择竞赛，请选择竞赛!" scope="session" />
                    <c:redirect url="ContestAction?method=getAllList&coderPage=1&coderLimit=10" />
                </c:if>

                <div class="fly-home fly-panel" style="background-image: url(https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516606181057&di=47fa0f209e644726c3c68e3a832c8254&imgtype=0&src=http%3A%2F%2Fimg1.3lian.com%2F2015%2Fa2%2F226%2Fd%2F311.jpg);">
                        <img src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516606181057&di=47fa0f209e644726c3c68e3a832c8254&imgtype=0&src=http%3A%2F%2Fimg1.3lian.com%2F2015%2Fa2%2F226%2Fd%2F311.jpg">
                        <h1>
                                ${contest.title}
                        </h1>
                        <p class="fly-home-info">
                                <span style="color: #FF7200;">${contest.body}</span>
                        </p>
                </div>

                <div class="layui-container">
                        <div class="layui-row layui-col-space15">
                                <div class="fly-panel">
                                        <ul class="jie-row">
                                                <c:if test="${not empty contest}">
                                                    <table class="layui-table" lay-even lay-skin="nob">
                                                            <colgroup>
                                                                    <col width="100">
                                                                    <col width="50">
                                                                    <col width="300">
                                                                    <col width="100">
                                                                    <col width="50">
                                                            </colgroup>
                                                            <thead>
                                                                    <tr>
                                                                            <th>题目标题</th>
                                                                            <th>分值</th>
                                                                            <th>剩余时间</th>
                                                                            <th>通过率</th>
                                                                            <th>操作</th>
                                                                    </tr> 
                                                            </thead>
                                                            <tbody>
                                                                    <c:forEach items="${CQMap[contest.contestId]}" var="q" varStatus="status">
                                                                        <tr>
                                                                                <td>No.${status.index + 1} ${questionMap[q].title}</td>
                                                                                <td>${questionMap[q].score}</td>
                                                                                <td>
                                                                                        <jsp:useBean id="dateObject" class="java.util.Date" scope="page"></jsp:useBean>
                                                                                        <jsp:setProperty property="time" name="dateObject" value="${questionMap[q].startTime}"/>
                                                                                        <fmt:formatDate value="${dateObject}" type="date" pattern="yyyy-MM-dd HH:mm:ss"/> - 
                                                                                        <jsp:useBean id="dateObject2" class="java.util.Date" scope="page"></jsp:useBean>
                                                                                        <jsp:setProperty property="time" name="dateObject2" value="${questionMap[q].endTime}"/>
                                                                                        <fmt:formatDate value="${dateObject2}" type="date" pattern="yyyy-MM-dd HH:mm:ss"/>
                                                                                        <c:choose>  
                                                                                            <c:when test="${questionMap[q].endTime - date > 0 && questionMap[q].endTime - date < 1000 * 60 * 60 * 24 *365}">
                                                                                                <span id="date_${status.index}"></span><span  id="time_${status.index}" hidden="true">${(questionMap[q].endTime - date) / 1000}</span>
                                                                                                </c:when>  
                                                                                                <c:otherwise>
                                                                                                    <c:choose>  
                                                                                                        <c:when test="${questionMap[q].endTime - date >= 1000 * 60 * 60 * 24 *365}">
                                                                                                        （永久开启）
                                                                                                    </c:when>  
                                                                                                    <c:otherwise>
                                                                                                        （已经结束）
                                                                                                    </c:otherwise>  
                                                                                                </c:choose>
                                                                                            </c:otherwise>  
                                                                                        </c:choose>
                                                                                </td>
                                                                                <td>
                                                                                        <c:choose>  
                                                                                            <c:when test="${questionMap[q].mainPeople == 0 || empty questionMap[q].mainPeople}">
                                                                                                无人挑战
                                                                                            </c:when>  
                                                                                            <c:otherwise>
                                                                                                ${questionMap[q].rightPeople} / ${questionMap[q].mainPeople}
                                                                                            </c:otherwise>  
                                                                                        </c:choose>  
                                                                                </td>
                                                                                <td><a href="QuestionAction?method=get&questionId=${questionMap[q].questionId}"><button class="layui-btn layui-btn-primary"><i class="layui-icon">&#xe600;</i> 详情</button></a></td>
                                                                        </tr>
                                                                    </c:forEach>
                                                            </tbody>
                                                    </table>
                                                </c:if>
                                                <c:if test="${empty contest}">
                                                    <div class="fly-none" style="min-height: 50px; padding:30px 0; height:auto;"><i style="font-size:14px;">没有任何题目</i></div>
                                                </c:if>
                                </div>
                                <div class="fly-panel">
                                        <ul class="jie-row">
                                                <c:if test="${not empty contestRank}">
                                                    <table class="layui-table" lay-even lay-skin="nob">
                                                            <colgroup>
                                                                    <col width="100">
                                                                    <col width="100">
                                                                    <col width="100">
                                                                    <col width="">
                                                            </colgroup>
                                                            <thead>
                                                                    <tr>
                                                                            <th>排名</th>
                                                                            <th>用户</th>
                                                                            <th>分值</th>
                                                                            <th>通过的题</th>
                                                                    </tr> 
                                                            </thead>
                                                            <tbody>
                                                                    <c:forEach items="${contestRank}" var="c" varStatus="status">

                                                                        <tr>
                                                                                <td>
                                                                                        ${status.index + rankPage + 1}
                                                                                </td>
                                                                                <td>
                                                                                        <a href="${pageContext.request.contextPath}/UserAction?method=get&userId=${c.userId}"  style="color: #01AAED;">
                                                                                                ${c.userId}
                                                                                        </a>
                                                                                </td>
                                                                                <td>
                                                                                        ${c.score}
                                                                                </td>
                                                                                <td>
                                                                                        <span class="layui-breadcrumb" lay-separator="-">
                                                                                                <c:forEach items="${fn:split(c.pass, ',')}" var="cp">
                                                                                                    <a href="${pageContext.request.contextPath}/QuestionAction?method=get&questionId=${cp}"  style="color: #01AAED;">
                                                                                                            ${questionMap[cp].title}<font style="color: #FF7200;">[${questionMap[cp].score}]</font>
                                                                                                    </a>
                                                                                                </c:forEach>
                                                                                        </span>
                                                                                </td>
                                                                        </tr>
                                                                    </c:forEach>
                                                            </tbody>
                                                    </table>
                                                    <div id="pageDiv" align="center"></div>
                                                </c:if>
                                                <c:if test="${empty contestRank}">
                                                    <div class="fly-none" style="min-height: 50px; padding:30px 0; height:auto;"><i style="font-size:14px;">没有任何排名</i></div>
                                                </c:if>
                                </div>
                        </div>
                </div>
                <script>
                    layui.use(['laypage', 'layer'], function () {
                        var laypage = layui.laypage
                                , layer = layui.layer;
                        laypage.render({
                            elem: 'pageDiv'
                            , count: ${fn:length(applicationScope.contestMap)}
                            , theme: '#1E9FFF'
                            , layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
                            , limit: ${contestLimit}
                            , curr: ${contestPage}
                            , jump: function (obj) {
                                if (obj.curr != ${contestPage} || obj.limit != ${contestLimit}) {
                                    location.href = "CoderAction?method=getAllList&contestPage=" + obj.curr + "&contestLimit=" + obj.limit;
                                }
                            }
                        });
                    });
                    //注意：导航 依赖 element 模块，否则无法进行功能性操作
                    layui.use('element', function () {
                        var element = layui.element;

                        //…
                    });
                </script>
        </body>
</html>
