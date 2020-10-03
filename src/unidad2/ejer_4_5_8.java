/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ejer_4_5_8 {
    
     public static void main(String[] args) {
         
         System.out.println("Ingrese 10 números");
         int positivo=0;
         int negativo=0;
         int nulo=0;
         Scanner entrada=new Scanner(System.in);
         
         for(int i=10; i>0; i--){
             
             int numero=entrada.nextInt();
             if(numero>0)positivo++;        
             else if(numero<0)negativo++; 
             else nulo++;
             
             
         }
         
         System.out.println("positivos = "+ positivo
                 +"\nnegativos = "+ negativo
                 +"\nnulos= "+ nulo);
         
     }
    
}
