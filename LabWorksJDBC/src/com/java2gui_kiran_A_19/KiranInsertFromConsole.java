package com.java2gui_kiran_A_19;
import java.sql.*;
import java.util.Scanner;
public class KiranInsertFromConsole {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int rolluser, marksuser; 
        String nameuser;
        System.out.print("Enter Name: ");
        nameuser=sc.nextLine();
        System.out.print("\nEnter RollNo: ");
        rolluser=sc.nextInt();
        System.out.print("\nEnter Marks: ");
        marksuser=sc.nextInt();
        String url="jdbc:mysql://localhost:3306/bim";
        String user="root";
        String pass="kiran123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,pass);
            Statement st=con.createStatement();
            String query="INSERT INTO students(RollNo,Name,Marks) VALUES("+rolluser+",'"+nameuser+"',"+marksuser+")";
            int res=st.executeUpdate(query);
            System.out.println(res+"row(s) inserted");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
