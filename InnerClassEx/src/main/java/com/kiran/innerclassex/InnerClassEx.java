/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.innerclassex;

/**
 *
 * @author Kiran
 */
import java.awt.*;
import java.awt.event.*;

public class InnerClassEx implements ActionListener {
    Label l1 = new Label("String length Calculator");
    Label l2 =new Label("Enter a string : ");
    Label l3 = new Label();
    TextField t = new TextField();
    Button b = new Button("Find Lenghth");
    Frame f = new Frame("Kiran-10413/19");
    public void init() {
        f.setSize(500,500);
        f.setLayout(null);
        l1.setBounds(50,50,200,20);
        l2.setBounds(50,70,200,20);
        t.setBounds(50,90,300,40);
        b.setBounds(50,150,100,30);
        b.addActionListener(this);
        l3.setBounds(50,200,300,20);
}
    public void start(){
        f.add(l1);f.add(l2);f.add(t);f.add(b);f.add(l3);
    }
    public void actionPerformed(ActionEvent ae){
    String s= t.getText();  
    int len = s.length();
    l3.setText("The length of given string is = "+ len);
    }
}
