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
 * Realice un programa que pinte la L por pantalla.
 * Se pide la altura y la base será h/2
 */
public class Ejer_31 {
    
    public static void main(String[] args) {
            
          
            int h;
            
            Scanner entrada=new Scanner(System.in);
            System.out.println("Inserte un número");
            h=entrada.nextInt();
            int b=h/2;
            
            for (int i=1; i<=h; i++)
                System.out.print(i<h? "*\n": "*");
            for(int i=1; i<=b; i++)
                 System.out.print(" *");
            entrada.close();
}
}
