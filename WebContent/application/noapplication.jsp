<%@ page language="java"  import="java.util.*,bean.*"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>校园</title>
</head>
<body>
<!-- 导航栏 -->
<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
<div class="container">
  <a class="navbar-brand" href="#"><img src="img/icon.png" alt="" style="width:40px; height: 50px;"></a>
    <a class="navbar-brand" href="#">教师业务档案管理系统</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
<div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link"  href="teacher/index.jsp" target="showframe">首页 </a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="#" target="showframe">校园 <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login.html" target="showframe">课程表</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login.html" target="showframe">科研</a>
      </li>
      
     <li class="nav-item" style="position:relative;left:10px">
        <a class="nav-link" id="shenhe" href="#" target="showframe">审核</a>
      </li>
    </ul>
    </div>
   <button class="btn btn-outline-success my-2 my-sm-0" type="submit" onclick="login()">Login</button>
  </div>
  </nav>
  
  <div class="py-5 text-center" style="margin-top:50px;">
    <img class="d-block mx-auto mb-4" src="<%=request.getContextPath()%>/image/headpo.jpg" alt="" width="88" height="88">
    <h2>未通过审核的申请信息</h2>
    <p class="lead">可对未通过审核的申请信息进行阅读</p>
  </div>
 <form style="position:relative;left:10px;margin-right:20px;">
 
   
   <table class="table table-bordered table-hover">
   <thead>
    <tr>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">姓名</th>        
        <th style="vertical-align:middle;text-align:center;font-size:18px;">性别</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">籍贯</th>        
        <th style="vertical-align:middle;text-align:center;font-size:18px;">出生日期</th>     
        <th style="vertical-align:middle;text-align:center;font-size:18px;">学历</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">职称</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">取得资格时间</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">毕业学校</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">毕业时间</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">所学专业</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">工作时间</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">现从事专业</th>       
        <th style="vertical-align:middle;text-align:center;font-size:18px;">操作</th>
    </tr>

    </thead>  
     <%List<Application> applications=(List<Application>)request.getAttribute("applications6");    
      if(applications!=null&&applications.size()>0){
      for(int i=0;i<applications.size();i++){
      %>  
  <tr>           
         <td width="5%" style="vertical-align:middle;text-align:center;"><%=applications.get(i).getName() %></td> 
         <td width="5%" style="vertical-align:middle;text-align:center;"><%=applications.get(i).getSex() %></td>
         <td width="5%" style="vertical-align:middle;text-align:center;"><%=applications.get(i).getNativeplace() %></td>  
         <td width="5%" style="vertical-align:middle;text-align:center;"><%=applications.get(i).getBirthday() %></td>   
         <td width="5%" style="vertical-align:middle;text-align:center;"><%=applications.get(i).getEducation() %></td>   
         <td width="5%" style="vertical-align:middle;text-align:center;"><%=applications.get(i).getTitle() %></td>
         <td width="10%" style="vertical-align:middle;text-align:center;"><%=applications.get(i).getQuatime() %></td>
         <td width="10%" style="vertical-align:middle;text-align:center;"><%=applications.get(i).getGraschool() %></td>
         <td width="5%" style="vertical-align:middle;text-align:center;"><%=applications.get(i).getGratime() %></td>  
         <td width="5%" style="vertical-align:middle;text-align:center;"><%=applications.get(i).getMajor()%></td>
         <td width="5%" style="vertical-align:middle;text-align:center;"><%=applications.get(i).getWorkingtime()%></td>  
         <td width="10%" style="vertical-align:middle;text-align:center;"><%=applications.get(i).getCurrentmajor()%></td>  
         <td width="5%" style="vertical-align:middle;text-align:center;"><a href="GetReaderApplicationServlet?id=<%=applications.get(i).getId()%>">已读</a></td> 
       </tr> 
        <% } }%> 
  </table>
  
  </form>

  
   <script src="../bootstrap/js/jquery-3.4.1.min.js"></script>
   <script src="../bootstrap/js/bootstrap.min.js"></script>
   <script src="../bootstrap/js/bootstrap.js"></script>
</body>
</html>