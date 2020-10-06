/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *
 * @author Semipresencial 1º
 */
public class Ejer_25bis {
    
       public static void main(String[] args) {
          
              int numero, vuelta=0, copia;
                          
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un número");
              numero=entrada.nextInt();
              copia=numero;
              
              while(numero>0){
                  
                  vuelta=(vuelta*10)+(numero%10);
                  numero/=10;
              }
    System.out.println("Si al numero"+ copia+ "le damos la vuelta es : "+ vuelta);
}
}
