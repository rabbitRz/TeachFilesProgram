<%@ page language="java"  import="java.util.*,bean.*"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>校园</title>
</head>
<body>

  <h4 style="position:relative;top:140px;left:165px;display:inline; font-family:STHupo;font-color:#191970;" >**实时新闻**</h4>
    <h4 style="position:relative;top:140px;left:760px;display:inline; font-family:STHupo;font-color:#191970;" >**开放论文**</h4>
  
 <form style="position:relative;top:150px;">
 
   <table class="table table-bordered table-hover" style="position:relative;left:30px;width:420px;height:500px;float:left;" >

   <thead>

    <tr>

        <th style="vertical-align:middle;text-align:center;font-size:18px;">新闻名称</th>        
        <th style="vertical-align:middle;text-align:center;font-size:18px;">新闻内容</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">新闻日期</th>        



    </tr>

    </thead>
 
  <%List<School> school=(List<School>)request.getAttribute("school");       
      if(school!=null&&school.size()>0){
      for(int i=0;i<school.size();i++){
      %>    
 

  <tr>           
         <td width="20%" style="vertical-align:middle;text-align:center;"><%=school.get(i).getNewsname() %></td> 
         <td width="80%" style="vertical-align:middle;text-align:center;"><%=school.get(i).getNewsinfo() %></td>
         <td width="10%" style="vertical-align:middle;text-align:center;"><%=school.get(i).getNewsdate() %></td>              
       </tr>
       
   <%} }%>
  </table>
  </form>
  <><>
  <form style="position:relative;top:150px;">
  
   <table class="table table-bordered table-hover" style="position:relative;right:30px;width:850px;height:500px;float:right;">

   <thead>

    <tr>      

        <th style="vertical-align:middle;text-align:center;font-size:18px;">论文名称</th>     
        <th style="vertical-align:middle;text-align:center;font-size:18px;">期刊名称</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">时间</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">期刊级别</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">索引情况</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">排名</th>
        <th style="vertical-align:middle;text-align:center;font-size:18px;">作者</th>
      
    </tr>

    </thead>
 
  <%List<Paper> paper=(List<Paper>)request.getAttribute("paper");       
      if(paper!=null&&paper.size()>0){
      for(int i=0;i<paper.size();i++){
      %>    
 

  <tr>           
         
         <td width="20%" style="vertical-align:middle;text-align:center;"><a href=""><%=paper.get(i).getPaper_name() %></a></td>
         <td width="17%" style="vertical-align:middle;text-align:center;"><%=paper.get(i).getJournal_name() %></td> 
         <td width="10%" style="vertical-align:middle;text-align:center;"><%=paper.get(i).getRelease_time() %></td> 
         <td width="10%" style="vertical-align:middle;text-align:center;"><%=paper.get(i).getJournal_level() %></td> 
         <td width="10%" style="vertical-align:middle;text-align:center;"><%=paper.get(i).getPaper_index() %></td> 
         <td width="7%" style="vertical-align:middle;text-align:center;"><%=paper.get(i).getPaper_ranking() %></td> 
         <td width="15%" style="vertical-align:middle;text-align:center;"><%=paper.get(i).getTeachername() %></td> 
   
       </tr>
       
   <%} }%>
  </table>
  </form>
   <script src="<%=request.getContextPath()%>/bootstrap/js/jquery-3.4.1.min.js"></script>
   <script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
   <script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>
</body>
</html>