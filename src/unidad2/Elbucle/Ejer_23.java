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
public class Ejer_23 {
    
        public static void main(String[] args) {
           
              int max=10000;
              int n;
              int suma=0;
              int contador=0;
              
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte números");
         
              while(suma<max){
                   n=entrada.nextInt();
                   if(suma+n<=max){
                       suma+=n;
                       contador++;
                   }
                   else break;
              }
              System.out.println("La suma es " +suma);
              System.out.print("La media es "+(double)suma/contador);
              
    
        }
}
