/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas.vistas;

import buscacosas.modelo.Modelo;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author franc
 */
public class InfoMision extends JPanel implements Observer{
    
    private Modelo modelo;
    private JTextArea info;
    
    public InfoMision(Modelo modelo){
        this.modelo = modelo;
        info = new JTextArea(4, 50);
        info.setEditable(false);
        info.setOpaque(false);
        info.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        setBackground(Color.decode("#C2F7F0"));
        
        switch(modelo.getMision().getNumMision()){
            case 1:
                info.setText(this.modelo.getIdioma().getInfoMision1());
                break;
            case 2:
                info.setText(this.modelo.getIdioma().getInfoMision2());
                break;
            case 3:
                info.setText(this.modelo.getIdioma().getInfoMision3());
                break;
            case 4:
                info.setText(this.modelo.getIdioma().getInfoMision4());
                break;
        }
        add(info);
    }
    
    public void update(Observable o, Object arg){
        switch(modelo.getMision().getNumMision()){
            case 1:
                info.setText(this.modelo.getIdioma().getInfoMision1());
                break;
            case 2:
                info.setText(this.modelo.getIdioma().getInfoMision2());
                break;
            case 3:
                info.setText(this.modelo.getIdioma().getInfoMision3());
                break;
            case 4:
                info.setText(this.modelo.getIdioma().getInfoMision4());
                break;
        }
    }
    
}
