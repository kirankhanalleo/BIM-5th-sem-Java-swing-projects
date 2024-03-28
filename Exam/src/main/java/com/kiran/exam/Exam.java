/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.exam;
import javax.swing.*;
import java.awt.*;
public class Exam extends JFrame{
    Exam(){
        this.setTitle("Calculator");
        this.setSize(500,500);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        Insets ins = new Insets (10,10,5,5);
        gbc.insets=ins;
        this.setLayout(gbl);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        JTextField jl=new JTextField("");  
        gbc.gridwidth=4;        
        gbc.ipady=10;
        gbc.gridx=0;
        gbc.gridy=0;
        this.add(jl,gbc);
        gbc.gridwidth=1;
        JButton jb0=new JButton("+");    
        gbc.gridx=0;
        gbc.gridy=1;
        this.add(jb0,gbc);
        
        JButton jb1=new JButton("1");        
        gbc.gridx=1;
        gbc.gridy=1;
        this.add(jb1,gbc);
        
        JButton jb2=new JButton("2");
        gbc.gridx=2;
        gbc.gridy=1;
        this.add(jb2,gbc);
        
        JButton jb3=new JButton("3");
        gbc.gridx=3;
        gbc.gridy=1;
        this.add(jb3,gbc);
        
        JButton jb4=new JButton("-");
        gbc.gridx=0;
        gbc.gridy=2;
        this.add(jb4,gbc);
        JButton jb5=new JButton("4");
        gbc.gridx=1;
        gbc.gridy=2;
        this.add(jb5,gbc);
        JButton jb6=new JButton("5");
        gbc.gridx=2;
        gbc.gridy=2;
        this.add(jb6,gbc);
        JButton jb7=new JButton("6");
        gbc.gridx=3;
        gbc.gridy=2;
        this.add(jb7,gbc);
        JButton jb8=new JButton("*");
        gbc.gridx=0;
        gbc.gridy=3;
        this.add(jb8,gbc);
        JButton jb9=new JButton("7");
        gbc.gridx=1;
        gbc.gridy=3;
        this.add(jb9,gbc);
        JButton jba=new JButton("8");
        gbc.gridx=2;
        gbc.gridy=3;
        this.add(jba,gbc);
        JButton jbs=new JButton("9");   
        gbc.gridx=3;
        gbc.gridy=3;
        this.add(jbs,gbc);
        JButton jbm=new JButton("/");
        gbc.gridx=0;
        gbc.gridy=4;
        this.add(jbm,gbc);
        JButton jbd=new JButton("AC");
        gbc.gridx=1;
        gbc.gridy=4;
        this.add(jbd,gbc);
        JButton jbe=new JButton("0");
        gbc.gridx=2;
        gbc.gridy=4;
        this.add(jbe,gbc);
        JButton jbac=new JButton("=");
        gbc.gridx=3;
        gbc.gridy=4;
        this.add(jbac,gbc);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Exam();
    }
}
