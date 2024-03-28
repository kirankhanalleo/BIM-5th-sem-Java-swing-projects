    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package com.kiran.computergraphics;
    import java.awt.event.*;
    import javax.swing.*;
    import java.awt.Graphics;

    public class ScalingThroughArbitary extends JFrame implements ActionListener {
        JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,signature;
        JButton jb;
        Graphics g;
        public ScalingThroughArbitary(){
            this.setTitle("2D Scaling Through Arbitary Point");
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
            l5=new JLabel("Sx");
            l5.setBounds(10,50,20,25);
            tf5=new JTextField();
            tf5.setBounds(40,50,50,25);
            l6=new JLabel("Sy");
            l6.setBounds(120,50,20,25);
            tf6=new JTextField();
            tf6.setBounds(150,50,50,25);
            l7=new JLabel("X");
            l7.setBounds(230,50,20,25);
            tf7=new JTextField();
            tf7.setBounds(260,50,50,25);
            l8=new JLabel("Y");
            l8.setBounds(340,50,20,25);
            tf8=new JTextField();
            tf8.setBounds(370,50,50,25);
            jb=new JButton("Scale Line");
            jb.setBounds(440,50,140,25);
            jb.addActionListener(this);
            this.add(l1); this.add(l2); this.add(l3); this.add(l4);
            this.add(l5); this.add(l6); this.add(l7); this.add(l8);
            this.add(tf5); this.add(tf6); this.add(tf7); this.add(tf8);
            this.add(tf1); this.add(tf2); this.add(tf3); this.add(tf4);
            this.add(signature); this.add(jb);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setVisible(true);
            g=this.getGraphics();
        }
        public static void main(String [] args){
            new ScalingThroughArbitary();
        }
        @Override
            public void actionPerformed(ActionEvent e){
                int x1=Integer.parseInt(tf1.getText());
                int y1=Integer.parseInt(tf2.getText());
                int x2=Integer.parseInt(tf3.getText());
                int y2=Integer.parseInt(tf4.getText());
                int sx=Integer.parseInt(tf5.getText());
                int sy=Integer.parseInt(tf6.getText());            
                int X=Integer.parseInt(tf7.getText());
                int Y=Integer.parseInt(tf8.getText());
                y1+=75;            
                y2+=75;
                int rx1=x1*sx+X*(1-sx);            
                int rx2=x2*sx+X*(1-sx);
                int ry1=y1*sy+Y*(1-sy);
                int ry2=y2*sy+Y*(1-sy);

                g.drawLine(x1,y1,x2,y2);
                g.drawString("Before Scaling", x1-10, y2+20);
                g.drawLine(rx1,ry1,rx2,ry2);
                g.drawString("After Scaling", rx1-10, ry2+20);
            }
    }

