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
public class Ejer_33 {
    
    public static void main(String[] args) {
            
          
            int h;
            
            Scanner entrada=new Scanner(System.in);
            System.out.println("Inserte la altura de U");
            h=entrada.nextInt();
            
        
            
            for(int i=1; i<h; i++){
                for(int j=1; j<=h; j++){
                    if(j%h==1||j%h==0) System.out.print("* ");
                    else System.out.print("  ");}
            System.out.println();}
            for(int i=1; i<h;i++){
                if(i%h==1||i%h==0) System.out.print("  ");
                else System.out.print("* ");}
            
            System.out.println();
            entrada.close();
    
    }
    
}
