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
    private Ranking verRanking = new Ranking(modelo);
    private TextoAyuda verAyuda = new TextoAyuda(modelo);
    
    private JPanel panelInicio;
    private JPanel panelJuego;
    private JPanel panelAyuda;
    private JPanel panelRanking;
    
    private int tiempo = 21;
    
    public Controlador(){
        
        modelo.addObserver(infoMision);
        modelo.addObserver(verRanking);
        modelo.addObserver(elegirMision);
        modelo.addObserver(verAyuda);
        
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
        
        //mision1
        gb.gridwidth = 1;
        JButton mision1 = new JButton();
        mision1.setIcon(Mision.misionUno().getImagen());
        mision1.setContentAreaFilled(false);
        mision1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                modelo.setMisionUno();
            }
        });
        agrega(mision1, gb, panelInicio, 0, 1);
        
        
        //mision2
        JButton mision2 = new JButton();
        mision2.setIcon(Mision.misionDos().getImagen());
        mision2.setContentAreaFilled(false);
        mision2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                modelo.setMisionDos();
            }
        });
        agrega(mision2, gb, panelInicio, 1, 1);
        
        
        //Mision3
        JButton mision3 = new JButton();
        mision3.setIcon(Mision.misionTres().getImagen());
        mision3.setContentAreaFilled(false);
        mision3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                modelo.setMisionTres();
            }
        });
        agrega(mision3, gb, panelInicio, 2, 1);
        
        //Mision 4
        JButton mision4 = new JButton();
        mision4.setIcon(Mision.misionCuatro().getImagen());
        mision4.setContentAreaFilled(false);
        mision4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                modelo.setMisionCuatro();
            }
        });
        agrega(mision4, gb, panelInicio, 3, 1);
        
        JPanel panelIdiomas = new JPanel();
        JButton esp = new JButton("Español");
        esp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                modelo.setIdiomaEspannol();
            }
        });
        JButton eng = new JButton("English");
        eng.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                modelo.setIdiomaIngles();
            }
        });
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
        JButton play = new JButton("JUGAR");
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
        
        JPanel panelJugable = new JPanel(new GridLayout(modelo.getMision().getColumnas(), modelo.getMision().getFilas()));
        for(int i = 0; i < modelo.getMision().getColumnas(); i++){
            for(int j = 0; j < modelo.getMision().getFilas(); j++){
                JButton casilla = new JButton();
                casilla.setIcon(new ImageIcon("imagenes/casilla.png"));
                casilla.setContentAreaFilled(false);
                casilla.addMouseListener(new MouseListener(){
                    public void mousePressed(MouseEvent e){}
                    public void mouseReleased(MouseEvent e){}
                    public void mouseEntered(MouseEvent e){}
                    public void mouseExited(MouseEvent e){}
                    public void mouseClicked(MouseEvent e){
                        JButton c = (JButton) e.getSource();
                        switch(e.getButton()){
                            case MouseEvent.BUTTON1:
                                modelo.actualizarRanking("LLL", tiempo);
                                generarPanelRanking();
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
        
        panelAyuda.add(verAyuda, BorderLayout.CENTER);
        
        JButton volver = new JButton("Volver");
        volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                generarPanelInicio();
            }
        });
        panelAyuda.add(volver, BorderLayout.SOUTH);
        
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
                modelo.actualizarRanking();
                generarPanelInicio();
            }
        });
        
       JLabel leaderBoard = new JLabel("LEADERBOARD");
       cabecera.add(leaderBoard);
        
        JPanel panelMuestraMision = new JPanel();
        Box caja = Box.createVerticalBox();
        JLabel mision = new JLabel("MISION:");
        JLabel nombreMision = new JLabel("_________");
        JButton imagen = new JButton(modelo.getMision().getImagen());
        imagen.setContentAreaFilled(false);
        caja.add(mision);
        caja.add(caja.createVerticalGlue());
        caja.add(nombreMision);
        caja.add(caja.createVerticalGlue());
        caja.add(imagen);
        panelMuestraMision.add(caja);
        
        panelRanking.add(cabecera, BorderLayout.NORTH);
        panelRanking.add(panelMuestraMision, BorderLayout.EAST);
        panelRanking.add(verRanking, BorderLayout.CENTER);
        
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
