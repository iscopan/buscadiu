/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas.vistas;

import buscacosas.modelo.Modelo;
import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author franc
 */
public class ElegirMision extends JPanel implements Observer{
    
    private Modelo modelo;
    private JLabel texto;
    
    public ElegirMision(Modelo modelo){
        this.modelo = modelo;
        texto = new JLabel(this.modelo.getIdioma().getEligeMision());
        Font f = texto.getFont();
        texto.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
        setBackground(Color.decode("#C2F7F0"));
        add(texto);
    }
    
    public void update(Observable o, Object arg){
        texto.setText(modelo.getIdioma().getEligeMision()); 
    }
    
}
