
<div class="page-sidebar" id="main-menu">
	<!-- BEGIN MINI-PROFILE -->
	<div class="user-info-wrapper">		
		<div class="user-info">
			<div class="greeting">Welcome 
                            
                            <% 
                            
                            try{
                            HttpSession sess=  request.getSession();
                                                if(sess.getAttribute("uname") == null)
                                                {
                                                 response.sendRedirect("Login.jsp");
                                                }else{
                                                out.write(sess.getAttribute("uname").toString());
                                                }}catch(Exception e){//response.sendRedirect("Login.jsp");
                                                    
                                                }
                        %></div>
		</div>
	</div>
	<!-- END MINI-PROFILE -->

	<!-- BEGIN SIDEBAR MENU -->
	<p class="menu-title"></p>
	<ul id="nav">
		<li id="liDashboard"><a href="Main.jsp"> <i
				class="icon-custom-home"></i> <span class="title">Dashboard</span></a></li>

		<li id="liMenuCategories" class=""><a href="javascript:;"> <i
				class="icon-custom-portlets"></i> <span class="title">
					Branch Categories</span> <span class="arrow "></span>
		</a>
			<ul class="sub-menu">
				<li id="liAddCategory"><a href="BranchAdd.jsp">Add Branch</a></li>
				<li id="liViewCategory"><a href="BranchShow.jsp"> View / Update Branch</a></li>
			</ul></li>
		<li id="liMenuRestaurants" class=""><a href="javascript:;"> <i
				class="icon-custom-ui"></i> <span class="title">Cities</span> <span
				class="arrow "></span>
		</a>
			<ul class="sub-menu">
				<li id="liAddRestaurant"><a href="CityAdd.jsp">Add City</a></li>
				<li id="liViewRestaurant"><a href="CityShow.jsp"> View / Update City</a></li>
			</ul></li>
                        
                        <li id="liMenuItems" class=""><a href="javascript:;"> <i
				class="icon-custom-form"></i> <span class="title">Registered Users</span>
				<span class="arrow "></span>
		</a>
			<ul class="sub-menu">
				
				<li id="liViewMenuItem"><a href="MemberShow.jsp"> View All Registered Users</a></li>
			</ul></li>
                        
		<!--<li class=""> <a href="javascript:;"> <i class="icon-custom-portlets"></i> <span class="title">Restaurant Categories</span> <span class="arrow "></span> </a>
        <ul class="sub-menu">
          <li > <a href="blank_template.html">Add</a> </li>
          <li > <a href="blank_template.html">Edit</a> </li>
		  <li > <a href="blank_template.html">Delete</a> </li>
        </ul>
      </li>-->

		<!-- <li id="liMenuItemDiscounts" class=""><a href="javascript:;"> <i
				class="icon-custom-portlets"></i> <span class="title">Menu
					Items Discounts</span> <span class="arrow "></span>
		</a>
			<ul class="sub-menu">
				<li id="liAddMenuItemDiscount"><a href="#">Add Menu Items Discount</a></li>
				<li id="liViewMenuItemDiscount"><a href="#"> View / Update Menu Items Discount</a></li>
			</ul></li> -->


	</ul>
	<a href="#" class="scrollup">Scroll</a>
	<div class="clearfix"></div>
	<!-- END SIDEBAR MENU -->
</div>