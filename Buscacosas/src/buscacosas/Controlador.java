/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author franc
 */
public class Controlador extends JFrame{
    
    private Modelo modelo = new Modelo();
    
    private InfoMision infoMision = new InfoMision(modelo);
    private ElegirMision elegirMision = new ElegirMision(modelo);
    
    private JPanel panelInicio;
    private JPanel panelJuego;
    private JPanel panelAyuda;
    private JPanel panelRanking;
    
    public Controlador(){
        
        modelo.addObserver(infoMision);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        generarPanelInicio();
        
    }
    
    public void generarPanelInicio(){
        
        panelInicio = new JPanel(new GridBagLayout());
        GridBagConstraints gb = new GridBagConstraints();
        gb.fill = GridBagConstraints.BOTH;
        
        gb.gridwidth = 4;
        agrega(elegirMision, gb, panelInicio, 0, 0);
        
        gb.gridwidth = 1;
        JButton mision1 = new JButton("Misión 1");
        agrega(mision1, gb, panelInicio, 0, 1);
        
        JButton mision2 = new JButton("Misión 2");
        agrega(mision2, gb, panelInicio, 1, 1);
        
        JButton mision3 = new JButton("Misión 3");
        agrega(mision3, gb, panelInicio, 2, 1);
        
        JButton mision4 = new JButton("Misión 4");
        agrega(mision4, gb, panelInicio, 3, 1);
        
        JPanel panelIdiomas = new JPanel();
        JButton esp = new JButton("Español");
        JButton eng = new JButton("English");
        Box b = Box.createVerticalBox();
        b.add(esp);
        b.add(b.createVerticalGlue());
        b.add(eng);
        b.add(b.createVerticalGlue());
        panelIdiomas.add(b);
        agrega(panelIdiomas, gb, panelInicio, 4, 1);
        
        gb.gridwidth = 4;
        gb.gridheight = 2;
        agrega(infoMision, gb, panelInicio, 0, 2);
        
        gb.gridwidth = 1;
        JButton play = new JButton("Jugar");
        play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                generarPanelJuego();
            }
        });
        agrega(play, gb, panelInicio, 4, 2);
        
        gb.gridwidth = 4;
        gb.gridheight = 1;
        JButton ranking = new JButton("Ranking");
        ranking.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                generarPanelRanking();
            }
        });
        agrega(ranking, gb, panelInicio, 0, 4);
        
        gb.gridwidth = 1;
        JButton help = new JButton("?");
        help.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                generarPanelAyuda();
            }
        });
        agrega(help, gb, panelInicio, 4, 4);
        
        getContentPane().removeAll();
        add(panelInicio);
        pack();
        
    }
    
    public void generarPanelJuego(){
        
        panelJuego = new JPanel(new BorderLayout());
        
        JButton volver = new JButton("Volver");
        volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                generarPanelInicio();
            }
        });
        panelJuego.add(volver, BorderLayout.NORTH);
        
        JPanel panelJugable = new JPanel(new GridLayout(modelo.getX(), modelo.getY()));
        for(int i = 0; i < modelo.getX(); i++){
            for(int j = 0; j < modelo.getY(); j++){
                JButton casilla = new JButton(".");
                casilla.addMouseListener(new MouseListener(){
                    public void mousePressed(MouseEvent e){}
                    public void mouseReleased(MouseEvent e){}
                    public void mouseEntered(MouseEvent e){}
                    public void mouseExited(MouseEvent e){}
                    public void mouseClicked(MouseEvent e){
                        JButton c = (JButton) e.getSource();
                        switch(e.getButton()){
                            case MouseEvent.BUTTON1:
                                break;
                            case MouseEvent.BUTTON3:
                                break;
                        }
                    }
                });
                panelJugable.add(casilla);
            }
        }
        
        // panelJugable.getComponents(); devuelve todos los componentes
        
        panelJuego.add(panelJugable, BorderLayout.CENTER);
        
        getContentPane().removeAll();
        add(panelJuego);
        pack();
        
    }
    
    public void generarPanelAyuda(){
        
        panelAyuda = new JPanel(new BorderLayout());
        
        JButton volver = new JButton("Volver");
        volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                generarPanelInicio();
            }
        });
        panelAyuda.add(volver, BorderLayout.NORTH);
        
        
        
        getContentPane().removeAll();
        add(panelAyuda);
        pack();
    }
    
    public void generarPanelRanking(){
        panelRanking = new JPanel(new BorderLayout());
        
        JPanel cabecera = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        JButton volver = new JButton("<--");
        cabecera.add(volver);
        volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                generarPanelInicio();
            }
        });
        
        JLabel leaderBoard = new JLabel("LEADERBOARD");
        cabecera.add(leaderBoard);
        
        JPanel panelMuestraRanking = new JPanel(new FlowLayout());
        JLabel listaRanking = new JLabel();
        listaRanking.setText("Aqui van los resultados del ranking");
        panelMuestraRanking.add(listaRanking);
        
        
        JPanel panelMuestraMision = new JPanel();
        Box caja = Box.createVerticalBox();
        JLabel mision = new JLabel("MISION:");
        JLabel nombreMision = new JLabel("_________");
        JButton imagen = new JButton("IMAGEN DE LA MISON");
        caja.add(mision);
        caja.add(caja.createVerticalGlue());
        caja.add(nombreMision);
        caja.add(caja.createVerticalGlue());
        caja.add(imagen);
        panelMuestraMision.add(caja);
        
        
        panelRanking.add(cabecera, BorderLayout.NORTH);
        panelRanking.add(panelMuestraMision, BorderLayout.EAST);
        panelRanking.add(panelMuestraRanking, BorderLayout.CENTER);
        
        
        
        getContentPane().removeAll();
        add(panelRanking);
        pack();
    }
    
    private void agrega(Component c, GridBagConstraints gb, JPanel v, int x, int y){
        gb.gridx = x;
        gb.gridy = y;
        gb.weightx = 1;
        gb.weighty = 1;
        v.add(c, gb);
    }
    
}
