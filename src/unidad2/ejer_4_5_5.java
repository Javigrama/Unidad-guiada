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
public class ejer_4_5_5 {
 
    
    
     static Scanner entrada=new Scanner(System.in);
    
     public static void main(String[] args) {
         
     
         System.out.println("Cuantos intentos desea calcular?");
         
          int intentos=entrada.nextInt();
          int numero=0;
          int numeros_correctos=0;
          int suma=0;
          //double media=suma/numeros_correctos;
          
          
          if(intentos>0){
             for(int i=0; i<intentos; i++){
              
              System.out.println("Ingrese el "+((i+1)==1|(i+1)==3? (i+1)+"er":(i+1)+ "º")+" número");
              numero=entrada.nextInt();
              if(numero==0||numero<0) System.out.println("Número no válido descartado");
              else {
                  suma+=numero;
                  numeros_correctos++;
              }
           
          
             }
             
           System.out.println("El total de intentos es "+intentos);
           System.out.println("El total de números correctos leidos es "+numeros_correctos);
           System.out.println("La suma de los números correctos es " +suma);
           System.out.println("La media de los números correctos es " +suma/numeros_correctos);
          }
          
          else {
              if(intentos==0)System.out.println("No se ha leído ningún número");
              else System.out.println("No es posible leer una cantidad negativa");
          }
            
        }     
      
     }
    

