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
public class ejer_4_5_2 {
    
     static Scanner entrada=new Scanner(System.in);
      
        public static void main(String[] args) {
            
            
       
            int i;
            int count =0;
            int producto=1;
            
            
             System.out.println("Inserte números enteros positivos para encontrar "
                    + "su producto.Para terminar inserte un número negativo");
           
             i=entrada.nextInt();
             
            while(i>=0){
            
            producto*=i;
             count++;
              System.out.println("Inserte...");
              
                  i=entrada.nextInt();
                
            }
            
            System.out.println("El producto de los números es "+ producto);
            System.out.println("Se han introducido " +count+" números");
            //--------------------------------------------
       
          
        }
        
}
