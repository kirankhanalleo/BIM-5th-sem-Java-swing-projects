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

public class MouseEventExample extends Frame implements MouseListener {
    MouseEventExample(){
        this.setTitle("Mouse Event Example");
        this.setSize(400,400);
        this.addMouseListener(this);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new MouseEventExample();
    }
    @Override
    public void mouseClicked(MouseEvent me){
        if(me.getButton()== MouseEvent.BUTTON1){
            System.out.println("Left Button has been clicked");
        }
        else if(me.getButton()==MouseEvent.BUTTON2){
            System.out.println("Other Button has been clicked");
        }
        else{
            System.out.println("Right Button has been clicked");
        }
    }
    @Override
    public void mouseEntered(MouseEvent me){
     System.out.println("Mouse Entered");   
    }
    @Override
    public void mouseReleased(MouseEvent me){
        System.out.println("Mouse Released");
    }
    @Override
    public void mouseExited(MouseEvent me){
        System.out.println("Mouse Exited");
    }
    @Override
    public void mousePressed(MouseEvent me){
        System.out.println("Mouse Pressed");
    }
}
