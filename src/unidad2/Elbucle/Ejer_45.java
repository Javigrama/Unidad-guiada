/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 * Se pide un número y una posición contada de izda a derecha
 * Se debe sustituir el dígito de la posición indicada por el 
 * nuevo dígito
 * @author javie
 */
public class Ejer_45 {
    
     public static void main(String[] args) {
    
              long n;
              int posicion;
              int digito;
              int particion;
              long entera;
              long modulo;
              long nuevaentera;
             
           
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un número entero positivo");
              n=entrada.nextLong();
              System.out.println("Introduzca la posición dónde se quiere insetar");
              posicion=entrada.nextInt();
              System.out.println("Introduzca el nuevo dígito");
              digito=entrada.nextInt();
    
              
//               1. Hallamos la cantidad de cifras del número
               int cifras=0;
               for(int i=1; i<=n; i*=10){
                   if(n%i>=0)
                   cifras++;
               }
               
               particion=cifras-posicion;
               
//               2. Hallamos una potencia de 10 acorde al numero de cifras de la particion
//                  y dividimos el numero entre esa potencia lo que nos da la parte entera
    
                int exp=1;
                for(int i=1; i<=particion; i++)
                    exp*=10;
                
                entera=n/exp;
                //System.out.println(entera);
                modulo=n%exp;
                   //  System.out.println(modulo);
//                3. Hallamos el módulo de la parte entera entre 10 y se lo restamos y a continuación le sumamos el
//                        nuevo dígito

                nuevaentera=entera-entera%10+ digito;
               // System.out.println(nuevaentera);
                        
//                4. Ahora tenemos un problema si el modulo del numero original empezaba por cero
//                   porque es descartado. Tenemos que añadir a ese móduolo la diferencia entre
//                   la variable particion y las cifras del módulo resultante hallamos las cifras del módulo.

                    int cifrasmodulo=0;
                    for(int i=1; i<=modulo; i*=10){
                        if(modulo%i>=0)
                        cifrasmodulo++;   //hallamos las cifras del módulo
                        
                    }
                        
                    
                    String nuevomodulo=""+modulo;
                    while(particion>cifrasmodulo){
                        
                        nuevomodulo="0"+nuevomodulo;
                        cifrasmodulo++;
                    }
                    
                    String numeroresultante=""+nuevaentera+nuevomodulo;
                System.out.println("el número resultante es "+ numeroresultante);
                
                
                
    }
}
