<%@page import="java.util.List"%>
<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加教师信息</title>
<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/css/elegant-icons-style.css" rel="stylesheet" />
<link href="<%=request.getContextPath() %>/bootstrap/css/font-awesome.min.css" rel="stylesheet" />
<link href="<%=request.getContextPath() %>/bootstrap/css/style.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/css/style-responsive.css" rel="stylesheet" />
</head>
<body>
      <!--main content start-->
          <section class="wrapper">
		  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-files-o"></i> 添加教师信息</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="<%=request.getContextPath() %>/admin/Home.jsp">Home</a></li>
						<li><i class="icon_genius"></i>教师信息管理</li>
						<li><i class="fa fa-files-o"></i>添加教师信息</li>
					</ol>
				</div>
			</div>
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                             创建用户
                          </header>
                          <div class="panel-body">  
							<div class="col-md-8 order-md-1"> 
							<form class="needs-validation" novalidate action="TeacherAddServlet" method="post">
							<table class="table table-bordered table-hover definewidth m10" >
							</table>
 
  <!-- <div class="form-group row"> 
    <label class="col-sm-2 col-form-label">教师编号</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="id" name="id" placeholder="教师编号">
    </div>
  </div> -->
  <div class="form-group row">
  
    <label class="col-sm-2 col-form-label">教师姓名</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" name="name" placeholder="姓名">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">为教师分配账户id</label>
    
      <div class="dropdown">
      <div class="col-sm-10">
      <select class="btn border-secondary dropdown-toggle" name="user_id" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		<option class="dropdown-menu" aria-labelledby="dropdownMenuButton">==请选择==</option>
<% 
List<User> newusers=(List<User>)request.getAttribute("newusers");
if(newusers!=null&&newusers.size()>0){
	for(int i=0;i<newusers.size();i++){
%>
		<option class="dropdown-item" value=<%=newusers.get(i).getUser_id() %>>用户编号：<%=newusers.get(i).getUser_id() %></option>
<%}} %>		
	  </select>
	  </div>
	  </div>
    
  </div>

  <!-- <div class="form-group row">
    <label class="col-sm-2 col-form-label">显示分配的账户</label>
    <div class="col">
      <input type="text" class="form-control" id="username" name="username" placeholder="用户名" >
    </div>
    <div class="col">
      <input type="text" class="form-control" id="password" name="password" placeholder="密码" >
    </div>
  </div> 
  <fieldset class="form-group">
    <div class="row">
      <label class="col-sm-2 col-form-label">性别</label>
      <div class="col-sm-10">
        <div class="form-check">
          <input class="form-check-input" type="radio" name="sex" id="sex1" value="男">
          <label class="form-check-label" for="sex1">
            男
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="sex" id="sex2" value="女">
          <label class="form-check-label" for="sex2">
            女
          </label>
        </div>
      </div>
    </div>
  </fieldset>-->
  <div class="form-group row">
     <label class="col-sm-2 control-label" for="inputSuccess">性别</label>
       <div class="col-sm-10">
          <div class="form-check">
              <input type="radio" name="sex" id="sex1" value="男" >
			    <label class="form-check-label" for="sex1">
                                                 男
                </label>
          </div>
          <div class="form-check">
               <input type="radio" name="sex" id="sex2" value="女" >
                  <label class="form-check-label" for="sex21">
                                                 女
                  </label>
          </div>

       </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">籍贯</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="nativeplace" name="nativeplace" placeholder="籍贯" >
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">出生日期</label>
    <div class="col-sm-10">
      <input type="date" class="form-control" id="birthday" name="birthday" placeholder="出生日期">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">学历</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="education" name="education" placeholder="学历" >
    </div>
  </div>
  <div class="form-group row">
     <label class="col-sm-2 control-label">职称</label>
     <div class="col-sm-10">
         <input type="text" class="form-control" name="title" placeholder="职称">
     </div>
    </div>
    <div class="form-group row">
       <label class="col-sm-2 control-label">取得资格时间</label>
       <div class="col-sm-10">
            <input type="Date" class="form-control" name="quatime" placeholder="取得资格时间">
       </div>
    </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">毕业学校</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="graschool" name="graschool" placeholder="毕业学校">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">毕业时间</label>
    <div class="col-sm-10">
      <input type="Date" class="form-control" id="gratime" name="gratime" placeholder="毕业时间">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">所学专业</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="major" name="major" placeholder="所学专业">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">工作时间</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="workingtime" id="workingtime" placeholder="工作时间">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">现从事专业</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="currentmajor" name="currentmajor" placeholder="现从事专业">
    </div>
  </div>
  <!-- <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
  </div> -->
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