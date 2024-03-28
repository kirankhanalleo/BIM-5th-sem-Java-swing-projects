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
public class WindowEventExample extends Frame implements WindowListener, ActionListener {
    Button b1;
    WindowEventExample(){
        this.setTitle("Kiran-10413/19");
        this.setSize(400,600);
        b1 = new Button("Close Window");
        b1.setBounds(50,20,100,100);
        this.add(b1);
        b1.addActionListener(this);
        b1.setActionCommand("Close Window");
        this.addWindowListener(this);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new WindowEventExample();
    }
    @Override
    public void windowActivated(WindowEvent we){
        System.out.println("Window Activated");
    }
    @Override
    public void windowDeactivated(WindowEvent we){
        System.out.println("Window deActivated");
    }
    @Override
    public void windowIconified(WindowEvent we){
        System.out.println("Window iconified");
    }
    @Override
    public void windowDeiconified(WindowEvent we){
        System.out.println("Window deiconified");
    }
    @Override
    public void windowClosed(WindowEvent we){
        System.out.println("Window closed");
    }
    @Override
    public void windowClosing(WindowEvent we){
        System.out.println("Window closing");
    }
    @Override
    public void windowOpened(WindowEvent we){
        System.out.println("Window opened");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getActionCommand().equals("Close Window")){
        this.dispose();
     }
    }
}
