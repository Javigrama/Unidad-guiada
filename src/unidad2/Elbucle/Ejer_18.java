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
public class Ejer_18 {
    
          public static void main(String[] args) {
   
              int n1;
              int n2;
              Scanner entrada=new Scanner(System.in);
                  System.out.println("Inserte un entero");
                    n1=entrada.nextInt();
                  System.out.println("Inserte otro entero distinto");
                    n2=entrada.nextInt();
                    
                    while(n2==n1){
                        
                         System.out.println("El segundo entero debe ser distinto al primero");
                    n2=entrada.nextInt();
                    }
              
              for(int i=n1; i<=n2; i+=7)
                  System.out.print(i+" ");
              entrada.close();
          }
    
}
