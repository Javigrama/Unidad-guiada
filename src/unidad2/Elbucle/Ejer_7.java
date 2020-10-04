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
public class Ejer_7 {
    
     public static void main(String[] args) {
         
         int combinacion=1357;
         Scanner entrada=new Scanner(System.in);
         
         System.out.println("Ingrese la combinación de la caja fuerte");
         
         if(entrada.nextInt()==combinacion) System.out.println("La caja fuerte se "
                 + "ha abierto satisfactoriamente");
         else System.out.println("Lo siento, esa no es la combinación");
     }
    
}
