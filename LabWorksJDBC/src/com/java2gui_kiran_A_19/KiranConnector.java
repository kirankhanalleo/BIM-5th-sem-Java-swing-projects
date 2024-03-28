package com.java2gui_kiran_A_19;
import java.sql.*;
public class KiranConnector {
    String url = "jdbc:mysql://localhost:3306/bim";
    String user = "root";
    String password = "kiran123";
    static Connection conn;
    Statement statement;
    public KiranConnector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
    public int iud(String query) {
        try {
            statement = conn.createStatement();
            return statement.executeUpdate(query);
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return -1;
    }
    public ResultSet select(String query) {
        try {
            statement = conn.createStatement();
            return statement.executeQuery(query);
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }
}

