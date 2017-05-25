<%@page import="java.sql.ResultSet"%>
<%@page import="CommonData.ComData"%>
<%CommonData.ComData C = new ComData();
ResultSet r1=null;
r1 = C.getmaterial();
%>
    



<div class="container">
		<div class="row">
			<div class="span3">
				

			

				<div class="well">
					<h4>Choose Field</h4>
					<form>
						<label class="checkbox">
							<input type="checkbox" value="">
							Engineering
						</label>

						<label class="checkbox">
							<input type="checkbox" value="">
							Diploma Engineering
						</label>

						<label class="checkbox">
							<input type="checkbox" value="">
							Lower Arts Studies
						</label>

						<label class="checkbox">
							<input type="checkbox" value="">
							Pharmacy
						</label>
                                            <br/>
						<button class="btn-success" type="submit">Search</button>
					</form>
                                        
				</div>
                                        <div class="well">
					<h4>Search Your Material Here</h4>
					<form>

						<label class="search-form">
                                                    
                                                    <input type="text" id="search" name="search" placeholder="Enter Material's Name Here"/>
							
						</label>
                                            <br/>
						<button class="btn-success" type="submit">Search</button>
					</form>
				
				</div></div>

				

				
	

			<div class="span9">
				
 
				<ul class="thumbnails">
                                   <%while(r1.next()){%>
					<li class="span7">
                                            
						<div class="thumbnail">
                                                    <div><table>
                                                            <tr><td style="width: 40%"><img src="client_docs/<%=r1.getString(6)%>" alt="Image Not Available" height="50%" width="40%"></td>
                                                                <td><div>
								<h4><%out.write(r1.getString(3));%></h4>
								<p><%out.write(r1.getString(4));%></p>
                                                                <p>Posted Date: <%out.write(r1.getString(5));%></p>
                                                               
								</div>
                                                                <a class="btn btn-primary" href="MaterialInfo.jsp?id=<%out.write(r1.getString(1));%>">View</a>
								<a class="btn btn-success" href="client_docs/<%out.write(r1.getString(7));%>" download="<%out.write(r1.getString(7));%>">Download</a>
						</td>
							</tr></table></div></div>
					</li>
					<%}%>
				</ul>

				

			</div>
		</div>
	</div>