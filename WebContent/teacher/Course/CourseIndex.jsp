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
<body background="../../image/TrCourseBg.jpg" style="background-repeat:repeat;background-size:cover;">

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
    <div class="col-auto"  style="position:relative;left:60px">
      <select id="XinQi" class="form-control">
        <option selected>1</option>
      </select>  
    </div>
    <label class="align-middle col-1" style="font-size:20px;position:relative;left:70px">周</label>
    
    <div class="col-auto" style="position:relative;left:40px">
    <button type="button" class="btn btn-danger" id="sel">
    <svg class="bi bi-hand-index-thumb" width="32" height="25" viewBox="0 0 16 16" fill="white" xmlns="http://www.w3.org/2000/svg">
    <path fill-rule="evenodd" d="M6.75 1a.75.75 0 0 0-.75.75V9.5a.5.5 0 0 1-.854.354l-2.41-2.411a.517.517 0 0 0-.809.631l2.512 4.185 1.232 2.465a.5.5 0 0 0 .447.276h6.302a.5.5 0 0 0 .434-.252l1.395-2.442a2.5 2.5 0 0 0 .317-.991l.272-2.715a1 1 0 0 0-.995-1.1H13.5v1a.5.5 0 1 1-1 0V7.154a4.208 4.208 0 0 0-.2-.26c-.187-.222-.368-.383-.486-.43-.124-.05-.392-.063-.708-.039a4.844 4.844 0 0 0-.106.01V8a.5.5 0 1 1-1 0V5.986c0-.167-.073-.272-.15-.314a1.657 1.657 0 0 0-.448-.182c-.179-.035-.5-.04-.816-.027l-.086.004V8a.5.5 0 1 1-1 0V1.75A.75.75 0 0 0 6.75 1zM8.5 4.466V1.75a1.75 1.75 0 1 0-3.5 0v6.543L3.443 6.736A1.517 1.517 0 0 0 1.07 8.588l2.491 4.153 1.215 2.43A1.5 1.5 0 0 0 6.118 16h6.302a1.5 1.5 0 0 0 1.302-.756l1.395-2.441a3.5 3.5 0 0 0 .444-1.389l.272-2.715a2 2 0 0 0-1.99-2.199h-.582a5.114 5.114 0 0 0-.195-.248c-.191-.229-.51-.568-.88-.716-.364-.146-.846-.132-1.158-.108l-.132.012a1.26 1.26 0 0 0-.56-.642 2.634 2.634 0 0 0-.738-.288c-.31-.062-.739-.058-1.05-.046l-.048.002zm2.094 2.025z"/>
   </svg>
    <font style="font-size:17px">查看</font>
    </button>
    </div>
 </div>
 
</form>

<div class="row" style="position:relative;top:40px">
  <div class="col-sm-1">
  </div>
  <div class="col-lg-12">
    <div class="card text-center">
