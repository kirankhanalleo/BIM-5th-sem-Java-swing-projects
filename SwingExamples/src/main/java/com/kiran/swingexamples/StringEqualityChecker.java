/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.swingexamples;

/**
 *
 * @author Kiran
 */
import java.awt.event.*;
import javax.swing.*;
public class StringEqualityChecker implements ActionListener {
    JFrame jf;
    JLabel jl,jl1,jl2;
    JTextField jtf1,jtf2;
    StringEqualityChecker(){
        jf = new JFrame("String Checker");
        jf.setSize(400,400);
        jf.setLayout(null);
        jl = new JLabel("Enter the strings that you want to compare..");
        jl.setBounds(20,30,300,30);
        
        jl1 = new JLabel("String 1 ");
        jl1.setBounds(20,65,100,30);
        
        jl2 = new JLabel("String 2 ");
        jl2.setBounds(20,100,100,30);
        
        jf.add(jl); jf.add(jl1); jf.add(jl2);
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println(e);
    }
    public static void main(String [] args){
        new StringEqualityChecker();
    }
    
}
