/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.computergraphics;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;

public class CCWRotation extends JFrame implements ActionListener {
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    JLabel l1,l2,l3,l4,l5,l6,signature;
    JButton jb;
    Graphics g;
    
    public CCWRotation(){
        this.setTitle("2D Counter Clockwise Rotation");
        this.setSize(600,600);
        signature=new JLabel("Kiran Khanal | NCC BIM");
        signature.setBounds(10,530,200,20);
        l1=new JLabel("X1");
        l1.setBounds(10,15,20,25);
        tf1=new JTextField();
        tf1.setBounds(40,15,50,25);
        l2=new JLabel("Y1");
        l2.setBounds(120,15,20,25);
        tf2=new JTextField();
        tf2.setBounds(150,15,50,25);
        l3=new JLabel("X2");
        l3.setBounds(230,15,20,25);
        tf3=new JTextField();
        tf3.setBounds(260,15,50,25);
        l4=new JLabel("Y2");
        l4.setBounds(340,15,20,25);
        tf4=new JTextField();
        tf4.setBounds(370,15,50,25);
        l5=new JLabel("Angle");
        l5.setBounds(10,50,50,25);
        tf5=new JTextField();
        tf5.setBounds(60,50,50,25);
        jb=new JButton("Rotate Line");
        jb.setBounds(220,50,190,25);
        jb.addActionListener(this);
        this.add(l1); this.add(l2); this.add(l3); this.add(l4);
        this.add(l5); this.add(tf5);
        this.add(tf1); this.add(tf2); this.add(tf3); this.add(tf4);
        this.add(signature); this.add(jb);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        g=this.getGraphics();
    }
    public static void main(String []args){
        new CCWRotation();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        int x1=Integer.parseInt(tf1.getText());
        int y1=Integer.parseInt(tf2.getText());
        int x2=Integer.parseInt(tf3.getText());
        int y2=Integer.parseInt(tf4.getText());
        y1+=75;            
        y2+=75;
        int angle = Integer.parseInt(tf5.getText());
        double t = angle*Math.PI/180;
        int rx1=(int)(x1*Math.cos(t)-y1*Math.sin(t));
        int rx2=(int)(x2*Math.cos(t)-y2*Math.sin(t));
        int ry1=(int)(y1*Math.cos(t)+x1*Math.sin(t));
        int ry2=(int)(y2*Math.cos(t)+x2*Math.sin(t));
        g.drawLine(x1,y1,x2,y2);
        g.drawString("Before Rotation", x1-10, y2+20);
        g.drawLine(rx1,ry1,rx2,ry2);
        g.drawString("After Rotation", rx1-10, ry2+20);
    }
}
