<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<button class="btn btn-navbar" data-target=".nav-collapse" data-toggle="collapse" type="button">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="brand" href="HomePage.jsp">Student Stuff</a>
				<div class="nav-collapse collapse">
					<ul class="nav">
						<li class="dropdown">
							<a href="HomePage.jsp">Home</a>
                                                       						
						</li>
                                                <li class="dropdown">
							<a href="StuffSharing.jsp">Stuff Sharing</a>
                                                       						
						</li>
                                                <li class="dropdown">
							<a href="MaterialSharing.jsp">Material Sharing</a>
                                                       						
						</li>
                                                  <li class="dropdown">
							<a href="Forum.jsp">Discussion Forum</a>
                                                 </li>
                                                  <li class="dropdown">
							<a href="AboutUs.jsp">About Us</a>
                                                 </li> <li class="dropdown">
							<a href="ContactUs.jsp">Contact Us</a>
                                                 </li>
                                                 
                                               
                                                
                                                        <%
                                                            HttpSession sess=  request.getSession();
                                                if(sess.getAttribute("client_uname") == null)
                                                {%>
                                                
                                                 <li class="dropdown">
							<a href="SignIn.jsp">Sign In</a>
                                                 </li>
                                                 <li class="dropdown">
							<a href="Registration.jsp">Join Us</a>
                                                 </li>
                                                
                                                 <%
                                                }else{
                                         
                                         
                                                        %>
					         </ul>
                                                 <ul class="nav"  style="float: right">
                                                        <li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" style="float: right"><%out.write(sess.getAttribute("client_uname").toString());%><b class="caret"></b></a>
							<ul class="dropdown-menu">
                                                            <li></li>
								<li><a href="AccountDetails.jsp">Account Details</a></li>
								<li><a href="../Client_Logout">Logout</a></li>
                                                                
								
						
                                                </ul><%}%>
				</div>
			</div>
		</div>
	</div>