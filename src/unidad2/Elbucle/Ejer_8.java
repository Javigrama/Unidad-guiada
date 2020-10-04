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
public class Ejer_8 {
    
    
     public static void main(String[] args) {
         
           int n;
           Scanner entrada=new Scanner(System.in);
           System.out.println("Introduzca el número para el que desea hallar la tabla de multiplicar");
           n=entrada.nextInt();
           
           for(int i=1; i<=10; i++)
           System.out.println(i+" x "+n+" = "+(i*n));
     
                   
     }
    
}
