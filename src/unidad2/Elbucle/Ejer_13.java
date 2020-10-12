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
public class Ejer_13 {
    
     public static void main(String[] args) {
         
           int n=10;
           int numero;
           int negativos=0;
           int positivos=0;
           
             Scanner entrada=new Scanner(System.in);
             System.out.println("Introduzca 10 números enteros");
             while(n>0){
             numero=entrada.nextInt();
             if(numero<0) negativos++;
             else positivos++;
             n--;}
             
         System.out.println("Hay "+ negativos +" números negativos y "+ positivos+ " números positivos");
         entrada.close();
     }
          
         
             
    
}
