package com.java2gui_kiran_A_19;
import java.io.IOException;  
import java.io.PrintWriter;  
import jakarta.servlet.ServletException;  
import jakarta.servlet.http.*;
public class LogoutServlet extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
            request.getRequestDispatcher("link.html").include(request, response);  
            HttpSession session=request.getSession();  
            session.invalidate();
            out.print("<br>You are successfully logged out!");  
            out.close();  
    }  
}