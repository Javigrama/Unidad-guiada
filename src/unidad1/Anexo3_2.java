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
public class Anexo3_2 {
    
    static Scanner entrada=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("introduzca el número de metros");
        
        int metros=entrada.nextInt();
        
        System.out.println("En "+ metros+ " metros hay "+ decimetros(metros)+ " decímetros");
        System.out.println("En "+ metros+ " metros hay "+ centimetros(metros)+ " centímetros");
        System.out.println("En "+ metros+ " metros hay "+ milimetros(metros)+ " milímetros");
        System.out.println("En "+ metros+ " metros hay "+ pulgadas(metros)+ " pulgadas");
        System.out.println("En "+ metros+ " metros hay "+ yardas(metros)+ " yardas");
        System.out.println("En "+ metros+ " metros hay "+ pies(metros)+ " pies");
    }
    
    public static double decimetros(int m){
       double d=m*10;
       return d;
     }
    
        
    public static double centimetros(int m){
       double c=m*100;
       return c;
     }

         
    public static double milimetros(int m){
       double mi=m*1000;
       return mi;
     }
    
           
    public static double pulgadas(int m){
       double p=m*39.3700787;
       return p;
     }
    
     public static double yardas(int m){
       double y=m*1.0936133;
       return y;
     }
     
      public static double pies(int m){
       double pie=m*3.2808399;
       return pie;
     }
    
}


