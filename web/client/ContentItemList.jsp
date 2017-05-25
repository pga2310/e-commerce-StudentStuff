<%@page import="java.sql.ResultSet"%>
<%@page import="CommonData.ComData"%>
<%HttpSession sess1=  request.getSession();
String uid = sess1.getAttribute("client_id").toString();
CommonData.ComData C = new ComData();
ResultSet r = null;
r = C.getuserItemListed(uid);
%>



<div class="span9">
				<h2>Added Item List</h2>
				<form>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>Item Name</th>
							<th>Post Date</th>
							<th>Price</th>
							<th>Image</th>
                                                        <th>Delete</th>
						</tr>
					</thead>
                                        <%while(r.next()){
%>
					<tbody>
						<tr>
							<td><%=r.getString(3)%></td>
                                                        <td><%=r.getString(5)%></td>
							<td><%=r.getString(6)%></td>
                                                        <td><img src="client_docs/<%=r.getString(7)%>" width="50" height="20"/></td>
                                                         <td>   <a href="#"><i class="icon-trash"></i></a></td>
						</tr>
                                               
						
					</tbody>
                                        <%}r.close();%>
				</table>
			</form>

			
			
		</div>