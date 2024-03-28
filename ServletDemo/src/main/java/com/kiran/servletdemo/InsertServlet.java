/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.servletdemo;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class InsertServlet extends HttpServlet{
    Connection con;
    Statement st;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException,ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Inserting Data</title></head>");
        out.println("<body><form method='post' action='insert'>");
        out.println("<input type='text' name='studid'>"
                +"<input type='text' name='name'>"
                +"<input type='text' name='marks'>"
                +"<input type='submit' value='INSERT'");
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException,ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/JAVAII";
            con = DriverManager.getConnection(url,"root","");
            st = con.CreateStatement();
            int stuid = Integer.parseInt(request.getParameter("stuid"));
            String name = request.getParameter("name");
            int marks = Integer.parseInt(request.getParameter("marks"));
            String query="INSERT INTO `Student`(`stuid`,`name`,`marks`)VALUES(stuid,name,marks)";
        }
        catch(){
            
        }
    }
}