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
            <a href="index.html" class="logo">教师业务档案 <span class="lite">管理系统</span></a>
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
                            <span class="username">Jenifer Smith</span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <div class="log-arrow-up"></div>
                            <li class="eborder-top">
                                <a href="#"><i class="icon_profile"></i> My Profile</a>
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
                                <a href="login.html"><i class="icon_key_alt"></i> Log Out</a>
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
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu">                
                  <li class="active">
                      <a class="" href="<%=request.getContextPath() %>/admin/NewFile.jsp">
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
                          <li><a class="" href="<%=request.getContextPath() %>/ShowAllTeacherServlet">显示老师信息</a></li>                          
                          <li><a class="" href="form_validation.html">添加老师信息</a></li>
                      </ul>
                  </li>       
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_document_alt"></i>
                          <span>论文信息管理</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="general.html">Elements</a></li>
                          <li><a class="" href="buttons.html">Buttons</a></li>
                          <li><a class="" href="grids.html">Grids</a></li>
                      </ul>
                  </li>
                             
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_table"></i>
                          <span>课程信息管理</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="basic_table.html">Basic Table</a></li>
                      </ul>
                  </li>
                  
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_documents_alt"></i>
                          <span>项目信息管理</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">                          
                          <li><a class="" href="profile.html">Profile</a></li>
                          <li><a class="" href="login.html"><span>Login Page</span></a></li>
                          <li><a class="" href="blank.html">Blank Page</a></li>
                          <li><a class="" href="404.html">404 Error</a></li>
                      </ul>
                  </li>
                  
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_desktop"></i>
                          <span>信息审核</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="basic_table.html">Basic Table</a></li>
                      </ul>
                  </li>
                  
              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->
      
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">            
              <!--overview start-->
			  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-home"></i> 首页</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="<%=request.getContextPath() %>/admin/index.jsp">Home</a></li>
						<li><i class=""></i></li>				  	
					</ol>
				</div>
			</div>

			<div class="row">
		    <div class="col-lg-9 col-md-12">
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h2><i class="fa fa-map-marker red"></i><strong>Countries</strong></h2>
							<div class="panel-actions">
								<a href="index.html#" class="btn-setting"><i class="fa fa-rotate-right"></i></a>
								<a href="index.html#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
								<a href="index.html#" class="btn-close"><i class="fa fa-times"></i></a>
							</div>	
						</div>
						<div class="panel-body-map">
							<div id="map" style="height:380px;"></div>	
						</div>
	
					</div>
				</div>
              <div class="col-md-3">
              <!-- List starts -->
				<ul class="today-datas">
                <!-- List #1 -->
				<li>
                  <!-- Graph -->
                  <div><span id="todayspark1" class="spark"></span></div>
                  <!-- Text -->
                  <div class="datas-text">11,500 visitors/day</div>
                </li>
                <li>
                  <div><span id="todayspark2" class="spark"></span></div>
                  <div class="datas-text">15,000 Pageviews</div>
                </li>
                <li>
                  <div><span id="todayspark3" class="spark"></span></div>
                  <div class="datas-text">30.55% Bounce Rate</div>
                </li>
                <li>
                  <div><span id="todayspark4" class="spark"></span></div>
                  <div class="datas-text">$16,00 Revenue/Day</div>
                </li> 
                <li>
                  <div><span id="todayspark5" class="spark"></span></div>
                  <div class="datas-text">12,000000 visitors every Month</div>
                </li>                                                                                                              
              </ul>
              </div>
              
			 
           </div>  
			<br><br>
		
              <!-- project team & activity end -->

          </section>
      </section>
      <!--main content end-->
  </section>
  <!-- container section start -->

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