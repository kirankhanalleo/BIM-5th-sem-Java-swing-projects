/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.listexample;

/**
 *
 * @author Kiran
 */
import java.awt.*;
public class ListExample {
    
    ListExample(){
       Frame f= new Frame("Lists");
       Label label1 = new Label("Select program you wish to study");
       label1.setBounds(100,50,250,20);
       
       List list1 = new List();
       list1.setBounds(100,100,95,100);
       list1.add("BIM");
       list1.add("BBA");
       list1.add("BBM");
       list1.add("BBA-F");
       list1.add("BSc.CSIT");
       list1.add("BCA");
       list1.add("BIT");
       list1.add("BTech");
       list1.add("BHM");
       list1.add("BTTM");
       f.add(label1);
       f.add(list1);
       f.setSize(400,400);
       f.setLayout(null);
       f.setVisible(true);
    }
    public static void main(String[] args) {
        new ListExample();
    }
}
