package com.java2gui_kiran_A_19;
import java.io.*;  
import jakarta.servlet.*;  
import jakarta.servlet.http.*;
public class KiranSecondServlet extends HttpServlet {  
    public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        HttpSession session=request.getSession(false);  
        String name=(String)session.getAttribute("uname");  
        out.print("Hello "+name+" . I can still recognize you!<br><br> Isn't this cool?");  
        out.close();  
        }
        catch(Exception e){
            System.out.println(e);
        }  
    }  
}  