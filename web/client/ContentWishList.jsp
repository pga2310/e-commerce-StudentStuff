<%@page import="java.sql.ResultSet"%>
<%@page import="CommonData.ComData"%>
<%HttpSession sess1=  request.getSession();
String uid = sess1.getAttribute("client_id").toString();
CommonData.ComData C = new ComData();
ResultSet r = null;
r = C.getwishlist(uid);
%>


<script type="text/javascript">    
    function myfunction()    
    {    
        document.getElementById("addwish").style.visibility = 'visible';  
    }    
    </script>  


<div class="span9">
				<h2>Wish List</h2>
                                <form name="ShowWishList" method="post" action="../DeleteWishListItem">
                               <table class="table table-striped table-hover">
                                    
                                    
                                    
                                    
					<thead>
						<tr>
							<th>Item Name</th>
							<th>Posted Date</th>
							<th>Requirement Details</th>
							
                                                        <th>Delete</th>
						</tr>
					</thead>
                                         <%while(r.next()){
%>
					<tbody>
						<tr>
							<td><%=r.getString(4)%></td>
                                                        <td><%=r.getString(8)%></td>
                                                        <td><%=r.getString(5)%></td>
                                                        <td><a href="../DeleteWishListItem?id=<%=r.getString(4)%>" onclick="return confirm('Sure Want to Delete This WishList Item?');"><i class="icon-trash"></i></a></td>
                                        <input type="hidden" name="id_wishList" value="<%=r.getString(1)%>"/>
							
						</tr>
						
					</tbody>
                                         <%}r.close();%>
				</table>
                                     <br/><br/>
                                     <a href="#" class="btn btn-success pull-right" onclick="javascript:myfunction();">Add Item in WishList</a>   
                             
			</form>
                                <form name="addwish" style="visibility: hidden" id="addwish" action="../AddWishList">
                               <table class="table table-striped table-hover">
                                    
                                    
                                    
                                    
					<thead>
						<tr>
							<th>Item Name</th>
							
							<th>Requirement Details</th>
							
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="text" class="large-field" value="" name="item_name"></td>
                                                        <td><input type="text" class="large-field" value="" name="req_details"></td>
                                                        <td><input type="submit" name="AddItemWishList" class="btn-success" value="Save"/></td>
                                        <input type="hidden" value="<%out.write(uid);%>"  name="member_id" />
						</tr>
						
					</tbody>
				</table>
                                     <br/><br/>
                                     
                             
			</form>

			
			
</div>