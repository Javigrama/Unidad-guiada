/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 * Realizar un programa que calcule la media de los dígitos de un
 * número
 * @author javie
 */
public class Ejer_58 {
    
     public static void main(String[] args) {
    
              long n;
              int suma=0;
              double media=0;
              int digito;
              int count=0;
          
                Scanner entrada=new Scanner(System.in);
                System.out.println("Introduzca un numero");
                n=entrada.nextLong();
                
                while(n>0){
            
                 digito=(int)n%10;
                 n/=10;
                 count++;
                 suma+=digito;
                 media=(double)suma/count;
                 
                    
                }
                System.out.println("La media de sus dígitos es "+media);
                
                
                entrada.close();
    }
}
