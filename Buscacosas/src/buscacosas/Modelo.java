/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;

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
        else{
            mision.guardarRanking(mision.getRuta());
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
        ranking = mision.getRanking();
        notificarObservadores();
    }
    
    public void setMisionDos(){
        mision = Mision.misionDos();
        ranking = mision.getRanking();
        notificarObservadores();
    }
    
    public void setMisionTres(){
        mision = Mision.misionTres();
        ranking = mision.getRanking();
        notificarObservadores();
    }
    
    public void setMisionCuatro(){
        mision = Mision.misionCuatro();
        ranking = mision.getRanking();
        notificarObservadores();
    }
}
