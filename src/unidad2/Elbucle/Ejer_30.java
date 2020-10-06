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
public class Ejer_30 {
    
    static String[] dias={ "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    
     public static void main(String[] args) {
    
            String dia1="";
            String dia2="";
         
            Scanner entrada=new Scanner(System.in);
            System.out.println("Introduzca el primer día");
            dia1=entrada.nextLine();
            System.out.println("Introduzca el segundo día");
            dia2=entrada.nextLine();
    
            System.out.println(dias[0]);
    }
}
