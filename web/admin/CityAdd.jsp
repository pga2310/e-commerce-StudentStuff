<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<head>

<title>Student Stuff</title>
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
					<h3>Add Branch</h3>
				</div>
				<div class="span12">
					<div class="tab-content">
						<div id="addarea">
							<div class="row-fluid">
								<div class="span12">
									<div class="grid simple">
										<div class="grid-title no-border"></div>
										<div class="grid-body no-border">
                                                                                    <form id="EditBranch" name="EditCity" method="post" action="../CityAdd">
												
												<div class="row-fluid column-seperation">
													<div class="span6">
														<div class="row-fluid">
															<div class="span12">
																 <input name="AddCity" 
                                                                                                                                        id="AddCity" type="text" class="span12"
                                                                                                                                        placeholder="Enter City" value="">
                                                                                                            
															</div>
														</div>
													</div>
												</div>
												<div class="form-actions">
													<div class="pull-left">
                                                                                                            <button class="btn btn-danger btn-cons" type="submit" name="AddCity_Button">
															<i class="icon-ok"></i> Save
														</button>
														<button class="btn btn-white btn-cons" type="button"
															onclick="">Cancel</button>
													</div>
												</div>
											</form>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
        </div>
	</div>
	<!-- END CONTAINER -->
</body>
</html>




