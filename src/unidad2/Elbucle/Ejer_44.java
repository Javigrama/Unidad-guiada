/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 * Insertar dígito dentro de un número
 * @author javie
 */
public class Ejer_44 {
    
      public static void main(String[] args) {
    
              long n;
              int posicion;
              int digito;
              int particion;
              long parteentera;
              long modulo;
              
     
                    
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un número entero positivo");
              n=entrada.nextLong();
              System.out.println("Introduzca la posición dónde se quiere insetar");
              posicion=entrada.nextInt();
              System.out.println("Introduzca el dígito que quiere insetar");
              digito=entrada.nextInt();
              
//              1.Hallamos el número de cifras total del número
                int cifras=0;
                
                for(long i=1; i<=n; i*=10){
                    if(n%i>=0)
                    cifras++;
                }
                  
//                2. Al número de cifras le restamos la posición en la que queremos insertar

                particion=(cifras-posicion)+1;
                
//                3. Hallamos la el módulo de nuestro número desde la posición de inserción: así mismo 
//                   hallamos la parte entera. Para ello vamos a divir nuestro número por 10 elevado
//                     a cifras -1. Para averiguar esa potencia de 10 hacemos un bucle for

                   int exp=1;
                   for(int i=1; i<=particion; i++)
                       exp*=10;
                   
             
                   parteentera=n/exp;
                   modulo=n%exp;
                   
                   
                
//                  4.Para insertar el número multiplicamos la parte entera x10 y le sumamos el número
                long parte_entera_mas_digito=parteentera*10+digito;
                //System.out.println(parte_entera_mas_digito);
                
//                5. El problema surge si al hallar el módulo del número este empieza por cero ya que es descartado
//                    Vamos a añadirle "0" hasta que el número de cifras del módulo sea igua a la variable particion
//                  que es la que refleja el número de cifras totales del módulo del número inicial

                int cifrasmodulo=0;
                for(int i=1; i<=modulo; i*=10){ 
                     if(n%i>=0) 
                     cifrasmodulo++;}
                
                String cifrastotalesmodulo=""+modulo;
                while(particion>cifrasmodulo){
                    
                    cifrastotalesmodulo="0"+cifrastotalesmodulo;
                    cifrasmodulo++;
                }
                
//                6. Finalmente para no trabajar con potencias de 10 y a que se permite el uso de String
//                        convertirmos la parte entera + el digito en un string y le concatenamos la otra parte

                String numeroresultante=""+parte_entera_mas_digito+cifrastotalesmodulo;
                System.out.println("El número resultante es " +numeroresultante);
                
              entrada.close();
      }
    
}
