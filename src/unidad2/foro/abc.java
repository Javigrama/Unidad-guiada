/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.foro;

/**
 *
 * @author javie
 */
public class abc {
    
    public static void main(String[] args) {
      // TODO code application logic here
      char a = 'a', b = 'c', c = 'b';

      if (a < b) {
         System.out.println(" la variable a:" + a + " es menor que la variable b:" + b);
      }
      if (b < c) {
         System.out.println(" la variable b:" + b + " es menor que la variable c:" + c);
      } else if (b > c) {
         System.out.println(" la variable b:" + b + " es mayor que la variable c:" + c);
      } else {
         System.out.println(" la variable b:" + b + " es igual que la variable c:" + c);
      }

   }
    
}
