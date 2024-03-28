/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.actioneventexample;

/**
 *
 * @author Kiran
 */
import java.awt.*;
import java.awt.event.*;
public class ActionEventExample extends Frame implements ActionListener {
		Frame f;
		Dialog dl;
		ActionEventExample(){
			f = new Frame("ActionEvent Example");
			f.setSize(400,300);
			Button b= new Button("Click here");
			b.setBounds(150,150,80,30);
			b.addActionListener(this);
			
			dl= new Dialog(f,"DialogBox Example",true);
			dl.setSize(400,150);
			Button b1,b2,b3;
			Label l= new Label("Do you want to close the window?");
			b1= new Button("Yes");
			b1.addActionListener(this);
			b2= new Button("No");
			b3= new Button("Cancel");
					
			dl.add(l);
			l.setBounds(100,50,200,20);
			dl.add(b1);
			b1.setBounds(50,100,50,20);
			dl.add(b2);
			b2.setBounds(150,100,50,20);
			dl.add(b3);
			b3.setBounds(250,100,50,20);
			
			
			
			f.add(b);
			f.setLayout(null);
			f.setVisible(true);
		}
	public static void main(String[] args) {
            new ActionEventExample();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
			dl.setLayout(null);
			dl.setVisible(true);
			f.dispose();
	}

}