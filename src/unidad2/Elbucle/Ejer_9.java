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
public class Ejer_9 {
    
        public static void main(String[] args) {
        
            long n;
            Scanner entrada=new Scanner(System.in);
            System.out.println("Introduzca un número");
            n=entrada.nextLong();
            
            int count=1;
            for(long i=1; i<=n; i*=10){
                if(n%i!=0)
                     count++;}
            
            System.out.println("El número tiene "+count+  "dígitos");
            
            
           /* String n="";
            Scanner entrada=new Scanner(System.in);
            System.out.println("Introduzca un número");
            n=entrada.nextLine();
            System.out.println("El número tiene "+n.length()+ " dígitos");*/
            
        }
}
