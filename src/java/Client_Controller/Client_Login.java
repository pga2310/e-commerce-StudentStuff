package Client_Controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pushpak Gandhi
 */
public class Client_Login extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
                String uname = request.getParameter("Username").toString();
		String pswd = request.getParameter("Password").toString();
		
		if(request.getParameter("Submit_Login")!=null)
		{
					
		try{
		CommonData.ComData C = new CommonData.ComData();
		String str = C.getpswd(uname);
                
		ResultSet r = null;
                
		
		r = C.getusername(uname);
                
		if (str.equals(pswd))
		{
			String id = C.getuserId(uname);
			HttpSession s = request.getSession();
                       	s.setAttribute("client_uname", uname);
                        s.setAttribute("client_id", id);
                       //Date createTime = new Date(s.getCreationTime());
                       // System.out.print(createTime);
                       // l.setlogintime(createTime);
			response.sendRedirect("client/HomePage.jsp");
		}
		else
		{
			response.sendRedirect("client/HomePage.jsp");
		}
		}
		catch(Exception e)
		{
			System.out.println("Error in loginserv class "+ e.toString());
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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
