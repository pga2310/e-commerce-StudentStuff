<%-- 
    Document   : forgotpswd
    Created on : Apr 6, 2014, 4:10:06 PM
    Author     : Acer 5536
--%>

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

<h1 style="margin-left: 15%">Forget Yout Password ???</h1>
<h5 style="margin-left: 15%">That's OK. Everyone Forgets. </h5>
<h6 style="margin-left: 15%">Just tell us your Email address you used to access create your account. We will send you a new  one. </h6>
<h5 style="margin-left: 15%">.................................................................................................... </h5>

<div style="margin-left: 15%">

<form action="HomePage.jsp"/>
	<h4>Enter Your Email Id:</h4>
        <input type="text" value="" name="email" style="width:40%; height:5%;" />
       
        <button class="btn btn-primary" name="submit" value="" >Continue</button>
	</form>
</div>
	
</body>
</html>
