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
    
  
    static int contador=0;
    private double arista;
    private double contenido;
    private String name;

       
    public Cubo(double a, String n){
            
        arista=a;
        contador++;
        setName(n);
       
        
    }

    
    public void vuelcaEn(Cubo destino){
        
        if(this.getContenido()<=destino.volumen(destino.getArista())){ destino.setContenido(this.getContenido());
        System.out.println(destino.toString());}
        else{ System.out.println("Si hace eso el cubo rebosará y se pondrá todo perdido"
                + "\nEl "+this.getName()+ " tiene una contenido de "+ this.getContenido()
                +" y usted pretende verter eso en el "+ destino.getName()+ " cuya capacidad es de "+ destino.volumen(destino.getArista()));}
      
    }

    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name+String.valueOf(contador);
    }
    
    
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
               System.out.println(this.toString());
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
        
        return "El " +this.getName()+ " tiene una capacidad de "+ this.volumen(arista) +
                (this.getContenido()==0? " y ahora está vacío": " y un contenido de "+ this.getContenido());
    }
         


}
