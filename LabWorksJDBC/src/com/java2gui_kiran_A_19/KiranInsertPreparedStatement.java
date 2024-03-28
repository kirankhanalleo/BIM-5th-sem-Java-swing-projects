package com.java2gui_kiran_A_19;
import java.sql.*;
public class KiranInsertPreparedStatement {
    public static void main(String [] args){
        String url="jdbc:mysql://localhost:3306/bim";
        String user="root";
        String pass="kiran123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,pass);
            String query="INSERT INTO newPrepared(id,name,address)VALUES(?,?,?)";
            PreparedStatement preparedStatement=con.prepareStatement(query);
            preparedStatement.setInt(1,10);
            preparedStatement.setString(2,"Kiran Khanal");
            preparedStatement.setString(3,"Mechinagar Municipality, Jhapa");
            int res=preparedStatement.executeUpdate();
            System.out.println(res+"row(s) affected");
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
