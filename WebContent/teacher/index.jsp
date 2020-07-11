<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
	
	<!-- Bootstrap CSS -->    
    <link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="<%=request.getContextPath()%>/bootstrap/css/elegant-icons-style.css" rel="stylesheet" />
    <link href="<%=request.getContextPath()%>/bootstrap/css/font-awesome.min.css" rel="stylesheet" />    
    <!-- full calendar css-->
    <link href="<%=request.getContextPath()%>/bootstrap/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
	<link href="<%=request.getContextPath()%>/bootstrap/assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
    <!-- easy pie chart-->
    <link href="<%=request.getContextPath()%>/bootstrap/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/css/owl.carousel.css" type="text/css">
	<link href="<%=request.getContextPath()%>/bootstrap/css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
    <!-- Custom styles -->
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/css/fullcalendar.css">
	<link href="<%=request.getContextPath()%>/bootstrap/css/widgets.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/bootstrap/css/style.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/bootstrap/css/style-responsive.css" rel="stylesheet" />
	<link href="<%=request.getContextPath()%>/bootstrap/css/xcharts.min.css" rel=" stylesheet">	
	<link href="<%=request.getContextPath()%>/bootstrap/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
<title>首页</title>
</head>
<body>
<%
   	User user=(User)request.getAttribute("user");   
%>
<!-- 导航栏 -->
<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top" style="font-size:20px">
  <div class="container">
  <a class="navbar-brand" href="#"><img src="<%=request.getContextPath()%>/img/icon.png" alt="" style="width:40px; height: 50px;"></a>
    <a class="navbar-brand" href="#">教师业务档案管理系统</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link"  href="<%=request.getContextPath()%>/teacher/Home.jsp" target="showframe">首页 </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath()%>/GetSchoolServlet" target="showframe">校园</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link" href="<%=request.getContextPath()%>/teacher/Course/CourseIndex.jsp?user_id=<%=user.getUser_id() %>"  target="showframe">课程表</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath()%>/teacher/Scientific/index.jsp?user_id=<%=user.getUser_id() %>" target="showframe">科研</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login.html" target="showframe">论文</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login.html" target="showframe">成绩</a>
      </li>
    </ul>
    </div>
    <!-- user login dropdown start-->
    <ul class="nav pull-right top-menu">
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">            
                            <span class="profile-ava">
                                <img alt="" src="<%=request.getContextPath()%>/bootstrap/img/avatar1_small.jpeg">
                            </span>
                            <span class="username"><%=user.getUsername() %></span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <li class="eborder-top">
                                <a href="<%=request.getContextPath()%>/PersonalInfoServlet?user_id=<%=user.getUser_id() %>"><i class="icon_profile"></i> My Profile</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_mail_alt"></i> My Inbox</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_clock_alt"></i> Timeline</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_chat_alt"></i> Chats</a>
                            </li>
                            <li>
                                <a href="<%=request.getContextPath()%>/login.jsp"><i class="icon_key_alt"></i> Log Out</a>
                            </li>
                            <li>
                                <a href="documentation.html"><i class="icon_key_alt"></i> Documentation</a>
                            </li>
                            <li>
                                <a href="documentation.html"><i class="icon_key_alt"></i> Documentation</a>
                            </li>
                        </ul>
                    </li>
                    <!-- user login dropdown end -->
     </ul>
     </div>
  </nav>
<div width="100%" height="90%" >
<iframe name="showframe" src="./teacher/Home.jsp" width="100%" height="100%" scrolling="yes" style="position:absolute;top:0px;left:0;border:0">
</iframe>
</div>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>
<!-- javascripts -->
    <script src="<%=request.getContextPath()%>/bootstrap/js/jquery.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery-ui-1.10.4.min.js"></script>
    <script src="<%=request.getContextPath()%>/bootstrap/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/bootstrap/js/jquery-ui-1.9.2.custom.min.js"></script>
    <!-- bootstrap -->
    <script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
    <!-- nice scroll -->
    <script src="<%=request.getContextPath()%>/bootstrap/js/jquery.scrollTo.min.js"></script>
    <script src="<%=request.getContextPath()%>/bootstrap/js/jquery.nicescroll.js" type="text/javascript"></script>
    <!-- charts scripts -->
    <script src="<%=request.getContextPath()%>/bootstrap/assets/jquery-knob/js/jquery.knob.js"></script>
    <script src="<%=request.getContextPath()%>/bootstrap/js/jquery.sparkline.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath()%>/bootstrap/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
    <script src="<%=request.getContextPath()%>/bootstrap/js/owl.carousel.js" ></script>
    <!-- jQuery full calendar -->
    <<script src="<%=request.getContextPath()%>/bootstrap/js/fullcalendar.min.js"></script> <!-- Full Google Calendar - Calendar -->
	<script src="<%=request.getContextPath()%>/bootstrap/assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
    <!--script for this page only-->
    <script src="<%=request.getContextPath()%>/bootstrap/js/calendar-custom.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery.rateit.min.js"></script>
    <!-- custom select -->
    <script src="<%=request.getContextPath()%>/bootstrap/js/jquery.customSelect.min.js" ></script>
	<script src="<%=request.getContextPath()%>/bootstrap/assets/chart-master/Chart.js"></script>
   
    <!--custome script for all page-->
    <script src="<%=request.getContextPath()%>/bootstrap/js/scripts.js"></script>
    <!-- custom script for this page-->
    <script src="<%=request.getContextPath()%>/bootstrap/js/sparkline-chart.js"></script>
    <script src="<%=request.getContextPath()%>/bootstrap/js/easy-pie-chart.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery-jvectormap-world-mill-en.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/xcharts.min.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery.autosize.min.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery.placeholder.min.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/gdp-data.js"></script>	
	<script src="<%=request.getContextPath()%>/bootstrap/js/morris.min.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/sparklines.js"></script>	
	<script src="<%=request.getContextPath()%>/bootstrap/js/charts.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery.slimscroll.min.js"></script>

</body>
</html>