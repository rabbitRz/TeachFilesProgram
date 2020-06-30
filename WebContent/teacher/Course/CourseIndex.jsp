<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../../bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>课程表页面</title>
</head>
<body>
<img src="../../image/TrCourseBg.jpg" style="width:100%;height:auto">
<div class="container" style="position:absolute;top:30px;color:black">
<form >
  <div class="row no-gutters">
   <div class="col-2" style="position:relative;left:20px"></div>
    <label belLg" class="align-middle col-auto" style="font-size:20px">班级:</label>
    <div class="col-3"  style="position:relative;left:20px">
      <select id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option>...</option>
      </select>  
    </div>
    <label for="colFormLabelLg" class="align-middle col-auto" style="font-size:20px;position:relative;left:50px">第:</label>
    <div class="col-3"  style="position:relative;left:60px">
      <select id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option>...</option>
      </select>  
    </div>
    <label class="align-middle col-1" style="font-size:20px;position:relative;left:70px">周</label>
 </div>
 
</form>

<div class="row" style="position:relative;top:40px">
  <div class="col-sm-1">
  </div>
  <div class="col-sm-10">
    <div class="card text-center">
<div class="card-img-overlay">
  <div class="card-header">
    课程表
  </div>
  <div class="card-body">
    <h5 class="card-title">Special title treatment</h5>
    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
  <div class="card-footer text-muted">
    2 days ago
  </div>
</div>
</div>
</div>
  </div>
  <div class="col-auto">
  </div>
</div>


</body>
<script src="bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="bootstrap/js/bootstrap.js"></script>
</html>