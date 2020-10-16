/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Main {
   
 public static void main(String[] args) {
// declaración de variables u objetos
 Scanner sc = new Scanner(System.in); //crear un objeto Scanner
 
 String nombre;
 double radio;
 int n;
// bloque de sentencias
 /*System.out.print("Introduzca su nombre: ");
 nombre = sc.nextLine(); //leer un String
 System.out.println("Hola " + nombre + "!!!");
 System.out.print("Introduzca el radio de la circunferencia: ");
 radio = sc.nextDouble(); //leer un double
 System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
 System.out.print("Introduzca un número entero: ");
 n = sc.nextInt(); //leer un entero
 System.out.println("El cuadrado es: " + Math.pow(n,2));*/
 
 
 System.out.print("Introduzca el radio de la circunferencia: ");
 radio = sc.nextDouble();
 System.out.println("Longitud de la circunferencia: " +
2*Math.PI*radio);
 System.out.print("Introduzca un número entero: ");
 n = sc.nextInt();
 sc.nextLine(); //Hay que introdcir esta línea aquí. Si no el siguiente nextline, 
 //lee lo que hay en el buffer que es ""\n. Asigna "" y limpia \n
 //No se para porque hay una linea aunque sea vadía antes deun\n
 System.out.println("El cuadrado es: " + Math.pow(n,2));
 System.out.print("Introduzca su nombre: ");
 nombre = sc.nextLine(); //leemos el String después del double
 System.out.println("Hola " + nombre + "!!!");
 System.out.printf("%e", radio);
 }
}
 

    

