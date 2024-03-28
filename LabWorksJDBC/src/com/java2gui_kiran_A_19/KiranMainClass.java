package com.java2gui_kiran_A_19;
import javax.swing.*;
import java.awt.event.*;
public class KiranMainClass extends JFrame implements ActionListener{
    JLabel lblStdId,lblName,lblAddress,lblRollNo,lblFaculty;
    JTextField txtStdId, txtName, txtAddress, txtRollNo;
    JComboBox cmbFaculty;
    JButton btnSubmit, btnClear;
    static KiranConnector dbConn;
    public KiranMainClass(){
	dbConn=new KiranConnector();
	initializeGUI();
    }
    public void clearFields(){
	this.txtStdId.setText("");
	this.txtName.setText("");
	this.txtAddress.setText("");
	this.txtRollNo.setText("");
    }
    public void initializeGUI(){
	this.setTitle("Kiran Khanal-10413/19");
	this.setSize(600,400);
	this.setLayout(null);
	lblStdId=new JLabel("Student ID: ");
	lblStdId.setBounds(10,10,100,25);
	lblName=new JLabel("Name: ");
	lblName.setBounds(10,45,100,25);
	lblAddress=new JLabel("Address: ");
	lblAddress.setBounds(10,80,100,25);
	lblRollNo=new JLabel("Roll No: ");
	lblRollNo.setBounds(10,115,100,25);
	lblFaculty=new JLabel("Faculty: ");
	lblFaculty.setBounds(10,150,100,25);
	txtStdId=new JTextField();
	txtStdId.setBounds(120,10,100,25);
	txtName=new JTextField();
	txtName.setBounds(120,45,100,25);
	txtAddress=new JTextField();
	txtAddress.setBounds(120,80,100,25);
	txtRollNo=new JTextField();
	txtRollNo.setBounds(120,115,100,25);
	cmbFaculty=new JComboBox();
	cmbFaculty.addItem("BBA");
	cmbFaculty.addItem("BIM");
	cmbFaculty.addItem("BBS");
	cmbFaculty.setBounds(120,150,150,25);
	btnSubmit=new JButton("Submit");
	btnSubmit.setBounds(10,190,100,25);
	btnSubmit.addActionListener(this);
	btnSubmit.setActionCommand("submit");
	btnClear=new JButton("Clear");
	btnClear.addActionListener(this);
	btnClear.setActionCommand("clear");
	btnClear.setBounds(150,190,100,25);
	this.add(lblStdId);
	this.add(lblName);
	this.add(lblAddress);
	this.add(lblRollNo);
	this.add(lblFaculty);
	this.add(txtStdId);
	this.add(txtName);
	this.add(txtAddress);
	this.add(txtRollNo);
	this.add(cmbFaculty);
	this.add(btnSubmit);
	this.add(btnClear);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
    }
    public static void main(String args[]){
	new KiranMainClass();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
    	if(ae.getActionCommand().equals("clear")){
            this.clearFields();
        }
	if(ae.getActionCommand().equals("submit")){
            KiranStudent std=new KiranStudent(Integer.parseInt(txtStdId.getText()),
                            txtName.getText(), txtAddress.getText(),
                            Integer.parseInt(txtRollNo.getText()),
                            cmbFaculty.getSelectedItem().toString());
            int stdId=std.getStudentId();
            String stdName=std.getName();
            String stdFaculty=std.getFaculty();
            String stdAddress=std.getAddress();
            int stdRollNo=std.getRollNo();
            String query="INSERT INTO CRUD(ID,Name,RollNo,Address,Faculty ) VALUES(?,?,?,?,?)";
//                    + "("+stdId+","+stdName+","+stdRollNo+","+stdAddress+","+stdFaculty+")";
            
            int result=dbConn.iud(query);
            if(result>0) {
                System.out.println("Record Insertion Successful!");
		clearFields();}
            else{
                System.out.println("Record Insertion Failed!"); 
            }
        }
    }
}

