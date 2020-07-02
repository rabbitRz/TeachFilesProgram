<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>首页</title>
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
      <li class="nav-item active">
        <a class="nav-link"  href="" target="showframe">首页 <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="../school/school.jsp" target="showframe">校园</a>
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

  <!-- 指示符 -->
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>
 
  <!-- 轮播图片 -->
 <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="../img/lan.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="../img/tig.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="../img/timg.jpg" class="d-block w-100" alt="...">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

  <!-- 搜索框 -->
<form method="post" action="Findlun">
<div class="input-group mb-3">
<div class="input-group-append">
    <span class="badge badge-secondary" style="text-align:center;font-size:20px;width:100px;height:42px;margin-top:50px;margin-left:400px;background:#A8A8A8;">
    查找论文</span>
  </div>
  <input type="text" placeholder="请输入关键字" aria-label="请输入关键字"
   aria-describedby="basic-addon2" style="width:300px;height:42px;margin-left:30px;margin-top:50px;border-color:#DDDDDD;">
  <div class="input-group-append">
    <button type="submit" style="margin-top:49px;"><img src="../img/sou.jpg"></button>
  </div>
</div>
</form>
  <div class="card bg-light mb-3" style="max-width:17rem;margin-top:50px;float:left">
  <div class="card-header">
  <h5 class="card-title">校内新闻<a href="login.html" class="card-link" >
  <b style="margin-left:80px;font-size:14px">更多>></b></a></h5>
  </div>
  <div class="card-body">
    <h5 class="card-title"><a href="login.html" class="card-link">Another link</a></h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
     <h5 class="card-title"><a href="login.html" class="card-link">Another link</a></h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
     <h5 class="card-title"><a href="login.html" class="card-link">Another link</a></h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
  </div>
  
 </div>
 <!-- 热门企业 -->
<div class="container" style="float:right;width:1000px;height:600px;">
  <h4 class="text-center" >——科研成果——<a href="login.html" class="card-link">
  <b style="font-size:16px;float:right;" >更多>></b></a></h4>
  
  <br>
<div class="border border-light" >
<div  class="bg-light text-dark" style="padding:10px">
<div class="row">
 <div class="card" style="width: 18rem;">
  <img class="card-img-top" src="..." alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
  <div class="card" style="width: 18rem;">
  <img class="card-img-top" src="..." alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
 <div class="card" style="width: 18rem;">
  <img class="card-img-top" src="..." alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
 
</div>
<div class="row" style="padding-top:20px">
  <div class="card" style="width: 18rem;">
  <img class="card-img-top" src="..." alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
  <div class="card" style="width: 18rem;">
  <img class="card-img-top" src="..." alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
  <div class="card" style="width: 18rem;">
  <img class="card-img-top" src="..." alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
 
</div>
</div>
</div>

</div>
<script type="text/javascript">
  function login(){
	  window.location.href="login.html";
  }
  </script>
  <!-- 底部 -->
<footer class="footer text-center" style="padding-top:600px">
<div class="p-3 mb-2 bg-dark text-white" >
  <div class="container">
    <a class="footer-logo" href="#" ><img src="../img/icon.png" alt="" style="width: 50px; height: 67px;"></a>
    <div class="social-links brand-hover-color" style="padding:20px">
      <a class="instagram" href="https://www.instagram.com/dine_dating" target="_blank"><i class="ion-social-instagram-outline"></i></a>
      <a class="facebook" href="https://www.facebook.com/dinewith.co" target="_blank"><i class="ion-social-facebook-outline"></i></a>
    </div>
    <p class="copyright">© 2020 <a href="/web/about"></a> All Rights Reserved</p>
  </div>
  </div>
</footer>

<a name="go_top" href="#" role="button" style="position:fixed;right:10px;bottom:10px">
<img src="../img/go_top_icon.png" style="width:30px;height:50px"></img>
</a>
<script src="../bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script src="../bootstrap/js/bootstrap.js"></script>
</body>
</html>