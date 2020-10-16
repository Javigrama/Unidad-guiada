/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejer_8_2_1 {
    
       static int n;
       
       static Scanner entrada=new Scanner(System.in);
       
       public static void main(String[] args) {
           
          int count=0;
          System.out.println("Introduzca un número entre el 1 y el 100");
           
        
           while(n<1||n>100){
              try{
                
                n=entrada.nextInt();
             
                if(n<1||n>100)System.out.println("Debe ser entre 1 y 100. Inserte");
              }catch(InputMismatchException e){System.out.println("Error en el tipo de dato. Inserte nuevamente");
                entrada.nextLine();
              }
              finally {count++;}
           }
          System.out.println("El número introducido es "+ n+ " y ha necesitado "+ count+ (count>1? " intentos": " intento"));
          
       }
}
