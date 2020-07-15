<%@ page language="java"  import="java.util.*,bean.*"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <%
     	Teacher teacher1=(Teacher)request.getAttribute("teacher1");   		
     %>


  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalCenterTitle">提示</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
     已经成功操作
      </div>
      <div class="modal-footer">
       
       <a href="PersonalInfoServlet?user_id=<%=teacher1.getUser_id() %>"> <button type="button" class="btn btn-primary">确定</button></a>
      </div>
    </div>
  </div>

<script src="../bootstrap/js/jquery-3.4.1.min.js"></script>
   <script src="../bootstrap/js/bootstrap.min.js"></script>
   <script src="../bootstrap/js/bootstrap.js"></script>
</body>
</html>