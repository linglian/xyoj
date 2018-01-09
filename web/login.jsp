<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">  

<html>
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
                <title>向阳小队专版OJ</title>
                <link rel = "stylesheet" type = "text/css" href = "css/login.css"/>
                <script src="http://cdn.bootcss.com/jquery/1.12.3/jquery.min.js"></script> <!-- 你必须先引入jQuery1.8或以上版本 -->
                <script src="layer/layer.js"></script>
                <c:if test="${not empty info}">
                        <script>layer.msg('${info}')</script>
                        <c:remove var="info" />
                </c:if>
        </head>

        <body>
                <form action="UserAction?method=login" method="POST">
                        <div id="login_div">
                                <h2>用户登录</h2>
                                <input class="login_input" type="text" name="userId" placeholder="用户名" required="" autofocus="" style="margin-top:30px; border-radius:5px;"/><br/><br/>
                                <input class="login_input" type="password" name="password" placeholder="密码" required="" autofocus="" style="margin-top:0; border-radius:5px;border-top:1px solid #ccc"/><br/>
                                <input id="login" type="submit" value="登录"/>
                        </div>
                </form>
        </body>
</html>
