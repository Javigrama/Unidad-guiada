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
public class Ejer_56 {
    
    
       public static void main(String[] args) {
    
              int h;
          
                Scanner entrada=new Scanner(System.in);
                System.out.println("Introduzca la altura de la figura");
                h=entrada.nextInt();
    
                
                for(int i=1; i<=h; i++){
                    
                    for(int j=1; j<=h; j++)
                        
                    if(j>i)System.out.print("*");
                    else System.out.print(" ");
                    
                    System.out.println();
                }
                entrada.close();
       }
}
