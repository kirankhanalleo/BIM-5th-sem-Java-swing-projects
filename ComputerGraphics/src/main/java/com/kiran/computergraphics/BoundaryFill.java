/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.computergraphics;

import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
public class BoundaryFill extends JFrame {
    BoundaryFill() {
        this.setTitle("Boundary Fill Algorithm");
        this.setSize(500, 500);
        JLabel signature=new JLabel("Kiran Khanal | NCC BIM");
        signature.setBounds(10,430,200,20);
        this.add(signature);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
    super.paint(g);
    BufferedImage image1, image2;
    try {
        image1 = ImageIO.read(new File("E:\\untitled1.jpg"));
        image2 = ImageIO.read(new File("E:\\untitled1.jpg"));
        Color bc1 = new Color(image1.getRGB(35, 35));
        boundaryFill4(image1, 35, 35, bc1, Color.red);
        g.drawImage(image1, 50, 50, this);
        g.drawString("4-Connected Pixel", 50, 180);
        Color bc2 = new Color(image2.getRGB(35, 35));
        boundaryFill8(image2, 30, 30, bc2, Color.red);
        g.drawImage(image2, 250, 50, this);
        g.drawString("8-Connected Pixel", 250, 180);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void boundaryFill4(BufferedImage i, int x, int y, Color boundaryColor, Color fillColor) {
        Color c2 = new Color(i.getRGB(x, y));
        if (c2.equals(boundaryColor) && !c2.equals(fillColor)) {
        i.setRGB(x, y, fillColor.getRGB());
        boundaryFill4(i, x + 1, y, boundaryColor, fillColor);
        boundaryFill4(i, x, y + 1, boundaryColor, fillColor);
        boundaryFill4(i, x - 1, y, boundaryColor, fillColor);
        boundaryFill4(i, x, y - 1, boundaryColor, fillColor);
    }
}
void boundaryFill8(BufferedImage i, int x, int y, Color boundaryColor, Color fillColor) {
Color c2 = new Color(i.getRGB(x, y));
if (c2.equals(boundaryColor) && !c2.equals(fillColor)) {
i.setRGB(x, y, fillColor.getRGB());
boundaryFill8(i, x + 1, y, boundaryColor, fillColor);
boundaryFill8(i, x, y + 1, boundaryColor, fillColor);
boundaryFill8(i, x - 1, y, boundaryColor, fillColor);
boundaryFill8(i, x, y - 1, boundaryColor, fillColor);
boundaryFill8(i, x - 1, y - 1, boundaryColor, fillColor);
boundaryFill8(i, x - 1, y + 1, boundaryColor, fillColor);
boundaryFill8(i, x + 1, y - 1, boundaryColor, fillColor);
boundaryFill8(i, x + 1, y + 1, boundaryColor, fillColor);
}
}
public static void main(String[] args) {
new BoundaryFill();
}
}