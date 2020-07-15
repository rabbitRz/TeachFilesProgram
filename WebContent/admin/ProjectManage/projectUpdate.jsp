<%@page import="bean.Project"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改项目信息</title> 
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
      <section id="main-content">
          <section class="wrapper">
		  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-file-text-o"></i> 修改项目信息</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="<%=request.getContextPath() %>/admin/Home.jsp">Home</a></li>
						<li><i class="icon_genius"></i>项目信息管理</li>
						<li><i class="fa fa-file-text-o"></i>修改项目信息</li>
					</ol>
				</div>
			</div>
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                             修改项目信息
                          </header>
                          <div class="panel-body">
                          <form class="form-validate form-horizontal " method="post" action="<%=request.getContextPath() %>/DoProjectUpdateServlet">
                              
<% 
Project project=(Project)request.getAttribute("project"); 
%>
								<div class="form-group">
                                     <label class="col-sm-2 control-label">项目编号</label>
                                     <div class="col-sm-10">
                                          <input type="text" class="form-control" name="pro_id" readOnly="true" value="<%=project.getPro_id() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">项目名称</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="pro_name" value="<%=project.getPro_name() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">项目类别</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" id="pro_category" name="pro_category" value="<%=project.getPro_category() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">开始时间</label>
                                      <div class="col-sm-10">
                                          <input type="Date" class="form-control" id="pro_starttime" name="pro_starttime" value="<%=project.getPro_starttime() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">完成时间</label>
                                      <div class="col-sm-10">
                                          <input type="Date" class="form-control" id="pro_finishtime" name="pro_finishtime" value="<%=project.getPro_finishtime() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">鉴定时间</label>
                                      <div class="col-sm-10">
                                          <input type="Date" class="form-control" id="pro_identime" name="pro_identime" value="<%=project.getPro_identime() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">鉴定结论</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="pro_identification" value="<%=project.getPro_identification() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">获奖情况</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="pro_prize" value="<%=project.getPro_prize() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">排名</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="pro_ranking" value="<%=project.getPro_ranking() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">领导老师编号</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="leader_id" value="<%=project.getLeader_id() %>">
                                      </div>
                                  </div>                                 
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">组员1编号</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="member1_id" value="<%=project.getT1_id() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">组员2编号</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="member2_id" value="<%=project.getT2_id() %>">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label">组员3编号</label>
                                      <div class="col-sm-10">
                                          <input type="text" class="form-control" name="member3_id" value="<%=project.getT3_id() %>">
                                      </div>
                                  </div>
                                  <hr class="mb-4">
                                   <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <button class="btn btn-primary" id="hh" type="submit">Save</button>
                                              <button class="btn btn-default" type="reset">Cancel</button>
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
    		$.post("<%=request.getContextPath() %>/DoProjectUpdateServlet",tt,function(data){
    			
    		})
    	})
    })
    </script>
</body>
</html>