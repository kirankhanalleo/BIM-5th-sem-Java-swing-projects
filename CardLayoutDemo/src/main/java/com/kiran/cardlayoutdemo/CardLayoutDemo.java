/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.cardlayoutdemo;

/**
 *
 * @author Kiran
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo extends Frame implements ActionListener{
    CardLayout cLayout;
    Button b1, b2,b3,b4,b5;
    public CardLayoutDemo(){
       cLayout = new CardLayout();
       this.setLayout(cLayout);
        
       b1 = new Button("CARD 1");        
       b2 = new Button("CRAD 2");
       b3 = new Button("CARD 3");
       b4 = new Button("CARD 4");
       b5 = new Button("CARD 5");
       
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       
       this.add("a",b1);
       this.add("b",b2);
       this.add("c",b3);
       this.add("d",b4);
       this.add("e",b5);
       
       this.setSize(300,300);
       this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        cLayout.next(this);
    }
    
    public static void main(String [] args){
      CardLayoutDemo cLayout1 =  new CardLayoutDemo();
    }
}