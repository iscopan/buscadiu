/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author GCM
 */
public class Ranking extends JPanel implements Observer{

    private Modelo modelo;
    private Box topDiez = Box.createVerticalBox();
    private JLabel pos1 = new JLabel();
    private JLabel pos2 = new JLabel();
    private JLabel pos3 = new JLabel();
    private JLabel pos4 = new JLabel();
    private JLabel pos5 = new JLabel();
    private JLabel pos6 = new JLabel();
    private JLabel pos7 = new JLabel();
    private JLabel pos8 = new JLabel();
    private JLabel pos9 = new JLabel();
    private JLabel posN = new JLabel();
    
    public Ranking(Modelo modelo){
        this.modelo = modelo;
        
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 0));
        
        pos1.setText("1º: " + modelo.getRanking(0) + "seg.");
        pos2.setText("2º: " + modelo.getRanking(1) + "seg.");
        pos3.setText("3º: " + modelo.getRanking(2) + "seg.");
        pos4.setText("4º: " + modelo.getRanking(3) + "seg.");
        pos5.setText("5º: " + modelo.getRanking(4) + "seg.");
        pos6.setText("6º: " + modelo.getRanking(5) + "seg.");
        pos7.setText("7º: " + modelo.getRanking(6) + "seg.");
        pos8.setText("8º: " + modelo.getRanking(7) + "seg.");
        pos9.setText("9º: " + modelo.getRanking(8) + "seg.");
        posN.setText("");
        
        topDiez.add(pos1);
        topDiez.add(topDiez.createVerticalGlue());
        topDiez.add(pos2);
        topDiez.add(topDiez.createVerticalGlue());
        topDiez.add(pos3);
        topDiez.add(topDiez.createVerticalGlue());
        topDiez.add(pos4);
        topDiez.add(topDiez.createVerticalGlue());
        topDiez.add(pos5);
        topDiez.add(topDiez.createVerticalGlue());
        topDiez.add(pos6);
        topDiez.add(topDiez.createVerticalGlue());
        topDiez.add(pos7);
        topDiez.add(topDiez.createVerticalGlue());
        topDiez.add(pos8);
        topDiez.add(topDiez.createVerticalGlue());
        topDiez.add(pos9);
        topDiez.add(topDiez.createVerticalGlue());
        topDiez.add(posN);
        add(topDiez);
        
    }
    
    public void update(Observable o, Object arg) {
        pos1.setText("1º: " + modelo.getRanking(0) + "seg.");
        pos2.setText("2º: " + modelo.getRanking(1) + "seg.");
        pos3.setText("3º: " + modelo.getRanking(2) + "seg.");
        pos4.setText("4º: " + modelo.getRanking(3) + "seg.");
        pos5.setText("5º: " + modelo.getRanking(4) + "seg.");
        pos6.setText("6º: " + modelo.getRanking(5) + "seg.");
        pos7.setText("7º: " + modelo.getRanking(6) + "seg.");
        pos8.setText("8º: " + modelo.getRanking(7) + "seg.");
        pos9.setText("9º: " + modelo.getRanking(8) + "seg.");
        if(!modelo.getRanking(9).equals("")){
            posN.setText("N : " + modelo.getRanking(9) + "seg.");
        }else{
            posN.setText("");
        }
    }
    
}
 
        
        
       
        
        