<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">

    <title>通讯录管理系统</title>

    <!-- Bootstrap CSS -->
    <link href="<%=basePath%>/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="<%=basePath%>/css/bootstrap-theme.css" rel="stylesheet">

    <link href="<%=basePath%>/css/styleIndex.css" rel="stylesheet">

</head>

<body>
<!-- container section start -->
<section id="container" class="">
    <header class="header dark-bg">
        <div class="toggle-nav">
            <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"></div>
        </div>

        <!--logo start-->
        <a href="index.html" class="logo"><span class="lite">通讯录管理系统</span></a>
        <!--logo end-->

        <div class="top-nav notification-row">
            <!-- notificatoin dropdown start-->
            <ul class="nav pull-right top-menu">
                <!-- user login dropdown start-->
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <span class="username">欢迎您，${username}</span>
                    </a>
                </li>
                <!-- user login dropdown end -->
            </ul>
            <!-- notificatoin dropdown end-->
        </div>
    </header>
    <!--header end-->

    <!--sidebar start-->
    <aside>
        <div id="sidebar" class="nav-collapse ">
            <!-- sidebar menu start-->
            <ul class="sidebar-menu">
                <li>
                    <a class="" href="javascript:void(0)">
                        <i class="icon_house_alt"></i>
                        <span>首页</span>
                    </a>
                </li>
                <li>
                    <a class="" id="toAdd" href="javascript:void(0)" >
                        <i class="icon_pencil-edit"></i>
                        <span>添加联系人</span>
                    </a>
                </li>${person.id}
                <li>
                    <a class="" id="toFind" href="javascript:void(0)">
                        <i class="icon_piechart"></i>
                        <span>查询联系人</span>
                    </a>
                </li>
            </ul>
            <!-- sidebar menu end-->
        </div>
    </aside>
    <!--main content end-->
    <section id="main-content">
        <section class="wrapper">
            <div id="content"></div>
        </section>
    </section>
</section>
<!-- container section end -->


<!-- javascripts -->
<script src="<%=basePath%>/js/jquery.js"></script>
<script src="<%=basePath%>/js/jquery.min.js"></script>
<!-- bootstrap -->
<script src="<%=basePath%>/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#toAdd").click(function () {
            $("#content").load("/index/toAdd");
        })
        $("#toFind").click(function () {
            $("#content").load("/index/toFind");
        })
    })
</script>
</body>
</html>