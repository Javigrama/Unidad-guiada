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
public class Ejer_54 {
    
    
     public static void main(String[] args) {
    
              int h;
          
                Scanner entrada=new Scanner(System.in);
                System.out.println("Introduzca la altura de la figura");
                h=entrada.nextInt();
    
                
                for(int i=h; i>0; i--){
                    
                    for(int j=1; j<=i; j++)
                        if(i==h)System.out.print("*");
                    
                        else{
   
                    if(j==1||j==i)System.out.print("*");
                    else System.out.print(" ");}
                    
                    System.out.println();
                }
                entrada.close();
    }
}