<div class="card-img-overlay">
  <div class="card-header" style="font-size:30px">
    课程表
  </div>
  <div class="card-body">
    <table class="table table-bordered table-hover " style="table-layout:fixed">
  <thead>
    <tr>
      <th></th>
      <th scope="col-2">星期一</th>
      <th scope="col-2">星期二</th>
      <th scope="col-2">星期三</th>
      <th scope="col-2">星期四</th>
      <th scope="col-2">星期五</th>
      <th scope="col-2">星期六</th>
      <th scope="col-2">星期日</th>
    </tr>
  </thead>
  <tbody id="tab">
  <!--   <tr>
      <th >第一节</th>
      <td >Mark</td>
      <td >Otto</td>
      <td >@mdo</td>
      <td >@mdo</td>
      <td >Mark</td>
      <td >Otto</td>
      <td >@mdo</td>
    </tr>
     -->
    
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
	//教师id
	var teacher_id="1";
	$.get("../../GetCourseClassServlet?teacher_id="+teacher_id,function(data){
		//console.log(data);
		$("#class").html("");
		for(var i=0;i<data.length;i++){
			$("#class").append("<option value="+data[i]+">"+data[i]+"</option>");
		}
		$("#class").append("<option selected value=全部>全部</option>");
	});
	
	//插入周数
	for(var i=0;i<20;i++){
		$("#XinQi").append("<option value="+(i+1)+">"+(i+1)+"</option>");
	}
	//计算当前为第几周
	$.get("../../ter",function(data){
		console.log(data);
		var y=data.split("-")[0];
		var m=data.split("-")[1];
		var d=data.split("-")[2];
		//获取打那岸给钱日期
		var endDate=new Date();
		var date=new Date(endDate.getFullYear(),endDate.getMonth()+1,endDate.getDate());
		var startDate = new Date(y,m,d); 
		var ch=parseInt(Math.abs(date - startDate ) /(1*24*60*60*1000));
		ch=parseInt(ch/7+1);
		$("#XinQi option[value="+ch+"]").attr("selected",true);
		$("option[value="+ch+"]").attr("selected");
		console.log(ch);
	});
	//课程表填充
	function InputCourse(data){
		var str1="<tr><th scope='row'  class='align-middle'>第一节</th>",
		str2="<tr><th scope='row'  class='align-middle'>第二节</th>",
		str3="<tr><th scope='row'  class='align-middle'>第三节</th>",
		str4="<tr><th scope='row'  class='align-middle'>第四节</th>";
		var sa1=new Array();
		for(var i=0;i<7;i++){
			sa1[i]="<td ></td>";
		}
		var sa2=new Array();
		for(var i=0;i<7;i++){
			sa2[i]="<td ></td>";
		}	
		var sa3=new Array();
		for(var i=0;i<7;i++){
			sa3[i]="<td ></td>";
		}
		var sa4=new Array();
		for(var i=0;i<7;i++){
			sa4[i]="<td ></td>";
		}
		for(var i=0;i<data.length;i++){
			switch(data[i].course_hours){
			case 1:
				var t=0;
				if(data[i].week=="星期一")
					t=0;
				else if(data[i].week=="星期二")
					t=1;
				else if(data[i].week=="星期三")
					t=2;
				else if(data[i].week=="星期四")
					t=3;
				else if(data[i].week=="星期五")
					t=4;
				else if(data[i].week=="星期六")
					t=5;
				else if(data[i].week=="星期日")
					t=6;
				sa1[t]='<td >'+data[i].course_name+'<br/>'+
				data[i].course_place+'<br/> (第'+data[i].start_courseweek+'-'+data[i].end_courseweek+'周)<br/>'+data[i].teachr_name+'<br/>'+data[i].course_class+'</td>';
				break;
			case 2:
				var t=0;
				if(data[i].week=="星期一")
					t=0;
				else if(data[i].week=="星期二")
					t=1;
				else if(data[i].week=="星期三")
					t=2;
				else if(data[i].week=="星期四")
					t=3;
				else if(data[i].week=="星期五")
					t=4;
				else if(data[i].week=="星期六")
					t=5;
				else if(data[i].week=="星期日")
					t=6;
				sa2[t]='<td >'+data[i].course_name+'<br/>'+
				data[i].course_place+'<br/> (第'+data[i].start_courseweek+'-'+data[i].end_courseweek+'周)<br/>'+data[i].teachr_name+'<br/>'+data[i].course_class+'</td>';
				break;
			case 3:
				var t=0;
				if(data[i].week=="星期一")
					t=0;
				else if(data[i].week=="星期二")
					t=1;
				else if(data[i].week=="星期三")
					t=2;
				else if(data[i].week=="星期四")
					t=3;
				else if(data[i].week=="星期五")
					t=4;
				else if(data[i].week=="星期六")
					t=5;
				else if(data[i].week=="星期日")
					t=6;
				sa3[t]='<td >'+data[i].course_name+'<br/>'+
				data[i].course_place+'<br/> (第'+data[i].start_courseweek+'-'+data[i].end_courseweek+'周)<br/>'+data[i].teachr_name+'<br/>'+data[i].course_class+'</td>';
				break;
			case 4:
				var t=0;
				if(data[i].week=="星期一")
					t=0;
				else if(data[i].week=="星期二")
					t=1;
				else if(data[i].week=="星期三")
					t=2;
				else if(data[i].week=="星期四")
					t=3;
				else if(data[i].week=="星期五")
					t=4;
				else if(data[i].week=="星期六")
					t=5;
				else if(data[i].week=="星期日")
					t=6;
				sa4[t]='<td >'+data[i].course_name+'<br/>'+
				data[i].course_place+'<br/> (第'+data[i].start_courseweek+'-'+data[i].end_courseweek+'周)<br/>'+data[i].teachr_name+'<br/>'+data[i].course_class+'</td>';
				break;
			}
		}
		for(var i=0;i<7;i++){
			str1+=sa1[i];
		}
		str1+="</tr>";
		for(var i=0;i<7;i++){
			str2+=sa2[i];
		}
		str2+="</tr>";
		for(var i=0;i<7;i++){
			str3+=sa3[i];
		}
		str3+="</tr>";
		for(var i=0;i<7;i++){
			str4+=sa4[i];
		}
		str4+="</tr>";
		$("#tab").append(str1+str2+str3+str4);
	}
	//课程表填充
	$.getJSON("../../course?teacher_id="+teacher_id,function(data){
		console.log(data);
		InputCourse(data);
	})
	//根据多选框来查看相应课程表
	$("#sel").click(function(){
		var course_class=$("#class").find("option:selected").val();
		var course_week=$("#XinQi").find("option:selected").val();
		if(course_class=='全部'){
			$.getJSON("../../course?teacher_id="+teacher_id,function(data){
				console.log(data);
				$("#tab").html("");
				InputCourse(data);
			})
		}else{
		$.getJSON("../../find_class?teacher_id="+teacher_id+"&class="+course_class+"&week="+course_week,function(data){
			console.log(data);
			$("#tab").html("");
			InputCourse(data);
		})
		}
	})
});
</script>
</html>