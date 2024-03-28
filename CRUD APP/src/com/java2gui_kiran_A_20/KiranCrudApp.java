package com.java2gui_kiran_A_20;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
public class KiranCrudApp extends JFrame implements ActionListener {
    Connection conn;
    JTextField jt1, jt2;
    JRadioButton rb1, rb2;
    JComboBox<String> jcb;
    JButton btn1, btn2, btn3, btn4;
    JLabel l;
    KiranCrudApp() {
        this.setTitle("Nishan Neyohang");
        this.setSize(800, 700);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI();
        String url="jdbc:mysql://localhost:3306/bim";
        String user="root";
        String pass="kiran123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
        } 
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
    void createUI() {
        JLabel l1 = new JLabel("Roll No ");
        l1.setBounds(30, 30, 50, 25);
        this.add(l1);
        jt1 = new JTextField();
        jt1.setBounds(100, 30, 200, 25);
        this.add(jt1);
        JLabel l2 = new JLabel("Name");
        l2.setBounds(30, 70, 50, 25);
        this.add(l2);
        jt2 = new JTextField();
        jt2.setBounds(100, 70, 200, 25);
        this.add(jt2);
        JLabel l3 = new JLabel("Gender  ");
        l3.setBounds(30, 110, 50, 25);
        this.add(l3);
        rb1 = new JRadioButton("Male");
        rb2 = new JRadioButton("Female");
        rb1.setBounds(100, 110, 60, 25);
        rb2.setBounds(160, 110, 70, 25);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        this.add(rb1);
        this.add(rb2);
        JLabel l4 = new JLabel("Course");
        l4.setBounds(30, 150, 50, 25);
        this.add(l4);
        jcb = new JComboBox<>();
        jcb.addItem("BIM");
        jcb.addItem("BBA");
        jcb.addItem("BBM");
        jcb.addItem("BBS");
        jcb.setBounds(100, 150, 200, 25);
        this.add(jcb);
        btn1 = new JButton("Insert");
        btn2 = new JButton("View");
        btn3 = new JButton("Update");
        btn4 = new JButton("Delete");
        btn1.setBounds(30, 190, 80, 25);
        btn2.setBounds(120, 190, 80, 25);
        btn3.setBounds(210, 190, 80, 25);
        btn4.setBounds(300, 190, 80, 25);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        l = new JLabel();
        l.setBounds(30, 560, 300, 30);
        this.add(l);
        this.setVisible(true);
    }
    void insert() throws SQLException {
        int rollno = Integer.parseInt(jt1.getText());
        String name = jt2.getText();
        String course = jcb.getSelectedItem() + "";
        String gender = "";
        if (rb1.isSelected()) {
        gender = "Male";
        } 
        else if (rb2.isSelected()) {
        gender = "Female";
        }
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO students VALUES(?, ?, ?, ?)");
        stmt.setInt(1, rollno);
        stmt.setString(2, name);
        stmt.setString(3, gender);
        stmt.setString(4, course);
        stmt.executeUpdate();
        l.setText("New record added!!!");
        display();
    }
    void display() throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        String[] columnNames = {"RollNo", "Name", "Gender", "Course"};
        String[][] data = {};
        DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
        JTable table = new JTable();
        table.setModel(dtm);
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(30, 260, 600, 300);
        this.add(jsp);
        while (rs.next()) {
        Object[] row = {
        rs.getInt("roll"),
        rs.getString("name"),
        rs.getString("gender"),
        rs.getString("course")
        };
        dtm.addRow(row);
        }
    }
    void update() throws SQLException {
        int roll = Integer.parseInt(jt1.getText());
        String name = jt2.getText();
        String course = jcb.getSelectedItem() + "";
        String gender = "";
        if (rb1.isSelected()) {
        gender = "Male";
        } else if (rb2.isSelected()) {
        gender = "Female";
        }
        PreparedStatement stmt = conn.prepareStatement("UPDATE students SET name = ?, gender = ?, course = ? WHERE roll = ?");
        stmt.setString(1, name);
        stmt.setString(2, gender);
        stmt.setString(3, course);
        stmt.setInt(4, roll);
        stmt.executeUpdate();
        l.setText("Existing record updated!!!");
        display();
    }
    void delete() throws SQLException {
        int roll = Integer.parseInt(jt1.getText());
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("DELETE FROM students WHERE roll = " + roll);
        l.setText("Record deleted!!!");
        display();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == btn1) {
            insert();
            } 
            else if (e.getSource() == btn2) {
            display();
            } 
            else if (e.getSource() == btn3) {
            update();
            } 
            else if (e.getSource() == btn4) {
            delete();
            }
        } 
        catch (SQLException ex) { 
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
    new KiranCrudApp();
    }
}
