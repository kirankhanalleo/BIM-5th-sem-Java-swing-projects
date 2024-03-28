package com.java2gui_kiran_A_19;
import java.io.*;  
import jakarta.servlet.*;  
import jakarta.servlet.http.*;  
public class KiranLoginServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();
    String name=request.getParameter("name");  
    String pass=request.getParameter("pass");  
    if(pass.equals("kiran123")){  
        RequestDispatcher rd=request.getRequestDispatcher("KiranWelcomeServlet");  
        rd.forward(request, response);  
    }  
    else{  
        out.print("Incorrect Credientials!!");  
        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
        rd.include(request, response);  
                      
        }  
    }  
}  