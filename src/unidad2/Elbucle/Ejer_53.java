/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 * Pintar un triángulo de asteriscos que decrezca 
 * @author javie
 */
public class Ejer_53 {
    
      public static void main(String[] args) {
    
              int h;
          
                Scanner entrada=new Scanner(System.in);
                System.out.println("Introduzcal a altura de la figura");
                h=entrada.nextInt();
    
                
                for(int i=h; i>0; i--){
                    
                    for(int j=1; j<=h; j++)
                        
                    if(i>j)System.out.print("*");
                    
                    System.out.println();
                }
    }
}
