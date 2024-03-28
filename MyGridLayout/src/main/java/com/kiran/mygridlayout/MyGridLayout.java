/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.mygridlayout;

/**
 *
 * @author Kiran
 */
import java.awt.*;
public class MyGridLayout extends Frame {
    Button b1,b2,b3,b4;
    MyGridLayout(){
        b1 = new Button("Button1");
        b2 = new Button("Button2");
        b3 = new Button("Button3");
        b4 = new Button("Button4");
        
        this.setSize(300,300);
        this.setLayout(new GridLayout(2,2));
        
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
       
        this.setTitle("Grid Layout");
        this.setVisible(true);
    }
    public static void main(String[] args) {
       new MyGridLayout();
    }
}
