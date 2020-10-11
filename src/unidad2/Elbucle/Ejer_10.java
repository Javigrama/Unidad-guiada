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
public class Ejer_10 {
    
      public static void main(String[] args) {
          
          
          int numero;
          int suma=0;
          int count=0;
          double media;
          Scanner entrada=new Scanner(System.in);
          System.out.println("Introduzca números para hallar la media artimetica."
                  + "Para finalizar introduzca un  número negativo");
          
          do{
              numero=entrada.nextInt();
              if(numero>0) count++;
              suma+=numero>=0? numero:0;
              
          }while(numero>=0);
          
          media=(double)suma/count;
          System.out.println("La media es "+ media);
          entrada.close();
      }
    
        
        
}
