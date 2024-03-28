package com.kiran.computergraphics;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class DDALineAlgorithm extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,signature;
    JTextField tf1,tf2,tf3,tf4;
    JButton jb;
    Graphics g;
    public DDALineAlgorithm(){
        this.setSize(600,600);
        this.setTitle("DDA Line Drawing Algorithm");
        signature=new JLabel("Kiran Khanal | NCC BIM");
        signature.setBounds(10,530,200,20);
        l1=new JLabel("X0");
        l1.setBounds(10,15,20,25);
        tf1=new JTextField();
        tf1.setBounds(40,15,50,25);
        l2=new JLabel("Y0");
        l2.setBounds(120,15,20,25);
        tf2=new JTextField();
        tf2.setBounds(150,15,50,25);
        l3=new JLabel("X1");
        l3.setBounds(230,15,20,25);
        tf3=new JTextField();
        tf3.setBounds(260,15,50,25);
        l4=new JLabel("Y1");
        l4.setBounds(340,15,20,25);
        tf4=new JTextField();
        tf4.setBounds(370,15,50,25);
        jb=new JButton("Draw Line");
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
    public static void main(String[] args) {
        DDALineAlgorithm ddA= new DDALineAlgorithm(); }
    @Override
    public void actionPerformed(ActionEvent ae) {
        int x1=Integer.parseInt(tf1.getText());
        int y1=Integer.parseInt(tf2.getText());
        int x2=Integer.parseInt(tf3.getText());
        int y2=Integer.parseInt(tf4.getText());
        int dx=x2-x1;
        int dy=y2-y1;
        double m=(double)dy/dx;
        int steps,x,y,j;
        int incX,incY;
        if(Math.abs(dx)>=Math.abs(dy)) {
            steps=Math.abs(dx);
        }
        else{
            steps=Math.abs(dy);
        }
        incX=dx/steps;
        incY=dy/steps;
        x=x1; 
        y=y1;
        g.fillRect((int)x,(int)y,5,5);
        
        for(j=1;j<=steps;j++) {
            x=x+incX;
            y=y+incY;
            g.fillRect((int)x,(int)y,5,5);
        }
    }
}