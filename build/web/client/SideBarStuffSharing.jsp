<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="CommonData.ComData"%>
<%@page import="java.sql.ResultSet"%>
<%CommonData.ComData C1 = new ComData();
Connection con=null;
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentstuff","root","root");
ResultSet rs3=null;
Statement st=null;
ResultSet rs2=null;
rs3 = C1.getAllfield();
%>



<div class="span3">
				

				
				<div class="well">
					<h4>Select Field</h4>
					<form>
                                             <%  
             while(rs3.next())
               {
               %>
				            <label class="checkbox">
					      <input type="checkbox"/>
                                              	<%=rs3.getString(1)%>
     </label>
                                           				
<%
               }rs3.close();
%>   						
					<br/> <input type="submit" name="field_search" class="btn-success" value="Search"/>		
					</form>



                                </div>

<div class="well">
					<h4>Select Type of Material</h4>
					<form>
         <%              st=con.createStatement();
               rs2 = st.executeQuery("select strCategoryName from tblcategory");
                while(rs2.next())
               {%>
				            <label class="checkbox">
					      <input type="checkbox"/>
                                              	<%=rs2.getString(1)%>
     </label>
                				
<%
               }rs2.close();
%>                               			
				   <br/> <input type="submit" name="category_search" class="btn-success" value="Search"/>	
					</form>

</div>
                                   
                                   
                                   
                                   <div class="well">
					<h4>Search Your Desire Stuff</h4>
					<form>

						<label class="search-form">
                                                    
                                                    <input type="text" id="search" name="search" placeholder="Enter Stuff's Name Here"/>
							
						</label>
                                            <br/>
						<button class="btn-success" type="submit">Search</button>
					</form>
				
				</div>

		</div>