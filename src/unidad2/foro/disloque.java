
package unidad2.foro;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class disloque {
    
    public static void main(String[] args) {
          
              long n;
              int digito;
              long recomposicion=0;
              int count=0;
              int exp=1;
              int exp2=1;
                          
              Scanner entrada=new Scanner(System.in);
              System.out.println("Inserte un número");
              n=entrada.nextLong();
              
                  int cifras=0;  //hallo el número de cifras del número
                     for(long i=1; i<=n; i*=10){ 
                     if(n%i>=0) 
                     cifras++;
                     
                     }
                     for(int i=1; i<cifras; i++) //obtengo 10 elevado a 1 menos el número de cifras del número
                     exp2=10*exp2;
                    
                     
                     int cociente =(int)n/exp2; //hallo el cociente del número por el exp2 y obtengo la primera cifra del número
                     //que si es 1 se me disloca
                   
              while(n>0){
                  
               digito=(int)n%10; //Averigüamos el módulo del número
               if(digito%2==0) digito++;
               else digito--;
               n/=10;
               
                //recomposicion+=(long)(digito*Math.pow(10, count));
               if(count>0) exp=10*exp; //Multiplicamos el módulo por potencias de 10
               recomposicion+=(long)(digito*exp); //y vamos sumando
               count++; //aumentamos el contador para obtener la potencia de 10 adecuada
             
              }
          
                     System.out.print("El número dislocado es "+ (cociente==1 ? "0" +recomposicion: recomposicion)+"\n");   
                       
                     //si es uno uso el operador condicional e imprimo un string "0" y lo concateno al numero dislocado
    }
    
}
