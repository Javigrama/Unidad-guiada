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
public class Ejer_21 {
    
       public static void main(String[] args) {
           
              int n;
              int contador=0;
              int impares=0;
              int suma=0;
              double media=0;
              int parmayor=0;
              
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte números positivos. Para terminar inserte un entero negativo");
              do{
              n=entrada.nextInt();
              if(n>=0){
                  contador++;
                  if(n%2!=0){
                  suma+=n;
                  impares++;
                  }
                  else {
                    if(n>parmayor) parmayor=n;
                  }
                  
              }
              else if(contador==0) System.out.println ("No ha introducido ningún entero positivo");
              }while(n>=0);
              
              if(contador>0){
              media=(double)suma/impares;
              System.out.println("Se han introducido "+contador+ (contador>1?" números": " numero"));
              System.out.println("La media de los impares es "+media);
              System.out.println("El mayor de los pares es "+parmayor);
              }
              
              
              
    
        }
}
