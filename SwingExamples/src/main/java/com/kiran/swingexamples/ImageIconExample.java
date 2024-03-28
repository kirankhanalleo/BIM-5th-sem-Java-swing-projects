/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiran.swingexamples;

/**
 *
 * @author Kiran
 */
import javax.swing.*;
public class ImageIconExample {
    JFrame jf;
    ImageIcon ic;
    JLabel jl;
    ImageIconExample(){
        jf = new JFrame("Image Icon Example ");
        jf.setSize(500,500);
        jf.setLayout(null);
        ic = new ImageIcon("E:\\Documents\\Golden jublie scholarship 2019-20\\kirankhanal_photo.jpg");
        jl = new JLabel();
        jl.setBounds(10,10,400,400);
        jl.setIcon(ic);
        jf.add(jl);
        jf.setVisible(true);
    }
    public static void main(String [] args){
        new ImageIconExample();
    }
}
