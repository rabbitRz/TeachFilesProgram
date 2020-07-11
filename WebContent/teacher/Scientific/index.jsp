<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../../bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<meta charset="UTF-8">
<title>科研模块</title>
</head>
<body background="../../image/scientificBg.gif">
<div class="container"style="position:relative;top:30px">

<div class="card mb-3" style="max-width:100%;height:auto">
  <div class="row no-gutters">
    <div class="col-md-auto" id="teacher_img"> 
      <img src="../../image/M_tr.jpg" class="card-img" alt="...">
    </div>
    <div class="col-md-9">
      <div class="card-body" id="teacher_info">
        <h5 class="card-title" id="teacher_name"></h5>
        <p class="card-text" id="teacher_m"></p>
        <p class="card-text"><small class="text-muted" id="teacher_n">欢迎加入兰州理工大学！</small></p>
      </div>
    </div>
  </div>
</div>

<div class="accordion" id="accordionExample">
  <div class="card">
    <div class="card-header" id="headingOne">
      <h2 class="mb-0">
        <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
          项目获奖信息
        </button>
      </h2>
    </div>

    <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
      <div class="card-body">
        
  <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">项目编号</th>
      <th scope="col">项目名称</th>
      <th scope="col">项目类别</th>
      <th scope="col">项目开始时间</th>
      <th scope="col">项目结束时间</th>
      <th scope="col">项目奖项</th>
      <th scope="col">项目排名</th>
      <th scope="col">项目队长</th>
      <th scope="col">队员1</th>
      <th scope="col">队员2</th>
      <th scope="col">队员3</th>
    </tr>
  </thead>
  <tbody id="proInfo">
    <!--<tr>
      <th scope="row" >1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Larry</td>
      <td>the Bird</td>
      <td>@twitter</td>
    </tr>-->
  </tbody>
</table>
        
      </div>
    </div>
  </div>
  
  <div class="card">
    <div class="card-header" id="headingTwo">
      <h2 class="mb-0">
        <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
          论文信息
        </button>
      </h2>
    </div>
    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
      <div class="card-body">
      
      <form id="paperTable" action="post">
       <table class="table table-striped"  >
  <thead>
    <tr>
      <th scope="col">论文编号</th>
      <th scope="col">论文名称</th>
      <th scope="col">期刊名称</th>
      <th scope="col">发布时间</th>
      <th scope="col">期刊级别</th>
      <th scope="col">索引情况</th>
      <th scope="col">论文排名</th>
      <th scope="col">成员1</th>
      <th scope="col">成员2</th>
      <th scope="col">成员3</th>
      <th scope="col">开放权限</th>
    </tr>
  </thead>
  <tbody id="paperInfo">
  </tbody>
</table> 
</form>
      </div>
    </div>
  </div>
  
  <!--<div class="card">
    <div class="card-header" id="headingThree">
      <h2 class="mb-0">
        <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
          论文信息
        </button>
      </h2>
    </div>
    <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
      <div class="card-body">
        Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
      </div>
    </div>
  </div>
  -->
  <div class="card">
    <div class="card-header" id="headingThree">
      <h2 class="mb-0">
        <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
          所带班级信息
        </button>
      </h2>
    </div>
    <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
      <div class="card-body">
        <table class="table table-striped" >
  <thead>
    <tr>
      <th scope="col">所带班级</th>
      <th scope="col">班级课程</th>
      <th scope="col">是否查看课程表</th>
    </tr>
  </thead>
  <tbody id="classInfo">
  </tbody>
</table> 
      </div>
    </div>
  </div>
  
  <div class="card">
    <div class="card-header" id="headingThree">
      <h2 class="mb-0">
        <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseFour" aria-expanded="false" aria-controls="collapseThree">
          论文权限申请
        </button>
      </h2>
    </div>
    <div id="collapseFour" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
      <div class="card-body">
      
        <table class="table table-striped" >
  <thead>
  <tr>
  若提交的申请中有一人不同意，则将会是该项申请失败！
  </tr>
    <tr>
      <th scope="col">申请论文名</th>
      <th scope="col">成员1</th>
      <th scope="col">成员1意向</th>
      <th scope="col">成员2</th>
      <th scope="col">成员2意向</th>
      <th scope="col">成员3</th>
      <th scope="col">成员3意向</th>
      <th scope="col">申请意向</th>
      <th scope="col">意向</th>
    </tr>
  </thead>
  <tbody id="classInfo">
  </tbody>
</table> 

      </div>
    </div>
  </div>
  
</div>
</div>

