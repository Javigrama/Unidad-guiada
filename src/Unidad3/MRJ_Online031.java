/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * El paquete consta de varias clases con utilidades didácticas
 */

package Unidad3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *Se trata de una clase con diversas utilidades matemáticas
 *@author Javier Martínez Ruiz
 *@version 1.0
 */
public class MRJ_Online031 {

    
        static Scanner entrada=new Scanner(System.in);
        
    /**
     * @param args the command line arguments
     */
 
   
    public static void main(String[] args) {
        
        MRJ_Online031 obj= new MRJ_Online031();
        
        int opcion=-1;
      
       
            do{
                
               try{
                System.out.println();
                System.out.println("Introduzca una opción");
                System.out.println("1. Operaciones con pulgadas y centímetros:  ");
                System.out.println("2. Operaciones aritméticas: ");
                System.out.println("3. Cien primeros números negativos:  ");
                System.out.println("4. Es positivo?:  ");
                System.out.println("5. 10 números pares consecutivos a...:  ");
                System.out.println("6. Suma o resta:  ");
                System.out.println("7. Divide y vencerás:  ");
                System.out.println("8. 50 primeros impares:  ");
                System.out.println("9. Es par o impar?:  ");
                System.out.println("0. Salir:  ");
                System.out.print("--> ");
                opcion=entrada.nextInt();
               }catch (InputMismatchException e){ System.err.println("Error.Marque una opción");
               entrada.nextLine();}
               
               
/**
 * El ejericio solicita que se haga un sólo método por cada uno de los ejercicios
 * de la unidad anterior y que estos métodos reciban los parámetros necesarios
 * para hacer los cálculos. Estos parámetros deben ser solicitados por teclado. Para
 * ello puede hacerse otro método que solicite y valide la entrada o insertar el código en el 
 * método principal. Se ha optado por esta última opción poque el ejercicio solicita un sólo
 * método por ejercicio. En mi opinión queda mucho más claro si se construye un método
 * adicional para validar la entrada de datos
 */                
                switch(opcion){
                    
                    case 1: 
                       
                           int chooser=0;
                           int cantidad=0;
                           double resultado;
                           boolean flag=false;
        
                        do{
                             try{
                                  System.out.println("Elija una de las siguientes opciones"
                                   +"\n 1: Pulgadas a centímetros"
                                   +"\n 2: Centímetros a pulgadas");
                                   chooser=entrada.nextInt();
//                                  if(chooser<1||chooser>2)System.out.println("La opción debe ser 1 o 2\n");
                         
                              }catch(InputMismatchException e){
                                    System.err.println("Error. Debe ser un número entero 1 o 2\n");
                                    entrada.nextLine();
                              }
                              finally{ System.out.println((chooser<1||chooser>2)? "La opción debe ser 1 o 2\n": "");}
                           
                            
                          }while(chooser!=1&&chooser!=2);
                         
                       //----------------- fin del bucle que solicita la opción deseada
                        
                        
                        while(!flag){
                         
                              try{
                                    System.out.println("Introduzca la cantidad de "+ (chooser==1? "pulgadas ": "centímetros")+" que desea convertir");
                                    cantidad=entrada.nextInt();
                                    flag=true;
                              }catch(InputMismatchException e){ 
                                     System.err.println("Error. Inserte un entero");
                                     entrada.nextLine();
                              }
                            
                        }
                        
                        
//                        ---------fin del bucle que valida la entrda de los enteros que se usarán para hacer las conversiones----------
                        
                        resultado=obj.pulgadasYCentimetros(chooser, cantidad);
                        
                        if(chooser==1) System.out.println(cantidad + (cantidad>1 ? " pulgadas ": " pulgada")+ " son "+ resultado +" cm.");
                         else System.out.println(cantidad + (cantidad>1 ? " centímetros ": " centímetro")+ " son "+ resultado +" pulgadas.");
                        
                        
                        break;
                        
                    case 2: 
                        
                             int n1=0;              // en la tarea online 2 se usaron variables double. Aquí he optado por int
                             int n2=0;              // para que se genere la excepción al dividir por zero y pueda ser capturada
                             flag=false;
                        
                             while(!flag){
                                     try{
                                         System.out.println("Escriba el primer número");
                                         n1=entrada.nextInt();
                                         flag=true;
                                    }catch(InputMismatchException e){ System.err.println("Error en la inserción");
                                    entrada.nextLine();}
                             }
                             
                             flag=false;
                             
                             while(!flag){
                                     try{
                                         System.out.println("Escriba el segundo número");
                                         n2=entrada.nextInt();
                                         flag=true;
                                    }catch(InputMismatchException e){ System.err.println("Error en la inserción. ");
                                    entrada.nextLine();}
                             }
                               
                            try{ //capturamos excepción que declara el método si es lanzada
                             System.out.println(obj.aritmeticas(n1, n2));
                            }catch(ArithmeticException e){ System.err.println("Dividir por zero genera indeterminación");}
                        break;
                        
                        
                    case 3: 
                    
                        obj.cien();
                        break;
                        
                     
                    case 4:
                          resultado=0;
                          flag=false;
                             while(!flag){
                                     try{
                                         System.out.println("Escriba un número");
                                         resultado=entrada.nextDouble();
                                         flag=true;
                                    }catch(InputMismatchException e){ System.err.println("Error en la inserción");
                                    entrada.nextLine();}
                             }
                        System.out.println(obj.positivo(resultado));
                        break;
                    
                        
                        
                    case 5:
                          n1=0;
                          flag=false;
                             while(!flag){
                                     try{
                                         System.out.println("Escriba un número entero");
                                         n1=entrada.nextInt();
                                         flag=true;
                                    }catch(InputMismatchException e){ System.err.println("Error. Error en la inserción");
                                    entrada.nextLine();}
                             }
                        
                        System.out.println("Los 10 números pares siguientes a "+n1+ " son "+obj.masDiezPares(n1));
                        break;
                        
                        
                        
                    case 6:
                        n1=0;
                        n2=0;
                        flag=false;
                        
                        while(!flag){
                                     try{
                                         System.out.println("Escriba un número entero");
                                         n1=entrada.nextInt();
                                         flag=true;
                                    }catch(InputMismatchException e){ System.err.println("Error en lainserción");
                                    entrada.nextLine();}
                             }
                             
                             flag=false;
                             
                        while(!flag){
                                     try{
                                         System.out.println("Escriba el segundo número entero");
                                         n2=entrada.nextInt();
                                         flag=true;
                                    }catch(InputMismatchException e){ System.err.println("Error en la inserción");
                                    entrada.nextLine();}
                             }
                        
//                        ------------hasta aquí para validar la entrada de los dos números
                           chooser=0; 
                           do{
                             try{
                                    System.out.println("Seleccione: "
                                                      + "\n 1-> realiza la suma de los dos números"
                                                      + "\n 2-> realiza la resta de los dos números");
                                    chooser=entrada.nextInt();
                                if(chooser<1||chooser>2)System.out.println("La opción debe ser 1 o 2\n");
                         
                             }catch(InputMismatchException e){
                                    System.err.println("Error. Debe ser 1 o 2\n");
                                    entrada.nextLine();
                              }
                            
                          }while(chooser!=1&&chooser!=2);
                        
//                           ----------ahora disponemos de todos los datos que necesita nuestro método por lo que lo invocamos-----------
                          System.out.println("La "+(chooser==1? " suma ": " resta ")+ "de ambos números es "+ obj.sumaResta(n1, n2, chooser));
                          break;
                          
                          
                    case 7:     
                         double d=-1;
                         resultado=100;
                         
                         do{
                          flag=false;
                             while(!flag){
                                     try{
                                         System.out.println("Escriba un número");
                                         d=entrada.nextDouble();
                                         flag=true;
                                    }catch(InputMismatchException e){ System.err.println("Error en la inserción");
                                    entrada.nextLine();}
                             }
                             
                             try{
                                  System.out.print("El resultado de dividir "+resultado+ " entre "+d+" es ");
                                  resultado=obj.divide(d, resultado);
                                  System.out.println(resultado);
                                
                             }catch(ArithmeticException e){System.out.println(" El método ha lanzado una excepción al dividir por 0 "
                                     + "que se ha propagado y hemos capturado aquí. Y además el ciclo finaliza porque deseamos que finalice "
                                     + "en el caso de que haya que dividir por zero");}
                             //esta excepción no se produciría nunca si estamos utilizando números de precisión double ya que al dividir por 
                             //0.0 La MVJ lanza como resultado Infinity. He optado por hacer un casting en el método al final para provocar la
                             //excepción.
                         }while(d!=0);
                         break;
                          
                          
                   /* case 7: 
                        double d=-1;
                        flag=false;
                             while(!flag){
                                     try{
                                         System.out.println("Escriba un número");
                                         d=entrada.nextDouble();
                                         flag=true;
                                    }catch(InputMismatchException e){ System.err.println("Error. Escriba un número");
                                    entrada.nextLine();}
                             }
                             try{
                                obj.divide(d, 100);
                             }catch(ArithmeticException e){System.err.println("Dividir por cero genera excepción pero como utilizamos"
                                     + "double laMJV lanzará como resultado Infinity");}
                        break;*/
                           
                         
                         
                    case 8:
                          System.out.println(obj.cincuenta());
                          break;
                          
                     
                    case 9: 
                         n1=0;
                          flag=false;
                             while(!flag){
                                     try{
                                         System.out.println("Escriba un número entero");
                                         n1=entrada.nextInt();
                                         flag=true;
                                    }catch(InputMismatchException e){ System.err.println("Error. Escriba un número");
                                    entrada.nextLine();}
                             }
                             
                             System.out.println(obj.esParImpar(n1));
                        
                         break;
                          
                    case 0:
                        System.out.println("Au Revoir");
                        break;
                          
                    default: System.out.println("Del 1 al 9 y 0 si desea salir");
                        break;
                }
            } while(opcion!=0);
    }
    
    
      /**
       * El método realiza conversiones de pulgadas a cm o a la inversa
       * @param chooser Se trata de la opción que elige el usuario para convertir, bien pulgadas a cm, bien cm a pulgadas
       * @param cantidad Indica la cantidad que será convertida
       * @return Devuelve el valor convertido
       * 
       */
    
