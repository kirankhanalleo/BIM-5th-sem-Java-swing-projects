package com.java2gui_kiran_A_19;
import java.io.*;  
import jakarta.servlet.*;  
import jakarta.servlet.http.*;  
  
public class KiranWelcomeServlet extends HttpServlet {  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String name=request.getParameter("name");  
    out.print("Welcome "+name);  
    }  
  
}  