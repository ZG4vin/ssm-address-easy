<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
%>
<!DOCTYPE HTML>
<html>
<head>
    <title>通讯录管理系统</title>
    <link href="<%=basePath%>/css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <!-- -->
    <script>var __links = document.querySelectorAll('a');

    function __linkClick(e) {
        parent.window.postMessage(this.href, '*');
    };
    for (var i = 0, l = __links.length; i < l; i++) {
        if (__links[i].getAttribute('data-t') == '_blank') {
            __links[i].addEventListener('click', __linkClick, false);
        }
    }</script>
    <script src="js/jquery.min.js"></script>
    <script>$(document).ready(function (c) {
        $('.alert-close').on('click', function (c) {
            $('.message').fadeOut('slow', function (c) {
                $('.message').remove();
            });
        });
    });
    </script>
</head>
<body>
<!-- contact-form -->
<div class="message warning">
    <div class="inset">
        <div class="login-head">
            <h1>通讯录管理系统</h1>
            <div class="alert-close"></div>
        </div>
        <form action="/login/toIndex" method="post">
            <li>
                <input type="text" class="text" placeholder="请输入您的用户名" name="username"><a href="#" class=" icon user"></a>
            </li>
            <li>
                <input type="password" placeholder="请输入您的密码" name="password"> <a href="#" class="icon lock"></a>
            </li>
            <div class="submit">
                <input type="submit"  value="登录">
                <div class="clear"></div>
            </div>
        </form>
    </div>
</div>
</div>
<div class="clear"></div>
<!--- footer --->
<div class="footer">

</div>

</body>
</html>