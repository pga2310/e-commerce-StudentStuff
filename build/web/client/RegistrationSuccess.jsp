<%@page import="java.sql.ResultSet"%>
<%@page import="CommonData.ComData"%>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />	
	<title>Responsive Web Mobile - Ecommerce</title>

	<!-- Included Bootstrap CSS Files -->
	<link rel="stylesheet" href="./js/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="./js/bootstrap/css/bootstrap-responsive.min.css" />
	
	<!-- Includes FontAwesome -->
	<link rel="stylesheet" href="./css/font-awesome/css/font-awesome.min.css" />

	<!-- Css -->	
	<link rel="stylesheet" href="./css/style.css" />

</head>
<body>

	
	
<%@include file="Header.jsp"%>


<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="org.apache.commons.fileupload.disk.*" %>
<%@ page import="org.apache.commons.fileupload.servlet.*" %>
<%@ page import="org.apache.commons.io.output.*" %>
<%
        
File file ;
int maxFileSize = 5000 * 1024;
int maxMemSize = 5000 * 1024;
ServletContext context = pageContext.getServletContext();
String filePath = context.getInitParameter("file-upload");
// Verify the content type
String contentType = request.getContentType();
if ((contentType.indexOf("multipart/form-data") >= 0)) {
DiskFileItemFactory factory = new DiskFileItemFactory();
// maximum size that will be stored in memory
factory.setSizeThreshold(maxMemSize);
// Location to save data that is larger than maxMemSize.
factory.setRepository(new File("C:\\Users\\Pushpak Gandhi\\Documents\\NetBeansProjects\\BootClient\\web\\client\\docs"));
// Create a new file upload handler
ServletFileUpload upload = new ServletFileUpload(factory);
// maximum file size to be uploaded.
upload.setSizeMax( maxFileSize );
try{
// Parse the request to get file items.
List fileItems = upload.parseRequest(request);
// Process the uploaded file items
Iterator i = fileItems.iterator();
out.println("<html>");
out.println("<head>");
out.println("<title>JSP File upload</title>");
out.println("</head>");
out.println("<body>");
while ( i.hasNext () )
{
FileItem fi = (FileItem)i.next();
if ( !fi.isFormField () )
{
// Get the uploaded file parameters
String fieldName = fi.getFieldName();
String fileName = fi.getName();
boolean isInMemory = fi.isInMemory();
long sizeInBytes = fi.getSize();
// Write the file
if( fileName.lastIndexOf("\\") >= 0 ){
file = new File( filePath +
fileName.substring( fileName.lastIndexOf("\\"))) ;
}else{
file = new File( filePath +
fileName.substring(fileName.lastIndexOf("\\")+1)) ;
}
fi.write( file ) ;
//out.println("Uploaded Filename: " + filePath +
//fileName + "<br>");
out.println("Registered Successfully..");
}
}

out.println("</body>");
out.println("</html>");

}catch(Exception ex) {
System.out.println(ex);//response.sendRedirect("Registration.jsp");
out.println("er"+ex);
}
}else{
//response.sendRedirect("Registration.jsp");
    out.println("er");
}
%>


	<script src="./js/jquery-1.10.0.min.js"></script>
	<script src="./js/bootstrap/js/bootstrap.min.js"></script>
	<script src="./js/holder.js"></script>
	<script src="./js/script.js"></script>
</body>
</html>