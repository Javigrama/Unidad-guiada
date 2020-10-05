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
public class Ejer_14 {
    
     public static void main(String[] args) {
          
           int base;
           int exponente;
           int resultado=1;
           
             Scanner entrada=new Scanner(System.in);
             System.out.println("Introduzca una base");
             base=entrada.nextInt();
             System.out.println("Introduzca un exponente");
             exponente=entrada.nextInt();
             
          for(int i=1; i<=exponente; i++){
             resultado=resultado*base;
          }
             System.out.println(base+" elevado a " + exponente+ " es igual a " +resultado);
     }
    
}
