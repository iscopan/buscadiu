/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas.modelo;

/**
 *
 * @author GCM
 */
public class Resultado{
    private String nommbre;
    private int segundos;
    
    public Resultado(){
        
    }
    
    public Resultado(String nombre, int segundos){
        this.nommbre = nombre;
        this.segundos = segundos;
    }
    
    public String getNombre(){
        return nommbre;
    }
    
    public int getSegundos(){
        return segundos;
    }
    
    public void setNombre(String nombre){
        this.nommbre = nombre;
    }
    
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }
    
    public String aString(){
        return nommbre + "\t" + segundos;
    }
}
