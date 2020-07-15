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
  <a href="" id="ooo"
 style="font-size:20px;color:green;position:relative;top:120px;margin-left:20px">返回主页面</a>
  <div class="py-5 text-center" style="margin-top:50px;">
    <img class="d-block mx-auto mb-4" src="<%=request.getContextPath()%>/image/headpo.jpg" alt="" width="88" height="88">
    <h2>未审核的申请信息</h2>
    <p class="lead">可对未审核的申请信息进行撤销</p>
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
     <%List<Application> applications=(List<Application>)request.getAttribute("applications");    
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
         <td width="5%" style="vertical-align:middle;text-align:center;"><a href="DeleteApplicationServlet?id=<%=applications.get(i).getId()%>">删除</a></td> 
       </tr> 
        <% } }%> 
  </table>
  
  </form>

  
  <script src="<%=request.getContextPath()%>/bootstrap/js/jquery-3.4.1.min.js"></script>
   <script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
   <script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>
   <script type="text/javascript">
   //根据教师id显示用户信息
   $.getJSON('<%=request.getContextPath()%>/userInfoTr?teacher_id=<%=request.getAttribute("teacher_id")%>',function(data){
	   console.log(data);
	   document.getElementById("ooo").href='./LoginServlet?username='+data.username+'&password='+data.password;
   })
   </script>
   
</body>
</html>