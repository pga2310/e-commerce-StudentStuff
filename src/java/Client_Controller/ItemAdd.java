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


public class ItemAdd extends HttpServlet {
    private final String UPLOAD_DIRECTORY = "C:/Users/Pushpak Gandhi/Documents/NetBeansProjects/BootClient/web/client/client_docs/";
    final int permitedSize = 314572800;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try{
              out.write("Enter");
        HttpSession sss = request.getSession();
	String id = sss.getAttribute("client_id").toString();
        MultipartRequest m1=new MultipartRequest(request, "C:/Users/Pushpak Gandhi/Documents/NetBeansProjects/BootClient/web/client/client_docs/",permitedSize);  
        String title=m1.getParameter("title");
        String tagline=m1.getParameter("tagline");
        String description=m1.getParameter("description");
        String price=m1.getParameter("price");
        String city=m1.getParameter("city");
        String field=m1.getParameter("field");
        String category=m1.getParameter("category");
        String condition=m1.getParameter("condin").toString();
        String img1=m1.getFilesystemName("img-1");
        String img2=m1.getFilesystemName("img-2");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
      
      
        CommonData.ComData C = new ComData();
        C.NewitemAdd(title,tagline,description,price,city,field,category,condition,img1,img2,id,strDate);
        out.write("Success");
        }
        catch(Exception e)
        {out.write(""+e);}
        } 

}