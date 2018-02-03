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
        <table class="layui-table" lay-even lay-skin="nob">
                <colgroup>
                        <col width="50">
                        <col width="150">
                        <col width="50">
                        <col width="50">
                        <col width="50">
                        <col width="50">
                        <col width="50">
                </colgroup>
                <thead>
                        <tr>
                                <th>竞赛编号</th>
                                <th>标题</th>
                                <th>开始时间</th>
                                <th>结束时间</th>
                                <th>操作</th>
                        </tr> 
                </thead>
                <tbody>
                <c:forEach items="${contestList}" var="q" begin="${(contestPage - 1) * contestLimit}" end="${contestPage * contestLimit - 1}" varStatus="status">
                        <tr>
                                <td>No.${q.contestId}</td>
                                <td>
                                        ${q.title}
                                </td>
                                <td>
                                        <jsp:useBean id="dateObject" class="java.util.Date" scope="page">

                                        </jsp:useBean>
                                        <jsp:setProperty property="time" name="dateObject" value="${q.startTime}"/>
                        <fmt:formatDate value="${dateObject}" type="date" pattern="yyyy-MM-dd HH:mm:ss"/>
                        </td>
                        <td>
                                <jsp:useBean id="dateObject2" class="java.util.Date" scope="page">

                                </jsp:useBean>
                                <jsp:setProperty property="time" name="dateObject2" value="${q.endTime}"/>
                        <fmt:formatDate value="${dateObject2}" type="date" pattern="yyyy-MM-dd HH:mm:ss"/>
                        </td>
                        <td>
                                <a href="ContestAction?method=get&contestId=${q.contestId}">
                                        <button class="layui-btn layui-btn-primary">
                                                <i class="layui-icon">&#xe600;</i> 查看
                                        </button>
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
