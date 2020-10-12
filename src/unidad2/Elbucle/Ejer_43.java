/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *Leemos un número y lo partimos en 2 partes. Se pide que se introduzca un entero
 * Deespués se pide que se introduzca un dígito para partir el entero a partir de
 * ese dígito. Se nos pide las dos particiones.
 * Se presupone que el usuario inserta un número de 2 o más dígitos
 * @author javie
 */
public class Ejer_43 {
    

      public static void main(String[] args) {
    
              int n;
              int digito;
              int particion;
              int partido1;
              int partido2;
              int cifras2;
              int cifras2bis;
                    
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un entero");
              n=entrada.nextInt();
              System.out.println("Inserte un dígito");
              digito=entrada.nextInt();
              
//              1:primero averigüamos cuantas cifras tiene el número
//              Esto lo hacemos diviendo el número por potencias de 10, de forma
//              que si hay resto es que hay una cifra
                int cifras=0;
                for(int i=1; i<=n; i*=10){ 
                     if(n%i>=0) 
                     cifras++;}
                     
                     //2. Al número de cifras del entero le resto el dígito por 
                     //el que queremos partir+1 (+1 porque partimos antes de la que fuera esa
//                     posición y ese número lo uso como exponente
                     // de 10

                 particion=(cifras-digito)+1;
                 int resultado=1;
                 for(int i=1; i<=particion; i++)
                     resultado*=10;
                // System.out.println(resultado);
                 
//                 3. Divido el número por el resultado que es 10 elevado a particion para 
//                    hallar la parte entera del número y hallo el módulo del número por el resultado
//                      para encontrar la otra partición  

                partido1=n/resultado;
                partido2=n%resultado;
                
                /*4. El ejercicio presenta un problema en la partición2 ya que si el número inicial
                   se parte en una posición en la que a continuación  hay un cero, no representa el 0
                   en el segundo número ya que sería un cero a la izda. Para subsanar esto haremos 
                   que el total de cifras de la partido2 sea igual a el número que refleja la variable
                    particion*/
                
                cifras2=0;
                
                for(int i=1; i<=partido2; i*=10){ 
                     if(n%i>=0) 
                     cifras2++;}
                String partido2bis=""+partido2;
                cifras2bis=cifras2;
                    while(particion>cifras2bis){
                        
                       partido2bis="0"+partido2bis;
                       cifras2bis++;
                       
                    }
                    
                  
                
                System.out.println("Los números partidos son el "+ partido1+ " y el "+ (particion>cifras2 ? partido2bis: partido2));
                //System.out.println(particion+" "+ cifras2+ " "+partido2bis);
                 
              entrada.close();
      }
}
