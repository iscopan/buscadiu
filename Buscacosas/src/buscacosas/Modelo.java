/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

import java.util.*;

/**
 *
 * @author francisco
 */
public class Modelo extends Observable{
    
    private Resultado[] ranking;
    private Idioma idioma;
    private Mision mision;
    
    public Modelo(){
        setIdiomaEspannol();
        setMisionUno();
        ranking = new Resultado[10];
        ranking[0] = new Resultado("CEN", 10);
        ranking[1] = new Resultado("JUA", 20);
        ranking[2] = new Resultado("ISC", 30);
        ranking[3] = new Resultado("MAN", 40);
        ranking[4] = new Resultado("SAM", 50);
        ranking[5] = new Resultado("PAB", 60);
        ranking[6] = new Resultado("ISM", 70);
        ranking[7] = new Resultado("KAL", 80);
        ranking[8] = new Resultado("ROC", 90);
    }
    
    public void notificarObservadores(){
        setChanged();
        notifyObservers();
    }
    
    public Resultado getRanking(int pos){
        return ranking[pos];
    }
    
    public void actualizarRanking(String nombre, int tiempo){
        boolean incluido = false;
        for(int i = 0; i < 9; i++ ){
            if(tiempo < ranking[i].getSegundos()){
                
                for(int j = 8; j > i; j-- ){
                    ranking[j].setNombre(ranking[j-1].getNombre());
                    ranking[j].setSegundos(ranking[j-1].getSegundos());
                }
                ranking[i].setNombre(nombre);
                ranking[i].setSegundos(tiempo);
                incluido = true;
                break;
            }
        }
        if(incluido == false){
            ranking[9] = new Resultado(nombre, tiempo);
        }
        notificarObservadores();
    }
    
    public void actualizarRanking(){
        ranking[9] = null;
        notificarObservadores();
    }
    
    public void setIdiomaEspannol(){  
        idioma = Idioma.espannol();
        notificarObservadores();
    }
    
    public void setIdiomaIngles(){
        idioma = Idioma.ingles();
        notificarObservadores();
    }
    
    public Idioma getIdioma(){
        return idioma;
    }
    
    public Mision getMision(){
        return mision;
    }
    
    public void setMisionUno(){
        mision = Mision.misionUno();
        notificarObservadores();
    }
    
    public void setMisionDos(){
        mision = Mision.misionDos();
        notificarObservadores();
    }
    
    public void setMisionTres(){
        mision = Mision.misionTres();
        notificarObservadores();
    }
    
    public void setMisionCuatro(){
        mision = Mision.misionCuatro();
        notificarObservadores();
    }
    
}
