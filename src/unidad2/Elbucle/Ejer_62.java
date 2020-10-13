/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *Numeros afortunados  3 7 8 9
 * Numeros mala suerte 0 1 2 4 5 6
 * un Numero es afortunado si contiene más números afortunados que de mala suerte
 * 
 * @author javie
 */
public class Ejer_62 {
    
      public static void main(String[] args) {
    
              long n;
              int afortunados=0;
              int mala_suerte=0;
              int digito;
              
                Scanner entrada=new Scanner(System.in);
                System.out.println("Introduzca un numero");
                n=entrada.nextLong();
              
                while(n>0){
                    digito=(int)n%10;
                    
                    if(digito==3||digito==7||digito==8|digito==9)
                        afortunados++;
                    else mala_suerte++;
                
                    n/=10;
                    
                }
                System.out.println("El número es "+(afortunados>mala_suerte? "afortunado": "mala_suerte"));
                
                
      }
}
