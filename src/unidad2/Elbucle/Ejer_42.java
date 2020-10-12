/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 * Se pide un número entero por teclado y muestra  los 5 números
 * consecutivos. Y debe indicarse junto a estos números si es primo
 * @author javie
 */
public class Ejer_42 {
    
    public static void main(String[] args) {
            
            int n;         
            Scanner entrada=new Scanner(System.in);
            System.out.println("Inserte un número");
            n=entrada.nextInt();
 
            for(int i=n+1; i<n+6; i++){
                int count=0;
                for(int j=1; j<=i; j++){
                   
                    if(i%j==0)count++;
                    
                }
            System.out.println(i + (count>2 ? " no es primo": " es primo"));
                    
            }
   }
}
