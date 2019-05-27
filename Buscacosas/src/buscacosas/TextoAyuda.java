/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author GCM
 */
public class TextoAyuda extends JPanel implements Observer{
    
    private Modelo modelo;
    private JTextArea comoJugar;
    private JTextArea creditos;
    
    public TextoAyuda(Modelo modelo){
        this.modelo = modelo;
        comoJugar = new JTextArea(this.modelo.getIdioma().getComoJugar(), 5, 20);
        comoJugar.setEditable(false);
        add(comoJugar);
    }
    
    public void update(Observable o, Object arg){
        comoJugar.setText(modelo.getIdioma().getComoJugar());  
    }
    
}