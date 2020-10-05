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
public class Ejer_24 {
    
        public static void main(String[] args) {
          
              int h;
                 
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un número");
              h=entrada.nextInt();
              
              for(int i=1; i<=h; i++){
                  
                  if(i>1) System.out.println();
                  for(int j=1; j<2*h ; j++){
                      
                     System.out.print(j>h-i&&j<h+i? i:" ");
                      
                  
                  }
              
              
              
              /*
                 for(int i=0; i<h; i++){
              
                  if(i>0)
                System.out.println();
                
                    for(int j=1; j<h*2; j++)
                  
                  System.out.print(j>=h-i&&j<=h+i? i+1:" ");             
           
                   */   
                  }
              }
         
    
}
