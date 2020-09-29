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
public class ejer12_4_1 {
    
   static int x1=10, x2=5, x3=0;
   static char c1='F', c2='S';
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println(x1==x2 ? true:false);
        System.out.println(c1!=c2 ? true:false);
        System.out.println(x1>10&&x1<100 ? true:false);
        System.out.println(!(x2>10&&x2<100) ? true:false);
        System.out.println(!(x3>10&&x3<100) ? true:false);
        System.out.println(x1>x2&&c1==c2 ? true:false);
        System.out.println(x1>x2||c1!=c2 ? true:false);
        System.out.println(x1<=7&&c2==c1 ? true:false);
        System.out.println(c2!='A'&&x2>0 ? true:false);
        System.out.println('F'!=c1||x1>20 ? true:false);
        System.out.println('F'!=c1||x1>20||x2>20 ? true:false);
        System.out.println('F'==c1&&x3<x1 ? true:false);
        System.out.println('F'==c1&&x3<x1&&x2<=x3 ? true:false);
        System.out.println(x2>x3&&x2<x1&&c2=='S' ? true:false);
        System.out.println(!(x3>x2&&x3<x1) ? true:false);
        System.out.println((!(x3>x2&&x3<x1))||c2==c1 ? true:false);
        System.out.println(!(x3<x1) ? true:false);
        System.out.println((!(x3>x1))&&!(c2!=c1) ? true:false);
        System.out.println(x1<100&&x2>10 ? true:false);
        System.out.println(c2<c1 ? true:false);
        
        
 

    }
    
}
