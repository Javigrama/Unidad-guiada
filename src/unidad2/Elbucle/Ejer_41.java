/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 * Averiguar cuántos dígitos pares e impares hay en un número
 * @author javie
 */
public class Ejer_41 {
    
     public static void main(String[] args) {
         
     
            long n;
            int impares=0;
            int pares=0;
            int digito;
            int exp=1;
            
            Scanner entrada=new Scanner(System.in);
            System.out.println("Inserte un número");
            n=entrada.nextLong();
    
            while(n>0){
                
                digito=(int)n%10;
                n/=10;
                if(digito%2==0) pares++;
                else impares++;
                
            }
            
            System.out.println("El número tiene "+ pares+ (pares!=1? " dígitos pares": " dígito par")+ " y "
            + impares+ (impares!=1? " dígitos impares": " dígito impar"));
//            System.out.println("El número tiene "+ impares+ (impares!=1? " dígitos impares": " dígito impar"));
            entrada.close();
                
    }
}
