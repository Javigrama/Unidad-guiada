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
public class Ejer_17 {
    
     public static void main(String[] args) {
         
             long n;
            
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un entero positivo");
              n=entrada.nextLong();
              
              while(n<=0){
                  System.out.println("Debe ser positivo y entero. Inserte");
                   n=entrada.nextLong();
              }
              
              for(int i=0; i<100; i++){
                  
                  n+=n+1;
              
               System.out.println(n);}
              entrada.close();
     }
    
    
}
