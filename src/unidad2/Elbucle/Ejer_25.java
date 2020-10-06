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
public class Ejer_25 {
    
      public static void main(String[] args) {
          
              int n;
              String numero="";
              int cifra;
              
              
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un número");
              n=entrada.nextInt();
              
               int count=0; 
                 for(long i=1; i<=n; i*=10){ 
                     if(n%i>=0) 
                     count++;}
            
            
            System.out.println("El número tiene "+count+  (count>1?" dígitos": " dígito"));
            
            while(count>0){
            cifra=(int)(n/Math.pow(10, count-1));
            System.out.println("La cifra posición "+ count+ " es "+ cifra);
            
            int resultado=1;
            for(int i=1; i<=count-1; i++){
             resultado=resultado*10;
            }
            n=n-(cifra*resultado);
            //n=n-( cifra*(int)Math.pow(10, count-1)); Podríamos hacer esta operación con el Math.Pow pero lo hacemos
            // sin este método por motivos didácticos
            count--;
            numero=""+cifra+ numero;
            }
            
            System.out.print("El número al revés es "+numero+ "\n");
            
       
                    
            
            
            
            }              
    
    }

