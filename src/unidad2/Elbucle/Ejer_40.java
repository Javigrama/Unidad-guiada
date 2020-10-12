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
public class Ejer_40 {
    
     public static void main(String[] args) {
            int h;
         
            
            Scanner entrada=new Scanner(System.in);
            System.out.println("Inserte un número impar mayor o igual que 3");
            h=entrada.nextInt();
            if(h<3||h%2==0) System.out.println("El número no es impar o/y no es mayor de 3");
            
            else {
                
                  for(int i=1; i<=h/2+1; i++){
                      
                      for(int j=h/2+1; j>0; j--){
                        if(j==i) System.out.print("* ");
                        else System.out.print("  ");}
                 
                      
                      for(int j=2; j<=h/2+1; j++){
                        if(j==i) System.out.print("* ");
                        else System.out.print("  ");}
                      
                        System.out.println();
                      
                  }
                      
                 for(int i=h/2; i>0; i--){
                      
                      for(int j=h/2+1; j>0; j--){
                        if(j==i) System.out.print("* ");
                        else System.out.print("  ");}
                 
                      
                      for(int j=2; j<=h/2+1; j++){
                        if(j==i) System.out.print("* ");
                        else System.out.print("  ");}
                      
                        System.out.println();
            
                  }
                
   
                }
                entrada.close();
    }
    
}
