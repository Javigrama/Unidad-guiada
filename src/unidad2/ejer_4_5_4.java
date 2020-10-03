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
public class ejer_4_5_4 {
    
    static Scanner entrada=new Scanner(System.in);
    
     public static void main(String[] args) {
         
     
        
         System.out.println("Cuantos números desea calcular?");
         
        int numeros_a_calcular=entrada.nextInt();
        int numeros_correctos=numeros_a_calcular;
        int intentos=0;
        int suma=0;
        double media=0;
        
        do{
        
        if(numeros_a_calcular<0)System.out.println("No es posible leer una cantidad "
                + "negativa de números");
        else if(numeros_a_calcular==0) System.out.println("No se ha leído ningún número");
        
        else {System.out.println(numeros_a_calcular==numeros_correctos? "La cantidad de números a calcular es "+ numeros_a_calcular:"");
        
      
            
            int numero;
          
            System.out.println("Introduzca un número");
            
            int sig=entrada.nextInt();
            
             intentos++;
             numero=sig>0? sig:0 ;
             suma+=numero;
             media=(double)suma/numeros_correctos;
  
            if(numero>0)numeros_a_calcular--;
        }
        }  while(numeros_a_calcular>0);
        
        
        if(numeros_correctos>0){
        System.out.println("Se han realizado un total de " + intentos + " intentos");
        System.out.println("El total de números correctos es " + numeros_correctos);
        System.out.println("La suma de los números introducidos es " + suma);
        System.out.println("La media de los números introducidos es " + media);}
        
        
        
      
     }
    
}