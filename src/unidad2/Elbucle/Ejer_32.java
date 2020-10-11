/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *Se pide un entero positivo y debe calcularse cuantos pares tiene y cuánto suman
 * dichos pares. Los pares deben mostrarse ordenados de izda a dcha
 * Lo he realizado primero usando la parte entera del número y luego usando módulos
 * @author javie
 */
public class Ejer_32 {
    
    public static void main(String[] args) {
            
            String nuevo="";
            int numero;
           
            int cifras=0;
            int suma =0;
            int exp=1;
            int digito;
           
            
            Scanner entrada=new Scanner(System.in);
            System.out.println("Inserte un número");
            numero=entrada.nextInt();
            
            //un número es par si su modúlo entre 2 es 0. Luego Tenemos que averiguar
            //ese datos realizando la operación entre cada cifra. Para esto tenemos que
            //averiguar cada cifra y por tanto debemos saber cuantas cifras tiene el número.
            //1. Averiguar numero de cifras del número
            //2. Decidir si la cifra es par aplicándole el módulo de 2
            //3. Si es par lo añadimos al String que representará nuestro número final
            
            
 
                while(numero>0){
                     
                
                for(int i=1; i<=numero; i*=10){ //Si al hacer el módulo del número entre i nos
                if(numero%i>=0)             // da algo es que hay una cifra. Itera como mucho
                    cifras++;}            //hasta igualar el número de cifras del número
                                            //por lo que cada iteración es una cifra
                                    
                                       
                for(int i=1; i<cifras; i++)  //averiguamos el divisor en potencia de 10 para sacar la parte entera del número,                           
                   exp*=10;                 // concretamente la primera cifra
               
               int cociente=numero/exp;
               if(cociente%2==0){ nuevo+=cociente +" ";
               suma+=cociente;}
               numero%=exp;
               cifras=0;
               exp=1;
                }
               
               
              System.out.println("Digitos pares " +nuevo);
              System.out.println("La suma es "+ suma);
              
               
             
             /*  int nuevo2=0;
               int par=0;
               int exp2=1;
               int count=0;
             
               while(numero>0){
                  
               digito=numero%10; //Averigüamos el módulo del número
               if(digito%2==0){
                   par=digito;
                   suma+=par;
                   if (count>0) exp2*=10;
                   count++;
                     nuevo2+=par*exp2;
                     
               }
               numero/=10;
               
             }
               
              System.out.println("Digitos pares " +nuevo2);
              System.out.println("La suma es "+ suma);*/
    }
}