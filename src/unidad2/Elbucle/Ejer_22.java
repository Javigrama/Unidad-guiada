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
public class Ejer_22 {
    
     public static void main(String[] args) {
           
              int n; 
              Scanner entrada=new Scanner(System.in);
              
              for(int i=2; i<=100; i++)
                  if(esPrimo(i)) System.out.print(i+" ");
             
    
    }
     
      public static boolean esPrimo(int n){
             
           int contador = 0;
 
            for(int i = 1; i<= n; i++){
                if((n % i)==0)  contador++;
            }
            if(contador==2)return true;
            return false;
      }
            
 
}
