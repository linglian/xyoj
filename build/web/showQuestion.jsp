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
                <link rel="stylesheet" href="layui/css/layui.css"  media="all">
                <link rel = "stylesheet" type = "text/css" href = "css/index.css"/>
                <script src="http://cdn.bootcss.com/jquery/1.12.3/jquery.min.js"></script> <!-- 你必须先引入jQuery1.8或以上版本 -->
                <script src="layer/layer.js"></script>
                <script src="layui/layui.js"></script>
                <script>
                    $(document).ready(function () {
                        function updateTime()
                        {
                            for (var i = 0; i < ${questionLimit}; i++) {
                                var time = parseInt($("#time_" + i).html());
                                if (time) {
                                    $("#time_" + i).html(time - 1);
                                    time = $("#time_" + i).html();
                                    time = parseInt(time);
                                    var hour = parseInt(time / 3600);
                                    var minute = parseInt((time - hour * 3600) / 60);
                                    var second = parseInt(time % 60);
                                    $("#date_" + i).html(hour + "小时" + minute + "分" + second + "秒");
                                }
                            }
                        }
                        updateTime();
                        window.setInterval(updateTime, 1000);
                    });
                </script>
                <c:if test="${not empty info}">
                    <script>layer.msg('${info}')</script>
                    <c:remove var="info" />
                </c:if>
                <c:if test="${empty sessionScope.identity}">
                    <c:set var="info" value="尚未登录，请登录!" scope="session" />
                    <c:redirect url="login.jsp" />
                </c:if>
                <c:if test="${empty applicationScope.questionList}">
                    <c:set var="info" value="尚未获取题目，正在重新获取题目列表!" scope="session" />
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
                <table class="layui-table" lay-even lay-skin="nob">
                        <colgroup>
                                <col width="100">
                                <col width="50">
                                <col width="200">
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
                                                                    （彭倩最好了）
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
                                                            ${q.rightPeople / q.mainPeople}(${q.rightPeople} / ${q.mainPeople})
                                                        </c:otherwise>  
                                                    </c:choose>  
                                            </td>
                                            <td><a href="QuestionAction?method=get&questionId=${q.questionId}"><button class="layui-btn layui-btn-primary"><i class="layui-icon">&#xe600;</i> 挑战</button></a></td>
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
                                    location.href = "QuestionAction?method=getList&questionPage=" + obj.curr + "&questionLimit=" + obj.limit;
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