    public double pulgadasYCentimetros(int chooser, int cantidad){
        
        if(chooser==1){
          
            return cantidad*2.54;
        }
        else {
          
            return cantidad/2.54;
           
        }
    }
    
    /**
     * El método calcula operaciones aritméticas simples
     * @param x es el primer número
     * @param z es el segundo número
     * @return Devuelve un cadena de carácteres en la que se detallan los resultados
     * @throws ArithmeticException cuya captura se delega
     */
    
    
    
    public String aritmeticas(int x, int z) throws ArithmeticException{
        
        
        return "La suma de ambos números es "+ (x+z)+"\n"
                +"La resta es "+(x-z)+"\n"
                +"El productos es "+(x*z)+"\n"
                +"El cociente es "+ (x/z)+"\n";
                
    }      
    
   /**
    * El método debe devolver los primeros 100 números negativos
    * Se ha optado por void para que devuleva el resultado de una vez
    * en lugar de uno en uno
    */
        
        public void cien() {
        
            for(int i=1; i<=100; i++)
            System.out.print((i*-1)+(i%10==0 ? "\n": i<10? "  ": " "));
        
    }
        
        
        
        /**
         * El método recibe un número y averigua si es positivo
         * @param n Es el número cuyo signo deseamos saber
         * @return Devuelve una cadena de carácteres vacía si no es positivo y
         * afirmando si es positivo
         */
        
