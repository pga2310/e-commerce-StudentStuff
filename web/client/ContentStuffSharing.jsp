<%@page import="java.sql.ResultSet"%>
<%@page import="CommonData.ComData"%>
<%CommonData.ComData C = new ComData();
ResultSet rs5=null;
rs5 = C.getAllStuff();
%>
            
            

<div class="container">
		<div class="row">
		
                    
			<div class="span9">
                            
                            	 <%			
                                        while(rs5.next())
               {
               %>
				<div class="hero-unit" style="width: 100%;height: 30%;">
                                   
                                    <table style="width: 100%;height: 100%;">
                                        <tr><td style="width: 50%"><h2 style="color: #990033"><%=rs5.getString(3)%></h2></td><td style="float: right;width: 50%"> 
                                                
                        <img src="client_docs/<%=rs5.getString(7)%>"  style="width: 100%; height: 70%;">
                                            </td></tr>
		
                                        <tr><td>   <p ><h3 style="color: #0090d9"><%=rs5.getString(12)%></h3></p></td></tr>
                                        <tr><td>   <p class=""><h5>Location: <%=rs5.getString(13)%></h5></p></td></tr>
         
                                        <tr><td>   <p class=""><h5>Condition: <%=rs5.getString(9)%></h5></p></td></tr>
          
          <tr><td> 	<p><a href=ItemProfile.jsp?did=<%=rs5.getString(1)%> class="btn btn-primary btn-large">See more »</a></p></td></tr>
                                       
                                    </table>
                                        
                                        
                                        </div>

                          <%}rs5.close();%>
				

				

			</div>
                                        

		</div>
	</div> 
