<%@page import="java.sql.ResultSet"%>
<script>	
$(document).ready(function() 
{ 
$("#form1").validationEngine()
});
		function abc()
		{
			window.location="Forum.jsp";
		}
</script>


        <%
            String usertype = "";
            HttpSession s = request.getSession();
            if(s.getAttribute("client_uname")==null)
            {
            	response.sendRedirect("HomePage.jsp");
            }
            
            
            
            %>
              
           
            <div style="margin-left: 50px;">
                <div class="row no-bottom-margin" >
            <section id="contact" class="clearfix" >
                <h1 style="color: #589aff">Discussion Forum</h1>
                <h4 style="color: #58ba95">Share your Ideas or any Queries with Student Stuff Users...</h4>
			<div class="primary">
				<form method="get" id="form1" action="../Discussion">
					
                                            <p><div class="thumbnail" style="width: 98%;overflow:scroll;height: 100%" >
                                                    <%
					ResultSet r = null;
					CommonData.ComData C = new CommonData.ComData();
					r = C.getcmnt();
					String cmnts="";
                                        out.write("<table border=0 style='width: 98%;'>");
					while(r.next())
					{
                                            
                                            out.write("<tr>");
                                            out.write("<td style='width: 8%;'>"+r.getString(3)+"</td>");
                                            out.write("<td style='width: 70%;'>"+r.getString(2)+"</td>");
                                            out.write("<td style='float: right'>"+r.getString(4)+"</td>");
                                            out.write("</tr>");
                                          
                                            
                                            //out.write(r.getString(3));
                                            //out.write(" :");
                                           // out.write(" "+r.getString(2));
                                            //out.write(""+r.getString(4));
                                            //out.write("\n");
                                            
                                            
                                            //cmnts=cmnts+" \n "+ r.getString(3) + " : " + r.getString(2) +  r.getString(4);
					}out.write("</table>");
					//out.write(cmnts);
                                        %>	
                                       </div>
                                       <div style="margin-top:  60px"><table>
                                               <tr><td >Add Comment:</td>
                                                   <td><textarea style="max-height: 2cm; max-width: 13cm;" name = "newcmt"  rows="4" cols="57"></textarea></td>
					</tr>
                                        <tr><td></td><td><input type="submit"  value="Comment" class="btn btn-success"></td></tr>
					</table>
                                        </div>
			
			</form>
					</section>
	</div>
</div>