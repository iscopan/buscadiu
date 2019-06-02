/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;


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
    
    public Contador(Modelo modelo){
        
        
        this.modelo = modelo;
        tiempo = new JLabel("   " + segundos + " seg");
        reloj = new JLabel(modelo.getMision().getReloj());
        
        add(reloj);
        add(tiempo);
        
        ActionListener e = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tiempo.setText("  " + segundos + " seg");
                segundos++;
            }
        };
        t = new Timer(1/2, e);
    }
    
    public void inicio(){
        t.start();
    }
    
    public void parar(){
        t.stop();
    }
}