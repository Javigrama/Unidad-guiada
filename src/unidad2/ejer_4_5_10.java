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
public class ejer_4_5_10 {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduzca un número para calcular su factorial");
        int n=entrada.nextInt();
        int factorial=1;
        
        for(int i=n; i>=1; i--)
            factorial*=i;
        
        System.out.println("El factorial de "+ n+ " es "+factorial);
            
        
                
    }
    
}
