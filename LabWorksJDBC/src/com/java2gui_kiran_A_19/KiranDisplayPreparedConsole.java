package com.java2gui_kiran_A_19;
import java.sql.*;
import java.util.Scanner;
public class KiranDisplayPreparedConsole {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee id: ");
        int id=sc.nextInt();
        String url="jdbc:mysql://localhost:3306/bim";
        String user="root";
        String pass="kiran123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,pass);
            String query="SELECT * from salary where emp_id=?";
            PreparedStatement pre_st=con.prepareStatement(query);
            pre_st.setInt(1,id);
            ResultSet rs=pre_st.executeQuery();
            System.out.println("---------Your Details are-------------\n");
            while(rs.next()){
                System.out.println("ID: "+rs.getString("emp_id"));                
                System.out.println("Name: "+rs.getString("emp_name"));
                System.out.println("Salary: "+rs.getString("emp_salary")+"\n\n");
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
