/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas.vistas;


import buscacosas.modelo.Modelo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author GCM
 */
public class Contador extends JPanel implements Observer{
    
    
    private Modelo modelo;
    private JLabel tiempo;
    private JLabel reloj;
    private JLabel numBanderas;
    private JLabel icono;
    
    public Contador(Modelo modelo){
        
        new BorderLayout();
        
        this.modelo = modelo;
        tiempo = new JLabel(" " + modelo.getSegundos() + "seg");
        reloj = new JLabel(modelo.getMision().getReloj());
        icono = new JLabel(modelo.getMision().getBandera());
        numBanderas = new JLabel(" x" + modelo.getNumeroBanderas());
        
        setBackground(Color.decode("#C2F7F0"));
        
        add(reloj);
        add(tiempo);
        add(icono, BorderLayout.WEST);
        add(numBanderas, BorderLayout.WEST);   
    }
    
    public void update(Observable o, Object arg) {
        tiempo.setText(" " + modelo.getSegundos() + "seg");
        numBanderas.setText(" x" + modelo.getNumeroBanderas());
        reloj.setIcon(modelo.getMision().getReloj());
        icono.setIcon(modelo.getMision().getBandera());
    }
    
}