package com.kiran.cardlayoutdemo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kiran
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CardLayoutFrameObject implements ActionListener {
    CardLayout cl;
    Frame f;
    Button b1, b2, b3, b4, b5;
   public CardLayoutFrameObject(){
        f = new Frame("Card Layout Frame Object");
        cl = new CardLayout();
        f.setLayout(cl);
        b1 = new Button("Button1");
        b2 = new Button("Button2");
        b3 = new Button("Button3");
        b4 = new Button("Button4");
        b5 = new Button("Button5");
       
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       
       f.add(b1);
       f.add(b2);
       f.add(b3);
       f.add(b4);
       f.add(b5);
       
       f.setSize(300,300);
       f.setVisible(true);
   }
   @Override
    public void actionPerformed(ActionEvent e) {
        cl.next(f);
    }
   public static void main(String[] args){
       new CardLayoutFrameObject();
   }
}
