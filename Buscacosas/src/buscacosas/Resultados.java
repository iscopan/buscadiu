/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

/**
 *
 * @author GCM
 */
public class Resultados {
    private String nommbre = new String();
    private int segundos;
    
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
}
