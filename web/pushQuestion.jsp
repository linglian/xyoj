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
                <script>
                    function addExample() {
                        var index = $("#number").val();
                        var str = $("#inputDemo").html();
                        str = str.replace("第1组", "第" + (parseInt(index) + 1) + "组");
                        str = str.replace("input_0", "input_" + index);
                        str = str.replace("output_0", "output_" + index);
                        $("#number").val(parseInt(index) + 1);
                        $("#left_form").append(str);
                    }
                </script>
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
        </head>
        <body>
                <c:import url="top.jsp" />
                <c:if test="${sessionScope.identity.lvl != -99}">
                    <c:set var="info" value="无权查看，请使用管理员账号登录" scope="session" />
                    <c:redirect url="login.jsp" />
                </c:if>
                <div class="fly-panel" id="left" style="float: left; width: 675px; border: 1px solid gray;">
                        <form class="layui-form"  id="left_form" action="${pageContext.request.contextPath}/QuestionAction?method=push" method="POSt">
                                <div class="layui-form-item">
                                        <label class="layui-form-label">题目标题</label>
                                        <div class="layui-input-block">
                                                <input type="text" name="title" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
                                        </div>
                                </div>
                                <div class="layui-form-item">
                                        <label class="layui-form-label">分值</label>
                                        <div class="layui-input-block">
                                                <input type="radio" name="score" value="1" title="1" checked>
                                                <input type="radio" name="score" value="2" title="2" >
                                                <input type="radio" name="score" value="3" title="3" >
                                                <input type="radio" name="score" value="4" title="4" >
                                                <input type="radio" name="score" value="5" title="5" >
                                        </div>
                                </div>
                                <div class="layui-form-item layui-form-text">
                                        <label class="layui-form-label">题目要求</label>
                                        <div class="layui-input-block">
                                                <textarea name="body" required lay-verify="required" placeholder="请输入内容"  class="layui-textarea fly-editor" style="height: 150px;"></textarea>
                                        </div>
                                </div>
                                <div class="layui-form-item">
                                        <label class="layui-form-label">限制时间</label>
                                        <div class="layui-input-block">
                                                <input type="checkbox" name="isSetTime" lay-skin="switch" lay-filter="isSetTimeSwitch" lay-text="开启|关闭" checked>
                                        </div>
                                </div>
                                <span id="setTime">
                                        <div class="layui-form-item">
                                                <div class="site-demo-laydate">
                                                        <label class="layui-form-label">设置时间</label>
                                                        <div class="layui-inline" id="test-n1"></div>
                                                </div>
                                        </div>
                                        <div class="layui-form-item">
                                                <label class="layui-form-label">开始时间</label>
                                                <div class="layui-input-block">
                                                        <input type="text" id="startTime" name="startTime"  class="layui-input">
                                                </div>
                                        </div>
                                        <div class="layui-form-item">
                                                <label class="layui-form-label">结束时间</label>
                                                <div class="layui-input-block">
                                                        <input type="text" id="endTime" name="endTime" class="layui-input">
                                                </div>
                                        </div>
                                </span>
                                <div class="layui-form-item layui-form-text">
                                        <label class="layui-form-label">输入格式</label>
                                        <div class="layui-input-block">
                                                <textarea name="inputFormat" required lay-verify="required" placeholder="请输入内容"  class="layui-textarea fly-editor" style="height: 150px;"></textarea> 
                                        </div>
                                </div>
                                <div class="layui-form-item layui-form-text">
                                        <label class="layui-form-label">输出格式</label>
                                        <div class="layui-input-block">
                                                <textarea name="outputFormat" required lay-verify="required" placeholder="请输入内容"  class="layui-textarea fly-editor" style="height: 150px;"></textarea>
                                        </div>
                                </div>
                                <div class="layui-form-item layui-form-text">
                                        <label class="layui-form-label">输入样例</label>
                                        <div class="layui-input-block">
                                                <textarea name="inputTest" required lay-verify="required" placeholder="请输入内容"  class="layui-textarea fly-editor" style="height: 150px;"></textarea>
                                        </div>
                                </div>
                                <div class="layui-form-item layui-form-text">
                                        <label class="layui-form-label">输出样例</label>
                                        <div class="layui-input-block">
                                                <textarea name="outputTest" required lay-verify="required" placeholder="请输入内容"  class="layui-textarea fly-editor" style="height: 150px;"></textarea>
                                        </div>
                                </div>
                                <input type="text" id="number" name="number" value="1" class="layui-input">
                                <div class="layui-form-item">
                                        <label class="layui-form-label">测试数据</label>
                                        <div class="layui-input-block" align="center">
                                                <a class="layui-btn layui-btn-normal" onclick="addExample()"><i class="layui-icon">&#xe654;</i></a>
                                        </div>
                                </div>
                                <div  id="inputDemo" >
                                        <div class="layui-form-item layui-form-text">
                                                <fieldset class="layui-elem-field layui-field-title">
                                                        <legend>第1组
                                                        </legend>
                                                        <div class="layui-block">
                                                                <label class="layui-form-label">输入</label>
                                                                <div class="layui-input-block">
                                                                        <textarea name="input_0" placeholder="请输入内容" class="layui-textarea"></textarea>
                                                                </div>
                                                        </div>
                                                        <div class="layui-block">
                                                                <label class="layui-form-label">输出</label>
                                                                <div class="layui-input-block">
                                                                        <textarea name="output_0" placeholder="请输入内容" class="layui-textarea"></textarea>
                                                                </div>
                                                        </div>
                                                </fieldset>
                                        </div>
                                </div>
                                <button type="submit" class="layui-btn layui-btn-normal" >
                                        提交
                                </button>
                        </form>
                </div>

                <div class="fly-panel" id="left" style="float: left; width: 960px; border: 1px solid gray;">
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
                                        <c:forEach items="${applicationScope.questionList}" var="q" varStatus="status">
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
                                                                    ${q.rightPeople} / ${q.mainPeople}
                                                                </c:otherwise>  
                                                            </c:choose>  
                                                    </td>
                                                    <td><a href="QuestionAction?method=get&questionId=${q.questionId}"><button class="layui-btn layui-btn-primary"><i class="layui-icon">&#xe600;</i> 挑战</button></a></td>
                                            </tr>
                                        </c:forEach>
                                </tbody>
                        </table>
                </div>
                <script>
                    //Demo
                    layui.use('form', function () {
                        var form = layui.form;

                        //监听提交
                        form.on('submit(formDemo)', function (data) {
                            layer.msg(JSON.stringify(data.field));
                            return false;
                        });

                        //监听指定开关
                        form.on('switch(isSetTimeSwitch)', function (data) {
                            if (!this.checked) {
                                $("#setTime").css("display", "none");
                                layer.tips('该题将没有时间限制', data.othis, {
                                    tips: [2, 'red']
                                    , time: 400
                                });
                            } else {
                                $("#setTime").css("display", "block");
                                layer.tips('请设置该题的时间', data.othis, {
                                    tips: [2, 'green']
                                    , time: 400
                                });
                            }
                        });
                    });

                    layui.use('laydate', function () {
                        var laydate = layui.laydate;
                        //直接嵌套显示
                        laydate.render({
                            elem: '#test-n1'
                            , position: 'static'
                            , type: 'datetime'
                            , range: true
                            , done: function (value, date, endDate) {
                                // console.log(value); //得到日期生成的值，如：2017-08-18
                                var d = new Date();
                                d.setFullYear(date.year);
                                d.setMonth(date.month - 1);
                                d.setDate(date.date);
                                d.setHours(date.hours);
                                d.setMinutes(date.minutes);
                                d.setSeconds(date.seconds);
                                $("#startTime").val(d.getTime());
                                var ed = new Date();
                                ed.setFullYear(endDate.year);
                                ed.setMonth(endDate.month - 1);
                                ed.setDate(endDate.date);
                                ed.setHours(endDate.hours);
                                ed.setMinutes(endDate.minutes);
                                ed.setSeconds(endDate.seconds);
                                $("#endTime").val(ed.getTime());
                            }
                        });
                    });
                    layui.cache.page = 'jie';
                    layui.cache.user = {
                        username: '游客'
                        , uid: -1
                        , avatar: 'res/images/avatar/00.jpg'
                        , experience: 83
                        , sex: '男'
                    };
                    layui.config({
                        version: "3.0.0"
                        , base: 'res/mods/'
                    }).extend({
                        fly: 'index'
                    }).use(['fly', 'face'], function () {
                        var $ = layui.$
                                , fly = layui.fly;
                        $('.detail-body').each(function () {
                            var othis = $(this), html = othis.html();
                            othis.html(fly.content(html));
                        });
                    });
                </script>
        </body>
</html>
