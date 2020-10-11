/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *Averiguar si un número es capicúa
 * @author javie
 */
public class Ejer_36 { 
    public static void main(String[] args) {
            
            long n;
           
            Scanner entrada=new Scanner(System.in);
            System.out.println("Inserte un número");
            n=entrada.nextLong();
            long numero=n;
            int exp=1;
            int cociente;
            int modulo;
            int cifras;
            
            do{
            
            cifras=0;  //hallo el número de cifras del número
                     for(long i=1; i<=n; i*=10){ 
                     if(n%i>=0) 
                     cifras++;}
                      //System.out.println(cifras+" cifras"); 
            for(int i=1; i<cifras; i++) //obtengo 10 elevado a 1 menos el número de cifras del número
                exp=10*exp;
                       
            cociente =(int)n/exp; //hallo el cociente del número diviendo el número x 10 elevado a el numero de cifras -1
            //System.out.println(cociente+" cociente");
            n%=exp;
            //System.out.println(n +"es el numero sin cociente");
            
            modulo=(int)n%10;
            //System.out.println(modulo+" modulo");
            exp=1;
            n/=10;
            //System.out.println(n+"es el numero sin modulo");
         
            
            }while(cociente==modulo&&cifras>1); //mientras el coiente sea igual al módulo sigue iterando
            //si queda una sóla cifra es que el módulo y el cociente han venido siendo iguales y como sólo queda 1 pues es capicúa
             if(cifras<=1)System.out.println("El número "+ numero+" es capicua");
             else  System.out.println("El número " + numero + " no es capicúa");
    }
}