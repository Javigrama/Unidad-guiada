/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *Indicar que números aparecen en un long introducido
 * @author javie
 */
public class Ejer_48 {
    
     public static void main(String[] args) {

        long n;
        int cero=0, uno=0, dos=0, tres=0, cuatro=0, cinco=0, seis=0, siete=0, ocho=0, nueve=0;
        

        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte un entero");
        n=entrada.nextLong();
        
        //vamos a ir hallando el módulo del número entre 10
        String aparecen="";
        while(n>0){
            
            int cifra=(int)n%10;
            n/=10;
            
            switch(cifra){
                
                case 0: 
                if(cero<1) cero++;
                break;
                
                case 1: 
                if(uno<1)uno++;
                break;
                
                case 2: 
                if(dos<1) dos++;
                break;
                
                case 3: 
                if(tres<1) tres++;
                break;
                
                case 4: 
                if(cuatro<1) cuatro++;
                break;
                
                case 5: 
                if(cinco<1)cinco++;
                break;
                
                case 6: 
                if(seis<1) seis++;
                break;
                
                case 7: 
                if(siete<1)siete++;
                break;
                
                case 8: 
                if(ocho<1) ocho++;
                break;
                
                case 9: 
                if(nueve<1) nueve++;
                break;
            }
        }
         
         System.out.print("Dígitos que aparecen: ");
         System.out.print((cero>0? "0 ":"")+(uno>0 ? "1 ":"")+(dos>0 ? "2 ":"")+(tres>0 ? "3 ":"")
         +(cuatro>0 ? "4 ":"")+(cinco>0 ? "5 ":"")+(seis>0 ? "6 ":"")+(siete>0 ? "7 ":"")
         +(ocho>0 ? "8 ":"")+(nueve>0 ? "9 ":""));
         
         System.out.println();
         
          System.out.print("Dígitos que no aparecen: ");
         System.out.print((cero==0? "0 ":"")+(uno==0 ? "1 ":"")+(dos==0 ? "2 ":"")+(tres==0 ? "3 ":"")
         +(cuatro==0 ? "4 ":"")+(cinco==0 ? "5 ":"")+(seis==0 ? "6 ":"")+(siete==0 ? "7 ":"")
         +(ocho==0 ? "8 ":"")+(nueve==0 ? "9 ":""));
        System.out.println();
        
  
     }
   
            
        }
          
     
      
    

