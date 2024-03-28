/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.multipleactioneventexample;

/**
 *
 * @author Kiran
 */
import java.awt.*;
import java.awt.event.*;
public class MultipleActionEventExample extends Frame implements ActionListener {
    Button b1,b2,b3;
    MultipleActionEventExample(){
        b1 = new Button("Yes");
        b1.setBounds(10,50,100,20);
        b1.addActionListener(this);
        b1.setActionCommand("Button 1");
        
        b2 = new Button("No");
        b2.setBounds(120,50,100,20);
        b2.addActionListener(this);
        b2.setActionCommand("Button 2");
        
        b3 = new Button("Cancel");
        b3.setBounds(230,50,100,20);
        b3.addActionListener(this);
        b3.setActionCommand("Button 3");
        
        this.setTitle("Multiple Action Event Example");
        this.setSize(600,200);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MultipleActionEventExample();
    }
    @Override
    public void actionPerformed(ActionEvent e){
     if(e.getActionCommand().equals("Button 1")){
         System.out.println("Yes is pressed");
     }
     else if(e.getActionCommand().equals("Button 2")){
         System.out.println("No is pressed");
     }
     else{
         System.out.println("Cancel is pressed");
         this.dispose();
     }
    }
}
