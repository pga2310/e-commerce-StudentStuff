<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />	
	<title>Student Stuff</title>

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

<div class="contentArea" style="margin-left: 5%">

        <div class="divPanel notop page-content">

            	
            <div class="row-fluid">
                <div class="span8" id="divMain">

                    <h1>Contact Us</h1>
                   	<h3 style="color:#FF6633;"></h3>
					<hr>
			<!--Start Contact form -->		                                                
<form name="enq" method="post" action="email/" onsubmit="return validation();">
  <fieldset>
    
	<input type="text" name="name" id="name" value=""  class="input-block-level" placeholder="Name" />
    <input type="text" name="email" id="email" value="" class="input-block-level" placeholder="Email" />
    <textarea rows="11" name="message" id="message" class="input-block-level" placeholder="Message"></textarea>
    <div class="actions">
	<input type="submit" value="Send Your Message" name="submit" id="submitButton" class="btn btn-info pull-right" title="Click here to submit your message!" />
	</div>
	
	</fieldset>
</form>  

</div></div>
       
        
        </div></div> <div class="span4 sidebar" style="margin-left: 5%">

                    <div class="sidebox">
                        <h3 class="sidebox-title">Contact Information</h3><hr/>
                    <p>
                        <address><strong>Student Stuff</strong><br />
                        Gandhinagar<br />
                        Gujarat, India<br />
                        382022<br />
                        <abbr title="Phone">P:</abbr> 079-23252658</address> 
                        <address>  <strong>Email</strong><br />
                        <a href="mailto:#">info@studentstuff.com</a></address>  
                 </div> 	 </div> 

	<script src="./js/jquery-1.10.0.min.js"></script>
	<script src="./js/bootstrap/js/bootstrap.min.js"></script>
	<script src="./js/holder.js"></script>
	<script src="./js/script.js"></script>
</body>
</html>