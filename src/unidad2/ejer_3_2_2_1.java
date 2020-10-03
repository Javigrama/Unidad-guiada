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
public class ejer_3_2_2_1 {
 
    static double aciertos=17;
    static double errores=3;
    static double blanco=0;
    
    public static void main(String[] args) {
        
       System.out.println("La calificación es " +calificacion(notaFinal(aciertos, errores, blanco)));
        
    }
    
    public static int notaFinal(double a, double e, double b){
        
        double aciertos=a*1.0;
        double errores=e*-0.5;
        double blanco=b*0;
        int nota=(int)(aciertos+errores+blanco)/2;
        
        return nota;
    }
    
    
    public static String calificacion(int n){
        
        String calificación="";
        
        switch(n){
            
            case 0: case 1: case 2: case 3: case 4:
                calificación+="INSUFICIENTE";
                break;
                
            case 5:
                calificación+="SUFICIENTE";
                break;
                
            case 6:
                calificación+="BIEN";
                break;
                
            case 7: case 8:
                calificación+="NOTABLE";
                break;
                
                           
            case 9: case 10:
                calificación+="SOBRESALIENTE";
                break;
                
            default:
                calificación+="ERROR EN EL VALOR INTRODUCIDO";
                break;
                       
                
                
        }
        
      
        
        return calificación;
    }
}

