/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1;
    import java.util.Scanner;
/**
 *
 * @author javie
 */
public class ejer12_7_2 {
       public static void main(String[] args) {
           
          
      Scanner teclado=new Scanner(System.in);
      System.out.print ("Introduzca una palabra: ");
      String palabra= teclado.nextLine();
      System.out.print ("La palabra introducida es " + palabra);
      
      System.out.println("\n"+palabra.charAt(0)+" "+ palabra.charAt(palabra.length()-1));
    }
}
       
    

