package com.java2gui_kiran_A_19;
import java.io.IOException;  
import java.io.PrintWriter;  
import jakarta.servlet.ServletException;  
import jakarta.servlet.http.*;
public class LoginServlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        request.getRequestDispatcher("link.html").include(request, response);  
          
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        if(password.equals("kiran123")){  
        out.print("<br>Welcome, "+name);  
        HttpSession session=request.getSession();  
        session.setAttribute("name",name);  
        }  
        else{  
            out.print("Sorry, invalid credientials!!");  
            request.getRequestDispatcher("login.html").include(request, response);  
        }  
        out.close();  
    }  
}  