/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ejer12_5_2 {
    
        static Scanner entrada=new Scanner(System.in);
         
        public static void main(String[] args) {
            
            System.out.println("Inserte un número");
            int numero= entrada.nextInt();

            System.out.println(numero%2==0 ? "El número es par": "El número es impar");
       
            
            
        }
    
}
