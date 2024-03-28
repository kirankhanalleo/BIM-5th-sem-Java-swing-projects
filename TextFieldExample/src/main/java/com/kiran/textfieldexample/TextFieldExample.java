/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.textfieldexample;

/**
 *
 * @author Kiran
 */
import java.awt.*;
public class TextFieldExample {
    
    TextFieldExample(){
        Frame f = new Frame("TextField Example");
        Label lbl = new Label("Name: ");
        lbl.setBounds(20,50,70,20);
        TextField txf = new TextField();
        txf.setBounds(90,50,100,20);
        
        Label lbl1 = new Label("Comment:");
        lbl1.setBounds(20,110,70,20);
        TextArea ta = new TextArea("",5,120,TextArea.SCROLLBARS_VERTICAL_ONLY);
        ta.setBounds(90,110,100,100);
        
        Button b1 = new Button("OK");
        Button b2 = new Button("Cancel");
        b1.setBounds(40,240,50,20);
        b2.setBounds(140,240,50,20);
        f.add(lbl);
        f.add(txf);
        f.add(lbl1);
        f.add(ta);
        f.add(b1);
        f.add(b2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TextFieldExample();
    }
}
