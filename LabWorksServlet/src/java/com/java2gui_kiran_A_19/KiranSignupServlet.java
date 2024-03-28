package com.java2gui_kiran_A_19;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
public class KiranSignupServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException { 
        response.setContentType("text/html"); 
        PrintWriter out = response.getWriter(); 
        String name = request.getParameter("name"); 
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        out.println(name);        
        out.println(email);
        out.println(password);
    }
}
