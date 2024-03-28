/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.computergraphics;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
public class GeneralCircleDrawing extends JFrame implements ActionListener{
    JTextField tf1,tf2,tf3;
    JLabel l1,l2,l3,signature;
    JButton jb;
    Graphics g;
    public GeneralCircleDrawing(){
        this.setTitle("General Circle Drawing Algorithm");
        this.setSize(600,600);
        signature=new JLabel("Kiran Khanal | NCC BIM");
        signature.setBounds(10,530,200,20);
        l1=new JLabel("Radius");
        l1.setBounds(10,15,40,25);
        tf1=new JTextField();
        tf1.setBounds(60,15,50,25);
        l2=new JLabel("X-Coordinate");
        l2.setBounds(140,15,90,25);
        tf2=new JTextField();
        tf2.setBounds(230,15,50,25);
        l3=new JLabel("Y-Coordinate");
        l3.setBounds(290,15,90,25);
        tf3=new JTextField();
        tf3.setBounds(380,15,50,25);
        jb=new JButton("Draw Circle");
        jb.setBounds(450,15,120,25);
        signature=new JLabel("Kiran Khanal | NCC BIM");
        signature.setBounds(10,530,200,20);
        jb.addActionListener(this);
        this.add(l1); this.add(l2);
        this.add(l3); this.add(tf1); this.add(tf2);
        this.add(tf3); this.add(signature); this.add(jb);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        g=this.getGraphics();
    }
    public static void main(String[] args){
        new GeneralCircleDrawing();
    }
    @Override
        public void actionPerformed(ActionEvent ae){
            int r=Integer.parseInt(tf1.getText());
            int h=Integer.parseInt(tf2.getText());
            int k=Integer.parseInt(tf3.getText());
            int xk=r; int yk=0;
            for(int i=xk;i>=0;i--){
                g.fillRect(xk+h, yk+k, 3, 3);
                g.fillRect(-xk+h, yk+k, 3, 3);
                g.fillRect(-xk+h, -yk+k, 3, 3);
                g.fillRect(xk+h, -yk+k, 3, 3);
                xk--;
                yk=(int)Math.round(Math.sqrt((r*r)-(xk*xk))); 
               }
        }
    }