package com.java2gui_kiran_A_19;
import java.sql.*;
public class KiranJDBCInsert {
    public static void main(String [] args){
        String url="jdbc:mysql://localhost:3306/bim";
        String user="root";
        String pass="kiran123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,pass);
            String query="INSERT INTO students(RollNo,Name,Marks) VALUES(1,'Kiran Khanal',35)";
            Statement st=con.createStatement();
            int res=st.executeUpdate(query);
            System.out.println(res+" row(s) inserted");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    }
