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
            int d1=0;
            int d2=0;
            int hora1;
            int hora2;
         
            Scanner entrada=new Scanner(System.in);
            //presuponemos que el tipo no va a fallar insertando el nombre de los días
            do{ 
                if(d1>d2) System.out.println("Introduzca los días en el orden natural");
            System.out.println("Introduzca el primer día");
            dia1=entrada.nextLine();
            System.out.println("Introduzca el segundo día");
            dia2=entrada.nextLine();
    
           
            
            for(int i=0; i<7; i++) {
                
            
                if(dia1.compareToIgnoreCase(dias[i])==0) d1=i;
                if(dia2.compareToIgnoreCase(dias[i])==0) d2=i;
          
            }
            
            } while(d1>d2);
            
            System.out.println("Introduzca la hora del primer día en formato de 24 horas");
            hora1=entrada.nextInt();
            System.out.println("Introduzca la hora del primer día en formato de 24 horas");
            hora2=entrada.nextInt();
            
            
            //hora1=d1*24+hora1;
            //hora2=d2*24+hora2;
            System.out.print("Entre las "+hora1+ "h del "+ dia1+" y las " +hora2+
                    "h del "+dia2+" hay "+((d2*24+hora2)-(d1*24+hora1))+" horas");
            
            entrada.close();
    }
}
