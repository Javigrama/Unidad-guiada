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
public class ejer_4_5_6 {
    
      public static void main(String[] args) {
          
          Scanner entrada=new Scanner(System.in);
          
          double kg;
          double alt;
          
          System.out.println("Ingrese su peso en Kilogramos");
          kg=entrada.nextDouble();
          System.out.println("Ingrese su altuta en metros");
          alt=entrada.nextDouble();
          
          double imc=imCorporal(kg, alt);
          System.out.println("Su IMC es "+ imc);
          
          if(imc<16)System.out.println("Criterio de ingreso en el Hospital");
          else if(imc>=16&imc<17)System.out.println("Infrapeso");
          else if(imc>=17&imc<18)System.out.println("Bajo peso");
          else if(imc>=18&imc<25)System.out.println("Peso normal(saludable)");
          else if(imc>=25&imc<30)System.out.println("Sobrepeso(obesidad de grado I)");
          else if(imc>=30&imc<35)System.out.println("Sobrepeso crónico(obesidad de grado II)");
          else if(imc>=35&imc<=40)System.out.println("Obesidad premórbida(obesidad de grado III)");
          else if(imc>40)System.out.println("Obesidad mórbida(obesidad de grado IV)");
          else System.out.println("Los datos introducidos no son correctos");
      }
      
      public static double imCorporal(double k, double a){
          
          return  k/Math.pow(a, 2);
      }
    
}
