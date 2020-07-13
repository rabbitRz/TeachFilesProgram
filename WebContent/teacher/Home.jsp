<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<link href="templatemo_style.css" rel="stylesheet" type="text/css">
<title>首页</title>
</head>
<body>

  <!-- 轮播图片 -->
 <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel" style="margin-top:110px;margin-top:10px">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="<%=request.getContextPath()%>/img/lan1.jpg" class="d-block w-100" alt="Responsive image">
    </div>
    <div class="carousel-item">
      <img src="<%=request.getContextPath()%>/img/lan1.jpg" class="d-block w-100" alt="...">
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
<div class="container">

<div style="font-size:15px">
	<div id="templatemo_main">
    <!-- 
    	<div class="three_column margin_r25 vertical_divider">
        	<h3>Happy People</h3>
            <img src="images/barchart.png" alt="image 1">
            <p>Suspendisse sed odio ut mi auctor blandit. Duis nulla diam, posuere ac, varius id.</p>
            <div class="cleaner_h10"></div>
            <div class="button float_r"><a href="#">More...</a></div>
        </div>
  		<div class="three_column margin_r25 vertical_divider">
        	<h3>Healthy Living</h3>
            <img src="images/linechart.png" alt="image 2">
            <p>Nam sodales, pede vel dapibus lobortis, ipsum diam molestie risus, a vulputate risus.</p>
            <div class="cleaner_h10"></div>
            <div class="button float_r"><a href="#">More...</a></div>
        </div>
         <div class="three_column">
        	<h3>Work Less</h3>
            <img src="images/piechart.png" alt="image 3">
            <p>Aliquam lacus turpis, dapibus eget, tincidunt eu, lobortis et, magna. Integer.</p>
            <div class="cleaner_h10"></div>
            <div class="button float_r"><a href="#">More...</a></div>
        </div><div class="cleaner_h60"></div>
         -->
        
        
        <h2>兰州理工大学</h2>
		
        <div class="image_wrapper fl_img" >
        <img src="<%=request.getContextPath()%>/img/xiaohui.jpg" alt="image" ></div>
        <p align="justify">Eco Green Template is one of the <a href="https://www.webmoban.net" target="_parent">free css templates</a>
         by <a href="https://www.webmoban.net" target="_parent" title="网站模板">网站模板</a>. You may use this template for your personal or commercial websites. Credits go to Free Photos for photos and <a href="#" target="_blank">Smashing Magazine</a> for icons used in this template. Morbi sed nulla ac est cursus suscipit eu ac lectus. Curabitur  ullamcorper nibh nisi, sed eleifend dolor. Pellentesque adipiscing  sollicitudin sapien nec aliquet. Cras rutrum ullamcorper metus, vitae  consectetur dolor vulputate a. Sed nec eros egestas nisl tincidunt  aliquet at in est. Duis luctus nulla metus, a vulputate mauris</p>
		<p align="justify">Suspendisse et libero eget dui fringilla vulputate. Aliquam faucibus eros sit amet elit lacinia id feugiat enim lacinia. Curabitur sit amet augue id lacus tincidunt commodo. Cras vestibulum est at mi semper sit amet tempus mauris pellentesque. Integer tincidunt eleifend interdum. Fusce posuere eros sed elit placerat dapibus et vitae dolor. Aenean arcu ligula, dapibus id fringilla vel, condimentum id nisi. Vivamus faucibus consequat feugiat.</p>
    
    </div> <!-- end of templatemo_main -->
</div>

</div>
  <!-- 搜索框 -->


<!-- 
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
  <div class="card bg-light mb-3" style="max-width:17rem;margin-top:50px;float:left;margin-left:50px">
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

<div class="container" style="float:right;margin-right:70px;width:1000px;height:600px;">
  <h4 class="text-center" >——科研成果——<a href="login.html" class="card-link">
  <b style="font-size:16px;float:right;" >更多>></b></a></h4>
  
  <br>
<div class="border border-light" >
<div  class="bg-light text-dark" style="padding-left:30px;padding-top:10px">
<div class="row">
 <div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">论文标题</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
  <div class="card" style="width: 18rem;margin-left:10px" >
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
-->
  <!-- 底部 -->
<footer class="footer text-center" style="margin-top:100px">
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
<script src="<%=request.getContextPath()%>/bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>

</body>
</html>