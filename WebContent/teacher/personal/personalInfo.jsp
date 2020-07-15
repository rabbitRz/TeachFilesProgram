<%@page import="bean.Project"%>
<%@page import="bean.Paper"%>
<%@ page language="java"  import="java.util.*,bean.*"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>个人信息</title>
</head>

 <body class="bg-light">
 <%
     	Teacher teacher=(Teacher)request.getAttribute("teacher");   		
     %>
     <%
   	List<Application> applications7=(List<Application>)request.getAttribute("applications7");   
	if(applications7!=null&&applications7.size()>0){
		
%>
<A href="GetApplicationServlet?teacher_id=<%=teacher.getId()%>"><button class="btn btn-primary btn-lg btn-block" type="button">查看未审核的申请</button></a>
<%}%>
  <%
    List<Application> applications8=(List<Application>)request.getAttribute("applications7");   
    if(applications8==null||applications8.size()>0){
		
%>
<a></a>
<%}%>  
<%
   	List<Application> applications5=(List<Application>)request.getAttribute("applications5");   
	if(applications5!=null&&applications5.size()>0){
		
%>
<A href="GetNoApplicationServlet?teacher_id=<%=teacher.getId()%>"><button class="btn btn-primary btn-lg btn-block" type="button" style="margin-top:30px;">您有未通过的申请</button></a>
<%}%>
<%
    List<Application> applications6=(List<Application>)request.getAttribute("applications5");   
    if(applications6==null||applications6.size()>0){
		
%>
<a></a>
<%}%>
<form action="<%=request.getContextPath() %>/ApplicationServlet" method="post">
    <div class="container">
  <div class="py-2 text-center" id="teacher_img">
    <img class="d-block mx-auto mb-4" src="<%=request.getContextPath()%>/image/headpo.jpg" alt="" width="88" height="88">   
  </div>
  <div class="py-2 text-center" >
  <h2>个人信息</h2>
  <p class="lead">请确认信息是否正确，与个人信息不符时请进行修改，管理员会进行审核</p>
  </div>
<div class="row">
  <div class="col-md-4 order-md-2 mb-4">
      <h4 class="d-flex justify-content-between align-items-center mb-3">
        <span class="text-muted">所写论文</span>
        <!-- <span class="badge badge-secondary badge-pill">3</span> -->
      </h4>
<%
   	List<Paper> papers=(List<Paper>)request.getAttribute("papers");   
	if(papers!=null&&papers.size()>0){
		for(int i=0;i<papers.size();i++){
%>
      <ul class="list-group mb-3">
        <li class="list-group-item d-flex justify-content-between lh-condensed">

          <div>
            <h6 class="my-0"><a  href=""><%=papers.get(i).getPaper_name() %></a></h6>
            <small class="text-muted"><%=papers.get(i).getJournal_name() %></small>
          </div>
          <!-- <span class="text-muted">$12</span> -->
          <svg class="bi bi-book-half" width="1.2em" height="1.2em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  		  <path fill-rule="evenodd" d="M12.786 1.072C11.188.752 9.084.71 7.646 2.146A.5.5 0 0 0 7.5 2.5v11a.5.5 0 0 0 .854.354c.843-.844 2.115-1.059 3.47-.92 1.344.14 2.66.617 3.452 1.013A.5.5 0 0 0 16 13.5v-11a.5.5 0 0 0-.276-.447L15.5 2.5l.224-.447-.002-.001-.004-.002-.013-.006-.047-.023a12.582 12.582 0 0 0-.799-.34 12.96 12.96 0 0 0-2.073-.609zM15 2.82v9.908c-.846-.343-1.944-.672-3.074-.788-1.143-.118-2.387-.023-3.426.56V2.718c1.063-.929 2.631-.956 4.09-.664A11.956 11.956 0 0 1 15 2.82z"/>
  		  <path fill-rule="evenodd" d="M3.214 1.072C4.813.752 6.916.71 8.354 2.146A.5.5 0 0 1 8.5 2.5v11a.5.5 0 0 1-.854.354c-.843-.844-2.115-1.059-3.47-.92-1.344.14-2.66.617-3.452 1.013A.5.5 0 0 1 0 13.5v-11a.5.5 0 0 1 .276-.447L.5 2.5l-.224-.447.002-.001.004-.002.013-.006a5.017 5.017 0 0 1 .22-.103 12.958 12.958 0 0 1 2.7-.869z"/>
	      </svg>
        </li>
        
      </ul>
<%}} %>

	<h4 class="d-flex justify-content-between align-items-center mb-3">
        <span class="text-muted">获奖情况</span>
        <!-- <span class="badge badge-secondary badge-pill">3</span> -->
      </h4>
