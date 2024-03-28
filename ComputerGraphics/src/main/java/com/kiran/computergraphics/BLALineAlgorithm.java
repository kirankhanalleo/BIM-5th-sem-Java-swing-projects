/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.computergraphics;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
public class BLALineAlgorithm extends JFrame implements ActionListener{
    JTextField tf1,tf2,tf3,tf4;
    JLabel l1,l2,l3,l4,signature;
    JButton jb;
    Graphics g;
public BLALineAlgorithm(){
    this.setSize(600,600);
    this.setTitle("BLA Line Drawing Algorithm");
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
    public static void main(String[] args){
        new BLALineAlgorithm();
    }
@Override
public void actionPerformed(ActionEvent ae){
    int x1=Integer.parseInt(tf1.getText());
    int y1=Integer.parseInt(tf2.getText());
    int x2=Integer.parseInt(tf3.getText());
    int y2=Integer.parseInt(tf4.getText());
    int delx=x2-x1;
    int dely=y2-y1;
    int dx=Math.abs(delx);
    int dy=Math.abs(dely);
    int Pk,xk=x1,yk=y1;
    if(dx>dy){
        Pk=2*dy-dx;
        do{
            g.fillRect(xk, yk, 1, 1);
            if(Pk>=0) {
                if(delx>0)
                    xk=xk+1;
                if(delx<=0)
                    xk=xk-1;
                if(dely>0)
                    yk=yk+1;
                if(dely<=0)
                    yk=yk-1;
                Pk=Pk+(2*dy)-(2*dx); 
            }
            else{
                if(delx>0)
                    xk=xk+1;
                if(delx<=0)
                    xk=xk-1;
                yk=yk;
                Pk=Pk+(2*dy); 
            }
        }
        while(xk!=x2);
            g.fillRect(xk, yk, 1, 1);}
    else{
        Pk=2*dx-dy;
        do{
            g.fillRect(xk, yk, 1, 1);
            if(Pk>=0) {
                if(delx>0)
                    xk=xk+1;
                if(delx<=0)
                    xk=xk-1;
                if(dely>0)
                    yk=yk+1;
                if(dely<=0)
                    yk=yk-1;
                Pk=Pk+(2*dx)-(2*dy);
            }
            else{
                xk=xk;
                if(dely>0)
                    yk=yk+1;
                if(dely<=0)
                    yk=yk-1;
                Pk=Pk+(2*dx); }
            }
        while(yk!=y2);
            g.fillRect(xk, yk, 1, 1);
        }
    }
}

