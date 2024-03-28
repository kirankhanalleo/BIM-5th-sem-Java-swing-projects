/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.computergraphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ReflectionX extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4,signature;
    JTextField tf1, tf2, tf3, tf4;
    JButton jb;
    Graphics g;
    ReflectionX() {
        this.setTitle("Reflection Through X-Axis");
        this.setSize(800, 700);
        signature=new JLabel("Kiran Khanal | NCC BIM");
        signature.setBounds(10,530,200,20);
        this.setLayout(null);
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
        g = this.getGraphics();
    }
    int[][] translate(int[][] orgMatrix, int tx, int ty) {
        int[][] translationVector = {{1, 0, tx}, {0, 1, ty}, {0, 0, 1}};
        int[][] tempMatrix = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                tempMatrix[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    tempMatrix[i][j] += translationVector[i][k] * orgMatrix[k][j];
                }
            }
        }
    return tempMatrix;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int x1 = Integer.parseInt(tf1.getText());
        int y1 = Integer.parseInt(tf2.getText());
        int x2 = Integer.parseInt(tf3.getText());
        int y2 = Integer.parseInt(tf4.getText());
        g.drawLine(400, 0, 400, 700);
        g.drawLine(0, 350, 800, 350);
        g.drawString("(400,350)", 340, 370);
        int[][] orgMatrix = {{x1, x2}, {y1, y2}, {1, 1}};
        int[][] translatedMatrix = translate(orgMatrix, 400, 350);
        int[][] reflectionVector = {{1, 0, 0}, {0, -1, 0}, {0, 0, 1}};
        int[][] reflectedMatrix = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                reflectedMatrix[i][j] = 0;
            for (int k = 0; k < 3; k++) {
            reflectedMatrix[i][j] += reflectionVector[i][k] * translatedMatrix[k][j];
            }
            }
        }
        int[][] finalMatrix = translate(reflectedMatrix, 0, 750);
        g.drawLine(translatedMatrix[0][0], translatedMatrix[1][0], translatedMatrix[0][1], translatedMatrix[1][1]);
        g.drawString("Before Reflection", 580, 650);
        g.drawLine(finalMatrix[0][0], finalMatrix[1][0], finalMatrix[0][1], finalMatrix[1][1]);
        g.drawString("After Reflection", 550, 250);
        }
    public static void main(String[] args) {
    new ReflectionX();
    }
}

