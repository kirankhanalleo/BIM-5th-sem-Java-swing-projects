package com.java2gui_kiran_A_19;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class KiranMultiplicationTable extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
        throws ServletException, IOException{
    res.setContentType("text/html");
    PrintWriter out =res.getWriter();
    int n=Integer.parseInt(req.getParameter("num"));
    out.println("<html>"
            + "<head>"
            + "<title>Multiplication Table Generator</title>"
            + "</head>"
            + "<body>");
        out.println(n);
        out.println("</body>"
            + "</html>");
    }
//    @Override
//    public void doPost(HttpServletRequest req, HttpServletResponse res) 
//        throws ServletException, IOException{
//        doGet(req,res);
//    }
}
