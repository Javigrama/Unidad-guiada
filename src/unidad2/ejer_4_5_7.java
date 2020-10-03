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
public class ejer_4_5_7 {
    
        public static void main(String[] args) {
            
            Scanner entrada=new Scanner(System.in);
            int a;
            int b;
            int aux=0;
            
            System.out.println("Ingrese el valor de la variable a");
            a=entrada.nextInt();
            System.out.println("Ingrese el valor de la variable b");
            b=entrada.nextInt();
            
            if(a>b){aux=a;
                    a=b;
                    b=aux;}
            
            System.out.println("a es "+ a + " y b es "+ b);
                 
            }
                    
            
        }
    
