/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad3;

/**
 *
 * @author javie
 */
public class Ejer_5_3_1 {      
   
        public static void main(String[] args) {
            
            Pajaro pa=new Pajaro("Cuervo", 8, 6);
            System.out.println(pa.toString()); 
            
        }
}
        
        class Pajaro{
            
            String nombre;
            int posX;
            int posY;
            
            public Pajaro(){
                
            }
            
            public Pajaro (String  nombre, int posX, int posY){
                
                this.nombre=nombre;
                this.posX=posX;
                this.posY=posY;
                
            }
            
            public double volar(int posX, int posY){
                    
                    double desp= posX*posX+posY*posY;
                    return Math.sqrt(desp);
            }
            
            @Override
            public String toString(){
                
                return ("El Pájaro "+ this.nombre+ "está en la posición "+ this.posX+ ", "+ this.posY);
            }
            
        }

