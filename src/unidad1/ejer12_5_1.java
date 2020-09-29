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
public class ejer12_5_1 {
    
    static double d= Math.random()*100;
    
       public static void main(String[] args) {
           
           System.out.println(d);
           System.out.println(d>=0&&d<20 ? true:false);
           System.out.println(d>=20&&d<=50 ? true:false);
           System.out.println(d>50&&d<75 ? true:false);
           System.out.println(d>=75&&d<=100 ? true:false);
       }
    
}
