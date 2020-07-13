<%@page import="bean.Teacher"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改课程信息</title> 
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
					<h3 class="page-header"><i class="fa fa-file-text-o"></i> 修改课程信息</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
						<li><i class="icon_genius"></i>教师课程管理</li>
						<li><i class="fa fa-file-text-o"></i>修改课程信息</li>
					</ol>
				</div>
			</div>
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                             修改课程信息
                          </header>
                          <div class="panel-body">
                          <form class="form-validate form-horizontal " id="register_form" method="get" >
                          <div class="form">
								<div class="form-group">
                                     <label class="col-sm-2 control-label">课程名称</label>
                                     <div class="col-sm-10">
                                          <input type="text" class="form-control" id="name" name="name"  value="">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">课程班级</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" id="class" name="class" value="">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label for="username" class="col-sm-2 control-label">课程节数<span class="required">*</span></label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" id="hour" name="hour" value="">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label for="password" class="col-sm-2 control-label">课程容量<span class="required">*</span></label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" id="peoplenum" name="peoplenum" value="">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label for="confirm_password" class="col-sm-2 control-label">课程地点<span class="required">*</span></label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" id="place" name="place" value="">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                     <label class="col-sm-2 control-label" for="inputSuccess">代课老师</label>
                                     <div class="col-sm-10">
                                         <select id="teacher" name="teacher" class="form-control">
										        <option selected>Choose...</option>
										        <option>...</option>
										      </select> 
                                      </div>
                                  </div>

                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">课程开始周</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="startweek" id="startweek" value="">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">课程结束周</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="endweek" id="endweek" value="">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">课程星期</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" id="xinqi" name="xinqi" value="">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">学期开始</label>
                                      <div class="col-sm-10">
                                      <select id="term_start" name="term_start" class="form-control">
										        <option selected>Choose...</option>
										        <option>...</option>
										      </select> 
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
    	//获取所有教师信息
    	$.getJSON("<%=request.getContextPath() %>/AdminGetAllTeacher",function(data){
    		console.log("教师"+data);
    		$("#teacher").html("");
    		for(var i=0;i<data.length;i++){
    			$("#teacher").append("<option value="+data[i].id+">"+data[i].id+":"+data[i].name+"</option>");
    		}
    		
    	})
    	//获取所有学期信息
    	$.getJSON("<%=request.getContextPath() %>/AdminGetAllTeacher",function(data){
    		console.log("教师"+data);
    		$("#teacher").html("");
    		for(var i=0;i<data.length;i++){
    			$("#teacher").append("<option value="+data[i].id+">"+data[i].id+":"+data[i].name+"</option>");
    		}
    		
    	})
    	$.getJSON("<%=request.getContextPath() %>/adminCourseUpdate?course_id=<%=request.getParameter("course_id") %>",function(data){
    		console.log(data);
    		//给文本框传值
    		$("#name").val(data.course_name);
    		$("#class").val(data.course_class);
    		$("#hour").val(data.course_hours);
    		$("#peoplenum").val(data.couser_peoplenum);
    		$("#place").val(data.course_place);
    		$("#teacher option[value="+data.teacher_id+"]").attr("selected",true);
    		$("#startweek").val(data.start_courseweek);
    		$("#endweek").val(data.end_courseweek);
    		$("#xinqi").val(data.week);
    		$("#term_start").append("<option value="+data.teacher_id+">"+data.term_start+"</option>");
    	})
    	$("#hh").click(function(){
    		var tt=$("#register_form").serialize();
    		$.post("<%=request.getContextPath() %>/",tt,function(data){
    			
    		})
    	})
    })
    </script>
</body>
</html>