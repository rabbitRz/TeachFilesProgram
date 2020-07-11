<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>首页</title>
</head>
<body>

  <!-- 轮播图片 -->
 <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel" style="margin-top:100px;margin-top:10px">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="<%=request.getContextPath()%>/img/lan.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="<%=request.getContextPath()%>/img/tig.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="<%=request.getContextPath()%>/img/timg.jpg" class="d-block w-100" alt="...">
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
<br/><br/>
  <!-- 搜索框 -->
  <table class="container" align=center>	
<tr align="center">
<td>
<form action = "<%=request.getContextPath()%>/Findlun" method = "post">
		<p class="d-inline p-2 text-dark" style="width: 8rem;">选择搜索方式</p>
    <select class="btn btn-secondary dropdown-toggle" name="select" id="select">
		<option>==请选择==</option>
		<option value="1">论文名称</option>
		<option value="2">期刊名称</option>
		<option value="3">期刊类别</option>
	</select>
		<p class="d-inline p-2 text-dark" style="width: 8rem;">请填写关键字</p>
		<input type="text" aria-label="Default" aria-describedby="inputGroup-sizing-default" name="input" id="Input" size="10">
		<input name="button" type="submit" class="btn btn-default" value="查找论文"> 
</form>		
</td>
</tr>
</table>
<br><br/>
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
  <!-- 底部 -->
<footer class="footer text-center" style="margin-top:600px">
<div class="p-3 mb-2 bg-dark text-white" >
  <div class="container">
    <a class="footer-logo" href="#" ><img src="<%=request.getContextPath()%>/img/icon.png" alt="" style="width: 50px; height: 67px;"></a>
    <div class="social-links brand-hover-color" style="padding:20px">
      <a class="instagram" href="https://www.instagram.com/dine_dating" target="_blank"><i class="ion-social-instagram-outline"></i></a>
      <a class="facebook" href="https://www.facebook.com/dinewith.co" target="_blank"><i class="ion-social-facebook-outline"></i></a>
    </div>
    <p class="copyright">© 2020 <a href="/web/about"></a> All Rights Reserved</p>
  </div>
  </div>
</footer>

<a name="go_top" href="#" role="button" style="position:fixed;right:10px;bottom:10px">
<img src="<%=request.getContextPath()%>/img/go_top_icon.png" style="width:30px;height:50px"></img>
</a>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>
<!-- javascripts -->
    <script src="<%=request.getContextPath()%>/bootstrap/js/jquery.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery-ui-1.10.4.min.js"></script>
    <script src="<%=request.getContextPath()%>/bootstrap/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/bootstrap/js/jquery-ui-1.9.2.custom.min.js"></script>
    <!-- bootstrap -->
    <script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
    <!-- nice scroll -->
    <script src="<%=request.getContextPath()%>/bootstrap/js/jquery.scrollTo.min.js"></script>
    <script src="<%=request.getContextPath()%>/bootstrap/js/jquery.nicescroll.js" type="text/javascript"></script>
    <!-- charts scripts -->
    <script src="<%=request.getContextPath()%>/bootstrap/assets/jquery-knob/js/jquery.knob.js"></script>
    <script src="<%=request.getContextPath()%>/bootstrap/js/jquery.sparkline.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath()%>/bootstrap/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
    <script src="<%=request.getContextPath()%>/bootstrap/js/owl.carousel.js" ></script>
    <!-- jQuery full calendar -->
    <<script src="<%=request.getContextPath()%>/bootstrap/js/fullcalendar.min.js"></script> <!-- Full Google Calendar - Calendar -->
	<script src="<%=request.getContextPath()%>/bootstrap/assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
    <!--script for this page only-->
    <script src="<%=request.getContextPath()%>/bootstrap/js/calendar-custom.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery.rateit.min.js"></script>
    <!-- custom select -->
    <script src="<%=request.getContextPath()%>/bootstrap/js/jquery.customSelect.min.js" ></script>
	<script src="<%=request.getContextPath()%>/bootstrap/assets/chart-master/Chart.js"></script>
   
    <!--custome script for all page-->
    <script src="<%=request.getContextPath()%>/bootstrap/js/scripts.js"></script>
    <!-- custom script for this page-->
    <script src="<%=request.getContextPath()%>/bootstrap/js/sparkline-chart.js"></script>
    <script src="<%=request.getContextPath()%>/bootstrap/js/easy-pie-chart.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery-jvectormap-world-mill-en.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/xcharts.min.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery.autosize.min.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery.placeholder.min.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/gdp-data.js"></script>	
	<script src="<%=request.getContextPath()%>/bootstrap/js/morris.min.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/sparklines.js"></script>	
	<script src="<%=request.getContextPath()%>/bootstrap/js/charts.js"></script>
	<script src="<%=request.getContextPath()%>/bootstrap/js/jquery.slimscroll.min.js"></script>

</body>
</html>