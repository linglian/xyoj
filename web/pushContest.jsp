<%-- 
    Document   : pushContest
    Created on : 2018-1-26, 16:49:53
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
        </head>
        <body>
                <c:import url="top.jsp" />

                <div class="fly-panel" id="left" style="float: left; width: 675px; border: 1px solid gray;">
                        <form class="layui-form"  id="left_form" action="${pageContext.request.contextPath}/ContestAction?method=push" method="POST">
                                <div class="layui-form-item">
                                        <label class="layui-form-label">竞赛标题</label>
                                        <div class="layui-input-block">
                                                <input type="text" name="title" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
                                        </div>
                                </div>
                                <div class="layui-form-item layui-form-text">
                                        <label class="layui-form-label">竞赛介绍</label>
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
                                <div class="layui-form-item">
                                        <label class="layui-form-label">选择题目</label>
                                        <div class="layui-input-block">
                                                <input type='hidden' id='qNumber' name='qNumber' />
                                                <select name="questionSelect" lay-filter="filter" id="qs" lay-search>
                                                        <option value="" selected>请选择题目</option>
                                                </select>  
                                        </div>
                                </div>
                                <div class="layui-form-item">
                                        <div class="layui-input-block">
                                                <table class="layui-table" lay-even lay-skin="nob">
                                                        <colgroup>
                                                                <col width="100">
                                                                <col width="100">
                                                                <col width="100">
                                                                <col width="50">
                                                        </colgroup>
                                                        <thead>
                                                                <tr>
                                                                        <th>题目编号</th>
                                                                        <th>题目标题</th>
                                                                        <th>分值</th>
                                                                        <th>操作</th>
                                                                </tr> 
                                                        </thead>
                                                        <tbody id="questionTable">
                                                        </tbody>
                                                </table>
                                        </div>
                                </div>
                                <button type="submit" class="layui-btn layui-btn-normal" >
                                        提交
                                </button>
                        </form>
                </div>

                <script>
                    var questionMap = {}

                    function deleteQuestion(key) {
                        questionMap[key] = null;
                        draw();
                    }

                    function draw() {
                        $("#questionTable").html("");
                        var n = 0;
                        for (var key in questionMap) {
                            console.log(questionMap[key]);
                            if (questionMap[key] == null) {
                                continue;
                            }
                            var str = "" + questionMap[key];
                            var strs = str.split(',');
                            console.log(strs);
                            $("#questionTable").append("<tr><td>"
                                    + key
                                    + "</td><td>"
                                    + strs[1]
                                    + "</td><td>"
                                    + strs[2]
                                    + "</td><td><a class='layui-btn layui-btn-sm layui-btn-primary' onclick='deleteQuestion(" + key + ")'><input type='hidden' name='question_" + n + "' value='" + key + "'><i class='layui-icon'>&#xe640;</i></a></td></tr>")
                            n += 1;
                        }
                        $("#qNumber").val(n);
                    }

                    //Demo
                    layui.use('form', function () {
                        var form = layui.form;
                        form.on('select(filter)', function (data) {
                            if (data.value) {
                                questionMap[data.value] = data.elem.options[data.elem.selectedIndex].text;
                            }
                            draw();
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

                        $.get('${pageContext.request.contextPath}/QuestionAction?method=getQuestion').done(function (data) {
                            data = JSON.parse(data);
                            $("#qs").html("")
                            $("#qs").append("<option value='' selected>请选择题目</option>")
                            for (var i = 0; i < data.length; i++) {
                                var da = data[i];
                                $("#qs").append("<option value='"
                                        + da.questionId
                                        + "'>" + "No."
                                        + da.questionId
                                        + "," + da.title
                                        + "," + da.score
                                        + "</option>");
                            }
                            form.render();
                        })
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
