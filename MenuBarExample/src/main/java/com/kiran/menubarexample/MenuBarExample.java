/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.menubarexample;

/**
 *
 * @author Kiran
 */
import java.awt.*;
public class MenuBarExample {
    MenuBarExample(){
        Frame f = new Frame("Kiran-10413/19");
        MenuBar mb = new MenuBar();
        Menu m1,m2,m3;
        MenuItem m11,m22,m33,m44,m55,m66;
        
        m1 = new Menu("File");
        m2 = new Menu("Edit");
        m3 = new Menu("Help");
        mb.add(m1); mb.add(m2); mb.add(m3);
        m11 = new MenuItem("Open");
        m22 = new MenuItem("Close");        
        m33 = new MenuItem("Exit");
        m44 = new MenuItem("Undo");
        m55 = new MenuItem("Redo");
        m66 = new MenuItem("About");
        m1.add(m11); m1.add(m22); m1.add(m33);
        m2.add(m44); m2.add(m55); m3.add(m66);
        f.setSize(300,300);
        f.setLayout(null);
        f.setMenuBar(mb);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new MenuBarExample();
    }
}
