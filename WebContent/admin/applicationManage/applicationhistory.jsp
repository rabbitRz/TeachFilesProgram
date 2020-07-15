<%@page import="bean.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>显示已审核过的申请信息</title>
<!-- Bootstrap CSS -->    
<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- bootstrap theme -->
<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
<!--external css-->
<!-- font icon -->
<link href="<%=request.getContextPath() %>/bootstrap/css/elegant-icons-style.css" rel="stylesheet" />
<link href="<%=request.getContextPath() %>/bootstrap/css/font-awesome.min.css" rel="stylesheet" />
<!-- Custom styles -->
<link href="<%=request.getContextPath() %>/bootstrap/css/style.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/css/style-responsive.css" rel="stylesheet" />
</head>
<body>
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
          <section class="wrapper">            
              <!--overview start-->
			  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-th-list"></i> 显示已审核过的申请信息</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="<%=request.getContextPath() %>/admin/Home.jsp">Home</a></li>
						<li><i class="icon_genius"></i>已审核过的信息管理</li>
						<li><i class="fa fa-th-list"></i>显示已审核过的申请信息</li>				  	
					</ol>
				</div>
			</div>

			<div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                              显示已审核过的申请信息表
                          </header>
                          <form action="" method='get'>
                          <table class="table table-striped table-advance table-hover">
                           <tbody>
                              <tr>
                                 <th><i class="icon_profile"></i>姓名</th>
								 <th><i class="icon_mail_alt"></i>性别</th>
                                 <th><i class="icon_mail_alt"></i>籍贯</th>
                                 <th><i class="icon_calendar"></i>出生日期</th>                                
                                 <th><i class="icon_pin_alt"></i>学历</th>
                                 <th><i class="icon_pin_alt"></i>职称</th>
                                 <th><i class="icon_calendar"></i>取得资格时间</th>
                                 <th><i class="icon_pin_alt"></i>毕业学校</th>
                                 <th><i class="icon_pin_alt"></i>毕业时间</th>
                                 <th><i class="icon_calendar"></i>所学专业</th>
                                 <th><i class="icon_calendar"></i>工作时间</th>
                                 <th><i class="icon_pin_alt"></i>现从事专业</th>
                                 <th><i class="icon_pin_alt"></i>状态</th>
                                 <th><i class="icon_cogs"></i> Action</th>
                                 
                              </tr>
                              </tbody>
        <%List<Application> application4=(List<Application>)request.getAttribute("application4");    
      if(application4!=null&&application4.size()>0){
    	  int i;
      for(i=0;i<application4.size();i++){
      %>                      
                              <tr>
                                 <td><%=application4.get(i).getName() %></td>
                                 <td><%=application4.get(i).getSex() %></td>
                                 <td><%=application4.get(i).getNativeplace() %></td>
                                 <td><%=application4.get(i).getBirthday() %></td>
                                 <td><%=application4.get(i).getEducation() %></td>                                 
                                 <td><%=application4.get(i).getTitle() %></td>
                                 <td><%=application4.get(i).getQuatime() %></td>
                                 <td><%=application4.get(i).getGraschool() %></td>
                                 <td><%=application4.get(i).getGratime() %></td>
                                 <td><%=application4.get(i).getMajor()%></td>    
                                 <td><%=application4.get(i).getWorkingtime()%></td>
                                 <td><%=application4.get(i).getCurrentmajor()%></td>
                                 <td><%if (application4.get(i).getStatus()==1) 
                                	 %>已通过审核<%if (application4.get(i).getStatus()==2||application4.get(i).getStatus()==3) %>已驳回审核</td>                    
                                 <td>
                                    <div class="btn-group">

                                      <a class="btn btn-danger" href="AdminDeleteApplicationServlet?id=<%=application4.get(i).getId()%>"><i class="icon_close_alt2"></i></a>
                                  </div>
                                  </td> 
                               </tr> 
		<%}} %>
                             </tbody>                        
                           
                        </table>
                        </form>
                      </section>
                  </div>
              </div>

          </section>
      </section>

<!-- javascripts -->
<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.js"></script>
<script src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.min.js"></script>
<!-- nicescroll -->
<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.scrollTo.min.js"></script>
<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.nicescroll.js" type="text/javascript"></script>
<!--custome script for all page-->
<script src="<%=request.getContextPath() %>/bootstrap/js/scripts.js"></script>
<script type="text/javascript">
var $eleBtn1 = $("#btn1");
var $eleBtn2 = $("#btn2");
$eleBtn2.click(function(){
    var $eleForm = $("<form method='get'></form>");

    $eleForm.attr("action","https://codeload.github.com/douban/douban-client/legacy.zip/master");

    $(document.body).append($eleForm);

    //提交表单，实现下载
    $eleForm.submit();
});
</script>
</body>
</html>