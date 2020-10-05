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
              int c1, c2, c3, c4, c5;
              int n1, n2, n3, n4, n5;
              
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un número");
              n=entrada.nextInt();
              
               int count=0; 
                 for(long i=1; i<=n; i*=10){ 
                     if(n%i>=0) 
                     count++;}
            
            
            System.out.println("El número tiene "+count+  (count>1?" dígitos": " dígito"));
            
            while(count>0){
            c1=(int)(n/Math.pow(10, count-1));
            n2=n-( c1*(int)Math.pow(10, count-1));
          //  count--};
            
            //System.out.print(c1 +" "+ n2);
            
       
                    
            
            
            
            }              
    
    }
}
