package com.kiran.computergraphics;
import javax.swing.*;
import java.awt.*;
public class ThickLineJava extends JFrame {
    ThickLineJava(){
        this.setTitle("Drawing Thick Line");
        this.setSize(500,500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D=(Graphics2D)g;
        g2D.setStroke(new BasicStroke(10f));
        g2D.drawLine(50, 200, 250, 200);
        g2D.drawString("Thick Line", 50, 230);
    }
    public static void main(String [] args){
        new ThickLineJava();
    }
}
