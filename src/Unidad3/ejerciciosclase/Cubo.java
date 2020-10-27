/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad3.ejerciciosclase;







/**
 * La clase Cubo diseña objetos geométricos cúbicos
 siendo todos sus lados iguales. La variable arista indica la dimensión de su
 * lado y la variable contenido, informa del volumen del contenido del cubo
 * @author javie
 */
public class Cubo {
    
  
    static int contador=0;        // complementael  nomnbre  a los cubos  
    private double arista;       // el lado del cubo
    private double contenido;   //representa como de lleno está el cubo
    private String name;        

       
    public Cubo(double a, String n){
            
        arista=a;
        contador++;
        setName(n);
       
        
    }

    
    public void vuelcaEn(Cubo destino){
        
        if(this.getContenido()<=destino.volumen(destino.getArista())){ destino.setContenido(this.getContenido());
        this.setContenido(0);
        System.out.println(this.toString());
        System.out.println(destino.toString());}
        
        else if(this.getContenido()>destino.volumen(destino.getArista())){
        
            this.setContenido(this.getContenido()-destino.volumen(destino.getArista()));
            destino.llena(destino.getArista());
            System.out.println(this.toString());
            System.out.println(destino.toString());
        
        
        }
      
    }

    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name+String.valueOf(contador);
    }
    
    /**
     * 
     * @param a recibe un valor para calcular el volumen del cubo
     * que representa la máxima capacidad
     * @return la máxima capacidad del cubo
     */
    public double volumen(double a){ 
        
        return Math.pow(a, 3);
    }

    
    public void llena(double a){
        
        contenido=volumen(a);
    }
    
    
    public void vacia(){
        
        if(getContenido()==0) System.out.println("El "+ getName()+ " ya está vacío");
        else { setContenido(0);
               System.out.println("El " +getName()+ " ahora está vacío"); 
               System.out.println(toString());
        }
        
    }

    public double getArista() {
        return arista;
    }
    

    public void setArista(double arista) {
        this.arista = arista;
    }

    public double getContenido() {
        return contenido;
    }

    public void setContenido(double contenido) {
        this.contenido = contenido;
    }
    
    @Override
    public String toString(){
        
        return "El " +getName()+ " tiene una capacidad de "+ volumen(arista) +
                (getContenido()==0? " y ahora está vacío": (getContenido()==volumen(getArista())? 
                " y ahora está lleno": " y un contenido de "+ getContenido()));
    }
         


}
