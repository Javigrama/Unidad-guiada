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
public class Ejer_26 {
    
        public static void main(String[] args) {
    
            int n;
            int d;
            int cifras=0;
            Scanner entrada=new Scanner(System.in);
            System.out.println("Introduzca un número");
            n=entrada.nextInt();
            System.out.println("Introduzca un dígito");
            d=entrada.nextInt();
            
             
            for(long i=1; i<=n; i*=10){ 
                     if(n%i>=0) 
                     cifras++;}
            
            for(int i=cifras; i>0; i--){
                
                if(n/(int)(Math.pow(10, cifras-1))==d) {System.out.println( "helo");
                
                cifras--;
                }
            
            
        }
            
            
            
            
        }
    
}
