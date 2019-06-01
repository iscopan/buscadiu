/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

import java.awt.Insets;
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
        setMargin(new Insets(0,0,0,0));
        setIcon(modelo.getMision().getSinPisar());
    }
    
    public void update(Observable o, Object arg) {
        if (!esOculto){
            if (esMina){
                setIcon(modelo.getMision().getMina());
            }
            //else setIcon(num[minasAlrededor]);
            else{
                if(minasAlrededor == 0){
                    setIcon(modelo.getMision().getPisado());
                }
                if(minasAlrededor == 1){
                    setIcon(modelo.getMision().getPisado1());
                }
                if(minasAlrededor == 2){
                    setIcon(modelo.getMision().getPisado2());
                }
                if(minasAlrededor == 3){
                    setIcon(modelo.getMision().getPisado3());
                }
                if(minasAlrededor == 4){
                    setIcon(modelo.getMision().getPisado4());
                }
                if(minasAlrededor == 5){
                    setIcon(modelo.getMision().getPisado5());
                }
                if(minasAlrededor == 6){
                    setIcon(modelo.getMision().getPisado6());
                }
                if(minasAlrededor == 7){
                    setIcon(modelo.getMision().getPisado7());
                }
                if(minasAlrededor == 8){
                    setIcon(modelo.getMision().getPisado8());
                }
                
            }
        }
        else if (tieneBandera){
            setIcon(modelo.getMision().getBandera());
        }
    }

    public boolean getMina() {
        return esMina;
    }

    public void revelar() {
        esOculto = false;
        update(new Observable(), new Object());
    }
    
    public void setMina(boolean b) {
        esMina = b;
    }

    public void setNum(int nminas) {
        minasAlrededor = nminas;
    }

    public void bandera(){
        setIcon(modelo.getMision().getBandera());
        tieneBandera = !tieneBandera;
    }

    public int minasAlrededor() {
        return minasAlrededor;
    }
    
    public boolean esOculto() {
        return esOculto;
    }
}
