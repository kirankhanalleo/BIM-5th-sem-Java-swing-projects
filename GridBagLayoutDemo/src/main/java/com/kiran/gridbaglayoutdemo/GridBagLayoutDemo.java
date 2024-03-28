/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.gridbaglayoutdemo;

/**
 *
 * @author Kiran
 */
import java.awt.*;
public class GridBagLayoutDemo extends Frame {
    Button b1,b2,b3,b4,b5;
    GridBagLayout gbl;
    GridBagConstraints gbc;
    Insets ins;
    GridBagLayoutDemo(){
        this.setTitle("GridBag Layout");
        this.setSize(300,200);
        
        gbl = new GridBagLayout();
        gbc = new GridBagConstraints();
        ins = new Insets (10,10,5,5);
        
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");
        this.setLayout(gbl);
        
        gbc.insets=ins;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(b1,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(b2,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 0;
        this.add(b3,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(b4,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        this.add(b5,gbc);
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
       new GridBagLayoutDemo();
    }
}
