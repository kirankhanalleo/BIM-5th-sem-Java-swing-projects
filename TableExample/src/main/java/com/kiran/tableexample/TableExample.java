/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiran.tableexample;

/**
 *
 * @author Kiran
 */
import javax.swing.*;
public class TableExample extends JFrame {
    JTable tbl;
    JScrollPane jsp;
    String header[]={"S.N","Name","Marks"};
    String data[][]={{"1","Kiran","100"},
        {"2","Manjul","105"},{"3","Nishan","90"},
        {"4","Daya","100"}
    };
    public TableExample(){
        this.setTitle("Table Example");
        this.setSize(600,500);
        this.setLayout(null);
        tbl=new JTable(data,header);
        tbl.setBounds(10,50,500,40);
        jsp = new JScrollPane(tbl);
        jsp.setBounds(10,10,520,220);
        this.add(jsp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new TableExample();
    }
}
