/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.outerclassexample;

/**
 *
 * @author Kiran
 */
import java.awt.*;
public class MainClass {
    Frame f;
    Button btn;
    public MainClass(){
        f = new Frame("Kiran-10413/19");
        f.setSize(400,200);
        f.setLayout(null);
        
        OuterClassExample outerListenerObj = new OuterClassExample();
        btn = new Button("Click Me!");
        btn.setBounds(150,80,100,40);
        
        btn.addActionListener(outerListenerObj);
        f.add(btn);
        f.setVisible(true);
    }
    public static void main(String [] args){
        new MainClass();
    }
}
