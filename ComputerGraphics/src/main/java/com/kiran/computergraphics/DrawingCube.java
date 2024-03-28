/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.computergraphics;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class DrawingCube extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,signature;
    JTextField tf1,tf2,tf3,tf4;
    JButton jb;
    Graphics g;
    DrawingCube(){
        this.setSize(600,600);
        this.setTitle("Drawing Cube");
        signature=new JLabel("Kiran Khanal | NCC BIM");
        signature.setBounds(10,530,200,20);
        l1=new JLabel("X");
        l1.setBounds(10,15,20,25);
        tf1=new JTextField();
        tf1.setBounds(40,15,50,25);
        l2=new JLabel("Y");
        l2.setBounds(100,15,20,25);
        tf2=new JTextField();
        tf2.setBounds(130,15,50,25);
        l3=new JLabel("Length");
        l3.setBounds(200,15,50,25);
        tf3=new JTextField();
        tf3.setBounds(250,15,50,25);
        l4=new JLabel("Shift");
        l4.setBounds(330,15,50,25);
        tf4=new JTextField();
        tf4.setBounds(370,15,50,25);
        jb=new JButton("Draw");
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
    @Override
    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(tf1.getText());
        int y = Integer.parseInt(tf2.getText());
        int length = Integer.parseInt(tf3.getText());
        int shift = Integer.parseInt(tf4.getText());
        Point[] cubeOnePoints = getCubeOnePoints(x, y, length);
        Point[] cubeTwoPoints = getCubeTwoPoints(x, y, length, shift);
        g.setColor(Color.RED);
        g.fillRect(x + shift, y + shift, length, length);
        int x1 = cubeOnePoints[0].x;
        int y1 = cubeOnePoints[0].y;
        int x2 = cubeTwoPoints[0].x;
        int y2 = cubeTwoPoints[0].y;
        int x3 = cubeTwoPoints[3].x;
        int y3 = cubeTwoPoints[3].y;
        int x4 = cubeOnePoints[3].x;
        int y4 = cubeOnePoints[3].y;
        int[] x_cords = {x1, x2, x3, x4};
        int[] y_cords = {y1, y2, y3, y4};
        g.setColor(Color.BLUE);
        g.fillPolygon(x_cords, y_cords, 4);
        x1 = cubeOnePoints[0].x;
        y1 = cubeOnePoints[0].y;
        x2 = cubeOnePoints[1].x;
        y2 = cubeOnePoints[1].y;
        x3 = cubeTwoPoints[1].x;
        y3 = cubeTwoPoints[1].y;
        x4 = cubeTwoPoints[0].x;
        y4 = cubeTwoPoints[0].y;
        x_cords = new int[]{x1, x2, x3, x4};
        y_cords = new int[]{y1, y2, y3, y4};
        g.setColor(Color.ORANGE);
        g.fillPolygon(x_cords, y_cords, 4);
        x1 = cubeOnePoints[1].x;
        y1 = cubeOnePoints[1].y;
        x2 = cubeTwoPoints[1].x;
        y2 = cubeTwoPoints[1].y;
        x3 = cubeTwoPoints[2].x;
        y3 = cubeTwoPoints[2].y;
        x4 = cubeOnePoints[2].x;
        y4 = cubeOnePoints[2].y;
        x_cords = new int[]{x1, x2, x3, x4};
        y_cords = new int[]{y1, y2, y3, y4};
        g.setColor(Color.YELLOW);
        g.fillPolygon(x_cords, y_cords, 4);
        for (int i = 0; i < 4; i++) {
            g.setColor(Color.BLACK);
            g.drawLine(cubeOnePoints[i].x, cubeOnePoints[i].y, cubeTwoPoints[i].x, cubeTwoPoints[i].y);
        }
        g.drawLine(cubeOnePoints[2].x, cubeOnePoints[2].y, cubeOnePoints[3].x, cubeOnePoints[3].y);
        g.drawLine(cubeTwoPoints[0].x, cubeTwoPoints[0].y, cubeTwoPoints[1].x, cubeTwoPoints[1].y);
        g.drawLine(cubeOnePoints[1].x, cubeOnePoints[1].y, cubeOnePoints[2].x, cubeOnePoints[2].y);
    }   
public static void main(String[] args){
    new DrawingCube();
    }
}
    
