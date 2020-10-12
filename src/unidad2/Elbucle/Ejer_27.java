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
public class Ejer_27 {
    
     public static void main(String[] args) {
    
            int n;
            int contador=0;
            int multiplo=0;
            int suma=0;
            Scanner entrada=new Scanner(System.in);
            System.out.println("Introduzca un número");
            n=entrada.nextInt();
            
            for(int i=1; i<=n; i++){
                
                if(i%3==0){
                    contador++;
                    multiplo=i;
                    System.out.print(multiplo+" ");
                    suma+=multiplo;
                    
                }
                    
               
            }
             System.out.print("\nHay "+contador+ " múltiplos de 3 que suman "+ suma+"\n");
             entrada.close();
     }
    
}
