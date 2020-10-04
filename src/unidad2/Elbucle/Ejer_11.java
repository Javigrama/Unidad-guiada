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
public class Ejer_11 {
    
    public static void main(String[] args) {
        
             int numero;
             Scanner entrada=new Scanner(System.in);
             System.out.println("Introduzca un número");
             numero=entrada.nextInt();
             
             
             System.out.printf("%-10s%10s%10s\n", "Número", "Cuadrado", "Cubo");
             for(int i=1; i<=5; i++){
                 System.out.printf("%-10d%10.1f%10.1f\n", (numero+i), Math.pow((numero+i), 2), Math.pow((numero+i), 3));
             }
    }
    
}