</body>
<script src="../../bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="../../bootstrap/js/bootstrap.min.js"></script>
<script src="../../bootstrap/js/bootstrap.js"></script>
<script type="text/javascript">
$(function(){
	//teahcer_id
	var teacher_id=1;
	//若论文某一成员提交了论文申请，其余成员将会收到申请，之后对其进行申请判断
	$.getJSON("../../permissionAgree?teacher_id=",function(data){
		
	})
	
	//$.getJSON("../../")
	$.getJSON("../../SciGetTrInfo?teacher_id="+teacher_id,function(data){
		console.log(data);
		var str_img="";
		if(data["sex"]=="男"){
			$("#teacher_img").html("");
			str_img='<img src="../../image/M_tr.jpg" class="card-img" alt="...">';
		}else if(data["sex"]=="女"){
			$("#teacher_img").html("");
			str_img='<img src="../../image/W_tr.jpg" class="card-img" alt="...">';
		}
		$("#teacher_img").append(str_img);
		$("#teacher_name").append(data["name"]);
		var str="性别:"+data["sex"]+"<br/>"+"籍贯："+data["nativeplace"]+"<br/>学历情况："+data["education"]+"<br/>"
		+"职称："+data["title"]+"<br/>专业："+data["major"]+"<br/>参加工作时间："+data["workingtime"];
		$("#teacher_m").append(str);
	});
	
	//获取项目获奖情况
	$.getJSON("../../SciGetProA?teacher_id="+teacher_id,function(data){
		console.log(data);
		var str="";
		for(var i=0;i<data.length;i++){
			str+='<tr>'+
			     '<th scope="row" >'+data[i].pro_id+'</th>'+
			     '<td>'+data[i].pro_name+'</td>'+
			     '<td>'+data[i].pro_category+'</td>'+
			     '<td>'+data[i].pro_starttime+'</td>'+
			     '<td>'+data[i].pro_finishtime+'</td>'+
			     '<td>'+data[i].pro_prize+'</td>'+
			     '<td>'+data[i].pro_ranking+'</td>'+
			     '<td>'+data[i].leader_name+'</td>'+
			     '<td>'+data[i].t1_name+'</td>'+
			     '<td>'+data[i].t2_name+'</td>'+
			     '<td>'+data[i].t3_name+'</td>'+
			     '</tr>';
		}
		$("#proInfo").append(str);
	});
	//获取论文信息
	$.getJSON("../../SciGetSciInfo?teacher_id="+teacher_id,function(data){
		console.log(data);
		var str="";
		for(var i=0;i<data.length;i++){
			var rt="私有";
			if(data[i].permission=='1')
				rt="公开";
			str+='<tr>'+
		     '<th scope="row" >'+data[i].paper_id+'</th>'+
		     '<td>'+data[i].paper_name+'</td>'+
		     '<td>'+data[i].journal_name+'</td>'+
		     '<td>'+data[i].release_time+'</td>'+
		     '<td>'+data[i].journal_level+'</td>'+
		     '<td>'+data[i].paper_index+'</td>'+
		     '<td>'+data[i].paper_ranking+'</td>'+
		     '<td>'+data[i].people1_name+'</td>'+
		     '<td>'+data[i].people2_name+'</td>'+
		     '<td>'+data[i].people3_name+'</td>'+
		     '<td><button type="button" class="btn btn-success"  name="ChangePermission">'+rt+'</button></td>'+
		     '</tr>';
		     $("button[name=ChangePermission]").click(data[i]);
		}
		$("#paperInfo").append(str);
		//权限切换
		$("button[name=ChangePermission]").click(function(){
			var rr=$(this).text();
			var application="";
			if(rr=="公开"){
				application="私有";
			}else if(rr=="私有"){
				application="公开";
			}
			var result=confirm("确定要将该篇论文状态设置为"+application+"吗？\n(注意：必须获取论文所有参与人员同意)");
			if(result){
			//console.log(application);
			//获取点击的该列对应的第一列的值
			var paper_id=$(this).closest("tr").find("th").eq(0).text();
			$.post("../../SciChangPermission",{paper_id:paper_id,member:teacher_id,member_per:"Y",application:application},function(data){
				alert(data);
			});
		}	
		});
		
	})
	//获取所带班级信息
	$.getJSON("../../SciGetClass?teacher_id="+teacher_id,function(data){
		console.log(data);
		var str="";
		for(var i=0;i<data.length;i++){
			str+='<tr>'+
			     '<th scope="row" >'+data[i].course_class+'</th>'+
			     '<td>'+data[i].course_name+'</td>'+
			     '<td><button type="button" class="btn btn-link">'+
			     '<a href="<%=request.getContextPath()%>/teacher/Course/CourseIndex.jsp">课程表</a></button></td>'+
			     '</tr>';
		}
		$("#classInfo").append(str);
	});
})
</script>
</html>