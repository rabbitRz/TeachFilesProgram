<%@page import="bean.Teacher"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改教师信息</title> 
<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/css/elegant-icons-style.css" rel="stylesheet" />
<link href="<%=request.getContextPath() %>/bootstrap/css/font-awesome.min.css" rel="stylesheet" />
<link href="<%=request.getContextPath() %>/bootstrap/css/style.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/css/style-responsive.css" rel="stylesheet" />
</head>
<body>

  

      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">
		  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-file-text-o"></i> 修改教师信息</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
						<li><i class="icon_genius"></i>教师信息管理</li>
						<li><i class="fa fa-file-text-o"></i>修改教师信息</li>
					</ol>
				</div>
			</div>
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                             修改教师信息
                          </header>
                          <div class="panel-body">
                              <form class="form-horizontal " method="get">
<% 
Teacher t=(Teacher)request.getAttribute("teacher"); 
%>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">教师姓名</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="name" value="<%=t.getName() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                     <label class="control-label col-lg-2" for="inputSuccess">性别</label>
                                     <div class="col-lg-10">
                                          <div class="form-check">
                                              <input type="radio" name="sex" id="sex1" value="男" <%=t.getSex().equals("男")?"checked":"" %>>
											  <label class="form-check-label" for="sex1">
                                                 男
                                              </label>
                                          </div>
                                          <div class="form-check">
                                                  <input type="radio" name="sex" id="sex2" value="女" <%=t.getSex().equals("男")?"checked":"" %>>
                                                  <label class="form-check-label" for="sex21">
                                                 女
                                              </label>
                                          </div>

                                      </div>
                                  </div>

                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">籍贯</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="nativeplace" value="<%=t.getNativeplace() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">生日</label>
                                      <div class="col-sm-10">
                                          <input type="Date" class="form-control" name="birthday" value="<%=t.getBirthday() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">学历</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="education" value="<%=t.getEducation() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">职称</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="title" value="<%=t.getTitle() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">取得资格时间</label>
                                      <div class="col-sm-10">
                                          <input type="Date" class="form-control" name="quatime" value="<%=t.getQuatime() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">毕业学校</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="graschool" value="<%=t.getGraschool() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">毕业时间</label>
                                      <div class="col-sm-10">
                                          <input type="Date" class="form-control" name="gratime" value="<%=t.getGratime() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">从事专业</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="major" value="<%=t.getMajor() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">工作时长</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="workingtime" value="<%=t.getWorkingtime() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">现从事专业</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="currentmajor" value="<%=t.getCurrentmajor() %>">
                                      </div>
                                  </div>
                                  <hr class="mb-4">
                                      <div align="left" style="float:left">
        								<button class="btn btn-primary" type="submit" style="width:500px;">提交</button>
    								  </div>
    								  <div align="right">
        								<button class="btn btn-info" type="reset" style="width:500px;">取消</button>
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
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery-ui-1.9.2.custom.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap/js/ga.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/bootstrap-switch.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.tagsinput.js"></script>   
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.hotkeys.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/bootstrap-wysiwyg.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/bootstrap-wysiwyg-custom.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap/assets/ckeditor/ckeditor.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/form-component.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/scripts.js"></script>
</body>
</html>