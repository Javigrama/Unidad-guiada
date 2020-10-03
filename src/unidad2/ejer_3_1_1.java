/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author javie
 */
public class ejer_3_1_1 {
    
    static double aciertos=12;
    static double errores=3;
    static double blanco=5;
    
    public static void main(String[] args) {
        
       System.out.println("La calificación es " +calificacion(notaFinal(aciertos, errores, blanco)));
        
    }
    
    public static double notaFinal(double a, double e, double b){
        
        double aciertos=a*1.0;
        double errores=e*-0.5;
        double blanco=b*0;
        double nota=(aciertos+errores+blanco)/2;
        
        return nota;
    }
    
    
    public static String calificacion(double n){
        
        String calificación="";
        
        if(n<5) calificación+="INSUFICIENTE";
        else if (n>=5&&n<6) calificación+="SUFICIENTE";
        else if (n>=6&&n<7) calificación+="BIEN";
        else if (n>=7&&n<9) calificación+="NOTABLE";
        else if (n>=9&&n<10) calificación+="SOBRESALIENTE";
        
        return calificación;
    }
}
