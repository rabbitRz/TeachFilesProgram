<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<!-- Bootstrap CSS -->    
    <link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="<%=request.getContextPath() %>/bootstrap/css/elegant-icons-style.css" rel="stylesheet" />
    <link href="<%=request.getContextPath() %>/bootstrap/css/font-awesome.min.css" rel="stylesheet" />    
    <!-- full calendar css-->
    <link href="<%=request.getContextPath() %>/bootstrap/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
	<link href="<%=request.getContextPath() %>/bootstrap/assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
    <!-- easy pie chart-->
    <link href="<%=request.getContextPath() %>/bootstrap/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
    <link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/owl.carousel.css" type="text/css">
	<link href="<%=request.getContextPath() %>/bootstrap/css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
    <!-- Custom styles -->
	<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/fullcalendar.css">
	<link href="<%=request.getContextPath() %>/bootstrap/css/widgets.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/bootstrap/css/style.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/bootstrap/css/style-responsive.css" rel="stylesheet" />
	<link href="<%=request.getContextPath() %>/bootstrap/css/xcharts.min.css" rel=" stylesheet">	
	<link href="<%=request.getContextPath() %>/bootstrap/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
</head>
<body>
      <!--main content start-->
          <section class="wrapper">            
              <!--overview start-->
			  <div class="row">
				<div class="col-lg-10">
					<h3 class="page-header"><i class="fa fa-home"></i> 首页</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="<%=request.getContextPath() %>/admin/Home.jsp">Home</a></li>
						<li><i class=""></i></li>				  	
					</ol>
				</div>
			</div>

			<div class="row">
		    <div class="col-lg-11 col-md-12">
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h2><i class="fa fa-map-marker red"></i><strong>Countries</strong></h2>
							<div class="panel-actions">
								<a href="index.html#" class="btn-setting"><i class="fa fa-rotate-right"></i></a>
								<a href="index.html#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
								<a href="index.html#" class="btn-close"><i class="fa fa-times"></i></a>
							</div>	
						</div>
						<div class="panel-body-map">
							<div id="map" style="height:380px;"></div>	
						</div>
	
					</div>
				</div>

              
			 
           </div>  
			<br><br>
		
              <!-- project team & activity end -->

          </section>
      </section>
      <!--main content end-->
  <!-- container section start -->
<!-- javascripts -->
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery-ui-1.10.4.min.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap/js/jquery-ui-1.9.2.custom.min.js"></script>
    <!-- bootstrap -->
    <script src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.min.js"></script>
    <!-- nice scroll -->
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.scrollTo.min.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.nicescroll.js" type="text/javascript"></script>
    <!-- charts scripts -->
    <script src="<%=request.getContextPath() %>/bootstrap/assets/jquery-knob/js/jquery.knob.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.sparkline.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/owl.carousel.js" ></script>
    <!-- jQuery full calendar -->
    <<script src="<%=request.getContextPath() %>/bootstrap/js/fullcalendar.min.js"></script> <!-- Full Google Calendar - Calendar -->
	<script src="<%=request.getContextPath() %>/bootstrap/assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
    <!--script for this page only-->
    <script src="<%=request.getContextPath() %>/bootstrap/js/calendar-custom.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.rateit.min.js"></script>
    <!-- custom select -->
    <script src="<%=request.getContextPath() %>/bootstrap/js/jquery.customSelect.min.js" ></script>
	<script src="<%=request.getContextPath() %>/bootstrap/assets/chart-master/Chart.js"></script>
   
    <!--custome script for all page-->
    <script src="<%=request.getContextPath() %>/bootstrap/js/scripts.js"></script>
    <!-- custom script for this page-->
    <script src="<%=request.getContextPath() %>/bootstrap/js/sparkline-chart.js"></script>
    <script src="<%=request.getContextPath() %>/bootstrap/js/easy-pie-chart.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery-jvectormap-world-mill-en.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/xcharts.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.autosize.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.placeholder.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/gdp-data.js"></script>	
	<script src="<%=request.getContextPath() %>/bootstrap/js/morris.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/sparklines.js"></script>	
	<script src="<%=request.getContextPath() %>/bootstrap/js/charts.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/js/jquery.slimscroll.min.js"></script>
<script>

      //knob
      $(function() {
        $(".knob").knob({
          'draw' : function () { 
            $(this.i).val(this.cv + '%')
          }
        })
      });

      //carousel
      $(document).ready(function() {
          $("#owl-slider").owlCarousel({
              navigation : true,
              slideSpeed : 300,
              paginationSpeed : 400,
              singleItem : true

          });
      });

      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });
	  
	  /* ---------- Map ---------- */
	$(function(){
	  $('#map').vectorMap({
	    map: 'world_mill_en',
	    series: {
	      regions: [{
	        values: gdpData,
	        scale: ['#000', '#000'],
	        normalizeFunction: 'polynomial'
	      }]
	    },
		backgroundColor: '#eef3f7',
	    onLabelShow: function(e, el, code){
	      el.html(el.html()+' (GDP - '+gdpData[code]+')');
	    }
	  });
	});



  </script>
</body>
</html>