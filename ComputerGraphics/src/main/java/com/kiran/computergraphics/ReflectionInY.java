/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.computergraphics;

/**
 *
 * @author Kiran
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ReflectionInY extends JFrame implements ActionListener{
    JTextField tf1,tf2,tf3,tf4;
    JLabel l1,l2,l3,l4,signature;
    Graphics g;
    JButton jb;
    ReflectionInY(){
        this.setTitle("Reflection on Y ");
        this.setSize(600,500);
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
        jb=new JButton("Reflect");
        jb.setBounds(450,15,100,25);
        jb.addActionListener(this);
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(tf1);
        this.add(tf2);
        this.add(tf3);
        this.add(tf4);
        this.add(jb);
        this.add(signature);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        g=this.getGraphics(); 
    }
    public static void main(String [] args){
        new ReflectionInY();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        int x1=Integer.parseInt(tf1.getText());
        int y1=Integer.parseInt(tf2.getText());
        int x2=Integer.parseInt(tf3.getText());
        int y2=Integer.parseInt(tf4.getText());
        int rx1=-x1+y2;
        int rx2=-x2+y2;
        g.drawLine(x1,y1,x2,y2);
        g.drawString("Before", x1-30, y2+20);
        g.drawLine(rx1,y1,rx2,y2);
        g.drawString("After", rx1-10, y2+20);
    }
}

