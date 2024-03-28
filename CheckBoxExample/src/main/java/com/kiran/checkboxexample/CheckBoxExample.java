/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.checkboxexample;

/**
 *
 * @author Kiran
 */
import java.awt.*;
public class CheckBoxExample {
    CheckBoxExample(){
        Frame f = new Frame("Checkbox");
        Label lbl = new Label("Select a course");
        lbl.setBounds(10,10,50,20);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("BIM",cbg,true);
        cb1.setBounds(10,40,50,20);
        Checkbox cb2 = new Checkbox("BBA",cbg,false);
        cb2.setBounds(10,70,50,20);
        Checkbox cb3 = new Checkbox("BBM",cbg,false);
        cb3.setBounds(10,100,50,20);
        f.add(lbl);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.remove(cb3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new CheckBoxExample();
    }
}
