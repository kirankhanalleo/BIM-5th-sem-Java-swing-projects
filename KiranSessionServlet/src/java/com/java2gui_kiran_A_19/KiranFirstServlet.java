package com.java2gui_kiran_A_19;
import java.io.*;    
import jakarta.servlet.http.*;
public class KiranFirstServlet extends HttpServlet {  
    public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        String user=request.getParameter("user");  
        out.print("Hello "+user);  
        HttpSession session=request.getSession();  
        session.setAttribute("uname",user);  
        out.print("<br><br><a href='KiranSecondServlet'>Go to another servlet</a>");      
        out.close();  
        }
        catch(Exception e)
            {System.out.println(e);}  
        }  
}  