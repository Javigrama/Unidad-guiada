/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad3.ejerciciosclase;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class PruebaCubo {
    
      static Scanner entrada=new Scanner(System.in);
    
      public static void main(String[] args) {
         
            
         Cubo cubo=null;   
         int opcion=-1;
         
     
            do{
                if(cubo==null){ System.out.println ("Creando un cubo origen: ");
                 cubo= new Cubo(validarDouble(), "Cubo_origen"); 
                  System.out.println(cubo.toString());
                  
                 
                }
                
               try{
                System.out.println();
                System.out.println("Introduzca una opción");
                System.out.println("1. Vacíe el cubo:  ");
                System.out.println("2. Llene el cubo: ");
                System.out.println("3. Vierta el contenido de un cubo en otro:  ");
                System.out.println("4. Destruyendo el cubo:  ");
                System.out.println("0. Salir:  ");
                System.out.print("--> ");
                opcion=entrada.nextInt();
               }catch (InputMismatchException e){ 
                                                 System.err.println("Error en la opción");
                                                 entrada.nextLine();}
            
               
             finally {
                    if (opcion == 0) { 
                         System.out.println("Cerrando el scanner");
                       entrada.close(); }
               }
               switch(opcion){
                   
                   
                   case 0:   System.out.println("Au revoir");
                             break;
                   
                   case 1:
                            cubo.vacia();
                            break;
                        
                   case 2:  
                            cubo.llena(cubo.getArista());
                            System.out.println(cubo.toString());
                            break;
                                 
                   case 3:
                           if(cubo.getContenido()==0)System.out.println("El "+ cubo.getName()+ " está vacío...que quieres volcar?");
                           else cubo.vuelcaEn(new Cubo(validarDouble(), "Cubo_Destino"));
                           break;
                        
                   case 4: 
                           cubo=null;
                           System.out.println("Cubo destruido");
                           break;
                            
                            
                   
                   default: System.out.println("Escriba un número entre 1 y 4 o 0 para salir");
                            break;
                            
               }
             
                 

          
            }while(opcion!=0);
                
            }
      
          public static double validarDouble(){
            
        
                        double d=0;                     
                        boolean  flag=false;        
                       
                        
                             while(!flag){
                                     try{
                                         System.out.println("Escriba el lado del cubo");       
                                         d=entrada.nextDouble();                                                                      
                                         flag=true;                                            
                                    }catch(InputMismatchException e){ System.err.println("Error en la inserción");
                                    entrada.nextLine();}
                             }
                             
                             return d;
                     
             }
    
}
