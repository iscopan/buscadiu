/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

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
        texto = new JLabel("Elige tu misión:");
        add(texto);
    }
    
    public void update(Observable o, Object arg){
        texto.setText("Elige tu misión:"); //pero en el idioma que sea
    }
    
}
