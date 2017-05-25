<%@page import="java.sql.ResultSet"%>
<%@page import="CommonData.ComData"%>
<%
HttpSession sess1=  request.getSession();    
String uname = sess1.getAttribute("client_uname").toString();
CommonData.ComData C = new ComData();
ResultSet r = null;
r = C.getregister(uname);
while(r.next()){
%>

<div class="row">
					<div class="span9">
						<div id="items-carousel" class="carousel slide mbottom0">
						
								
									<img class="media-object" src="client_docs\<%=r.getString(14)%>" alt="Profile Picture Not Available"  style="width: 30%; height: 20%;" >
								

								
							
						</div>
					

					<div class="span4">
						
                                              <h4>First Name: <%=r.getString(4)%></h4>
                                              <h4>Last Name: <%=r.getString(5)%></h4>
                                              <h4>Gender: <%=r.getString(6)%></h4>
                                              <h4>Address: <%=r.getString(16)%></h4>
                                              <h4>City: <%=r.getString(17)%></h4>
                                              <h4>College: <%=r.getString(7)%></h4>
                                              <h4>Field: <%=r.getString(8)%></h4>
                                              <h4>Stream: <%=r.getString(9)%></h4>
                                              <h4>Year/Semester: <%=r.getString(10)%></h4>
                                              <h4>Email-ID: <%=r.getString(11)%></h4>
                                              <h4>Mobile No: <%=r.getString(12)%></h4>
                                              
                                                
                                                
						
						<p></p>
						
						
                                                <form>
							
							<br/>
                                                        <a href=EditProfile.jsp?did=<%=r.getString(1)%> class="btn btn-primary btn-large">Edit Profile</a>
						</form>
						
						
					</div>
				</div>
                      <%}%>