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
public class Ejer_29 {
    

      public static void main(String[] args) {
    
            int n1;
            int n2;
         
            Scanner entrada=new Scanner(System.in);
            System.out.println("Introduzca un número");
            n1=entrada.nextInt();
            System.out.println("Introduzca un número");
            n2=entrada.nextInt();
            
            for(int i=n1-1; i<n1; i--)
                
                if(i%n2!=0&&i>0)
                    
                    System.out.print(i+" ");
                entrada.close();
    
     }
}
