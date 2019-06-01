/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

import java.util.Observable;
import java.util.Observer;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author GCM
 */
public class Casilla extends JButton implements Observer{
    private boolean esMina = false;
    private boolean esOculto = true;
    private boolean tieneBandera = false;
    private int minasAlrededor = 0;
    private Modelo modelo;
    
    public Casilla(Modelo modelo){
        this.modelo = modelo;
        setContentAreaFilled(false);
        setIcon(modelo.getMision().getSinPisar());
    }
    
    public void update(Observable o, Object arg) {
        if (!esOculto){
            if (esMina){
                setIcon(modelo.getMision().getMina());
            }
            //else setIcon(num[minasAlrededor]);
            else{
                setIcon(null);
                setText(Integer.toString(minasAlrededor));
            }
        }
        else if (tieneBandera) setIcon(modelo.getMision().getBandera());
    }

    public boolean getMina() {
        return esMina;
    }

    public void revelar() {
        esOculto = false;
        setEnabled(false);
        update(new Observable(), new Object());
    }
    
    public void setMina(boolean b) {
        esMina = b;
    }

    public void setNum(int nminas) {
        minasAlrededor = nminas;
    }

    public void bandera() {
        tieneBandera = !tieneBandera;
    }

    public int minasAlrededor() {
        return minasAlrededor;
    }
    
    public boolean esOculto() {
        return esOculto;
    }
}