/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Anexo3_1 {
    
    static Scanner entrada=new Scanner(System.in);
    
     public static void main(String[] args) {
         
         System.out.println("Introduzca la altura de la pirámide");
         
         double altura= entrada.nextDouble();
         
         System.out.println("Introduzca la longitud del lado de la pirámide");
         
         double lado=entrada.nextDouble();
        
         
         System.out.println("El volumen de la pirámide es " + volumen(lado, altura)+" metros cúbicos");
         
         
     }
     
     public static double volumen(double la, double h){
         
         double v;
         double b=Math.pow(la,2);
     
         return v=(1.0/3.0)*(b*h);
     }
    
}
