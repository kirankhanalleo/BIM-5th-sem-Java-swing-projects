package com.java2gui_kiran_A_19;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.sql.*;
public class KiranSignupServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException { 
        response.setContentType("text/html"); 
        PrintWriter out = response.getWriter(); 
        String name = request.getParameter("name"); 
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bim","root","kiran123");
            String query="INSERT INTO kiranSignup(Name,Email,password) VALUES(?,?,?)";
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1,name);
            st.setString(2,email);
            st.setString(3,password);
            st.executeUpdate();
            out.println("<h1>User Registered Successfully!<h1>");
            st.close();
            con.close();
        }
        catch(Exception e){
            out.println(e);
        }
    }
}
