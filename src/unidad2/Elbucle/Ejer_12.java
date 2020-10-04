/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejer_12 {
    
      public static void main(String[] args) {
          
           int n;
             Scanner entrada=new Scanner(System.in);
             System.out.println("Introduzca un número");
             n=entrada.nextInt();
             
             
                 int a=0;
                 int b=1;
                 int r=a+b;
             for(int i=0; i<n;i++){
               
             
               if(i==0||i==1)System.out.print(i+" ");
               else {System.out.print(a+r +" ");
                 r=a+b;
                 a=b;
                 b=r;}
              
             }
      }
    
}
