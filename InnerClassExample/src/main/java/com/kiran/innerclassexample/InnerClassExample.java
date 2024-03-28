/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.innerclassexample;

/**
 *
 * @author Kiran
 */
import java.awt.*;
import java.awt.event.*;
public class InnerClassExample {
    TextField tf;
    Button b;
    Frame f;
    InnerClassExample(){
        f = new Frame("Kiran-10413/19");
        tf=new TextField();
        tf.setBounds(40,90,170,20);
        b=new Button("Click to change");
        b.setBounds(40,120,100,30);
        ActionListener ac;
        ac = new ActionListener(){
            public void actionPerformed(ActionEvent e){
            tf.setText("Hello World");
        }
    };
        b.addActionListener(ac);
        f.add(b);
        f.add(tf);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
}
public static void main(String args[]){
    new InnerClassExample();
    }
}
class OtherClass implements ActionListener{
    InnerClassExample obj;
    OtherClass(InnerClassExample obj){
        this.obj=obj;
    }
    @Override
    public void actionPerformed(ActionEvent e){
    obj.tf.setText("welcome");
    }
}
