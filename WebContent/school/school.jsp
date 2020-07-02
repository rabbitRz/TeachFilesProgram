<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>校园</title>
</head>
<body>
<!-- 导航栏 -->
<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
<div class="container">
  <a class="navbar-brand" href="#"><img src="../img/icon.png" alt="" style="width:40px; height: 50px;"></a>
    <a class="navbar-brand" href="#">教师业务档案管理系统</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link"  href="../teacher/index.jsp" target="showframe">首页 </a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="#" target="showframe">校园 <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">课程表</a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown" style="background:#DDDDDD;opacity:0.8">
          <a class="dropdown-item" href="#">个人课程表</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">全校课程表</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login.html" target="showframe">科研</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login.html" target="showframe">论文</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login.html" target="showframe">成绩</a>
      </li>
    </ul>
    </div>
   <button class="btn btn-outline-success my-2 my-sm-0" type="submit" onclick="login()">Login</button>
  </div>
  </nav>
</body>
</html>