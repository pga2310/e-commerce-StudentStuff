
<%@page import="java.sql.ResultSet"%>
<%DBCON.Data l = new DBCON.Data();
  String Activate="";
  ResultSet r1 = null;
  r1 = l.getregister();
  
  
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<head>

<meta charset="utf-8" />
<title>Online Food Ordering System</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta content="" name="description" />
<meta content="" name="author" />

<link href="./resources/css/pace-theme-flash.css" rel="stylesheet" type="text/css">
<link href="./resources/css/jquery.sidr.light.css" rel="stylesheet" type="text/css">
<link href="./resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="./resources/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css">
<link href="./resources/css/font-awesome.css" rel="stylesheet" type="text/css">
<link href="./resources/css/animate.min.css" rel="stylesheet" type="text/css">
<link href="./resources/css/style.css" rel="stylesheet" type="text/css">
<link href="./resources/css/responsive.css" rel="stylesheet" type="text/css">
<link href="./resources/css/custom-icons.css" rel="stylesheet" type="text/css">
<link href="./resources/css/custom-icon-set.css" rel="stylesheet" type="text/css">
<link href="./resources/css/bootstrap-timepicker.css" rel="stylesheet" type="text/css">
<link href="./resources/css/datepicker.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="./resources/js/jquery/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="./resources/js/jquery/jquery-ui-1.10.1.custom.min.js"></script>
<script type="text/javascript" src="./resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="./resources/js/breakpoints.js"></script>
<script type="text/javascript" src="./resources/js/jquery/jquery.unveil.min.js"></script>
<script type="text/javascript" src="./resources/js/jquery/jquery.sidr.min.js"></script>
<script type="text/javascript" src="./resources/js/jquery/jquery.slimscroll.min.js"></script>
<script type="text/javascript" src="./resources/js/pace.min.js"></script>
<script type="text/javascript" src="./resources/js/jquery/jquery.animateNumbers.js"></script>
<script type="text/javascript" src="./resources/js/tabs_accordian.js"></script>
<script type="text/javascript" src="./resources/js/dropzone.min.js"></script>
<script type="text/javascript" src="./resources/js/bootstrap-timepicker.min.js"></script>
<script type="text/javascript" src="./resources/js/bootstrap-datepicker.js"></script>
<script type="text/javascript" src="./resources/js/jquery/jquery.validate.min.js"></script>
<script type="text/javascript" src="./resources/js/jquery/additional-methods.min.js"></script>
<script type="text/javascript" src="./resources/js/jquery/jquery.bootstrap.wizard.min.js"></script>
<script type="text/javascript" src="./resources/js/jquery/plugin/jquery.form.js"></script>
<script type="text/javascript" src="./resources/js/jquery/jquery.tabletojson.min.js"></script>

<script type="text/javascript" src="./resources/js/core.js"></script>
<script type="text/javascript" src="./resources/js/demo.js"></script>

<script type="text/javascript" src="./resources/js/form_validation.js"></script>
<script type="text/javascript" src="./resources/js/elements.js"></script>
<script type="text/javascript" src="./resources/js/add_menu_item_elements.js"></script>
<script type="text/javascript" src="./resources/js/smooth-sliding-menu.js"></script>

<script type="text/javascript" src="./resources/js/general.js"></script>
</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="">
	<!-- BEGIN HEADER -->
      	<%@include file="Header.jsp"%>
	<!-- END HEADER -->
	<!-- BEGIN CONTAINER -->
	<div class="page-container row-fluid">
		<!-- BEGIN SIDEBAR -->
		<%@include file="sidebar.jsp"%>
<script type="text/javascript" src="./resources/js/smooth-sliding-menu.js"></script>
		<!-- END SIDEBAR -->
		<!-- BEGIN PAGE CONTAINER-->
		<div class="page-content">
			<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
			<div class="clearfix"></div>
			<div class="content">
				<div class="page-title">
					<h3>List of Members</h3>
				</div>
				<div class="row-fluid">
					<div class="span12">
						<div class="grid simple ">
							<div class="grid-body no-border">
								<div class="row-fluid">
									<br> <br>
									<table class="table table-hover no-more-tables">
										<thead>
											<tr>
												<th width="90%">User Full Name</th>
                                                                                                <th width="90%">Gender</th>
                                                                                                <th width="90%">College</th>
                                                                                                 <th width="90%">Degree</th>
                                                                                                 <th width="90%">Stream</th>
                                                                                                 <th width="90%">Enroll. No.</th>
                                                                                                 <th width="90%">Activation</th>
                                                                                                 
                                                                                               
												<th style="text-align: center" width="5%" colspan="2">Action</th>
											</tr>
										</thead>
										<tbody>
                                                                                    <%while(r1.next()){%>
                                                                                    
                                                                                
                                                                                <%
                                                                                        if(r1.getInt(15) == 0)
  {
  Activate="Block";
  }else if(r1.getInt(15) == 1)
  {
  Activate="Activate";
  }
                                                                                String conf="confirm(\'Sure Want to Block?\')";
                                                                                out.write("<td>"+r1.getString(4)+r1.getString(5)+"</td>");
                                                                                out.write("<td>"+r1.getString(6)+"</td>");
                                                                                 out.write("<td>"+r1.getString(7)+"</td>");
                                                                                  out.write("<td>"+r1.getString(8)+"</td>");
                                                                                   out.write("<td>"+r1.getString(9)+"</td>");
                                                                                    out.write("<td>"+r1.getString(10)+"</td>");
                                                                                     out.write("<td>"+Activate+"</td>");
                                                                                    out.write("<td style='text-align: center'><a href ='../MemberBlock?id="+r1.getString(1)+"' onclick=\" return "+ conf+"\">Block</a></td>");
                                                                                    out.write("<td style='text-align: center'><a href='MemberInfo.jsp?id="+r1.getString(1)+"'>Show</a></td>");
                                                                                    
                                                                                   
                                                                                %>      
                                                                                   </tr><%}%>
                                                                              </tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- END PAGE -->
		</div>
	</div>
	<!-- END CONTAINER -->
</body>
</html>