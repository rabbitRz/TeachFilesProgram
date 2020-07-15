<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主页面-管理员</title>
<!-- Bootstrap CSS -->    
    <link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="<%=request.getContextPath() %>/bootstrap/css/elegant-icons-style.css" rel="stylesheet" />
    <link href="<%=request.getContextPath() %>/bootstrap/css/font-awesome.min.css" rel="stylesheet" />    
    <!-- full calendar css-->
    <link href="<%=request.getContextPath() %>/bootstrap/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
	<link href="<%=request.getContextPath() %>/bootstrap/assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
    <!-- easy pie chart-->
    <link href="<%=request.getContextPath() %>/bootstrap/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
    <link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/owl.carousel.css" type="text/css">
	<link href="<%=request.getContextPath() %>/bootstrap/css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
    <!-- Custom styles -->
	<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/fullcalendar.css">
	<link href="<%=request.getContextPath() %>/bootstrap/css/widgets.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/bootstrap/css/style.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/bootstrap/css/style-responsive.css" rel="stylesheet" />
	<link href="<%=request.getContextPath() %>/bootstrap/css/xcharts.min.css" rel=" stylesheet">	
	<link href="<%=request.getContextPath() %>/bootstrap/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
</head>
<body>
  <!-- container section start -->
  <section id="container" class="">
     
      
      <header class="header dark-bg">
            <div class="toggle-nav">
                <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"></div>
            </div>

            <!--logo start-->
            <a href="<%=request.getContextPath()%>/teacher/index.jsp" class="logo">教师业务档案 <span class="lite">管理系统</span></a>
            <!--logo end-->

            <div class="nav search-row" id="top_menu">
                <!--  search form start -->
                <ul class="nav top-menu">                    
                    <li>
                        <form class="navbar-form">
                            <input class="form-control" placeholder="Search" type="text">
                        </form>
                    </li>                    
                </ul>
                <!--  search form end -->                
            </div>

            <div class="top-nav notification-row">                
                <!-- notificatoin dropdown start-->
                <ul class="nav pull-right top-menu">           
                    <!-- user login dropdown start-->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                               <img alt="" src="<%=request.getContextPath()%>/bootstrap/img/avatar1_small.jpeg">
                            </span>
        <%
   			User user=(User)request.getAttribute("user");   
		%>
                            <span class="username"><%=user.getUsername() %></span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <li class="eborder-top">
                                <a href="<%=request.getContextPath()%>/PersonalInfoServlet?user_id=<%=user.getUser_id() %>"><i class="icon_profile"></i> My Profile</a>
                            </li>
                            <li>
                                <a href="<%=request.getContextPath()%>/login.jsp"><i class="icon_key_alt"></i> Log Out</a>
                            </li>
                        </ul>
                    </li>
                    <!-- user login dropdown end -->
                </ul>
                <!-- notificatoin dropdown end-->
            </div>
      </header>      
      <!--header end-->

      <!--sidebar start-->
      <aside width="20%" >
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu">                
                  <li class="active">
                      <a class="" href="<%=request.getContextPath()%>/admin/Home.jsp" target="showframe">
                          <i class="icon_house_alt"></i>
                          <span>首页</span>
                      </a>
                  </li>
				  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_genius"></i>
                          <span>教师信息管理</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                      	  <li><a class="" href="<%=request.getContextPath() %>/admin/teacherManage/createUser.jsp" target="showframe">创建账户</a></li>
                      	  <li><a class="" href="<%=request.getContextPath() %>/ShowUIdServlet" target="showframe">添加老师信息</a></li>
                          <li><a class="" href="<%=request.getContextPath() %>/ShowAllTeacherServlet" target="showframe">显示老师信息</a></li>                          
                          
                      </ul>
                  </li>       
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_document_alt"></i>
                          <span>论文信息管理</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="<%=request.getContextPath() %>/AdminGetPaperServlet" target="showframe">显示论文信息</a></li>
                         <li><a class="" href="<%=request.getContextPath() %>/AdminGetPaperPeopleServlet" target="showframe">添加论文信息</a></li>
                      
                      </ul>
                  </li>
                             
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_table"></i>
                          <span>课程信息管理</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="<%=request.getContextPath() %>/admin/Course/courseIndex.jsp" target="showframe">查看所有课程信息</a></li>
                          <li><a class="" href="<%=request.getContextPath() %>/admin/Course/InsertCourse.jsp" target="showframe">录入课程信息</a></li>
                      </ul>
                  </li>
                  
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_documents_alt"></i>
                          <span>项目信息管理</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">                          
                      	  <li><a class="" href="<%=request.getContextPath() %>/admin/ProjectManage/addProject.jsp" target="showframe">添加项目信息</a></li>
                          <li><a class="" href="<%=request.getContextPath() %>/ShowAllProjectServlet" target="showframe">已分配人员的项目信息</a></li>    
                          <li><a class="" href="<%=request.getContextPath() %>/ShowNotProjectServlet" target="showframe">未分配人员的项目信息</a></li>                      
                      </ul>
                  </li>
                  
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_desktop"></i>
                          <span>信息审核</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                        <li><a class="" href="<%=request.getContextPath()  %>/AdminApplicationServlet" target="showframe">审核</a></li>
                          <li><a class="" href="<%=request.getContextPath()  %>/AdminApplicationHistoryServlet" target="showframe">历史记录</a></li>
                      </ul>
                  </li>
                  
              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->
	<iframe name="showframe" src="./admin/Home.jsp" width="90%" height="100%"  style="position:absolute;top:0px;left:180px;right:0;bottom:0;border:0">
	</iframe>
    <!-- javascripts -->
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery-ui-1.10.4.min.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap/js/jquery-ui-1.9.2.custom.min.js"></script>
    <!-- bootstrap -->
    <script src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.min.js"></script>
    <!-- nice scroll -->
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.scrollTo.min.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.nicescroll.js" type="text/javascript"></script>
    <!-- charts scripts -->
    <script src="<%=request.getContextPath() %>/bootstrap/assets/jquery-knob/js/jquery.knob.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.sparkline.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/owl.carousel.js" ></script>
    <!-- jQuery full calendar -->
    <<script src="<%=request.getContextPath() %>/bootstrap/js/fullcalendar.min.js"></script> <!-- Full Google Calendar - Calendar -->
	<script src="<%=request.getContextPath() %>/bootstrap/assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
    <!--script for this page only-->
    <script src="<%=request.getContextPath() %>/bootstrap/js/calendar-custom.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.rateit.min.js"></script>
    <!-- custom select -->
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.customSelect.min.js" ></script>
	<script src="<%=request.getContextPath() %>/bootstrap/assets/chart-master/Chart.js"></script>
   
    <!--custome script for all page-->
    <script src="<%=request.getContextPath() %>/bootstrap/js/scripts.js"></script>
    <!-- custom script for this page-->
    <script src="<%=request.getContextPath() %>/bootstrap/js/sparkline-chart.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/easy-pie-chart.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery-jvectormap-world-mill-en.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/xcharts.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.autosize.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.placeholder.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/gdp-data.js"></script>	
	<script src="<%=request.getContextPath() %>/bootstrap/js/morris.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/sparklines.js"></script>	
	<script src="<%=request.getContextPath() %>/bootstrap/js/charts.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.slimscroll.min.js"></script>
<script>

      //knob
      $(function() {
        $(".knob").knob({
          'draw' : function () { 
            $(this.i).val(this.cv + '%')
          }
        })
      });

      //carousel
      $(document).ready(function() {
          $("#owl-slider").owlCarousel({
              navigation : true,
              slideSpeed : 300,
              paginationSpeed : 400,
              singleItem : true

          });
      });

      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });
	  
	  /* ---------- Map ---------- */
	$(function(){
	  $('#map').vectorMap({
	    map: 'world_mill_en',
	    series: {
	      regions: [{
	        values: gdpData,
	        scale: ['#000', '#000'],
	        normalizeFunction: 'polynomial'
	      }]
	    },
		backgroundColor: '#eef3f7',
	    onLabelShow: function(e, el, code){
	      el.html(el.html()+' (GDP - '+gdpData[code]+')');
	    }
	  });
	});



  </script>
  </body>
</html>