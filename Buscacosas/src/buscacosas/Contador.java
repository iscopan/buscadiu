/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author GCM
 */
public class Contador extends JPanel{
    
    private Timer t;
    private Modelo modelo;
    private int segundos = 0;
    private JLabel tiempo;
    private JLabel reloj;
    private int numero;
    private JLabel numBanderas;
    private JLabel icono;
    
    
    public Contador(Modelo modelo){
        
        new BorderLayout();
        
        this.modelo = modelo;
        tiempo = new JLabel(" " + segundos + "seg");
        reloj = new JLabel(modelo.getMision().getReloj());
        icono = new JLabel(modelo.getMision().getBandera());
        numero = modelo.getMision().getNumMinas();
        numBanderas = new JLabel(" x" + numero);
        
        setBackground(Color.decode("#C2F7F0"));
        
        add(reloj);
        add(tiempo);
        add(icono, BorderLayout.WEST);
        add(numBanderas, BorderLayout.WEST);
        
        ActionListener e = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tiempo.setText(" " + segundos + "seg");
                segundos++;
            }
        };
        t = new Timer(1000, e);
    }
    
    public void inicio(){
        t.start();
    }
    
    public void parar(){
        t.stop();
    }
    
    public void quitar() {
        numero++;
        numBanderas.setText(" x" + numero);
    }

    public void poner() {
        numero--;
        numBanderas.setText(" x" + numero);
    }
    public int getNumero(){
        return numero;
    }
    
    public int getSegundos(){
        return segundos;
    }
}