<%@page import="bean.Project"%>
<%@page import="bean.Teacher"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>为项目分配人员</title>
<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/css/elegant-icons-style.css" rel="stylesheet" />
<link href="<%=request.getContextPath() %>/bootstrap/css/font-awesome.min.css" rel="stylesheet" />
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

      </header>      
      <!--header end-->
          <section class="wrapper">
		  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-files-o"></i> 为项目分配人员</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="<%=request.getContextPath() %>/admin/Home.jsp">Home</a></li>
						<li><i class="icon_genius"></i>项目信息管理</li>
						<li><i class="fa fa-files-o"></i>为项目分配人员</li>
					</ol>
				</div>
			</div>
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                             为项目分配人员
                          </header>
                          <div class="panel-body">  
							<div class="col-md-8 order-md-1"> 
							<form class="needs-validation" novalidate action="ProjectPeopleAddServlet" method="post">
							<table class="table table-bordered table-hover definewidth m10" >
							</table>
 <%
 	Project project=(Project)request.getAttribute("project");
 %>
                                  <div class="form-group row">
                                      <label class="col-sm-2 control-label">项目编号</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control border-secondary text-dark" name="project_id" value="<%=project.getPro_id() %>">
                                      </div>
                                  </div>
                                  <div class="form-group row">
                                      <label class="col-sm-2 control-label">领导老师编号</label>
                                      <div class="dropdown">
      									<div class="col-sm-10">
      									<select class="btn border-secondary dropdown-toggle" name="leader_id" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
												<option class="dropdown-menu" aria-labelledby="dropdownMenuButton">==请选择==</option>
												 <%
              										List<Teacher> teachers=(List<Teacher>)request.getAttribute("teachers");
              										if(teachers!=null&&teachers.size()>0){
              											for(int i=0;i<teachers.size();i++){
              									%>
												<option class="dropdown-item" value=<%=teachers.get(i).getId() %>>领导老师编号：<%=teachers.get(i).getId() %></option>
												<%}} %>
										</select>
										</div>
									 </div>
                                  </div>                                 
                                  <div class="form-group row">
                                      <label class="col-sm-2 control-label">组员1编号</label>
                                      <div class="dropdown">
      									<div class="col-sm-10">
      									<select class="btn border-secondary dropdown-toggle" name="member1_id" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
												<option class="dropdown-menu" aria-labelledby="dropdownMenuButton">==请选择==</option>
												 <%
              										List<Teacher> t1=(List<Teacher>)request.getAttribute("teachers");
              										if(t1!=null&&t1.size()>0){
              											for(int i=0;i<t1.size();i++){
              									%>
												<option class="dropdown-item" value=<%=t1.get(i).getId() %>>组员1编号：<%=t1.get(i).getId() %></option>
												<%}} %>
										</select>
										</div>
									 </div>
                                  </div>
                                  <div class="form-group row">
                                      <label class="col-sm-2 control-label">组员2编号</label>
                                      <div class="dropdown">
      									<div class="col-sm-10">
      									<select class="btn border-secondary dropdown-toggle" name="member2_id" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
												<option class="dropdown-menu" aria-labelledby="dropdownMenuButton">==请选择==</option>
												 <%
              										List<Teacher> t2=(List<Teacher>)request.getAttribute("teachers");
              										if(t2!=null&&t2.size()>0){
              											for(int i=0;i<t2.size();i++){
              									%>
												<option class="dropdown-item" value=<%=t2.get(i).getId() %>>组员2编号：<%=t2.get(i).getId() %></option>
												<%}} %>
										</select>
										</div>
									 </div>
                                  </div>
                                  <div class="form-group row">
                                      <label class="col-sm-2 control-label">组员3编号</label>
                                      <div class="dropdown">
      									<div class="col-sm-10">
      									<select class="btn border-secondary dropdown-toggle" name="member3_id" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
												<option class="dropdown-menu" aria-labelledby="dropdownMenuButton">==请选择==</option>
												 <%
              										List<Teacher> t3=(List<Teacher>)request.getAttribute("teachers");
              										if(t3!=null&&t3.size()>0){
              											for(int i=0;i<t3.size();i++){
              									%>
												<option class="dropdown-item" value=<%=t3.get(i).getId() %>>组员3编号：<%=t3.get(i).getId() %></option>
												<%}} %>
										</select>
										</div>
									 </div>
                                  </div>
               
        <hr class="mb-4">
        <button class="btn btn-primary btn-lg btn-block" type="submit">提交</button>
		
						</form>
                              </div>
                          </div>
                      </section>
                      </div>
              </div>
              <!-- page end-->
          </section>
      </section>
<script src="<%=request.getContextPath()%>/bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>
</body>
</html>