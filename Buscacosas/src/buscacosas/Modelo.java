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
    
    // ranking
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
    
}
