<%@page import="bean.Teacher"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>显示全部课程信息</title>
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
      
          <section class="wrapper">            
              <!--overview start-->
			  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-th-list"></i> 显示课程信息</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="<%=request.getContextPath() %>/admin/Home.jsp">Home</a></li>
						<li><i class="icon_genius"></i>课程信息管理</li>
						<li><i class="fa fa-th-list"></i>显示课程信息</li>				  	
					</ol>
				</div>
			</div>

			<div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                              显示全部教师信息表
                          </header>
                          <form action="" method='get'>
                          <table class="table table-striped table-advance table-hover">
                           <tbody>
                              <tr>
                                 <th><i class="icon_profile"></i> 课程名称</th>
                                 
                                 <th>
                                 	<svg class="bi bi-emoji-sunglasses" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  									<path fill-rule="evenodd" d="M8 15A7 7 0 1 0 8 1a7 7 0 0 0 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
  									<path fill-rule="evenodd" d="M4.285 9.567a.5.5 0 0 1 .683.183A3.498 3.498 0 0 0 8 11.5a3.498 3.498 0 0 0 3.032-1.75.5.5 0 1 1 .866.5A4.498 4.498 0 0 1 8 12.5a4.498 4.498 0 0 1-3.898-2.25.5.5 0 0 1 .183-.683zM6.5 6.497V6.5h-1c0-.568.447-.947.862-1.154C6.807 5.123 7.387 5 8 5s1.193.123 1.638.346c.415.207.862.586.862 1.154h-1v-.003l-.003-.01a.213.213 0 0 0-.036-.053.86.86 0 0 0-.27-.194C8.91 6.1 8.49 6 8 6c-.491 0-.912.1-1.19.24a.86.86 0 0 0-.271.194.213.213 0 0 0-.036.054l-.003.01z"/>
  									<path d="M2.31 5.243A1 1 0 0 1 3.28 4H6a1 1 0 0 1 1 1v1a2 2 0 0 1-2 2h-.438a2 2 0 0 1-1.94-1.515L2.31 5.243zM9 5a1 1 0 0 1 1-1h2.72a1 1 0 0 1 .97 1.243l-.311 1.242A2 2 0 0 1 11.439 8H11a2 2 0 0 1-2-2V5z"/>
									</svg> 课程班级
								 </th>
								 <th><i class="icon_mail_alt"></i> 课程节数</th>
                                 <th><i class="icon_mail_alt"></i> 课程容量</th>
                                 <th><i class="icon_calendar"></i> 课程地点</th>
                                 <th><i class="icon_pin_alt"></i> 代课老师</th>                                
                                 <th><i class="icon_pin_alt"></i> 课程开始周</th>
                                 <th><i class="icon_pin_alt"></i> 课程结束周</th>
                                 <th><i class="icon_pin_alt"></i> 课程星期</th>
                                 <th><i class="icon_pin_alt"></i> 学期开始</th>
                                 <th><i class="icon_cogs"></i> Action</th>
                                 
                              </tr>
                              </tbody >                      
                             <tbody id="couTable">   
                                                 
                           </tbody>
                        </table>
                        </form>
                      </section>
                  </div>
              </div>

          </section>
      </section>
<script src="<%=request.getContextPath() %>/bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.js"></script>
<!-- javascripts -->
<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.js"></script>
<script src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.min.js"></script>
<!-- nicescroll -->
<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.scrollTo.min.js"></script>
<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.nicescroll.js" type="text/javascript"></script>
<!--custome script for all page-->
<script src="<%=request.getContextPath() %>/bootstrap/js/scripts.js"></script>
<script type="text/javascript">
</script>
<script type="text/javascript">
function m(data){
$.get("../../ADdeleteCour?course_id="+data,function(data){
   	 alert(data);
 })   	   
 }

$(function(){
	$.getJSON("../../adminGetCourse",function(data){
		console.log(data);
		var str="";
		for(var i=0;i<data.length;i++){
			str+='<tr>'+
                '<td>'+data[i].course_name+'</td>'+
                '<td>'+data[i].course_class+'</td>'+
                '<td>'+data[i].course_hours+'</td>'+
                '<td>'+data[i].couser_peoplenum+'人</td>'+
                '<td>'+data[i].course_place+'</td>'+
                '<td>'+data[i].teacher_id+':'+data[i].teachr_name+'</td>'+
                '<td>'+data[i].start_courseweek+'</td>'+
                '<td>'+data[i].end_courseweek+'</td>'+
                '<td>'+data[i].course_place+'</td>'+
                '<td>'+data[i].term_start+'</td>'+
                '<td><div class="btn-group">'+
                     '<a class="btn btn-primary" id="updateC" href="CourseUpdate.jsp?course_id='+data[i].course_id+'">'+
                     	'<svg class="bi bi-question-circle" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">'+
							'<path fill-rule="evenodd" d="M8 15A7 7 0 1 0 8 1a7 7 0 0 0 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>'+
							'<path d="M5.25 6.033h1.32c0-.781.458-1.384 1.36-1.384.685 0 1.313.343 1.313 1.168 0 .635-.374.927-.965 1.371-.673.489-1.206 1.06-1.168 1.987l.007.463h1.307v-.355c0-.718.273-.927 1.01-1.486.609-.463 1.244-.977 1.244-2.056 0-1.511-1.276-2.241-2.673-2.241-1.326 0-2.786.647-2.754 2.533zm1.562 5.516c0 .533.425.927 1.01.927.609 0 1.028-.394 1.028-.927 0-.552-.42-.94-1.029-.94-.584 0-1.009.388-1.009.94z"/>'
						+'</svg> </a>'+
                     '<a class="btn btn-danger" href="#" onclick="m('+data[i].course_id+')"><i class="icon_close_alt2"></i></a>'+  
               '</div></td></tr>'
		
		}
		$("#couTable").append(str);
		
	})
})
</script>
</body>
</html>