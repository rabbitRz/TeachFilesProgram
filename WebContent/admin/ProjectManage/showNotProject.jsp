<%@page import="bean.Project"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>显示未分配人员项目信息</title>
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
              <!--overview start-->
			  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-th-list"></i> 显示未分配人员的项目信息</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="<%=request.getContextPath() %>/admin/Home.jsp">Home</a></li>
						<li><i class="icon_documents_alt"></i>项目信息管理</li>
						<li><i class="fa fa-th-list"></i>显示未分配人员的项目信息</li>				  	
					</ol>
				</div>
			</div>

			<div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                              显示未分配人员的项目信息表
                          </header>
                          
                          <table class="table table-striped table-advance table-hover">
                           <tbody>
                              <tr> 
                              	 <th><i class=""></i> 项目编号</th>       
								 <th><i class=""></i> 项目名称</th>
                                 <th><i class=""></i> 项目类别</th>
                                 <th><i class=""></i> 开始时间</th>                                
                                 <th><i class=""></i> 完成时间</th>
                                 <!-- <th><i class=""></i> 领导老师编号</th>
                                 <th><i class=""></i> 组员1编号</th>
                                 <th><i class=""></i> 组员2编号</th>
                                 <th><i class=""></i> 组员3编号</th> -->
                                 <th><i class=""></i> 获奖情况</th>
                                 <th><i class=""></i> 排名</th>
                                 <th><i class="icon_cogs"></i> Action</th>
                                 
                              </tr>
                              </tbody>
        <%
     	List<Project> p=(List<Project>)request.getAttribute("projects");   		
        if(p!=null&&p.size()>0){
    		for(int i=0;i<p.size();i++){
     	%>                       
                              <tr>
                              	 <td><%=p.get(i).getPro_id() %></td>
                                 <td><%=p.get(i).getPro_name() %></td>
                                 <td><%=p.get(i).getPro_category() %></td>
                                 <td><%=p.get(i).getPro_starttime() %></td>
                                 <td><%=p.get(i).getPro_finishtime() %></td>
                                 <!--<td><%=p.get(i).getLeader_id() %></td>                                 
                                 <td><%=p.get(i).getT1_id() %></td>
                                 <td><%=p.get(i).getT2_id() %></td>
                                 <td><%=p.get(i).getT3_id() %></td> -->
                                 <td><%=p.get(i).getPro_prize() %></td>                                 
                                 <td><%=p.get(i).getPro_ranking() %></td>                            
                                 <td>
                                  <div class="btn-group">
                                      
                                      <a class="btn btn-primary" href="ShowTeacherIdServlet?id=<%=p.get(i).getPro_id() %>">为项目分配人员</a>
                                  </div>
                                  </td> 
                               </tr> 
		<%}} %>
                             </tbody>                        
                           
                        </table>
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

</body>
</html>