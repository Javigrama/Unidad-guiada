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
public class Ejer_16 {
    
       public static void main(String[] args) {
           
              int n;
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un número");
              n=entrada.nextInt();
              
             // esPrimo(n);
            
            if (n==2) System.out.println("El numero es primo");
            else if (n%2==0) System.out.println("El numero no es primo");
            else if(n%2!=0){
                if(n==3||n==5||n==7)  System.out.println("El numero es primo");
                for(int i=3; i*i<=n; i+=2)
                    if(n%i==0)  System.out.println("El numero no es primo");
                    else  System.out.println("El numero es primo");
                
                entrada.close();
            }
            
       }
       
         public static void esPrimo(int n){
             
              int contador = 0;
 
            for(int i = 1; i<= n; i++){
                if((n % i)==0)  contador++;
            }
 
             if(contador <= 2) System.out.println("El numero es primo");
             else System.out.println("El numero no es primo");
             
           
         }
}

