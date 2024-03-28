package com.java2gui_kiran_A_19;
import java.sql.*;
public class KiranDisplayPreparedStatement {
    public static void main(String [] args){
        String url="jdbc:mysql://localhost:3306/bim";
        String user="root";
        String pass="kiran123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,pass);
            String query="SELECT * from clients where id=?";
            PreparedStatement pre_st=con.prepareStatement(query);
            pre_st.setInt(1,26);
            ResultSet rs=pre_st.executeQuery();
            System.out.println("---------Your Details are-------------");
            while(rs.next()){
                System.out.println("ID: "+rs.getString("id"));                
                System.out.println("Name: "+rs.getString("name"));
                System.out.println("Email: "+rs.getString("email"));
            }
            rs.close();
            pre_st.close();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
