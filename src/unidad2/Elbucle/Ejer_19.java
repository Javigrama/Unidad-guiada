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
public class Ejer_19 {
    
    
       public static void main(String[] args) {
           
              int h;
              char c;
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte la altura de la pirámmide");
              h=entrada.nextInt();
              System.out.println("Inserte el carácter con el que desea dibujar la pirámide");
              c=entrada.next().charAt(0);
              
          
              
              for(int i=0; i<h; i++){
              
                  if(i>0)
                System.out.println();
                
                    for(int j=0; j<=h*2; j++)
                  
                   System.out.print(j>=h-i&&j<=h+i? c:" ");
       }
    
}
}
