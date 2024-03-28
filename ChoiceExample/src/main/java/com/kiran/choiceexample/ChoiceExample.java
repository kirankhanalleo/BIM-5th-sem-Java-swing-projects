/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.choiceexample;

/**
 *
 * @author Kiran
 */
import java.awt.*;
public class ChoiceExample {
    ChoiceExample(){
        Frame f = new Frame("Choice");
        Choice ch = new Choice();
        Label lb = new Label("Pick your favourite team: ");
        
        lb.setBounds(50,60,250,50);
        ch.add("FC Barcelona");
        ch.add("Real Madrid");
        ch.add("Manchester United");
        ch.add("Manchester City");
        ch.add("Liverpool");
        ch.add("Bayern Munich");
        ch.add("Paris Saint German");
        ch.add("Juventus");
        ch.add("Inter Milan");
        ch.add("AC Milan");
        ch.setBounds(50,120,200,50);
        
        f.add(lb);
        f.add(ch);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new ChoiceExample();
    }
}
