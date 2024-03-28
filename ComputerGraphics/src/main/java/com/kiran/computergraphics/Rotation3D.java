/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.computergraphics;

import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Point;
public class Rotation3D extends JFrame implements ActionListener{
    JTextField tf1,tf2,tf3,tf4,tf5;
    JLabel l1,l2,l3,l4,l5,signature;
    JButton jb;
    Graphics g;
    public Rotation3D(){
        this.setTitle("3D Rotation");
        this.setSize(800,700);
        signature=new JLabel("Kiran Khanal | NCC BIM");
        signature.setBounds(10,630,200,20);
        l1=new JLabel("X");
        l1.setBounds(10,15,20,25);
        tf1=new JTextField();
        tf1.setBounds(40,15,50,25);
        l2=new JLabel("Y");
        l2.setBounds(120,15,20,25);
        tf2=new JTextField();
        tf2.setBounds(150,15,50,25);
        l3=new JLabel("Length");
        l3.setBounds(230,15,50,25);
        tf3=new JTextField();
        tf3.setBounds(280,15,50,25);
        l4=new JLabel("Shift");
        l4.setBounds(350,15,50,25);
        tf4=new JTextField();
        tf4.setBounds(400,15,50,25);
        l5=new JLabel("Angle");
        l5.setBounds(470,15,50,25);
        tf5=new JTextField();
        tf5.setBounds(530,15,50,25);
        jb = new JButton("Rotate");
        jb.setBounds(600,15,100,25);
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
    Point[] getCubeOnePoints(int x, int y, int length) {
        Point[] points = new Point[4];
        points[0] = new Point(x, y);
        points[1] = new Point(x + length, y);
        points[2] = new Point(x + length, y + length);
        points[3] = new Point(x, y + length);
        return points;
    }
    Point[] getCubeTwoPoints(int x, int y, int length, int shift) {
        int newX = x + shift;
        int newY = y + shift;
        Point[] points = new Point[4];
        points[0] = new Point(newX, newY);
        points[1] = new Point(newX + length, newY);
        points[2] = new Point(newX + length, newY + length);
        points[3] = new Point(newX, newY + length);
        return points;
    }
    Point[] drawCubeOnePointsAfterRotation(int x, int y, int length, double rad) {
        int[][] orgMatrix = {
            {x, x + length, x + length, x},
            {y, y, y + length, y + length},
            {1, 1, 1, 1}
         };
        double[][] rotationVector = {
            {Math.cos(rad), -Math.sin(rad), 0},
            {Math.sin(rad), Math.cos(rad), 0},
            {0, 0, 1}
        };
        int[][] finalMatrix = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
            finalMatrix[i][j] = 0;
             for (int k = 0; k < 3; k++) {
                finalMatrix[i][j] += rotationVector[i][k] * orgMatrix[k][j];
            }
        }
    }
    int x1 = finalMatrix[0][0];
    int y1 = finalMatrix[1][0];
    int x2 = finalMatrix[0][1];
    int y2 = finalMatrix[1][1];
    int x3 = finalMatrix[0][2];
    int y3 = finalMatrix[1][2];
    int x4 = finalMatrix[0][3];
    int y4 = finalMatrix[1][3];
    Point[] points = new Point[4];
    points[0] = new Point(x1, y1);
    points[1] = new Point(x2, y2);
    points[2] = new Point(x3, y3);
    points[3] = new Point(x4, y4);
    g.drawLine(x1, y1, x2, y2);
    g.drawLine(x2, y2, x3, y3);
    g.drawLine(x3, y3, x4, y4);
    g.drawLine(x4, y4, x1, y1);
    return points;
    }
    Point[] drawCubeTwoPointsAfterRotation(int x, int y, int length, int shift, double rad) {
    int newX = x + shift;
    int newY = y + shift;
    int[][] orgMatrix = {
        {newX, newX + length, newX + length, newX},
        {newY, newY, newY + length, newY + length},
        {1, 1, 1, 1}
    };
    double[][] rotationVector = {
        {Math.cos(rad), -Math.sin(rad), 0},
        {Math.sin(rad), Math.cos(rad), 0},
        {0, 0, 1}
    };
    int[][] finalMatrix = new int[3][4];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            finalMatrix[i][j] = 0;
            for (int k = 0; k < 3; k++) {
                finalMatrix[i][j] += rotationVector[i][k] * orgMatrix[k][j];
            }
        }
    }
    int x1 = finalMatrix[0][0];
    int y1 = finalMatrix[1][0];
    int x2 = finalMatrix[0][1];
    int y2 = finalMatrix[1][1];
    int x3 = finalMatrix[0][2];
    int y3 = finalMatrix[1][2];
    int x4 = finalMatrix[0][3];
    int y4 = finalMatrix[1][3];
    Point[] points = new Point[4];
    points[0] = new Point(x1, y1);
    points[1] = new Point(x2, y2);
    points[2] = new Point(x3, y3);
    points[3] = new Point(x4, y4);
    g.drawLine(x1, y1, x2, y2);
    g.drawLine(x2, y2, x3, y3);
    g.drawLine(x3, y3, x4, y4);
    g.drawLine(x4, y4, x1, y1);
    return points;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(tf1.getText());
        int y = Integer.parseInt(tf2.getText());
        int length = Integer.parseInt(tf3.getText());
        int shift = Integer.parseInt(tf4.getText());
        int angle = Integer.parseInt(tf5.getText());
        double rad = Math.toRadians(angle);
        Point[] cubeOnePoints = getCubeOnePoints(x, y, length);
        Point[] cubeTwoPoints = getCubeTwoPoints(x, y, length, shift);
        g.drawRect(x, y, length, length);
        g.drawRect(x + shift, y + shift, length, length);
        g.drawString("Object", 370, 530);
        for (int i = 0; i < 4; i++) {
            g.drawLine(cubeOnePoints[i].x, cubeOnePoints[i].y, cubeTwoPoints[i].x, cubeTwoPoints[i].y);
        }
        g.drawString("Counter-Clockwise", 200, 650);
        Point[] finalCubeOnePoints = drawCubeOnePointsAfterRotation(x, y, length, rad);
        Point[] finalCubeTwoPoints = drawCubeTwoPointsAfterRotation(x, y, length, shift, rad);
        for (int i = 0; i < 4; i++) {
            g.drawLine(finalCubeOnePoints[i].x,
                finalCubeOnePoints[i].y,
                finalCubeTwoPoints[i].x,
                finalCubeTwoPoints[i].y
            );
        }
        Point[] finalCubeOnePointsClockwise = drawCubeOnePointsAfterRotation(x, y, length, -rad);
        Point[] finalCubeTwoPointsClockwise = drawCubeTwoPointsAfterRotation(x, y, length, shift, -rad);
        for (int i = 0; i < 4; i++) {
            g.drawLine(
                finalCubeOnePointsClockwise[i].x,
                finalCubeOnePointsClockwise[i].y,
                finalCubeTwoPointsClockwise[i].x,
                finalCubeTwoPointsClockwise[i].y
            );
        }
        g.drawString("Clockwise", 560, 280);
    }
    public static void main(String [] args){
        new Rotation3D();
    }
}