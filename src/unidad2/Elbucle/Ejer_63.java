/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *Dibujar dos pirámides separadas por un espacio
 * @author javie
 */
public class Ejer_63 {
    
      public static void main(String[] args) {
              
              int h;
              int h2;
              
                Scanner entrada=new Scanner(System.in);
                System.out.println("Introduzca la altura de la primera pirámide");
                h=entrada.nextInt();
    
                while(h<3){
                    
                    System.out.println("la Altura debe ser mayor o igual de 3. Inserte");
                    h=entrada.nextInt();
    
                 }
                
                System.out.println("Introduzca la altura de la primera pirámide");
                h2=entrada.nextInt();
    
                while(h2<3){
                    
                    System.out.println("la Altura debe ser mayor o igual de 3. Inserte");
                    h2=entrada.nextInt();
                 }
                
                
               if(h>h2){ 
          
               for(int i=1; i<=h; i++){
                  
          
                  for(int j=1; j<2*h ; j++){
                      
                      System.out.print(j>h-i&&j<h+i? "*":" ");
              
             
                  }
                  
                  for (int j=1;j<=1;j++)
                  System.out.print(" ");
                  
                  int h3=h-h2;
                  if(i>h-h2){
                  for(int j=1; j<2*h2; j++){
                      
                         System.out.print(j>h2-i+h3&&j<h2+i-h3? "*":" ");
                  }
                  }
                   System.out.println();
                }
                 // int an=(2*h-1)+(2*h2-1);
                  //for (int j=2*h; j<=an; j++){
               }
                  
              }
                     
      }
    

              
          
                  