<%@page import="java.sql.ResultSet"%>
<%@page import="CommonData.ComData"%>
<%HttpSession sess1=  request.getSession();

int id =Integer.parseInt(sess1.getAttribute("client_id").toString());
CommonData.ComData C = new ComData();
ResultSet r = null;
r = C.getListofUploadedItem(id);
%>


<div class="span9">
				<h2>List of Added Material</h2>
				<form>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>Title</th>
							<th>Description</th>
							<th>Posted Date</th>
							<th>Image</th>
                                                        <th>Delete</th>
						</tr>
					</thead>
                                        
					<tbody>
                                             <%while(r.next()){
%>
						<tr>
							<td><%=r.getString(3)%></td>
                                                        <td><%=r.getString(4)%></td>
							<td><%=r.getString(5)%></td>
                                                        <td><img src="client_docs/<%=r.getString(6)%>" width="50" height="20"/></td>
                                                         <td><a href="../DeleteMaterial?id=<%=r.getString(1)%>" onclick="return confirm('Sure Want to Delete This WishList Item?');"><i class="icon-trash"></i></a></td>
						</tr>
                                               <%}r.close();%>
						
					</tbody>
                                      
				</table>
			</form>

			
			
		</div>
	

                                           