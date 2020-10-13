/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 * Hay que pintar la V. El ancho del palo es siempre 3
 * Se pide la altra que como mínimo es 3 pisos y si se
 * inserta menor muestra error
 * @author javie
 */
public class Ejer_61 {
    
     public static void main(String[] args) {
              
              int h;
              
                Scanner entrada=new Scanner(System.in);
                System.out.println("Introduzca la altura de la figura");
                h=entrada.nextInt();
    
                while(h<3){
                    
                    System.out.println("la Altura debe ser mayor o igual de 3. Inserte");
                    h=entrada.nextInt();
                    
                }
        
                
                for(int i=0; i<h; i++){
                    
                    for(int j=1; j<=3+i; j++){
                        
                        if(j>i)System.out.print("*");
                        else System.out.print(" ");
                    }
                    
                    for(int j=(2*(h-1)-(2*i)+3); j>0; j--){
                         if(j<=3)System.out.print("*");
                         else System.out.print(" ");
                    }
           
                   
                    System.out.println();
                }
                entrada.close();
     }
}
