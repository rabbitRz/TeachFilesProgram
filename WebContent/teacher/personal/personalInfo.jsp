<%@page import="bean.Paper"%>
<%@ page language="java"  import="java.util.*,bean.Teacher"
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
    <div class="container">
  <div class="py-5 text-center">
    <img class="d-block mx-auto mb-4" src="<%=request.getContextPath()%>/image/headpo.jpg" alt="" width="88" height="88">
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
      <ul class="list-group mb-3">
        <li class="list-group-item d-flex justify-content-between lh-condensed">
          <div>
            <h6 class="my-0">Product name</h6>
            <small class="text-muted">Brief description</small>
          </div>
          <span class="text-muted">$12</span>
        </li>
        
      </ul>
    </div>   
<div class="col-md-8 order-md-1"> 
<form class="needs-validation" novalidate>
<table class="table table-bordered table-hover definewidth m10" >
	<%
     	Teacher teacher=(Teacher)request.getAttribute("teacher");   		
     %>
     </table>
  <div class="form-group row">
  
    <label class="col-sm-2 col-form-label">姓名</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" placeholder="姓名" value="<%=teacher.getName() %>">
    </div>
  </div>

  <fieldset class="form-group">
    <div class="row">
      <legend class="col-form-label col-sm-2 pt-0">性别</legend>
      <div class="col-sm-10">
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="男" <%=teacher.getSex().equals("男")?"checked":"" %>>
          <label class="form-check-label" for="gridRadios1">
            男
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="女" <%=teacher.getSex().equals("女")?"checked":"" %>>
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
      <input type="text" class="form-control" id="nativeplace" placeholder="籍贯" value="<%=teacher.getNativeplace() %>">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">出生日期</label>
    <div class="col-sm-10">
      <input type="date" class="form-control" id="birthday" placeholder="出生日期" value="<%=teacher.getBirthday() %>">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">学历</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="education" placeholder="学历" value="<%=teacher.getEducation() %>">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">毕业学校</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="graschool" placeholder="毕业学校" value="<%=teacher.getGraschool() %>">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">所学专业</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="major" placeholder="所学专业" value="<%=teacher.getMajor() %>">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">工作时间</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="workingtime" placeholder="工作时间" value="<%=teacher.getWorkingtime() %>">
    </div>
  </div>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">现从事专业</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="currentmajor" placeholder="现从事专业" value="<%=teacher.getCurrentmajor() %>">
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
<script src="<%=request.getContextPath()%>/bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>
</body>
</html>