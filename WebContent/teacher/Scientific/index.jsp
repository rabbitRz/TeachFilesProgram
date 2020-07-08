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
      <th scope="col">权限设置</th>
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
          科研信息
        </button>
      </h2>
    </div>
    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
      <div class="card-body">
        Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
      </div>
    </div>
  </div>
  <div class="card">
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
        Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
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
		for(var i=0;i<list.length();i++){
			str+='<tr>'+
			     '<th scope="row" >'+data[i].id+'</th>'+
			     '<td>Mark</td>'
			      <td>Otto</td>
			      <td>@mdo</td>
			    </tr>'
		}
	})
})
</script>
</html>