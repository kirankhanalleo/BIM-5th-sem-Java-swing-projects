package com.java2gui_kiran_A_19;
import javax.swing.*;
import java.sql.*;
public class KiranJDBCDisplay {
    public static void main(String [] args){
        String url ="jdbc:mysql://localhost:3306/bim";
        String user="root";
        String pass="kiran123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,pass);
            String query="SELECT * FROM clients";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                System.out.println("ID: "+rs.getString("id")
                                   +"\t\t Name:"+rs.getString("name")
                                   +"\t\t Email:"+rs.getString("email")+"\n");                
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
