/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *Pintar el 155 con asteriscos. La altura debe ser5 o mas
 * y los espacios 1 o mas
 * @author javie
 */
public class Ejer_50 {
    
       public static void main(String[] args) {
    
        int h;
        int esp;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte la alttura (mnimo 5)");

        do {

            h = entrada.nextInt();
            if (h < 5) {
                System.out.println("Lo siento, los datos introducidos no son correctos."
                        + "El valor mínimo debe ser 5. Inténtelo de nnuevo");
            }

        } while (h < 5);
        
        
         System.out.println("Inserte los espacios (mnimo 1)");
        do {

            esp = entrada.nextInt();
            if (esp < 1) {
                System.out.println("Lo siento, los datos introducidos no son correctos."
                        + "El valor mínimo debe ser 1. Inténtelo de nnuevo");
            }

        } while (esp < 1);
       
        
        
       for (int i=1; i<=h; i++){  //para toda la altura
           
           if(i==1||i==3||i==h){  //Sölo para cuando la i es 1 3 o altura, pues todas son iguales
           
           for(int j=1; j<=1+esp; j++){
               
               if(j==1)System.out.print("* ");
               else System.out.print("  ");
           }
           
           for(int j=4+esp; j>0; j--){
               if(j>esp)System.out.print("* ");
               else System.out.print("  ");
           }
           
           for(int j=4; j>0; j--)
               System.out.print("* ");
         
           }
           
           else if(i==2){
               
               for(int j=1; j<(9+(2*esp)); j++)
                   
                   if(j==1||j==(2+esp)||j==(6+(2*esp)))System.out.print("* ");
                   else System.out.print("  ");
                   
                   } //fin else(if==2)
           else {
               
                 for(int j=1; j<=(9+(2*esp)); j++){
                     
                   if(j==1||j==(5+esp)||j==(9+(2*esp)))System.out.print("* ");
                   else System.out.print("  ");
                 }
           }
                   
           System.out.println();
       }
         
        
       }
       

    
}
