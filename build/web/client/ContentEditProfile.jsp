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

<h1 style="margin-left: 27%;color: #0099cc">Edit Profile</h1>
<div style="margin-left: 27%">
    <form name="editProfile" action="" method="post">
        
        
        <label> Profile Picture:</label><img src="client_docs/<%=r.getString(14)%>" height="15%" width="15%"/>
                                                                         <input type="file" name="proPic">
                                                                         <br />
       
									<label> First Name:</label>
                                                                        <input type="text" class="large-field" name="firstname" value=" <%=r.getString(4)%>">

									<label> Last Name:</label>
                                                                        <input type="text" class="large-field" name="lastname" value="<%=r.getString(5)%>">

									<label> Gender:</label>
                                                                        <label class="radio">
                                                                            <input type="radio" name="gender"  value="Male" checked>
										Male
									</label>
                                                                        <label class="radio">
										<input type="radio" name="gender" value="Female">
										FeMale
									</label>
                                                                        
                                                                        
									<label> Address :</label>
                                                                        <input type="text" class="large-field" name="address" value="<%=r.getString(7)%>">

									

									<label> City:</label>
                                                                        <input type="text" class="large-field" name="city" value="<%=r.getString(8)%>">

									
									<label> College:</label>
									<select class="large-field" name="college" value="<%=r.getString(9)%>">
										<option value=""> --- Please Select --- </option>
										<option value="Samarth College of Engineering And Technology">Samarth College of Engineering And Technology</option>
                <option value="Sabar Institue of Engineering">Sabar Institue of Engineering</option>
                <option value="VGEC, Chandkheda">VGEC, Chandkheda</option>
									</select>


									<label> Branch:</label>
									<select class="large-field" name="branch">
										<option value=""> --- Please Select --- </option>
										<option value="Aeronautical Engineering">Aeronautical Engineering</option>
                <option value="Automobile Engineering">Automobile Engineering</option>
                <option value="Bio-medical Engineering">Bio-medical Engineering</option>
                <option value="Bio-Technology">Bio-Technology</option>
                <option value="Chemical Engineering">Chemical Engineering</option>
                <option value="Civil Engineering">Civil Engineering</option>
                <option value="Computer Engineering">Computer Engineering</option>
                <option value="Computer Science & Engineering">Computer Science & Engineering</option>
                <option value="Electrical & Electronics">Electrical & Electronics</option>
                <option value="Electrical Engineering">Electrical Engineering</option>
                <option value="Electronics">Electronics</option>
                <option value="Electronics & Communication">Electronics & Communication</option>
                <option value="Electronics & Telecommunication">Electronics & Telecommunication</option>
                <option value="Environmental Engineering">Environmental Engineering</option>
                <option value="Food Processing Technology">Food Processing Technology</option>
                <option value="Industrial Engineering">Industrial Engineering</option>
                <option value="Information Technology">Information Technology</option>
                <option value="Information & Communication Technology">Information & Communication Technology</option>
                <option value="Instrumentation & Control">Instrumentation & Control</option>
                <option value="Manufacturing Engineering">Manufacturing Engineering</option>
                <option value="Marine Engineering">Marine Engineering</option>
                <option value="Mechanical Engineering">Mechanical Engineering</option>
                <option value="Mechatronic">Mechatronic</option>
                <option value="Metallurgy">Metallurgy</option>
                <option value="Mining Engineering">Mining Engineering</option>
                <option value="Plastic Technology">Plastic Technology</option>
                <option value="Power Electronics">Power Electronics</option>
                <option value="Production Engineering">Production Engineering</option>
                <option value="Rubber Technology">Rubber Technology</option>
                <option value="Textile Production">Textile Production</option>
                <option value="Textile Technology">Textile Technology</option>
									</select>
									<br />
                                                                        <label> Mobile Number:</label>
									<input type="text" class="large-field" name="mobilenumber" value="<%=r.getString(5)%>">
                                                                        
                                                                        <br />
                                                                        
                                                                        <label> Email_ID:</label>
									<input type="text" class="large-field" name="email" value="<%=r.getString(5)%>">
                                                                         <br />
                                                                         <label> Password:</label>
                                                                         <input type="password" class="large-field"  name="password" value="<%=r.getString(5)%>">
                                                                         <br />
                                                                         
                                                                         
                                                                        
									<button class="btn btn-primary">Continue</button>
								</form>
							</div>
			<%}r.close();
                        
%>			