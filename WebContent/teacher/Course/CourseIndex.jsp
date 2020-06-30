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
<div class="container">
<form style="position:relative;top:30px">
  <div class="row no-gutters">
   <div class="col-sm-1" style="position:relative;left:10px"></div>
    <label for="colFormLabelLg" class="col-sm-auto col-form-label col-form-label-lg">班级:</label>
    <div class="col-sm-5" style="position:relative;left:10px">
      <select id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option>...</option>
      </select>  
    </div>
    <label for="colFormLabelLg" class="col-sm-auto col-form-label col-form-label-lg">第</label>
    <div class="col-sm-3">
      <select id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option>...</option>
      </select>  
    </div>
    <label for="colFormLabelLg" class="col-sm-auto col-form-label col-form-label-lg">周</label>
  </div>
</form>
</div>
</body>
<script src="bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="bootstrap/js/bootstrap.js"></script>
</html>