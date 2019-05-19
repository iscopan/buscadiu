/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

import javax.swing.UIManager;

/**
 *
 * @author franc
 */
public class Buscacosas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // cosas porque no minas
        
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            
        }
        
        Controlador controlador = new Controlador();
        
    }
    
}
