/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *Convetir un entero a palotes
 * @author javie
 */
public class Ejer_37 {
    
     public static void main(String[] args) {
            
            int n;
            int digito;
            int nvolteado=0;
            int exp=1;
            String palote="";
           
            Scanner entrada=new Scanner(System.in);
            System.out.println("Inserte un número");
            n=entrada.nextInt();
    
            while(n>0){
                
                nvolteado=(nvolteado*10)+(n%10); //le damos la vuelta al número para imprimir directamente los módulos
                n/=10;
            }
            
            while(nvolteado>0){
                  
               digito=(int)nvolteado%10; //Averigüamos el módulo del número
               nvolteado/=10;
               
               for(int i=0;i<digito; i++){
                   palote+="|";}
              // palote+= i==digito-1? "-":"";}
              palote+= nvolteado>0? "-": "";
            }
            
            System.out.print(palote);
    }
}