/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.computergraphics;

/**
 *
 * @author Kiran
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Point;
public class Scaling3D extends JFrame implements ActionListener {
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    JLabel l1,l2,l3,l4,l5,l6,signature;
    JButton jb;
    Graphics g;
    public Scaling3D(){
        this.setTitle("3D Scaling");
        this.setSize(500,500);
        signature=new JLabel("Kiran Khanal | NCC BIM");
        signature.setBounds(10,430,200,20);
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
        l5=new JLabel("Sx");
        l5.setBounds(10,50,20,25);
        tf5=new JTextField();
        tf5.setBounds(40,50,50,25);
        l6=new JLabel("Sy");
        l6.setBounds(120,50,20,25);
        tf6=new JTextField();
        tf6.setBounds(150,50,50,25);
        jb=new JButton("Translate");
        jb.setBounds(230,50,190,25);
        jb.addActionListener(this);
        this.add(l1); this.add(l2); this.add(l3); this.add(l4);
        this.add(l5); this.add(l6); this.add(tf5); this.add(tf6);
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
    Point[] drawCubeOnePointsAfterScaling(int x, int y, int length, int sx, int sy) {
        Point[] points = new Point[4];
        points[0] = new Point(x * sx, y * sy);
        points[1] = new Point((x + length) * sx, y * sy);
        points[2] = new Point((x + length) * sx, (y + length) * sy);
        points[3] = new Point(x * sx, (y + length) * sy);
        int x1 = points[0].x;
        int y1 = points[0].y;
        int x2 = points[1].x;
        int y2 = points[1].y;
        int x3 = points[2].x;
        int y3 = points[2].y;
        int x4 = points[3].x;
        int y4 = points[3].y;
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x4, y4);
        g.drawLine(x4, y4, x1, y1);
        return points;
    }
    Point[] drawCubeTwoPointsAfterScaling(int x, int y, int length, int shift, int sx, int sy) {
    int newX = x + shift;
    int newY = y + shift;
    Point[] points = new Point[4];
    points[0] = new Point(newX * sx, newY * sy);
    points[1] = new Point((newX + length) * sx, newY * sy);
    points[2] = new Point((newX + length) * sx, (newY + length) * sy);
    points[3] = new Point(newX * sx, (newY + length) * sy);
    int x1 = points[0].x;
    int y1 = points[0].y;
    int x2 = points[1].x;
    int y2 = points[1].y;
    int x3 = points[2].x;
    int y3 = points[2].y;
    int x4 = points[3].x;
    int y4 = points[3].y;
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
        int sx = Integer.parseInt(tf5.getText());
        int sy = Integer.parseInt(tf6.getText());
        Point[] cubeOnePoints = getCubeOnePoints(x, y, length);
        Point[] cubeTwoPoints = getCubeTwoPoints(x, y, length, shift);
        g.drawRect(x, y, length, length);
        g.drawRect(x + shift, y + shift, length, length);
        g.drawString("Before Scaling", 100, 250);
        for (int i = 0; i < 4; i++) {
        g.drawLine(cubeOnePoints[i].x, cubeOnePoints[i].y, cubeTwoPoints[i].x, cubeTwoPoints[i].y);
    }
    Point[] finalCubeOnePoints = drawCubeOnePointsAfterScaling(x, y, length, sx, sy);
    Point[] finalCubeTwoPoints = drawCubeTwoPointsAfterScaling(x, y, length, shift, sx, sy);
    for (int i = 0; i < 4; i++) {
        g.drawLine(finalCubeOnePoints[i].x, finalCubeOnePoints[i].y, finalCubeTwoPoints[i].x, finalCubeTwoPoints[i].y);
    }
        g.drawString("After Scaling", 360, 450);
    }
    public static void main(String[] args) {
        new Scaling3D();
    }
}
