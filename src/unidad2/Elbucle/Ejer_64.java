/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *rectángulo hueco de 6 ancho x 3 alto
 * menu con argrandarlo, achcarlo, cambiar orientacion, salir
 * Agrandarlo incrementa en 1 la anchura y la altura
 * Decrementarlo en 1
 * Cambio de orientacion es altura igual a anchura y viceversa
 * Valor mínimo de anchura o altura es 2
 * @author javie
 */
public class Ejer_64 {
    
     public static void main(String[] args) {
              
              int opcion;
              
              
                Scanner entrada=new Scanner(System.in);
                System.out.println("Introduzca lo que desea hacer con el rectángulo");
                
            do{
                System.out.println("1. Agrandarlo:  ");
                System.out.println("2. Achicarlo:  ");
                System.out.println("3. Cambiar la orientación:  ");
                System.out.println("4. Salir:  ");
                System.out.println("--> ");
                opcion=entrada.nextInt();
                
            } while(opcion!=4);
                
     }
    
}
