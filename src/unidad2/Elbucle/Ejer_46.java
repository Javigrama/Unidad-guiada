/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *Se pide pintar un rectángulo hueco con asterísticos
 * Se solicita por teclado anchura y altura que deben ser
 * mayores o iguales que 2. Sino hay que mostrar error
 * @author javie
 */
public class Ejer_46 {
    
       public static void main(String[] args) {
    
              int h;
              int b;
              
                Scanner entrada=new Scanner(System.in);
                 System.out.println("Inserte la altura del rectángulo (como mínimo 2)");
                 
              do {
       
                   h=entrada.nextInt();
                   if(h<2)System.out.println("Lo siento, los datos introducidos no son correctos."
                           + "El valor mínimo debe ser 2");
              
              }while(h<2);
    
               System.out.println("Ahora introduzca la anchura (como mínimo 2)");
                  do {
       
                   b=entrada.nextInt();
                   if(b<2)System.out.println("Debe ser 2 o mayor");
              
              }while(b<2);
                  
                  //hasta aquí la solicitud de los datos para dibujar el rectángulo
                  
                  
                  for(int i=1; i<=h; i++){
                      
                      for(int j=1; j<=b; j++){
                          
                          if(i==1||i==h)System.out.print("* ");
                          else{
                          
                                if(j==1||j==b)System.out.print("* ");
                                else System.out.print("  ");
                          }
                                    
                      }
                      System.out.println();
                  }
                  
                  
        
       }
}
              
