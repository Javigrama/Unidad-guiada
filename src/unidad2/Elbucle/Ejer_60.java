/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *Hay que pintar por pantalla un par de calcetines. Se pide la altura
 * que es mayor o igual que 4
 * @author javie
 */
public class Ejer_60 {
    
      public static void main(String[] args) {
              
              int h;
          
                Scanner entrada=new Scanner(System.in);
                System.out.println("Introduzca la altura de la figura");
                h=entrada.nextInt();
    
                while(h<4){
                    
                    System.out.println("la Altura debe ser mayor o igual de 4. Inserte");
                    h=entrada.nextInt();
                    
                }
                
                for(int i=1; i<=h; i++){
                  
                    if(i<=h-2){
                        for(int j=1;j<=11; j++){
                        if(j<4||j>8) System.out.print("*");
                        else System.out.print(" ");
                        }
                    }
                    
                    else {
                        for(int j=1; j<=14; j++){
                            if(j<7||j>8) System.out.print("*");
                            else System.out.print(" ");
                        }
                    }
                    System.out.println();
                    entrada.close();
                }
                
}
    
}
