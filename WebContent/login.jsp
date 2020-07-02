<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/sign-in/">

<!-- Custom styles for this template -->
<link href="bootstrap/css/signin.css" rel="stylesheet">
<title>登录</title>
</head>
<body class="text-center">
 <form class="form-signin" method="post" action="LoginServlet">
  <img class="mb-4" src="image/headpo.jpg" alt="" width="72" height="72">
  <h1 class="h3 mb-3 font-weight-normal">教师业务档案管理系统</h1>
  <label for="inputEmail" class="sr-only">用户名</label>
  <input type="email" id="inputEmail" class="form-control" placeholder="用户名" required autofocus>
  <label for="inputPassword" class="sr-only">密码</label>
  <input type="password" id="inputPassword" class="form-control" placeholder="密码" required>
  <div class="checkbox mb-3">
    <label>
      <input type="checkbox" value="remember-me"> Remember me
    </label>
  </div>
  <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
  <p class="mt-5 mb-3 text-muted">&copy; 2020-07</p>
</form>

<script src="bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="bootstrap/js/bootstrap.js"></script>
</body>
</html>