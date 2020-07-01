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
      <select id="class" class="form-control">
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
  <div class="card-header" style="font-size:30px">
    课程表
  </div>
  <div class="card-body">
    <table class="table table-bordered table-hover ">
  <thead>
    <tr>
      <th></th>
      <th scope="col">星期一</th>
      <th scope="col">星期二</th>
      <th scope="col">星期三</th>
      <th scope="col">星期四</th>
      <th scope="col">星期五</th>
      <th scope="col">星期六</th>
      <th scope="col">星期日</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="col" rowspan="2" class="align-middle">第一节</th>
      <td scope="col" rowspan="2" class="align-middle">Mark</td>
      <td scope="col" rowspan="2" class="align-middle">Otto</td>
      <td scope="col" rowspan="2" class="align-middle">@mdo</td>
      <td scope="col" rowspan="2" class="align-middle">@mdo</td>
      <td scope="col" rowspan="2" class="align-middle">Mark</td>
      <td scope="col" rowspan="2" class="align-middle">Otto</td>
      <td scope="col" rowspan="2" class="align-middle">@mdo</td>
    </tr>
    <tr>
     
    </tr>
  </tbody>
</table>
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
<script src="../../bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="../../bootstrap/js/bootstrap.min.js"></script>
<script src="../../bootstrap/js/bootstrap.js"></script>
<script>
$(function(){
	$.get("../../GetCourseClassServlet",function(data){
		console.log(data);
		$("#class").html("");
		for(var i=0;i<data.size();i++){
			console.log(data.get[i])
			$("#class").append("<option selected value="+data[i]+">"+data[i]+"</option>");
		}
		
	});
});
</script>
</html>