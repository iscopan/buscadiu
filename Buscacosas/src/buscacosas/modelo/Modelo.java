/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas.modelo;

import buscacosas.modelo.Mision;
import buscacosas.modelo.Idioma;
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
    private int numeroBanderas;
    private int segundos = 0;
    private Timer t;

    public Modelo(){
        setIdiomaEspannol();
        setMisionUno();
        
        ActionListener e = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                segundos++;
                notificarObservadores();
            }
        };
        t = new Timer(1000, e);
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
        numeroBanderas = mision.getNumMinas();
        notificarObservadores();
    }
    
    public void setMisionDos(){
        mision = Mision.misionDos();
        ranking = mision.getRanking();
        numeroBanderas = mision.getNumMinas();
        notificarObservadores();
    }
    
    public void setMisionTres(){
        mision = Mision.misionTres();
        ranking = mision.getRanking();
        numeroBanderas = mision.getNumMinas();
        notificarObservadores();
    }
    
    public void setMisionCuatro(){
        mision = Mision.misionCuatro();
        ranking = mision.getRanking();
        numeroBanderas = mision.getNumMinas();
        notificarObservadores();
    }
    
    public void inicio(){
        segundos = 0;
        numeroBanderas = mision.getNumMinas();
        t.start();
        notificarObservadores();
    }
    
    public void parar(){
        t.stop();
        notificarObservadores();
    }
    
    public void quitarBandera() {
        numeroBanderas++;
        notificarObservadores();
    }

    public void ponerBandera() {
        numeroBanderas--;
        notificarObservadores();
    }
    public int getNumeroBanderas(){
        return numeroBanderas;
    }
    
    public int getSegundos(){
        return segundos;
    }
    
    public void setSegundos(int segundos){
        this.segundos = segundos;
        notificarObservadores();
    }
    
    public void setNumBanderas(int numBanderas){
        this.numeroBanderas = numBanderas;
        notificarObservadores();
    }
}
