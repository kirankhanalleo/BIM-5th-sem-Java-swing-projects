package com.kiran.computergraphics;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;

public class Shearing2D extends JFrame implements ActionListener {
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    JLabel l1,l2,l3,l4,l5,l6,signature;
    JButton jb;
    Graphics g;
    public Shearing2D(){
        this.setTitle("2D Shearing");
        this.setSize(800,700);
        signature=new JLabel("Kiran Khanal | NCC BIM");
        signature.setBounds(10,600,200,20);
        l1=new JLabel("X1");
        l1.setBounds(10,15,20,25);
        tf1=new JTextField();
        tf1.setBounds(40,15,50,25);
        l2=new JLabel("Y1");
        l2.setBounds(120,15,20,25);
        tf2=new JTextField();
        tf2.setBounds(150,15,50,25);
        l3=new JLabel("X2");
        l3.setBounds(230,15,20,25);
        tf3=new JTextField();
        tf3.setBounds(260,15,50,25);
        l4=new JLabel("Y2");
        l4.setBounds(340,15,20,25);
        tf4=new JTextField();
        tf4.setBounds(370,15,50,25);
        l5=new JLabel("Shx");
        l5.setBounds(10,50,25,25);
        tf5=new JTextField();
        tf5.setBounds(40,50,50,25);
        l6=new JLabel("Shy");
        l6.setBounds(120,50,25,25);
        tf6=new JTextField();
        tf6.setBounds(150,50,50,25);
        jb=new JButton("Shear Object");
        jb.setBounds(260,50,190,25);
        jb.addActionListener(this);
        this.add(l1); this.add(l2); this.add(l3); this.add(l4);
        this.add(l5); this.add(l6); this.add(tf5); this.add(tf6);
        this.add(tf1); this.add(tf2); this.add(tf3); this.add(tf4);
        this.add(signature); this.add(jb);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        g=this.getGraphics();
    }
    void shear(int[][] orgMatrix, int[][] shearVector) {
        int[][] finalMatrix = new int[3][4];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    finalMatrix[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    finalMatrix[i][j] += shearVector[i][k] * orgMatrix[k][j];
                }
            }
        }
g.drawLine(finalMatrix[0][0], finalMatrix[1][0], finalMatrix[0][1], finalMatrix[1][1]);
g.drawLine(finalMatrix[0][1], finalMatrix[1][1], finalMatrix[0][2], finalMatrix[1][2]);
g.drawLine(finalMatrix[0][2], finalMatrix[1][2], finalMatrix[0][3], finalMatrix[1][3]);
g.drawLine(finalMatrix[0][3], finalMatrix[1][3], finalMatrix[0][0], finalMatrix[1][0]);
}
   @Override
    public void actionPerformed(ActionEvent e) {
        int x1=Integer.parseInt(tf1.getText());
        int y1=Integer.parseInt(tf2.getText());
        int x2=Integer.parseInt(tf3.getText());
        int y2=Integer.parseInt(tf4.getText());
        int shx=Integer.parseInt(tf5.getText());
        int shy=Integer.parseInt(tf6.getText());
        int[][] orgMatrix = {{x1, x2, x2, x1}, {y1, y1, y2, y2}, {1, 1, 1, 1}};
        g.drawLine(x1, y1, x2, y1);
        g.drawLine(x2, y1, x2, y2);
        g.drawLine(x2, y2, x1, y2);
        g.drawLine(x1, y2, x1, y1);
        g.drawString("Real Object", 250, 350);
        int[][] shearVector = {{1, shx, 0}, {0, 1, 0}, {0, 0, 1}};
        shear(orgMatrix, shearVector);
        g.drawString("X-direction Shearing", 760, 350);
        shearVector = new int[][]{{1, 0, 0}, {shy, 1, 0}, {0, 0, 1}};
        shear(orgMatrix, shearVector);
        g.drawString("Y-direction Shearing", 100, 560);
        shearVector = new int[][]{{1, shx, 0}, {shy, 1, 0}, {0, 0, 1}};
        shear(orgMatrix, shearVector);
        g.drawString("XY-direction Shearing", 500, 560);
}
    public static void main(String[] args) {
        new Shearing2D();
    }
} 
        