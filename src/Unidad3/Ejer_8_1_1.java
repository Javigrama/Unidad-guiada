/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejer_8_1_1 {
    
       static int n;
       static Scanner entrada=new Scanner(System.in);
       
       public static void main(String[] args) {
           
           System.out.println("Introduzca un entero");
           
           while(n!=1){
           try{
                scaneo();
               
           }catch(Exception e){// e.printStackTrace();
           
           System.out.println("Estamos solicitando un entero. Por favor, introduzca un entero");
           entrada.nextLine();
           }
          
           }   
        
       }
       
       static public void scaneo() throws Exception{
           
           n=entrada.nextInt();
           
           
       } 
    
}
