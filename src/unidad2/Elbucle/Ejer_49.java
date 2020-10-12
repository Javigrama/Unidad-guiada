/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.Elbucle;

import java.util.Scanner;

/**
 *Calcular máximo, mínimo y media de los números introducidos
 * Si se introduce un número primo, finaliza la inserción y este número
 * no se tendrá en cuenta en los cálculos.
 * Indicar además cantidad de números introducidos sin contar el primo
 * @author javie
 */
public class Ejer_49 {
    
     public static void main(String[] args) {

        long n;
        boolean primo=false;
        long maximo;
        long minimo;
        long suma=0;
        long media;
        int count=0;
        
        

        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte números. La inserción finaliza si introduce un número primo");
        n=entrada.nextLong();
        int contador=0;
            for(int i=1; i<=n; i++){
            if(n%i==0) contador++;}
            if(contador<=2) primo=true;
            if(!primo){
                count++;
                System.out.println(count);
                suma=n;
               
            }
          
        maximo=n;
        minimo=n;
        
        
        while(!primo){
            System.out.print("-->");
             n=entrada.nextLong();
             contador=0;
            for(int i=1; i<=n; i++){
                if(n%i==0) contador++;}
            if(contador<=2) primo=true;
            
            
                if(!primo){
                maximo=n>maximo? n: maximo;
                minimo=n<minimo? n: minimo;
                suma+=n;
                count++; //si no es primo añadimos uno al contador
                }
         
            
        }
        
        System.out.println("Ha introducido "+ count+ " números no primos");
        System.out.println("El máximno es "+ maximo);
        System.out.println("El mínimo es "+ minimo);
        System.out.println("La media es "+ suma/(count>0?count:1));
    }
}
