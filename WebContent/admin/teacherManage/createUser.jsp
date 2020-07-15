<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>创建用户</title> 
    <link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
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
					<h3 class="page-header"><i class="fa fa-files-o"></i> 创建用户</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="<%=request.getContextPath() %>/admin/Home.jsp">Home</a></li>
						<li><i class="icon_genius"></i>教师信息管理</li>
						<li><i class="fa fa-files-o"></i>创建用户</li>
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
                              <div class="form">
                                  <form class="form-validate form-horizontal " action="<%=request.getContextPath() %>/CreateUserServlet" method="post">
                                      <div class="form-group ">
                                          <label for="user_id" class="control-label col-lg-2">用户编号 <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class=" form-control" id="user_id" name="user_id" type="text" required="required" />
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="username" class="control-label col-lg-2">用户名 <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class="form-control " id="username" name="username" type="text" required="required" />
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="password" class="control-label col-lg-2">密码 <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class="form-control " id="password" name="password" type="password" required="required" />
                                          </div>
                                      </div>
                                     <!--  <div class="form-group ">
                                          <label for="confirm_password" class="control-label col-lg-2">再次确认密码 <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class="form-control " id="confirm_password" name="confirm_password" type="password" />
                                          </div>
                                      </div> -->
                                      <fieldset class="form-group">
    									<div class="row">
      									<label for="role_id" class="control-label col-lg-2">角色 <span class="required">*</span></label>
      										<div class="col-sm-10">
        										<div class="form-check">
          											<input class="form-check-input" type="radio" name="role_id" id="role1" value=1>
          											<label class="form-check-label" for="role1">
            教师
          											</label>
        										</div>
        										<div class="form-check">
          											<input class="form-check-input" type="radio" name="role_id" id="role2" value=2 >
          											<label class="form-check-label" for="role2">
            管理员
          											</label>
        										</div>
      										</div>
    									</div>
  									  </fieldset>
                                      <!-- <div class="form-group ">
                                          <label for="email" class="control-label col-lg-2">Email <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class="form-control " id="email" name="email" type="email" />
                                          </div>
                                      </div> -->
                                      <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <button class="btn btn-primary" type="submit" id="subbutton">Save</button>
                                              <!-- <a href="<%=request.getContextPath() %>/CreateUserServlet"><button class="btn btn-primary" type="button">Save</button></a> -->
                                              <button class="btn btn-default" type="reset">Cancel</button>
                                          </div>
                                      </div>
                                  </form>
                              </div>
                          </div>
                      </section>
                  </div>
              </div>
              <!-- page end-->
          </section>
      </section>
      <!--main content end-->
  <!-- container section end -->
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.scrollTo.min.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.nicescroll.js" type="text/javascript"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap/js/jquery.validate.min.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/form-validation-script.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/scripts.js"></script>    

</body>
</html>