package com.java2gui_kiran_A_19;
import java.sql.*;
import java.util.Scanner;
public class KiranDisplayFromConsole {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter RollNo: ");
        int roll = sc.nextInt();
        String url = "jdbc:mysql://localhost:3306/bim";
        String user="root";
        String pass="kiran123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,pass);
            Statement st=con.createStatement();
            String query="SELECT * from result where roll_no="+roll;
            ResultSet rs=st.executeQuery(query);
            System.out.println("=========Your Details==========");
            System.out.println("Roll No\t\tCourse\t\tMarks");
            while(rs.next()){
                System.out.println(rs.getString("roll_no")
                                    +"\t\t"+rs.getString("course_name")
                                    +"\t\t"+rs.getString("marks_obtained"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
