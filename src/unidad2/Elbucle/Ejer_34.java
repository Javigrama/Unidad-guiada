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
public class Ejer_34 {
    
     public static void main(String[] args) {
            
          
            long n1;
            long n2;
            int exp1=1;
            int exp2=1;
            
            String pares="";
            String impares="";
            
            Scanner entrada=new Scanner(System.in);
            System.out.println("Inserte un número");
            n1=entrada.nextInt();
            System.out.println("Inserte un número");
            n2=entrada.nextInt();
            
            int cifrasn1=0;
            int cifrasn2=0;
            int cifrastotales=0;
            int ct1=0;
            int ct2=0;
            
             for(long i=1; i<=n1; i*=10){ //hallamos las cifras del 1er numero para saber cuantas iteraciones tendrá 
                     if(n1%i>=0)           //nuestro bucle
                     ct1++;
                     }
             for(long i=1; i<=n2; i*=10){ //hallamos las cifras del 2 número
                     if(n2%i>=0) 
                     ct2++;
                     }
             
             cifrastotales=ct1>ct2? ct1:ct2;
             System.out.println(cifrastotales);
            while(cifrastotales>0){
              //hallo el número de cifras del número n1
              
                if(ct1>0){
                     for(long i=1; i<=n1; i*=10){ 
                     if(n1%i>=0) 
                     cifrasn1++;
                     }
                     
                     for(int i=1; i<cifrasn1; i++) //obtengo 10 elevado a 1 menos el número de cifras del número
                     exp1=10*exp1;
                     int cociente =(int)n1/exp1; //hallo el cociente del número por el exp1 y obtengo la primera cifra del número
                     n1%=exp1;                   //hallo el modulo del n1 entre 10 elevado a el número de cifras del número -1
                                                 // y el resultado será el nuevo n1  
                    
                    cifrasn1=0;
                    exp1=1;
                 
                     if(cociente%2==0) pares+=cociente;
                     else impares+=cociente;
                     ct1--;
                     
                
                }
                     
                     //----------------- a partir de aquí hacemos lo mismo conel segundo número
                     
                if(ct2>0){ //esto debe hacerlo si el numero tiene alguna cifra. las cifras disminuyen en cada iteración
                     for(long i=1; i<=n2; i*=10){ 
                     if(n2%i>=0) 
                     cifrasn2++;
                     }
                     
                     for(int i=1; i<cifrasn2; i++) //obtengo 10 elevado a 1 menos el número de cifras del número
                     exp2=10*exp2;
                     int cociente2 =(int)n2/exp2; //hallo el cociente del número por el exp1 y obtengo la primera cifra del número
                     n2%=exp2;                   //hallo el modulo del n1 entre 10 elevado a el número de cifras del número -1
                                                 // y el resultado será el nuevo n1  
                    
                    cifrasn2=0;                   // reseteo estas variables para que los bucles de cálculo de cifras de los nuevos
                    exp2=1;                         //números sean correctos
                 
                     if(cociente2%2==0) pares+=cociente2;
                     else impares+=cociente2;
                 ct2--;
            }
                      cifrastotales--;
                  
                     
            }   
                System.out.println(pares+" pares");  
                     System.out.println(impares+" impares");  
  
    }
}
