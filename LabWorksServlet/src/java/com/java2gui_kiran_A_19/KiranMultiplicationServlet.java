package com.java2gui_kiran_A_19;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
public class KiranMultiplicationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException { 
        response.setContentType("text/html"); 
        PrintWriter out = response.getWriter(); 
        int num=Integer.parseInt(request.getParameter("num")); 
        out.println("<h1>The Multiplication table for "+num+" :</h1>");
        for(int i=1;i<=10;i++){
            out.println(num+"	*	"+i+"	= "+(num*i)+"<br>");
        }
    }
}
