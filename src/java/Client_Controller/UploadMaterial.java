package Client_Controller;

import CommonData.ComData;
import com.oreilly.servlet.MultipartRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UploadMaterial extends HttpServlet {
    private final String UPLOAD_DIRECTORY = "C:/Users/Pushpak Gandhi/Documents/NetBeansProjects/BootClient/web/client/client_docs/";
    private final int permitedSize = 314572800;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try{
        HttpSession sss = request.getSession();
	   String uid = sss.getAttribute("client_id").toString();
           MultipartRequest m=new MultipartRequest(request, "C:/Users/Pushpak Gandhi/Documents/NetBeansProjects/BootClient/web/client/client_docs/",permitedSize);  
           
           
           String path=m.getFilesystemName("file");  
          
           String tagline=m.getParameter("tagline");  
            SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
            Date now = new Date();
            String strDate = sdfDate.format(now);
           String description=m.getParameter("description"); 
           String tt=m.getParameter("tt");  
            String img=m.getFilesystemName("img");  
           
           CommonData.ComData C = new ComData();
           C.UploadMaterial(path, tagline, description, strDate, uid, tt,img);
           response.sendRedirect("client/ListofUploadedMaterial.jsp");
        }catch(Exception e){out.write(""+e);}
    }
  
}