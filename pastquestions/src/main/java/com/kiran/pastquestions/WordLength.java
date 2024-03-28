/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.pastquestions;

/**
 *
 * @author Kiran
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class WordLength extends Applet implements ActionListener{
    Label l1 = new Label("Word Length Checker");
    Label l2 = new Label("Enter a word");
    Label l3 = new Label();
    TextField tf = new TextField();
    Button b = new Button("CHECK");
    
    public void init(){
        setSize(450,450);
        setLayout(null);
        l1.setBounds(40,40,220,30);
        l2.setBounds(40,80,220,30);
        tf.setBounds(40,120,200,40);
        b.setBounds(250,120,50,40);
        b.addActionListener(this);
    }
    public void start(){
        add(l1);
        add(l2);
        add(l3);
        add(tf);
        add(b);
    }
    public void actionPerformed(ActionEvent e){
        String word = tf.getText();
        int length = word.length();
        if(length==5){
            l3.setText("The word"+word+"is of length 5");
        }
        else{
            l3.setText("The word"+word+"is not of length 5");
        }
    }
<Applet code="WordLength" height="400px" width="400px"></Applet>
}