/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.borderlayoutdemo;

/**
 *
 * @author Kiran
 */
import java.awt.*;
public class BorderLayoutDemo {
    BorderLayoutDemo(){
        Frame f = new Frame("Border Layout");
        Button b1 = new Button("NORTH");
        Button b2 = new Button("SOUTH");
        Button b3 = new Button("EAST");
        Button b4 = new Button("WEST");
        Button b5 = new Button("CENTER");
        f.setLayout(new BorderLayout());
        
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.CENTER);
        
        f.setSize(300,300);
        f.setVisible(true);
    }
    public static void main(String[] args) {
       new BorderLayoutDemo();
    }
}
