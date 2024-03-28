/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.swingexamples;

/**
 *
 * @author Kiran
 */
import java.awt.Font;
import javax.swing.*;
public class JFrameExample {
    JFrameExample(){
    JFrame jf= new JFrame("JFrame Example");
    jf.setSize(400,400);
    jf.setLayout(null);
    JLabel JL1 = new JLabel("Hello World!");
    JL1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    JLabel JL2 = new JLabel("I am Java Swing");
    JL2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    JL1.setBounds(50,40,200,40);
    JL2.setBounds(50,90,200,40);
    jf.add(JL1);
    jf.add(JL2);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String [] args){
        new JFrameExample();
    }
}
