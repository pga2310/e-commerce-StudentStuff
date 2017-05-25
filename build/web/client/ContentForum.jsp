<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%              
    
           
                Connection con;
                ResultSet rs;
                ResultSet rs1;
                Statement st;
              
                try{
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentstuff", "root", "root");
                st = con.createStatement();
              	rs = st.executeQuery("select * from tblquestion");	
                %>
                
            	





<div class="container">
		<div class="row">
			<div class="span12">
				<h2>Discussion Forum</h2>
                      		<div class="accordion" id="accordion2">
                                    
                                    
                                    <%
                while(rs.next())
               {
                   rs1 = st.executeQuery("select * from tblanswers");
               %>
					<div class="accordion-group">
						<div class="accordion-heading">
							<a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
								QUESTION <%=rs.getString(1)%>: <%=rs.getString(3)%>
							</a>
						</div>
						<div id="collapseOne" class="accordion-body collapse in">
							<div class="accordion-inner">
								<div class="span4">
									
								</div>

								<div class="span4 offset2">
									<h4></h4>
									<form>
										
									</form>
								</div>
							</div>
						</div>
					</div>



				                 <%
               }rs.close();
                con.close();
                }catch(Exception e){}
%>
				</div>

			</div>	
		</div>
	</div>
