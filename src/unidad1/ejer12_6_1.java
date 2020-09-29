/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1;

/**
 *
 * @author javie
 */
public class ejer12_6_1 {
    
       public static void main(String[] args) {
           
           
int i = 0b10000001;         
System.out.println(Integer.toBinaryString(i));
System.out.println(i);

     i=i | 0b00000011;
         System.out.println(Integer.toBinaryString(i));
         System.out.println(i); //El valor de i ahora es 131
       }
    
}
