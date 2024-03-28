/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.computergraphics;
import java.util.Scanner;
import javax.swing.*;
import java.awt.Graphics;
public class Scaling extends JFrame {
    int x1,y1,x2,y2,sx,sy,rx1,ry1,rx2,ry2;
    public Scaling(){
        this.setTitle("2D Scaling");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter end points X1 and Y1: ");
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        System.out.print("Enter end points X2 and Y2: ");
        x2= scan.nextInt();
        y2 = scan.nextInt();
        System.out.print("Enter the value for sx: ");
        sx = scan.nextInt();
        System.out.print("Enter the value for sy: ");
        sy = scan.nextInt();
        rx1=x1*sx;
        rx2=x2*sx;
        ry1=y1*sy;
        ry2=y2*sy;
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        g.drawLine(x1,y1,x2,y2);
        g.drawString("Before Scaling",x1-10,y2+20);
        g.drawLine(rx1,ry1,rx2,ry2);
        g.drawString("After Scaling",rx2-10,ry2+20);
    }
    public static void main(String [] args){
        new Scaling();
    }
}
