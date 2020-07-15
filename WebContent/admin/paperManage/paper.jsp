<%@page import="bean.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>显示全部论文信息</title>
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
              <!--overview start-->
			  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-th-list"></i> 显示论文信息</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="<%=request.getContextPath() %>/admin/Home.jsp">Home</a></li>
						<li><i class="icon_genius"></i>论文信息管理</li>
						<li><i class="fa fa-th-list"></i>显示论文信息</li>				  	
					</ol>
				</div>
			</div>

			<div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                              显示全部论文信息表
                          </header>
                          <form action="" method='get'>
                          <table class="table table-striped table-advance table-hover">
                           <tbody>
                              <tr>
                                 <th><i class="icon_profile"></i> 论文名称</th>
								 <th><i class="icon_mail_alt"></i>期刊名称</th>
                                 <th><i class="icon_mail_alt"></i>时间</th>
                                 <th><i class="icon_calendar"></i>期刊级别</th>                                
                                 <th><i class="icon_pin_alt"></i>索引情况</th>
                                 <th><i class="icon_pin_alt"></i>排名</th>
                                 <th><i class="icon_cogs"></i> Action</th>
                                 
                              </tr>
                              </tbody>
        <%List<Paper> papers=(List<Paper>)request.getAttribute("papers");       
      if(papers!=null&&papers.size()>0){
      for(int i=0;i<papers.size();i++){
      %>                       
                              <tr>
                                 <td><%=papers.get(i).getPaper_name() %></td>
                                 <td><%=papers.get(i).getJournal_name() %></td>
                                 <td><%=papers.get(i).getRelease_time() %></td>
                                 <td><%=papers.get(i).getJournal_level() %></td>
                                 <td><%=papers.get(i).getPaper_index() %></td>                                 
                                 <td><%=papers.get(i).getPaper_ranking() %></td>
                                                        
                                 <td>
                                    <div class="btn-group">
                                      <a class="btn btn-primary" href="AdminGetPapeServlet?id=<%=papers.get(i).getPaper_id() %>">
                                      	<svg class="bi bi-question-circle" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  										<path fill-rule="evenodd" d="M8 15A7 7 0 1 0 8 1a7 7 0 0 0 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
  										<path d="M5.25 6.033h1.32c0-.781.458-1.384 1.36-1.384.685 0 1.313.343 1.313 1.168 0 .635-.374.927-.965 1.371-.673.489-1.206 1.06-1.168 1.987l.007.463h1.307v-.355c0-.718.273-.927 1.01-1.486.609-.463 1.244-.977 1.244-2.056 0-1.511-1.276-2.241-2.673-2.241-1.326 0-2.786.647-2.754 2.533zm1.562 5.516c0 .533.425.927 1.01.927.609 0 1.028-.394 1.028-.927 0-.552-.42-.94-1.029-.94-.584 0-1.009.388-1.009.94z"/>
										</svg>
									  </a>
                                      <a class="btn btn-danger" href="AdminDeletePaperServlet?id=<%=papers.get(i).getPaper_id() %>"><i class="icon_close_alt2"></i></a>
                                  </div>
                                  </td> 
                               </tr> 
		<%}} %>
                             </tbody>                        
                           
                        </table>
                        </form>
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
<script type="text/javascript">
var $eleBtn1 = $("#btn1");
var $eleBtn2 = $("#btn2");
$eleBtn2.click(function(){
    var $eleForm = $("<form method='get'></form>");

    $eleForm.attr("action","https://codeload.github.com/douban/douban-client/legacy.zip/master");

    $(document.body).append($eleForm);

    //提交表单，实现下载
    $eleForm.submit();
});
</script>
</body>
</html>