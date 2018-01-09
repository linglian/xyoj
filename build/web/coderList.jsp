<%-- 
    Document   : coderList
    Created on : 2018-1-9, 18:07:22
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
                <c:if test="${empty applicationScope.coderList}">
                    <c:set var="info" value="尚未获取提交列表，正在重新获取提交列表!" scope="session" />
                    <c:redirect url="CoderAction?method=getAllList&coderPage=1&coderLimit=10" />
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
                <table class="layui-table" lay-even lay-skin="nob">
                        <colgroup>
                                <col width="50">
                                <col width="50">
                                <col width="200">
                                <col width="50">
                                <col width="50">
                                <col width="50">
                        </colgroup>
                        <thead>
                                <tr>
                                        <th>提交编号</th>
                                        <th>题目编号</th>
                                        <th>提交时间</th>
                                        <th>运行状态</th>
                                        <th>提交者</th>
                                        <th>操作</th>
                                </tr> 
                        </thead>
                        <tbody>
                                <c:forEach items="${applicationScope.coderList}" var="q" begin="${(coderPage - 1) * coderLimit}" end="${coderPage * coderLimit - 1}" varStatus="status">
                                    <tr>
                                            <td>No.${q.coderId}</td>
                                            <td><a href="QuestionAction?method=get&questionId=${q.questionId}" style="color: #01AAED;">No.${q.questionId} （戳这里）</a></td>
                                            <td>
                                                    <jsp:useBean id="dateObject" class="java.util.Date" scope="page"></jsp:useBean>
                                                    <jsp:setProperty property="time" name="dateObject" value="${q.time}"/>
                                                    <fmt:formatDate value="${dateObject}" type="date" pattern="yyyy-MM-dd HH:mm:ss"/>
                                            </td>
                                            <td>
                                                    <c:choose>  
                                                        <c:when test="${empty q.status || q.status == 0}">
                                                            正在运行
                                                        </c:when>  
                                                        <c:otherwise>
                                                            ${applicationScope.coderStatus[q.status + 6].name}
                                                        </c:otherwise>  
                                                    </c:choose>
                                            </td>
                                            <td>
                                                    ${q.userId}
                                            </td>
                                            <td><a href="CoderAction?method=get&coderId=${q.coderId}"><button class="layui-btn layui-btn-primary"><i class="layui-icon">&#xe600;</i> 查看</button></a></td>
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
                            , count: ${fn:length(applicationScope.coderList)}
                            , theme: '#1E9FFF'
                            , layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
                            , limit: ${coderLimit}
                            , curr: ${coderPage}
                            , jump: function (obj) {
                                if (obj.curr != ${coderPage} || obj.limit != ${coderLimit}) {
                                    location.href = "CoderAction?method=getAllList&coderPage=" + obj.curr + "&coderLimit=" + obj.limit;
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
