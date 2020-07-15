<%@page import="bean.User"%>
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

      <!--main content start-->
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
                          <form class="form-validate form-horizontal " id="register_form" method="get" action="<%=request.getContextPath() %>/DoTeacherUpdateServlet">
                          <div class="form">
                              
<% 
Teacher t=(Teacher)request.getAttribute("teacher"); 
%>
								<div class="form-group">
                                     <label class="col-sm-2 control-label">教师id</label>
                                     <div class="col-sm-10">
                                          <input type="text" class="form-control" name="id" readOnly="true" value="<%=t.getId() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">教师姓名</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="name" value="<%=t.getName() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label for="username" class="col-sm-2 control-label">用户名<span class="required">*</span></label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" id="username" name="username" value="<%=t.getUser().getUsername() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label for="password" class="col-sm-2 control-label">密码<span class="required">*</span></label>
                                      <div class="col-sm-10">
                                          <input type="password" class="form-control" id="password" name="password" value="<%=t.getUser().getPassword() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label for="confirm_password" class="col-sm-2 control-label">确认密码<span class="required">*</span></label>
                                      <div class="col-sm-10">
                                          <input type="password" class="form-control" id="confirm_password" name="confirm_password" value="<%=t.getUser().getPassword() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                     <label class="col-sm-2 control-label" for="inputSuccess">性别</label>
                                     <div class="col-sm-10">
                                          <div class="form-check">
                                              <input type="radio" name="sex" id="sex1" value="男" <%=t.getSex().equals("男")?"checked":"" %>>
											  <label class="form-check-label" for="sex1">
                                                 男
                                              </label>
                                          </div>
                                          <div class="form-check">
                                                  <input type="radio" name="sex" id="sex2" value="女" <%=t.getSex().equals("女")?"checked":"" %>>
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
                                   <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <button class="btn btn-primary" id="hh" type="submit">Save</button>
                                              <button class="btn btn-default" type="reset">Cancel</button>
                                          </div>
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
    		$.post("<%=request.getContextPath() %>/DoTeacherUpdateServlet",tt,function(data){
    			
    		})
    	})
    })
    </script>
</body>
</html>