/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 * Pintar por pantalla un rombo hueco con un altura impar y >=3
 * @author javie
 */
public class Ejer_39 {
    
     public static void main(String[] args) {
          
              int numero; 
              int factorial=1;
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un número");
              numero=entrada.nextInt();
              
    
              for(int i=1; i<=numero; i++){
                  factorial*=i;
              System.out.println(i+" ! = "+ factorial);}
              entrada.close();
    }
}
