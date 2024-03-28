/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.eventhandlingexample;

/**
 *
 * @author Kiran
 */
import java.awt.*;
import java.awt.event.*;
public class KeyEventExample extends Frame implements KeyListener {
    Frame f;
    Label l;
    TextArea t;
    KeyEventExample(){
        f = new Frame("Kiran-10413/19");
        f.setSize(400,200);
        
        l = new Label("Type Here:");
        l.setBounds(80,100,80,20);
        
        t= new TextArea();
        t.setBounds(200,100,150,20);
        t.addKeyListener(this);
        
        f.add(l);
        f.add(t);
        
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String [] args){
        new KeyEventExample();
    }
    @Override
    public void keyReleased(KeyEvent ke){
        l.setText("Key Released");
    }
    @Override
    public void keyTyped(KeyEvent ke){
        char ch = ke.getKeyChar();
        l.setText("Key Pressed ");
        System.out.println("Key is"+ch);
    }
    @Override
    public void keyPressed(KeyEvent ke){
        l.setText("Key Pressed");
    }
}
/*
int key = ke.getKeyCode();
*/