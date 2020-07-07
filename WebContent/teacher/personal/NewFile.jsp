<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>主页面</title>
</head>

 <body class="bg-light">
  <div class="py-5 text-center">
    <h2>主页面</h2>
  </div>

<form class="needs-validation" novalidate>
<table class="table table-bordered table-hover definewidth m10" >
   <thead>
    <tr>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">ID</th>        
        <th style="vertical-align:middle;text-align:center;font-size:18px;">名称</th>   
        <TH><A class=sortheader href="">用户名<SPAN class=sortarrow> </SPAN></A></TH>     
    </tr>
    </thead>
	<%
     	User user=(User)request.getAttribute("user"); 
     		
     %>
      <tr>
            
         <td width="15%" style="vertical-align:middle;text-align:center;"><%=user.getUser_id()%></td>
         <td width="30%" style="vertical-align:middle;text-align:center;"><%=user.getUsername() %></td>
       	 <td><A href="PersonalInfoServlet?user_id=<%=user.getUser_id() %>"><%=user.getUsername() %></A></td>
       </tr>

     </table>
 </form>
<script src="<%=request.getContextPath()%>/bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>
<script>

</script>
</body>
</html>