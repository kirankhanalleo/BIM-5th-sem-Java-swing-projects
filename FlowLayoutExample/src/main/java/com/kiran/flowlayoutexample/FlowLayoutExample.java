/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.flowlayoutexample;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 *
 * @author Kiran
 */
public class FlowLayoutExample {
    Frame f;
    Button b1,b2,b3;
    public FlowLayoutExample(){
        f = new Frame("Flow Layout");
        f.setSize(300,300);
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,50,50);
        f.setLayout(fl);
        //f.setLayout(new FlowLayout(how, vspace,hspace));
        // f.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
        
        
        b1 =  new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        
        f.setVisible(true);
    }
    public static void main(String [] args){
        new FlowLayoutExample();
    }
}

