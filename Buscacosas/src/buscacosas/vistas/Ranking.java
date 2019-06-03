/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas.vistas;

import buscacosas.modelo.Modelo;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Guillermo
 */
public class Ranking extends JPanel implements Observer{

    private Modelo modelo;
  
    private JLabel puesto1 = new JLabel("  1º");
    private JLabel puesto2 = new JLabel("  2º");
    private JLabel puesto3 = new JLabel("  3º");
    private JLabel puesto4 = new JLabel("  4º");
    private JLabel puesto5 = new JLabel("  5º");
    private JLabel puesto6 = new JLabel("  6º");
    private JLabel puesto7 = new JLabel("  7º");
    private JLabel puesto8 = new JLabel("  8º");
    private JLabel puesto9 = new JLabel("  9º");
    private JLabel puestoN = new JLabel("");
    
    private JLabel nombre1 = new JLabel();
    private JLabel nombre2 = new JLabel();
    private JLabel nombre3 = new JLabel();
    private JLabel nombre4 = new JLabel();
    private JLabel nombre5 = new JLabel();
    private JLabel nombre6 = new JLabel();
    private JLabel nombre7 = new JLabel();
    private JLabel nombre8 = new JLabel();
    private JLabel nombre9 = new JLabel();
    private JLabel nombreN = new JLabel();
    
    private JLabel tiempo1 = new JLabel();
    private JLabel tiempo2 = new JLabel();
    private JLabel tiempo3 = new JLabel();
    private JLabel tiempo4 = new JLabel();
    private JLabel tiempo5 = new JLabel();
    private JLabel tiempo6 = new JLabel();
    private JLabel tiempo7 = new JLabel();
    private JLabel tiempo8 = new JLabel();
    private JLabel tiempo9 = new JLabel();
    private JLabel tiempoN = new JLabel();
    
    public Ranking(Modelo modelo){
        this.modelo = modelo;
        
        setLayout(new GridLayout(10,3,20,10));
        
        nombre1.setText(modelo.getRanking(0).getNombre());
        nombre2.setText(modelo.getRanking(1).getNombre());
        nombre3.setText(modelo.getRanking(2).getNombre());
        nombre4.setText(modelo.getRanking(3).getNombre());
        nombre5.setText(modelo.getRanking(4).getNombre());
        nombre6.setText(modelo.getRanking(5).getNombre());
        nombre7.setText(modelo.getRanking(6).getNombre());
        nombre8.setText(modelo.getRanking(7).getNombre());
        nombre9.setText(modelo.getRanking(8).getNombre());
        nombreN.setText("");
        
        tiempo1.setText(modelo.getRanking(0).getSegundos() + "seg.");
        tiempo2.setText(modelo.getRanking(1).getSegundos() + "seg.");
        tiempo3.setText(modelo.getRanking(2).getSegundos() + "seg.");
        tiempo4.setText(modelo.getRanking(3).getSegundos() + "seg.");
        tiempo5.setText(modelo.getRanking(4).getSegundos() + "seg.");
        tiempo6.setText(modelo.getRanking(5).getSegundos() + "seg.");
        tiempo7.setText(modelo.getRanking(6).getSegundos() + "seg.");
        tiempo8.setText(modelo.getRanking(7).getSegundos() + "seg.");
        tiempo9.setText(modelo.getRanking(8).getSegundos() + "seg.");
        tiempoN.setText("");
        
        add(puesto1,0);
        add(nombre1,1);
        add(tiempo1,2);
        
        add(puesto2,3);
        add(nombre2,4);
        add(tiempo2,5);
        
        add(puesto3,6);
        add(nombre3,7);
        add(tiempo3,8);
        
        add(puesto4,9);
        add(nombre4,10);
        add(tiempo4,11);
        
        add(puesto5,12);
        add(nombre5,13);
        add(tiempo5,14);
        
        add(puesto6,15);
        add(nombre6,16);
        add(tiempo6,17);
        
        add(puesto7,18);
        add(nombre7,19);
        add(tiempo7,20);
        
        add(puesto8,21);
        add(nombre8,22);
        add(tiempo8,23);
        
        add(puesto9,24);
        add(nombre9,25);
        add(tiempo9,26);
       
        add(puestoN,27);
        add(nombreN,28);
        add(tiempoN,29);
    }
    
    public void update(Observable o, Object arg) {
        nombre1.setText(modelo.getRanking(0).getNombre());
        nombre2.setText(modelo.getRanking(1).getNombre());
        nombre3.setText(modelo.getRanking(2).getNombre());
        nombre4.setText(modelo.getRanking(3).getNombre());
        nombre5.setText(modelo.getRanking(4).getNombre());
        nombre6.setText(modelo.getRanking(5).getNombre());
        nombre7.setText(modelo.getRanking(6).getNombre());
        nombre8.setText(modelo.getRanking(7).getNombre());
        nombre9.setText(modelo.getRanking(8).getNombre());
        
        
        tiempo1.setText(modelo.getRanking(0).getSegundos() + "seg.");
        tiempo2.setText(modelo.getRanking(1).getSegundos() + "seg.");
        tiempo3.setText(modelo.getRanking(2).getSegundos() + "seg.");
        tiempo4.setText(modelo.getRanking(3).getSegundos() + "seg.");
        tiempo5.setText(modelo.getRanking(4).getSegundos() + "seg.");
        tiempo6.setText(modelo.getRanking(5).getSegundos() + "seg.");
        tiempo7.setText(modelo.getRanking(6).getSegundos() + "seg.");
        tiempo8.setText(modelo.getRanking(7).getSegundos() + "seg.");
        tiempo9.setText(modelo.getRanking(8).getSegundos() + "seg.");
        
        
        if(modelo.getRanking(9) != null){
            nombreN.setText(modelo.getRanking(9).getNombre());
            tiempoN.setText(modelo.getRanking(9).getSegundos() + "seg.");
            puestoN.setText("  N");
        }else{
            nombreN.setText("");
            tiempoN.setText("");
            puestoN.setText("");
        }
    }
    
}
 
        
        
       
        
        