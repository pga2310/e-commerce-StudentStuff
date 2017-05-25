<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%               Connection con;
                ResultSet rs;
                ResultSet rss1;
                Statement st;
                Statement st1;

                try{
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentstuff", "root", "root");
                st = con.createStatement();
                st1 = con.createStatement();
                rs = st.executeQuery("select * from tblitemlisted");	
                rss1 = st1.executeQuery("select * from tblmaterial");	
                %>

<div class="container" style="width: 100%">
    
    <div class="row">
        
        <center> <img src="client_docs/sslogo copy.png.jpg" style= "width:90%; height:70%; margin-left: 3%"   onclick="abc();"/>   
        </center>
    </div> </div>
   
<div class="container" style="margin-top: 5%;width: 100%">
    
  
    <table style="width: 100%">
        <tr><td style="width: 60%">  
        <div class="span5">	
            <div class="well" style="height: 45%">    
                                                    <div class="widget HTML" id="HTML7">
<h5 class="title">
Get Latest Stuff and Materials Direct In Your Inbox.
</h5>
<div class="widget-content">
<form action="http://feedburner.google.com/fb/a/mailverify" method="post" onsubmit="window.open('http://feedburner.google.com/fb/a/mailverify?uri=World4free', 'popupwindow', 'scrollbars=yes,width=550,height=520');return true" style="border: 1px solid #ccc; padding: 3px; text-align: center;" target="popupwindow"><p>Enter your email address:</p><p><input name="email" style="width: 140px;" type="text"></p><input name="uri" value="World4free" type="hidden"><input name="loc" value="en_US" type="hidden"><input value="Subscribe" type="submit"><p>Delivered by <a class="external" href="http://feedburner.google.com/" target="_blank">FeedBurner</a></p></form><p><a class="external" href="http://feeds.feedburner.com/World4free" target="_blank"><img alt="" src="http://feeds.feedburner.com/%7Efc/World4free?bg=99CCFF&amp;fg=444444&amp;anim=1" style="border: 0pt none;" height="26" width="88"></a></p>
</div>
<div class="clear"></div>
<span class="widget-item-control">
<span class="item-control blog-admin">
<a class="quickedit" href="//www.blogger.com/rearrange?blogID=6245814514989601730&amp;widgetType=HTML&amp;widgetId=HTML7&amp;action=editWidget&amp;sectionId=sidebar" onclick="return _WidgetManager._PopupConfig(document.getElementById(&quot;HTML7&quot;));" target="configHTML7" title="Edit">
<img alt="" height="18" src="http://img1.blogblog.com/img/icon18_wrench_allbkg.png" width="18">
</a>
</span>
</span>
<div class="clear"></div>
</div>
						</div>
						<br />
						
					
        </div>
            </td>
        
            <td>
                <div class="span5" style="padding: 0%">	
            <div class="well" style="height: 20%;width: 50%;float: right">
    
						<h4>Google Site Search</h4>
						<div>
							
                <form method="get" action="http://www.google.com/search">

<div style="border:2px black;padding:4px;width:15em;">
<table border="0" align="center" cellpadding="0">
<tr><td>
<input type="text"   name="q" size="25" style="color:#808080;"
       maxlength="255" placeholder="Google site search"
onfocus="if(this.value==this.defaultValue)this.value=''; this.style.color='black';" onblur="if(this.value=='')this.value=this.defaultValue; "/>
<input type="submit" value="Go!" />
<input type="hidden" name="sitesearch" value="google.com" /></td></tr>
</table>
</div>

</form>
                                                    
                                                </div></div></div>
        
            </td>
    </tr> 
        
        
        	
            
        
            
            
           
        
               
    <tr> 
        <td>
            
       <div class="span5">	
           
    <div class="well" style="height: 65%;background: none;float: right;width: 50%;overflow-y:  scroll" >    
                                                   <h4 class="title">
Latest Material Uploaded
</h4>
                  <%
                while(rss1.next())
               {
                  
               %>
              

                   
                 
                     <p><a href="MaterialInfo.jsp?id=<%=rss1.getString(1)%>"><%=rss1.getString(3)%></a><hr/></p>  


<%}rss1.close();%>
            </div>
  	    </div>     
            
            
 </td><td>
            <div class="span5">	
           
            <div class="well" style="height: 50%;background: none;width: 50%;overflow-y:  scroll;float: right">    
                                                   
<h4 class="title">
Latest Stuff Uploaded
</h4>
                  <%
                while(rs.next())
               {
                
               %>
                 
                   <p><a href="ItemProfile.jsp?did=<%=rs.getString(1)%>"><%=rs.getString(3)%></a><hr/></p>  
     
<%}
                rs.close();
               %>

            </div></div></td></tr>
            
            
         
</table>
        
        </div>
 <% 
                con.close();
    }catch(Exception e){out.write(""+e);}%>