/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.foro;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class velocidad {
    
    public static void main(String[] args) {
    
    double velocidad=0.0f, distancia ;
    String lectura ;
    int segundos ;

    Scanner teclado = new Scanner( System.in) ;


    try {
      System.out.print( "Velocidad en kilometros por hora: ");
      lectura = teclado.nextLine() ;
      velocidad = Float.parseFloat(lectura) ;
    }
    catch( Exception e){

       System.out.println("Error: Al leer la velocidad.");
    }
    
    finally{ System.out.println("Esto se va a leer independientemente del resultado"
            + "del bloque try/catch, es decir, se produzca o no se produzca una"
            + "excepción.  El recurso scanner abierto para leer se cierra evitando"
            + "fugas de memoria. No se si se refiere a esta mejora Manuela."
            + "De todas formas leer un String y hacerle un parse a float no me"
            + " soluciona lo de la coma flotante por defecto.");}


System.out.println("Tiempo en segundos: ");
segundos = teclado.nextInt();
distancia = segundos/3600 ;

System.out.println("Distancia recorrida en KM: "+ (velocidad * distancia)); 
    }
}

