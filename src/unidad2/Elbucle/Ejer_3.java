/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

/**
 *
 * @author javie
 */
public class Ejer_3 {
    
     //Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do while
     public static void main(String[] args){
         
         
         int i=0;
         do{
             System.out.print(i%5==0? i+" ": "");
             i++;
         }while(i<=100);
         
     }
}
