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
public class Ejer_51 {
    
       public static void main(String[] args) {
    
        long n;
        int modulo;
       
        long vuelta=0;
        long numerodelgadito=0;
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte un número");
        n=entrada.nextLong();
    
        while(n>0){             //si el módulo es 0 u 8, sencillamente dividimos nuestro número entre
            modulo=(int)n%10;   //10 y tenemos nuestro nuevo numero sin 0 u 8. Así todas los 0 u 8 se irán eliminando
            if(modulo==8||modulo==0){ // y sólo conservaremos las que sean diferentes que almacenaremos en vuelta
            n/=10;}
            else {              //si el mdódulo no es 0 u 8 añadimos ese módulo al número vuelta
                                //para almacenar las cifras que conservaremos
                  
                    vuelta=(vuelta*10)+modulo;
                    n/=10;
                   
                }
               
            }
        while(vuelta>0){            //en vuelta tenemos todas las cifras que no son ni 0 ni 8, así que lo volvemos a voltear
                modulo=(int)vuelta%10; //y nos da nuestro número
                numerodelgadito=(numerodelgadito*10)+modulo;
                vuelta/=10;
            
            
        }
           System.out.println("El número delgadito es "+ numerodelgadito);
           entrada.close();
    }
}
