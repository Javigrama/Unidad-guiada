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
public class Ejer_24bis {
    
        public static void main(String[] args) {
            
            int n=1; //números que serán escritos
            int h;
         
            Scanner entrada=new Scanner(System.in);
            System.out.println("Inserte un número");
            h=entrada.nextInt();
            int espacios=h-1;
            
            for(int i=1; i<=h; i++){
                
                for (int j=1; j<=espacios; j++)
                    
                    System.out.print(" ");
                
                 for(int j=1; j<=n; j++){
                      
                      System.out.print(j);
                  }
                 
                for(int j=1; j<n; j++)
                    System.out.print(j);
                 
                espacios--;
                n++;
                System.out.println();
            }
            
        }
    
}
