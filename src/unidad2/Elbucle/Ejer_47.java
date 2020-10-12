/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *Se trata de pintar un 8 por pantalla usando la "M".
 * Se pide por teclado la altura que debe ser impar mayor de 5
 * Si no es correcto aparece mensaje de error.
 * la anchura siempre debe ser 6
 * @author javie
 */
public class Ejer_47 {
  
    public static void main(String[] args) {

        int h;
        int b=6;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte la altura del rectángulo (número impar mayor o igual que 5)");

        do {

            h = entrada.nextInt();
            if (h < 5||h%2==0) {
                System.out.println("Lo siento, los datos introducidos no son correctos."
                        + "El valor mínimo debe ser 5. Inténtelo de nnuevo");
            }

        } while (h < 5||h%2==0);

    
               
                  for(int i=1; i<=h; i++){
                      
                      for(int j=1; j<=b; j++){
                          
                          if(i==1||i==h/2+1||i==h)System.out.print("M ");
                          else{
                          
                                if(j==1||j==b)System.out.print("M ");
                                else System.out.print("  ");
                          }
                                    
                      }
                      System.out.println();
                  }
    }
}
