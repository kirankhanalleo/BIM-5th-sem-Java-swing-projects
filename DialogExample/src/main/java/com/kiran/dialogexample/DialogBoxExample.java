/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.dialogexample;

/**
 *
 * @author Kiran
 */
import java.awt.*;
public class DialogBoxExample {
    
    DialogBoxExample(){
        Frame f = new Frame("Kiran - 10413/19");
        Dialog d = new Dialog(f,"Dialog Example",true);
        Button b1,b2,b3;
        Label l = new Label("Do you want to save ?");
        b1 = new Button("YES");
        b2 = new Button("NO");
        b3 = new Button("CANCEL");
        l.setBounds(20,35,200,30);
        d.add(l);
        b1.setBounds(20,75,60,20);
        d.add(b1);
        b2.setBounds(90,75,60,20);
        d.add(b2);
        b3.setBounds(160,75,60,20);
        d.add(b3);
        d.setLayout(null);
//        f.setSize(400,400);
//        f.setVisible(true);
        d.setSize(250,130);
        d.setVisible(true);
    }
    
    public static void main(String[] args) {
        new DialogBoxExample();
    }
}
