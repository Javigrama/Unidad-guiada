
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;
import java.util.Scanner;
/**
 *
 * @author javie
 */
public class ejer_4_5_1 {
    
      static Scanner entrada= new Scanner(System.in);
           public static void main(String[] args) {
     int i=0;
           do{
         
           System.out.println("Para hacer un recta inserte: 1");
           System.out.println("Para hacer un punto inserte: 2");
           System.out.println("Para hacer un rectángulo inserte: 3");
           System.out.println("Para no hacer nada inserte: 4");
           
           
              i=entrada.nextInt();
             
           }while(i<1||i>4);
           
              switch (i){
               
               case 1: 
                   System.out.println("Va a dibujar una recta");
                   break;
               
               case 2: 
                    System.out.println("Va a dibujar un punto");
                    break;
               case 3:
                    System.out.println("Va a dibujar un rectángulo");
                    break;
               case 4:
                   System.out.println("No va a dibujar nada");
                   break;
                   
               default:
                     System.out.println("Que pase buen día");
    
             }
           }
}
