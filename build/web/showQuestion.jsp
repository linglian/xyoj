<%-- 
    Document   : showQuestion
    Created on : 2018-1-9, 10:51:26
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
                <c:if test="${not empty info}">
                    <script>layer.msg('${info}')</script>
                    <c:remove var="info" />
                </c:if>
                <c:if test="${empty sessionScope.identity}">
                    <c:set var="info" value="尚未登录，请登录!" scope="session" />
                    <c:redirect url="login.jsp" />
                </c:if>
        </head>
        <body>
                <c:import url="top.jsp" />
                <table class="layui-table" lay-even lay-skin="nob">
                        <colgroup>
                                <col width="100">
                                <col width="50">
                                <col width="200">
                                <col width="100">
                                <col width="100">
                                <col width="50">
                        </colgroup>
                        <thead>
                                <tr>
                                        <th>题目标题</th>
                                        <th>分值</th>
                                        <th>剩余时间</th>
                                        <th>通过率</th>
                                        <th>相关竞赛</th>
                                        <th>操作</th>
                                </tr> 
                        </thead>
                        <tbody>
                                <c:forEach items="${applicationScope.questionList}" var="q" begin="${(questionPage - 1) * questionLimit}" end="${questionPage * questionLimit - 1}" varStatus="status">
                                    <tr>
                                            <td>No.${q.questionId} ${q.title}</td>
                                            <td>${q.score}</td>
                                            <td>
                                                    <jsp:useBean id="dateObject" class="java.util.Date" scope="page"></jsp:useBean>
                                                    <jsp:setProperty property="time" name="dateObject" value="${q.startTime}"/>
                                                    <fmt:formatDate value="${dateObject}" type="date" pattern="yyyy-MM-dd HH:mm:ss"/> - 
                                                    <jsp:useBean id="dateObject2" class="java.util.Date" scope="page"></jsp:useBean>
                                                    <jsp:setProperty property="time" name="dateObject2" value="${q.endTime}"/>
                                                    <fmt:formatDate value="${dateObject2}" type="date" pattern="yyyy-MM-dd HH:mm:ss"/>
                                                    <c:choose>  
                                                        <c:when test="${q.endTime - date > 0 && q.endTime - date < 1000 * 60 * 60 * 24 *365}">
                                                            <span id="date_${status.index}"></span><span  id="time_${status.index}" hidden="true">${(q.endTime - date) / 1000}</span>
                                                            </c:when>  
                                                            <c:otherwise>
                                                                <c:choose>  
                                                                    <c:when test="${q.endTime - date >= 1000 * 60 * 60 * 24 *365}">
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
                                                        <c:when test="${q.mainPeople == 0 || empty q.mainPeople}">
                                                            无人挑战
                                                        </c:when>  
                                                        <c:otherwise>
                                                            ${q.rightPeople} / ${q.mainPeople}
                                                        </c:otherwise>  
                                                    </c:choose>  
                                            </td>
                                            <td>
                                                    <c:if test="${not empty q.contestId}">
                                                        <a href="${pageContext.request.contextPath}/ContestAction?method=get&contestId=${q.contestId}" style="color: #01AAED;">
                                                                ${contestMap[q.contestId].title}
                                                        </a>
                                                    </c:if>
                                            </td>
                                            <td>
                                                    <a href="${pageContext.request.contextPath}/QuestionAction?method=get&questionId=${q.questionId}">
                                                            <button class="layui-btn layui-btn-primary">
                                                                    <i class="layui-icon">&#xe600;</i> 详情</button>
                                                    </a>
                                            </td>
                                    </tr>
                                </c:forEach>
                        </tbody>
                </table>
                <div id="pageDiv" align="center"></div>
                <script>
                    layui.use(['laypage', 'layer'], function () {
                        var laypage = layui.laypage
                                , layer = layui.layer;
                        laypage.render({
                            elem: 'pageDiv'
                            , count: ${fn:length(applicationScope.questionList)}
                            , theme: '#1E9FFF'
                            , layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
                            , limit: ${questionLimit}
                            , curr: ${questionPage}
                            , jump: function (obj) {
                                if (obj.curr != ${questionPage} || obj.limit != ${questionLimit}) {
                                    location.href = "${pageContext.request.contextPath}/QuestionAction?method=getList&questionPage=" + obj.curr + "&questionLimit=" + obj.limit;
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
