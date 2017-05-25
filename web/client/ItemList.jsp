
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />	
	<title>Responsive Web Mobile - Ecommerce</title>

	<!-- Included Bootstrap CSS Files -->
	<link rel="stylesheet" href="./js/bootstrap/css/bootstrap.css" />
	<link rel="stylesheet" href="./js/bootstrap/css/bootstrap-responsive.min.css" />
	
	<!-- Includes FontAwesome -->
	<link rel="stylesheet" href="./css/font-awesome/css/font-awesome.css" />

	<!-- Css -->	
	<link rel="stylesheet" href="./css/style.css" />

</head>
<body>

	

	
	
<%@include file="Header.jsp"%>


	
			<div class="span3">

<div class="well">
					<ul class="nav nav-list">
						<li class="nav-header">Account Naigation</li>
                                                <li>
							<a href="AccountDetails.jsp">Account Details</a>
						</li>
						<li>
							<a href="ItemAdd.jsp">New Item Adding</a>
						</li>
						<li  class="active">
							<a href="ItemList.jsp">List of Added Items</a>
						</li>
                                                <li>
							<a href="WishList.jsp">Wish List</a>
						</li>
                                                 <li>
							<a href="MaterialUpload.jsp">Material Upload</a>
						</li>
						
                                             <li>
							<a href="ListofUploadedMaterial.jsp">List of Material Uploaded</a>
						</li>

						
					</ul>
				</div>
                            </div>
        
	
	
<%@include file="ContentItemList.jsp"%>







	

	<script src="./js/jquery-1.10.0.min.js"></script>
	<script src="./js/bootstrap/js/bootstrap.min.js"></script>
	<script src="./js/holder.js"></script>
	<script src="./js/script.js"></script>
</body>
</html>