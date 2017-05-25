<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />	
	<title>Responsive Web Mobile - Ecommerce</title>

	<!-- Included Bootstrap CSS Files -->
	<link rel="stylesheet" href="./js/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="./js/bootstrap/css/bootstrap-responsive.min.css" />
	
	<!-- Includes FontAwesome -->
	<link rel="stylesheet" href="./css/font-awesome/css/font-awesome.min.css" />

	<!-- Css -->	
	<link rel="stylesheet" href="./css/style.css" />

</head>
<body>

<%@include file="Header.jsp"%>

<div class="span12" style="width: 95%">
    <div class="well" align="center">
    <form class="form login-form" action="../Client_Login">
        <h2 align="center" style="color: #44a4da">Sign in</h2>
						<div  align="center">
                                                    <hr/> <hr/>
                                                    <table>
                                                        <tr><td><label>Username</label></td> </tr>
							<tr><td><input id="Username" name="Username" type="text" style="height: 26px;" /></td> </tr>

							<tr><td><label>Password</label></td> </tr>
                                                       <tr><td> <input id="Password" name="Password" type="password" style="height: 26px;"/></td> </tr>

							<br /><br />

                                                        <tr> <td><button type="submit" class="btn btn-success" name="Submit_Login">Login</button></td> </tr>
						 </table>
                                                </div>
						<br />
						<a href="Registration.jsp">register</a>&nbsp;&#124;&nbsp;<a href="forgotpswd.jsp">forgot password?</a>
					
   
    </form>
				</div>				</div>



	

	<script src="./js/jquery-1.10.0.min.js"></script>
	<script src="./js/bootstrap/js/bootstrap.min.js"></script>
	<script src="./js/holder.js"></script>
	<script src="./js/script.js"></script>
</body>
</html>