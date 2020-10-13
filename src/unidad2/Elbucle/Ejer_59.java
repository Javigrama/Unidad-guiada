/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *Pintar un árbol de navidad. Se pide la altura que debe ser >=4
 * El tronco es una Y y la estrella un asterisco
 * @author javie
 */
public class Ejer_59 {
    
      public static void main(String[] args) {
    
              int altura;
              int h;
          
                Scanner entrada=new Scanner(System.in);
                System.out.println("Introduzca la altura de la figura");
                altura=entrada.nextInt();
    
                while(altura<4){
                    
                    System.out.println("la Altura debe ser mayor de 4. Inserte");
                    altura=entrada.nextInt();
                }
              
               h=altura-2;
               
                      for(int j=1; j<=h*2+1; j++){
                          if(j==h)System.out.print("*");
                          else System.out.print(" ");
                      }
                          System.out.println();
                
                        for(int i=h; i>1; i--){
                            for(int j=1; j<=h; j++){
                            
                                if(i==j)System.out.print("^");
                                else System.out.print(" ");
                            }
                            
                            for(int j=h-1; j>=1; j--){
                                if(i==j)System.out.print("^");
                                else System.out.print(" ");
                            
                             }
                           
                        System.out.println();
                        }
                      for(int j=1; j<=h*2-1; j++)
                              System.out.print("^");
                        System.out.println();
                      
                      for(int j=1; j<=h*2+1; j++){
                          if(j==h)System.out.print("Y");
                          else System.out.print(" ");
                      }
                
                entrada.close();
    }
    
}
