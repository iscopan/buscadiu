/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

import java.util.*;

/**
 *
 * @author franc
 */
public class Modelo extends Observable{
    
    private Resultado[] ranking;
    
    public Modelo(){
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
    
    // idiomas querida (array + elegido)
    // misiones (array + elegida)
    
    public void notificarObservadores(){
        setChanged();
        notifyObservers();
    }
    
    public String getChooseMissionMessage(){
        return "Elige tu misión:";
    }
    
    public String getMissionInfo(){
        return "info de la misión";
    }
    
    public int getX(){
        return 8;
    }
    
    public int getY(){
        return 8;
    }
    
    public int getNumMinas(){
        return 8;
    }
    
    public String getRanking(int pos){
        String puntos = "";
        if(ranking[pos] != null){
            puntos = ranking[pos].getNombre() + " ---- " + ranking[pos].getSegundos();
        }
        return puntos;
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
}
