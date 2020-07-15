<%@page import="bean.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加论文信息</title>
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


      <!--main content start-->
          <section class="wrapper">
		  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-file-text-o"></i> 添加论文信息</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="<%=request.getContextPath() %>/admin/Home.jsp">Home</a></li>
						<li><i class="icon_genius"></i>论文信息管理</li>
						<li><i class="fa fa-file-text-o"></i>添加论文信息</li>
					</ol>
				</div>
			</div>
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                             添加论文信息
                          </header>
                          <div class="panel-body">
                          <form class="form-validate form-horizontal " id="register_form" method="get" action="<%=request.getContextPath() %>/AdminAddPaperServlet">
                          <div class="form">
                              
           
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">论文名称</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="paper_name" value="">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">期刊名称</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" id="journal_name" name="journal_name" value="">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label  class="col-sm-2 control-label">时间</label>
                                      <div class="col-sm-10">
                                          <input type="date" class="form-control" id="release_time" name="release_time" value="">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">期刊级别</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" id="journal_level" name="journal_level" value="">
                                      </div>
                                  </div>
                                   
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">索引情况</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="paper_index" value="">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">排名</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="paper_ranking" value="">
                                      </div>
                                  </div>
                                               
                                 <div class="form-group">
                                      <label class="col-sm-2 control-label">成员1编号</label>
                                      <div class="col-sm-10">
                                          <select name="people1_id" id="people1_id" style="width:150px;" >     
                                       <option>==请选择==</option>  
                                       <%List<Teacher> paperPeople=(List<Teacher>)request.getAttribute("paperPeople");    
                                               if(paperPeople!=null&&paperPeople.size()>0){
    	                                                          int i;
                                                   for(i=0;i<paperPeople.size();i++){
                                                         %>   
                                       <option value=<%=paperPeople.get(i).getId() %>>成员1编号：<%=paperPeople.get(i).getId()%></option>    
                                              <%}} %>
                                        </select>
                                      </div>
                                  </div>
                                   <div class="form-group">
                                      <label class="col-sm-2 control-label">成员2编号</label>
                                      <div class="col-sm-10">
                                          <select name="people2_id" id="people2_id" style="width:150px;" >     
                                       <option>==请选择==</option>  
                                       <%List<Teacher> paperPeople2=(List<Teacher>)request.getAttribute("paperPeople");    
                                               if(paperPeople2!=null&&paperPeople2.size()>0){
    	                                                          int i;
                                                   for(i=0;i<paperPeople2.size();i++){
                                                         %>   
                                       <option value=<%=paperPeople2.get(i).getId() %>>成员2编号：<%=paperPeople2.get(i).getId() %></option>    
                                              <%}} %>
                                        </select>
                                      </div>
                                  </div>
                                    <div class="form-group">
                                      <label class="col-sm-2 control-label">成员3编号</label>
                                      <div class="col-sm-10">
                                          <select name="people3_id" id="people3_id" style="width:150px;" >     
                                       <option>==请选择==</option>  
                                       <%List<Teacher> paperPeople3=(List<Teacher>)request.getAttribute("paperPeople");    
                                               if(paperPeople3!=null&&paperPeople3.size()>0){
    	                                                          int i;
                                                   for(i=0;i<paperPeople3.size();i++){
                                                         %>   
                                       <option value=<%=paperPeople3.get(i).getId() %>>成员3编号：<%=paperPeople3.get(i).getId() %></option>    
                                              <%}} %>
                                        </select>
                                      </div>
                                  </div>
                                  
                                  <hr class="mb-4">
                                   <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <button class="btn btn-primary" id="hh" type="submit">Save</button>
                                              <button class="btn btn-default" type="reset">Reset</button>
                         
                                     </div>                                           
                         
                          </div>
                          </form>
                          </div>
                      </section>                  
                  </div>
              </div>             
          </section>
      </section>
      <!--main content end-->
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.scrollTo.min.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.nicescroll.js" type="text/javascript"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap/js/jquery.validate.min.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/form-validation-script.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/scripts.js"></script> 
    <script type="text/javascript">
    $(function(){
    	$("#hh").click(function(){
    		var tt=$("#register_form").serialize();
    		$.post("<%=request.getContextPath() %>/AdminAddPaperServlet",tt,function(data){		
    		})
    	})
    })
    </script>
</body>
</html>