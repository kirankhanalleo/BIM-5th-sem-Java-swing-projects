/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.computergraphics;

/**
 *
 * @author Kiran
 */
import javax.swing.*;
import java.awt.*;
public class ComputerGraphics extends JFrame {
    ComputerGraphics(){
        this.setSize(500,500);
        this.setTitle("Computer Graphics");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setFont(new Font("Times New Roman",Font.PLAIN,20));
        g.setColor(Color.red);
        g.drawString("Computer Graphic", 100, 50);
    }
    public static void main(String [] args){
        new ComputerGraphics();
    }
}