         public String positivo(double n) {
            
             double numero=n;
             return (numero>0)?"El número introducido es positivo":"";
       
        }
         
         
         
         
        /**
         * El método sirve para devolver los 10 siguientes números pares a uno
         * solicitado
         * @param n Es el entero solicitado
         * @return Devuelve una cadena de carácteres con los 10 pares siguientes.
         */ 
           
         public String masDiezPares (int n) {
        
            int numero=n;
            int contador=10;
            String diezPares="";
      
             while(contador>0){     //Como en casos anteriores podría ejecutarse el bucle fuera del método y 
                                    //que éste fuera retornando cada uno de los pares
            
             diezPares+=(numero%2==0? (numero+=2)+" ": (contador==10? (numero+=1)+ " ":(numero+=2)+ " "));
             contador--;
            }
            return diezPares; 
         }
         
         
         
         
         /**
          * Suma o resta dos operandos
          * @param n1 Es el primer operando
          * @param n2 Es el segundo operando
          * @param op Es la opción que significa la operación a realizar, si suma o resta
          * @return Devuelve un valor entero, resultado de la operación correspondiente
          */
         
         public int sumaResta(int n1, int n2, int op) {
  
            int opcion=op;
            
            return (op==1? n1+n2: n1-n2);
               
        }
         
         
         
