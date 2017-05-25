/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client_Controller;

import CommonData.ComData;
import com.oreilly.servlet.MultipartRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.MultipartConfig;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;

/**
 *
 * @author Pushpak Gandhi
 */
@MultipartConfig
public class Registration extends HttpServlet {

      RegistrationBean rb = new RegistrationBean();
    //////////////////////////////////////////////////////////////////////////////
      
        

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception 
    {
        String s;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if(!isMultipart)
        {
            out.println("File not uploaded");
        }
        else
        {
             FileItemFactory factory = new DiskFileItemFactory();
             ServletFileUpload upload = new ServletFileUpload(factory);
                List items = null;
            try {             
                
                items = upload.parseRequest((RequestContext) request);
                
            } catch (FileUploadException ex) 
            {
                //Logger.getLogger(ImgServ.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
            System.out.println("Items; " + items);
            Iterator itr = items.iterator();
            while(itr.hasNext())
            {
                FileItem item = (FileItem)itr.next();
                if(item.isFormField())
                {
                    String name = item.getFieldName();
                    if(name.equals("firstname"))
                    {
                        String fname  = item.getString();
                   rb.setF_name(fname);
                    }
                    else if(name.equals("lastname"))
                    {
                        String lname = item.getString();
                    rb.setL_name(lname);
                    }
                    else if(name.equals("gender"))
                    {
                        String gender = item.getString();
                    rb.setGender(gender);
                    }
                    else if(name.equals("address"))
                    {
                        String add = item.getString();
                    rb.setAddress(add);
                    }
                    else if(name.equals("city"))
                    {
                        String city = item.getString();
                    rb.setCity(city);
                    }
                    else if(name.equals("college"))
                    {
                        String col = item.getString();
              rb.setCollege(col);
                    }
                    else if(name.equals("branch"))
                    {
                        String branch = item.getString();
                    rb.setBranch(branch);
                    }
                    else if(name.equals("mobilenumber"))
                    {
                        String mo = item.getString();
                    rb.setMobile(mo);
                    }
                        
                     else if(name.equals("email"))
                    {
                        String email = item.getString();
                    rb.setEmail(email);
                    }
                   
                     else if(name.equals("password"))
                    {
                        String pass = item.getString();
                    rb.setPassword(pass);
                    }
                   
                }else
                {
                    try {
                        String itemName = item.getName();
                        Random gen = new Random();
                        int r = Math.abs(gen.nextInt());
                        
                        String reg = "[.*]";
                        String replaceText = "";
                        System.out.println("Text befor replacing is: " + itemName);
                        Pattern pattern = Pattern.compile(reg);
                        Matcher matcher = pattern.matcher(itemName);
                        
                        StringBuffer buffer = new StringBuffer();
                        while(matcher.find())
                        {
                            matcher.appendReplacement(buffer, replaceText);
                        }
                        int indexOf = itemName.indexOf(".");
                        String domainName = itemName.substring(indexOf);
                        System.out.println("Domain Name: "+ domainName);
                        
                        String finalImg = buffer.toString()+"_"+r+domainName;
                    //    finalImg=buffer.toString()+domainName;
                        System.out.println("Final Image: "+ finalImg);
                        
                       File savedFile = new File("C:/Users/Pushpak Gandhi/Documents/NetBeansProjects/BootClient/web/client/client_docs/"+finalImg);
                       System.out.println("File Name: " + savedFile);
                       item.write(savedFile);                                   
                                                     
                           s=finalImg;                           

                            rb.setImage(s);
        CommonData.ComData C = new ComData(); 
        C.register(rb.getF_name(),rb.getL_name(), rb.getGender(),rb.getAddress(),rb.getCity(),rb.getCollege(),rb.getBranch(),rb.getMobile(),rb.getEmail(), rb.getPassword(),rb.getImage());
        out.write("Suceess");
       
                           
                           
                           //out.println("Successfull.....");
        response.sendRedirect("SignIn.jsp");
                    }
                    catch (SQLException ex)
                    {
                        ex.printStackTrace();
                        //Logger.getLogger(ImgServ.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) 
                    {
                     //   Logger.getLogger(ImgServ.class.getName()).log(Level.SEVERE, null, ex);
                        ex.printStackTrace();
                    }
                    
                }
            }
       
        }
       

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}

                
        
        
        ////////////////////////////////////////////////////////////////////////
       
        
        
        
        
       
