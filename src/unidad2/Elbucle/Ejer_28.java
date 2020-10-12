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
public class Ejer_28 {
    
     
     public static void main(String[] args) {
    
            int n;
            int factorial=1;
            Scanner entrada=new Scanner(System.in);
            System.out.println("Introduzca un número");
            n=entrada.nextInt();
            
            for(int i=n; i>=1; i--)
                
                factorial*=i;
            
            System.out.println(factorial);
            entrada.close();
    }
}
