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
public class InfoMision extends JPanel implements Observer{
    
    private Modelo modelo;
    private JLabel info;
    
    public InfoMision(Modelo modelo){
        this.modelo = modelo;
        info = new JLabel(this.modelo.getIdioma().getInfoMision1());
        add(info);
    }
    
    public void update(Observable o, Object arg){
        info.setText(this.modelo.getIdioma().getInfoMision1());
    }
    
}