<%
   	List<Project> projects=(List<Project>)request.getAttribute("projects");   
	if(projects!=null&&projects.size()>0){
		for(int i=0;i<projects.size();i++){
%>
      <ul class="list-group mb-3">
        <li class="list-group-item d-flex justify-content-between lh-condensed">
          <div>
            <h6 class="my-0"><a  href=""><%=projects.get(i).getPro_name() %></a></h6>
            <small class="text-muted"><%=projects.get(i).getPro_prize() %></small>
          </div>
          <svg class="bi bi-award-fill" width="1.2em" height="1.2em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  			<path d="M8 0l1.669.864 1.858.282.842 1.68 1.337 1.32L13.4 6l.306 1.854-1.337 1.32-.842 1.68-1.858.282L8 12l-1.669-.864-1.858-.282-.842-1.68-1.337-1.32L2.6 6l-.306-1.854 1.337-1.32.842-1.68L6.331.864 8 0z"/>
  			<path d="M4 11.794V16l4-1 4 1v-4.206l-2.018.306L8 13.126 6.018 12.1 4 11.794z"/>
		  </svg>
        </li>
        
      </ul>
<%}} %>
    </div>   
<div class="col-md-8 order-md-1"> 
<form class="needs-validation" novalidate>
<table class="table table-bordered table-hover definewidth m10" >
	
     </table>
    <div class="form-group row">
  
    <label class="col-sm-2 col-form-label">ID</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="id" placeholder="ID" name="id1" readonly="true" value="<%=teacher.getId() %>">
    </div>
  </div>
     
  <div class="form-group row">
  
    <label class="col-sm-2 col-form-label">姓名</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" placeholder="姓名" name="name" value="<%=teacher.getName() %>">
    </div>
  </div>

  <fieldset class="form-group">
    <div class="row">
      <legend class="col-form-label col-sm-2 pt-0">性别</legend>
      <div class="col-sm-10">
        <div class="form-check">
          <input class="form-check-input" type="radio" name="sex" id="gridRadios1" value="男" <%=teacher.getSex().equals("男")?"checked":"" %>>
          <label class="form-check-label" for="gridRadios1">
            男
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="sex" id="gridRadios2" value="女" <%=teacher.getSex().equals("女")?"checked":"" %>>
          <label class="form-check-label" for="gridRadios2">
            女
          </label>
        </div>
      </div>
    </div>
  </fieldset>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">籍贯</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="nativeplace" id="nativeplace" placeholder="籍贯" value="<%=teacher.getNativeplace() %>">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">出生日期</label>
    <div class="col-sm-10">
      <input type="date" class="form-control" name="birthday" id="birthday" placeholder="出生日期" value="<%=teacher.getBirthday() %>">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">学历</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="education" id="education" placeholder="学历" value="<%=teacher.getEducation() %>">
    </div>
  </div>
    <div class="form-group row">
    <label class="col-sm-2 col-form-label">职称</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="title" id="title" placeholder="职称" value="<%=teacher.getTitle() %>">
    </div>
  </div>
    <div class="form-group row">
    <label class="col-sm-2 col-form-label">取得资格时间</label>
    <div class="col-sm-10">
      <input type="date" class="form-control" name="quatime" id="quatime" placeholder="取得资格时间" value="<%=teacher.getQuatime() %>">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">毕业学校</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="graschool" id="graschool" placeholder="毕业学校" value="<%=teacher.getGraschool() %>">
    </div>
  </div>
    <div class="form-group row">
    <label class="col-sm-2 col-form-label">毕业时间</label>
    <div class="col-sm-10">
      <input type="date" class="form-control" name="gratime" id="gratime" placeholder="毕业时间" value="<%=teacher.getGratime() %>">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">所学专业</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="major" id="major" placeholder="所学专业" value="<%=teacher.getMajor() %>">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">工作时间</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="workingtime" id="workingtime" placeholder="工作时间" value="<%=teacher.getWorkingtime() %>">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">现从事专业</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="currentmajor" id="currentmajor" placeholder="现从事专业" value="<%=teacher.getCurrentmajor() %>">
    </div>
  </div>
  <!-- <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
  </div> -->
        <hr class="mb-4">
        <button class="btn btn-primary btn-lg btn-block" type="submit">提交</button>
</form>
	</div>
  </div>

  <footer class="my-5 pt-5 text-muted text-center text-small">
    <p class="mb-1">&copy; 2020 ly</p>
  </footer>
</div>
</form>
<script src="<%=request.getContextPath()%>/bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript">
$(function(){
	$.getJSON("<%=request.getContextPath()%>/PersonalImage?teacher_id="+<%=teacher.getId() %>,function(data){
		console.log(data);
		var str_img="";
		if(data["sex"]=="男"){
			$("#teacher_img").html("");
			str_img='<img class="d-block mx-auto mb-4" src="<%=request.getContextPath()%>/image/man.jpg" alt="" width="88" height="88">';
		}else if(data["sex"]=="女"){
			$("#teacher_img").html("");
			str_img='<img class="d-block mx-auto mb-4" src="<%=request.getContextPath()%>/image/woman.jpg" alt="" width="88" height="88">';
		}
		$("#teacher_img").append(str_img);
	});
	
})
</script>
</body>
</html>