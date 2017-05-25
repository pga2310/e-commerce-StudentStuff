<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%              
    
                if(request.getParameter("did")!=null)
                {
                    String id=request.getParameter("did");
                Connection con;
                ResultSet rs;
                Statement st;
              
                try{
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentstuff", "root", "root");
                st = con.createStatement();
              	//rs = st.executeQuery("select * from tblitemlisted where intItem_id="+id);	
                rs = st.executeQuery("SELECT * FROM tblitemlisted RIGHT OUTER JOIN tblmembers ON tblitemlisted.intSeller_id=tblmembers.member_id WHERE intItem_id="+id);	
                while(rs.next())
               {
               %>





<div class="row" style="margin-left: 25%">
					<div class="span5">
						<div id="items-carousel" class="carousel slide mbottom0">
							<div class="carousel-inner">
								<div class="active item">
                                                                    <img class="media-object" src="client_docs/<%=rs.getString(7)%>" alt="Image Not Available"  style="width: 470px; height: 310px;" >
								</div>
							</div>
													</div>
					</div>
</div><div class="row" style="margin-left: 25%">
					<div class="span4">
                                            
						<h4>Title: <%=rs.getString(3)%></h4><br/>
                                                <h4>TagLine:<%=rs.getString(12)%></h4><br/>
						<h4>Description: <%=rs.getString(4)%></h4><br/>
                                                <h4>Posted Date: <%=rs.getString(5)%></h4><br/>
                                                <h4>Price: Rs.<%=rs.getString(6)%></h4><br/>
                                               
                                               
                                                <h4>Condition: <%=rs.getString(9)%></h4><br/>
                                                 <h4>Type of Field: <%=rs.getString(10)%></h4><br/>
                                                <h4>Type of Material: <%=rs.getString(11)%></h4><br/>
                                                
                                                <h4>Location: <%=rs.getString(13)%></h4><br/>
                                                <%HttpSession sess1=  request.getSession();
                                                if(sess1.getAttribute("client_uname") != null){%>
                                                <h4>Person Name: <%=rs.getString(17)%> <%=rs.getString(18)%></h4><br/>
                                                
                                                <h4>Email ID: <%=rs.getString(24)%></h4><br/>
                                                <h4>Mobile No: <%=rs.getString(25)%></h4><br/>
                                               <%}else{
                                                out.write("You have to login to see User's contact details.");
 
 }%>
                                               
						<br/><br/>
                                                <a href="StuffSharing.jsp" style="font-size: 20px;"><< Back</a>
						
						
					</div>
				</div>
                          <%
               }rs.close();
                con.close();
}catch(Exception e){out.write(""+e);}}
%>