         /**
          * Divide un operando entre otro e impide la división por zero que se ha
          * tratado como una excepción
          * @param d es el double que hará de divisor
          * @param r es el dividendo
          * @return devuelve el resultado de la división
          * @throws ArithmeticException cuando se divide por zero
          */
         
         
         public double divide(double d, double r) throws ArithmeticException {
            
                double n=d;
                double  dividendo=r;
                return (int)dividendo/(int)n; //he optado por hacer un casting y convertir el double en int para que 
                                                // se genere la excepción y sea capturada fuera del método
                
        }
         
         
       
           
        /*public void divide(double d, double r) throws ArithmeticException{
            
                double n=d;
                double  dividendo=r;
                System.out.println("El resultado de dividir "+dividendo+"/"+n+ " es " + dividendo/n);
                dividendo/=n;
               
                do{
                    boolean flag=false;
                             while(!flag){
                                     try{
                                         System.out.println("Escriba un número");
                                         d=entrada.nextDouble();
                                         flag=true;
                                    }catch(InputMismatchException e){ System.err.println("Error. Escriba un número");
                                    entrada.nextLine();}
                             }
                    divide(d, dividendo);
                }while(d!=0);
        }*/
         
         
         
         /**
          * El método sirve para mostrar los 50 primeros números impares
          * @return Devuelve una cadena de carácteres con los 50 primeros impares
          */
         
         
         
            public String cincuenta() {

                String cincuenta="";
                for(int i=1; i<100; i++){
           
                 if(i%2==0) continue;
         
                      cincuenta+=(i+(i==1? " ":i%10==1? "\n": " "));
                 }
                return cincuenta;
            }
         
         
         /**
          * El método determina si un número es par o impar
          * @param n es el número cuyo dato se desea conocer
          * @return Devuelve una cadena de carácteres indicando si el parámetro es par o impar
          */
            
            
            public String esParImpar(int n) {
        
                    return ("El número es "+ (n%2==0? "par":"impar"));
            }
            
  
             
              
            
            public boolean validarPulgadasCm(){
                
                      int chooser=0;
                      int cantidad=0;
                      double resultado;
                      boolean flag=false;
                      
                      
                        do{
                             try{
                                  System.out.println("Elija una de las siguientes opciones"
                                   +"\n 1: Pulgadas a centímetros"
                                   +"\n 2: Centímetros a pulgadas");
                                   chooser=entrada.nextInt();
//                                  if(chooser<1||chooser>2)System.out.println("La opción debe ser 1 o 2\n");
                         
                              }catch(InputMismatchException e){
                                    System.err.println("Error. Debe ser un número entero 1 o 2\n");
                                    entrada.nextLine();
                              }
                              finally{ System.out.println((chooser<1||chooser>2)? "La opción debe ser 1 o 2\n": "");}
                           
                            
                          }while(chooser!=1&&chooser!=2);
                         
                       //----------------- fin del bucle que solicita la opción deseada
                        
                        
                        while(!flag){
                         
                              try{
                                    System.out.println("Introduzca la cantidad de "+ (chooser==1? "pulgadas ": "centímetros")+" que desea convertir");
                                    cantidad=entrada.nextInt();
                                    flag=true;
                              }catch(InputMismatchException e){ 
                                     System.err.println("Error. Inserte un entero");
                                     entrada.nextLine();
                              }
                            
                        }
                        
                      return true;
                        
                
                }
}

                     
        
         
                  /*      
                        
//                        ---------fin del bucle que valida la entrda de los enteros que se usarán para hacer las conversiones----------
                        
                        resultado=obj.pulgadasYCentimetros(chooser, cantidad);
                        
                        if(chooser==1) System.out.println(cantidad + (cantidad>1 ? " pulgadas ": " pulgada")+ " son "+ resultado +" cm.");
                         else System.out.println(cantidad + (cantidad>1 ? " centímetros ": " centímetro")+ " son "+ resultado +" pulgadas.");
                        
                        
                        break;
}
   */
    