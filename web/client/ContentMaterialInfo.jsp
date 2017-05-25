<%@page import="java.sql.ResultSet"%>
<%@page import="CommonData.ComData"%>
<%String material_id=request.getParameter("id");
CommonData.ComData C = new ComData();
ResultSet r1=null;
r1 = C.getselectedmaterial(material_id);
%>
<div class="row" style="margin-left: 28%">
					<div class="span5">
						<div id="items-carousel" class="carousel slide mbottom0">
							<div class="carousel-inner">
                                                            <div class="active item"><%while(r1.next()){%>

									<img class="media-object" src="client_docs/<%out.write(r1.getString(6));%>" alt="Image Not Available" data-src="holder.js/470x310" style="width: 500px; height: 350px;" >
								</div>

							</div>
													</div>
					</div>
</div><div class="row" style="margin-left: 28%">
					<div class="span4">
						<h4><%out.write(r1.getString(3));%></h4>
						<h5><%out.write(r1.getString(4));%></h5>
						<p><%out.write(r1.getString(5));%></p>
                                                <p><%out.write(r1.getString(6));%></p>
						
						<a class="btn btn-success" href="client_docs/<%out.write(r1.getString(7));%>" download="<%out.write(r1.getString(7));%>">Download</a>
						<%}%><br/><br/><a class="btn btn-primary" href="MaterialSharing.jsp">Back</a>
					</div></div>
				