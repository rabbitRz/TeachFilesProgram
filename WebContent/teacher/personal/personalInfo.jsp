<%@ page language="java"  import="java.util.*,bean.Teacher"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../../bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>个人信息</title>
</head>

 <body class="bg-light">
    <div class="container">
  <div class="py-5 text-center">
    <img class="d-block mx-auto mb-4" src="../../image/headpo.jpg" alt="" width="88" height="88">
    <h2>个人信息</h2>
    <p class="lead">请确认信息是否正确，与个人信息不符时请进行修改，管理员会进行审核</p>
  </div>

<div class="row">
  <div class="col-md-4 order-md-2 mb-4">
      <h4 class="d-flex justify-content-between align-items-center mb-3">
        <span class="text-muted">所写论文</span>
        <!-- <span class="badge badge-secondary badge-pill">3</span> -->
      </h4>
      <ul class="list-group mb-3">
        <li class="list-group-item d-flex justify-content-between lh-condensed">
          <div>
            <h6 class="my-0">Product name</h6>
            <small class="text-muted">Brief description</small>
          </div>
          <span class="text-muted">$12</span>
        </li>
        
      </ul>


	<h4 class="d-flex justify-content-between align-items-center mb-3">
        <span class="text-muted">获奖情况</span>
        <!-- <span class="badge badge-secondary badge-pill">3</span> -->
      </h4>
      <ul class="list-group mb-3">
        <li class="list-group-item d-flex justify-content-between lh-condensed">
          <div>
            <h6 class="my-0">Product name</h6>
            <small class="text-muted">Brief description</small>
          </div>
          <span class="text-muted">$12</span>
        </li>
        
      </ul>
    </div>   
<div class="col-md-8 order-md-1"> 
<form class="needs-validation" novalidate>
<table class="table table-bordered table-hover definewidth m10" >
   <thead>
    <tr>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">ID</th>        
        <th style="vertical-align:middle;text-align:center;font-size:18px;">名称</th>        
        <th style="vertical-align:middle;text-align:center;font-size:18px;">价格（元）/斤</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">原产地</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">操作</th>
    </tr>
    </thead>
	<%
     	Teacher teacher=(Teacher)request.getAttribute("teacher"); 
      
      if(teacher!=null){
     		
     %>
      <tr>
            
         <td width="15%" style="vertical-align:middle;text-align:center;"><%=teacher.getId() %></td>
         <td width="15%" style="vertical-align:middle;text-align:center;"><%=teacher.getName() %></td>
         <td width="15%" style="vertical-align:middle;text-align:center;"><%=teacher.getMajor() %></td>
         <td width="30%" style="vertical-align:middle;text-align:center;"><%=teacher.getGraschool() %></td>
         <td><a href="">修改</a>
         <a href="">删除</a></td>
       
       </tr>
   <%} %>
     </table>
  <div class="form-group row">
  
    <label class="col-sm-2 col-form-label">姓名</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" placeholder="姓名">
    </div>
  </div>

  <fieldset class="form-group">
    <div class="row">
      <legend class="col-form-label col-sm-2 pt-0">性别</legend>
      <div class="col-sm-10">
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>
          <label class="form-check-label" for="gridRadios1">
            男
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">
          <label class="form-check-label" for="gridRadios2">
            女
          </label>
        </div>
      </div>
    </div>
  </fieldset>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">籍贯</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="nativeplace" placeholder="籍贯">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">出生日期</label>
    <div class="col-sm-10">
      <input type="date" class="form-control" id="birthday" placeholder="出生日期">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">学历</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="education" placeholder="学历">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">毕业学校</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="graschool" placeholder="毕业学校">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">所学专业</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="major" placeholder="所学专业">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">工作时间</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="workingtime" placeholder="工作时间">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">现从事专业</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="currentmajor" placeholder="现从事专业">
    </div>
  </div>
  <!-- <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
  </div> -->
        <hr class="mb-4">
        <button class="btn btn-primary btn-lg btn-block" type="submit">提交</button>
</form>
	</div>
  </div>

  <footer class="my-5 pt-5 text-muted text-center text-small">
    <p class="mb-1">&copy; 2020 ly</p>
  </footer>
</div>
<script src="../../bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="../../bootstrap/js/bootstrap.min.js"></script>
<script src="../../bootstrap/js/bootstrap.js"></script>
</body>
</html>