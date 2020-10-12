/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 * Desplazamiento de digitos 1 posicion
 * @author javie
 */
public class Ejer_52 {
    
     public static void main(String[] args) {
    
              long n;
              long vuelta=0;
           
            
           //1. variante con la parte entera
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un número entero positivo");
              n=entrada.nextLong();
              
               /*
            // 1.Hallamos las cofras del numero para sacar la parte entera
            int cifras=0;
            for(long i=1; i<n; i*=10){
                if(n%10>=0)
                cifras++;
            }
            int exp=1;
            for(long i=1; i<cifras; i++)
            exp*=10;
           
            long entera=n/exp;
            long modulo=n%exp;
          
            
            long desplazado=modulo*10+entera;
            System.out.println("El número desplazado es " +desplazado);*/
            
            while(n>0){
                
                 vuelta=(vuelta*10)+(n%10);//le damos la vuelta al numero
                  n/=10;
            }
            
            int modulo=(int)vuelta%10; //hallamos el modulo de la vuelta que será el número que irá más a la derecha
            long revuelta=vuelta/10;   //nos quedamos con la parte entera de la vuelta y la volvemos a voltear
            long desplazado=0;
            while(revuelta>0){
                desplazado=(desplazado*10)+ revuelta%10;
                revuelta/=10;
            }
            long numero_final=desplazado*10+modulo;
            
            System.out.println(numero_final);
            
     }
            
}
