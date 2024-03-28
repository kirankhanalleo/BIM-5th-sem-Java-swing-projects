package com.java2gui_kiran_A_19;
import java.sql.*;
public class KiranDeletePreparedStatement {
    public static void main(String [] args){
        String url="jdbc:mysql://localhost:3306/bim";
        String user="root";
        String pass="kiran123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,pass);
            String query="DELETE from clients where name like ?";
            PreparedStatement pre_st=con.prepareStatement(query);
            pre_st.setString(1,"A%");
            int res=pre_st.executeUpdate();
            System.out.println(res+"row(s) deleted");
            pre_st.close();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
