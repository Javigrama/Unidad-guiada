/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ejer_4_5_9 {
    
       public static void main(String[] args) {
           
              int numero_horas;  
              String nombre="";
              Scanner entrada=new Scanner(System.in);
              double sueldo_semanal_bruto;
              double sueldo_semanal_neto;
              
             
              do{
              System.out.println("Introduzca su nombre");
              nombre+=entrada.nextLine();
              System.out.println("Introduzca el número de horas trabajadas en la semana");
              numero_horas=entrada.nextInt();
              }while(numero_horas<=0);
              
              sueldo_semanal_bruto=numero_horas<=40?7.5*numero_horas:7.5*40+((numero_horas-40)*(7.5*50/100+7.5));
              
              
              
          
              System.out.println(nombre+" su sueldo bruto es "+ sueldo_semanal_bruto+ "euros."+
                      "\nLos impuestos a pagar son " + (sueldo_semanal_bruto-sueldoNeto(sueldo_semanal_bruto))+ " euros."+
                      "\nSu sueldo neto es "+ sueldoNeto(sueldo_semanal_bruto)+" euros.");
             
           
       }
       
       public static double sueldoNeto(double s){
           
          // if(s<=150) return s;
            if(s>=150&s<=300){
               
               double s2=s-150;
               return 150+s2*85/100;
               
           }
           
           else if (s>300){
               
               double s3=s-300;
               return 150+(150*85/100)+(s3*65/100);
           }
                  
            return s;
        }
       
       
          
           
       }
    

