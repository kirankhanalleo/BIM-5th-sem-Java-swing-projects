/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.innerclassexample;

/**
 *
 * @author Kiran
 */
import java.awt.event.*;
class OuterClass implements ActionListener{
    InnerClassExample obj;
    OuterClass(InnerClassExample obj){
        this.obj=obj;
    }
    @Override
    public void actionPerformed(ActionEvent e){
    obj.tf.setText("welcome");
    }
}
