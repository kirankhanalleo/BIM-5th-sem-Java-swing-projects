/*Write a java program using Prepared Statement that allows a 
user to insert values to a table of particular database (Suppose 
database is in MySql server). The program should take the values 
to insert from console as long as the user want to add new record.
*/
package com.java2gui_kiran_A_19;
import java.sql.*;
import java.util.Scanner;
public class KiranInsertPreparedConsole {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("No. of records you want to insert: ");
        int total=sc.nextInt();
        int[] idArray=new int[total];
        String[] nameArray=new String[total];
        String[] addressArray=new String[total];
        int length=idArray.length;
        for(int i=0;i<length;i++){
            System.out.print("\nId: ");
            idArray[i]=sc.nextInt();
            sc.nextLine();
            System.out.print("\nName: ");
            nameArray[i]=sc.nextLine();
            System.out.print("\nAddress: ");
            addressArray[i]=sc.nextLine();
        }
        String url="jdbc:mysql://localhost:3306/bim";
        String user="root";
        String pass="kiran123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,pass);
            String query="INSERT INTO newPrepared VALUES(?,?,?)";
            PreparedStatement pre_st=con.prepareStatement(query);
            for(int i=0;i<length;i++){
                pre_st.setInt(1, idArray[i]);
                pre_st.setString(2,nameArray[i]);
                pre_st.setString(3,addressArray[i]);
                pre_st.executeUpdate();
            }
            System.out.println(length+" row(s) affected");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
