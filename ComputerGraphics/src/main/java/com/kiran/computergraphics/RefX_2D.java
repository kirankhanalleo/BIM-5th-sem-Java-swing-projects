package com.kiran.computergraphics;
import java.util.Scanner;
import java.awt.Graphics;
public class RefX_2D {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int [][] Refx= {
                            {1,0},{0,-1}
                       };
        System.out.print("Enter end points X1 and Y1: ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.print("Enter end points X2 and Y2: ");
        int x2= scan.nextInt();
        int y2 = scan.nextInt();
        int [][] points = {
                            {x1,y1},{x2,y2}
                          };
        for(int i =0;i<Refx.length;i++){
            for(int j=0;j<Refx.length;i++){
                int [][] result = new int[3][3];
                for (int k=0;k<Refx.length;k++){
                    result[i][j] = Refx[i][k]*points[k][j];
                }    
                System.out.println(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
