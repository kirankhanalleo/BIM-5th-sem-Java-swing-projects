/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.drawpixelexample;

/**
 *
 * @author Kiran
 */
import java.awt.*;
public class DrawPixelExample extends Frame {
    Frame f;
    final public int PIXELTHICKNESS = 20;
    int x=0;
    int y =0;
    DrawPixelExample(){
        f = new Frame("Kiran-10413/19");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        g.drawString("", 0, 0);
    }
    public void draw(int x, int y){
        this.y =y;
        Graphics g = this.getGraphics();
        g.fillOval(x,y,PIXELTHICKNESS,PIXELTHICKNESS);
        this.paint(g);
    }
    public static void main(String[] args) {
        DrawPixelExample dpe = new DrawPixelExample();
        dpe.draw(60,60);
    }
}
