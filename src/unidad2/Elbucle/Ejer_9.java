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
            
            int count=1; //damos por sentado que al menos tiene una cifra
            for(long i=1; i<=n; i*=10){ //cada iteracion actualiza la variable elevándo 10 a la iteración
                if(n%i!=0) // si sobra algo cuando dividimos nuestro número por la variable es que es mayor de 10 elevado a la iteración y sumamos uno al contador
                     count++;}
            
            System.out.println("El número tiene "+count+  (count>1?" dígitos": " dígito"));
            
            
           /* String n="";
            Scanner entrada=new Scanner(System.in);
            System.out.println("Introduzca un número");
            n=entrada.nextLine();
            System.out.println("El número tiene "+n.length()+ " dígitos");*/
            
        }
}
