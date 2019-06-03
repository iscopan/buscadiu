/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

import buscacosas.vistas.TextoAyuda;
import buscacosas.vistas.Ranking;
import buscacosas.modelo.Modelo;
import buscacosas.modelo.Mision;
import buscacosas.vistas.InfoMision;
import buscacosas.vistas.ElegirMision;
import buscacosas.vistas.Contador;
import buscacosas.modelo.Casilla;
import static com.sun.javafx.scene.control.skin.Utils.getResource;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.time.LocalTime;
import java.util.Random;
import javax.swing.*;


public class Controlador extends JFrame{
    
    private boolean iniciado = false;
    private boolean perdido = false;
    private Modelo modelo = new Modelo();
    
    private InfoMision infoMision = new InfoMision(modelo);
    private ElegirMision elegirMision = new ElegirMision(modelo);
    private Ranking verRanking = new Ranking(modelo);
    private TextoAyuda verAyuda = new TextoAyuda(modelo);
    private Contador contador = new Contador(modelo);
    
    private JPanel panelInicio;
    private JPanel panelJuego;
    private JPanel panelAyuda;
    private JPanel panelRanking;
    
    
    public Controlador(){
    
        modelo.addObserver(infoMision);
        modelo.addObserver(verRanking);
        modelo.addObserver(elegirMision);
        modelo.addObserver(verAyuda);
        modelo.addObserver(contador);
        
        setTitle("Fantasy Sweeper");
        
        Image icon = new ImageIcon(("imagenes/Logo.png")).getImage();
        setIconImage(icon);
        
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
        
        JButton mision1 = new JButton();
        JButton mision2 = new JButton();
        JButton mision3 = new JButton();
        JButton mision4 = new JButton();
        
        //mision1
        mision1.setIcon(Mision.misionUno().getImagen());
        mision1.setMargin(new Insets(2,2,2,2));
        mision1.setContentAreaFilled(true);
        mision1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                modelo.setMisionUno();
                mision1.setMargin(new Insets(2,2,2,2));
                mision1.setContentAreaFilled(true);
                mision2.setMargin(new Insets(0,0,0,0));
                mision2.setContentAreaFilled(false);
                mision3.setMargin(new Insets(0,0,0,0));
                mision3.setContentAreaFilled(false);
                mision4.setMargin(new Insets(0,0,0,0));
                mision4.setContentAreaFilled(false);
            }
        });
        agrega(mision1, gb, panelInicio, 0, 1);
        
        
        //mision2
        mision2.setIcon(Mision.misionDos().getImagen());
        mision2.setMargin(new Insets(0,0,0,0));
        mision2.setContentAreaFilled(false);
        mision2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                modelo.setMisionDos();
                mision1.setMargin(new Insets(0,0,0,0));
                mision1.setContentAreaFilled(false);
                mision2.setMargin(new Insets(2,2,2,2));
                mision2.setContentAreaFilled(true);
                mision3.setMargin(new Insets(0,0,0,0));
                mision3.setContentAreaFilled(false);
                mision4.setMargin(new Insets(0,0,0,0));
                mision4.setContentAreaFilled(false);
            }
        });
        agrega(mision2, gb, panelInicio, 1, 1);
        
        
        //Mision3
        mision3.setIcon(Mision.misionTres().getImagen());
        mision3.setMargin(new Insets(0,0,0,0));
        mision3.setContentAreaFilled(false);
        mision3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                modelo.setMisionTres();
                mision1.setMargin(new Insets(0,0,0,0));
                mision1.setContentAreaFilled(false);
                mision2.setMargin(new Insets(0,0,0,0));
                mision2.setContentAreaFilled(false);
                mision3.setMargin(new Insets(2,2,2,2));
                mision3.setContentAreaFilled(true);
                mision4.setMargin(new Insets(0,0,0,0));
                mision4.setContentAreaFilled(false);
            }
        });
        agrega(mision3, gb, panelInicio, 2, 1);
        
        //Mision 4
        mision4.setIcon(Mision.misionCuatro().getImagen());
        mision4.setMargin(new Insets(0,0,0,0));
        mision4.setContentAreaFilled(false);
        mision4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                modelo.setMisionCuatro();
                mision1.setMargin(new Insets(0,0,0,0));
                mision1.setContentAreaFilled(false);
                mision2.setMargin(new Insets(0,0,0,0));
                mision2.setContentAreaFilled(false);
                mision3.setMargin(new Insets(0,0,0,0));
                mision3.setContentAreaFilled(false);
                mision4.setMargin(new Insets(2,2,2,2));
                mision4.setContentAreaFilled(true);
            }
        });
        agrega(mision4, gb, panelInicio, 3, 1);
        
        JPanel panelIdiomas = new JPanel();
        JButton esp = new JButton(new ImageIcon("imagenes/espanol.png"));
        esp.setMargin(new Insets(0,0,0,0));
        esp.setContentAreaFilled(false);
        esp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                modelo.setIdiomaEspannol();
            }
        });
        JButton eng = new JButton(new ImageIcon("imagenes/ingles.png"));
        eng.setMargin(new Insets(0,0,0,0));
        eng.setContentAreaFilled(false);
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
        panelIdiomas.setBackground(Color.decode("#C2F7F0"));
        agrega(panelIdiomas, gb, panelInicio, 4, 1);
        
        gb.gridwidth = 4;
        gb.gridheight = 2;
        agrega(infoMision, gb, panelInicio, 0, 2);
        
        gb.gridwidth = 1;
        JButton play = new JButton();
        play.setIcon(new ImageIcon("imagenes/play.png"));
        play.setContentAreaFilled(false);
        play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                generarPanelJuego();
            }
        });
        agrega(play, gb, panelInicio, 4, 2);
        
        gb.gridwidth = 4;
        gb.gridheight = 1;
        JButton ranking = new JButton();
        ranking.setIcon(new ImageIcon("imagenes/ranking.png"));
        ranking.setBackground(Color.BLACK);
        ranking.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                generarPanelRanking();
            }
        });
        agrega(ranking, gb, panelInicio, 0, 4);
        
        gb.gridwidth = 1;
        JButton help = new JButton();
        help.setIcon(new ImageIcon("imagenes/ayuda.png"));
        help.setContentAreaFilled(false);
        help.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                generarPanelAyuda();
            }
        });
        agrega(help, gb, panelInicio, 4, 4);
        
        panelInicio.setBackground(Color.decode("#C2F7F0"));
        
        getContentPane().removeAll();
        add(panelInicio);
        pack();
        
    }
    
    public void generarPanelJuego(){
        iniciado = false;
        perdido = false;
        panelJuego = new JPanel(new BorderLayout());
        
        JPanel cabeza = new JPanel(new BorderLayout());
        
        JButton volver = new JButton();
        volver.setIcon(modelo.getMision().getVolver());
        volver.setContentAreaFilled(false);
        volver.setMargin(new Insets(0,0,0,0));
        volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                generarPanelInicio();
            }
        });
        
        JButton resert = new JButton();
        resert.setIcon(modelo.getMision().getReiniciar());
        resert.setMargin(new Insets(0,0,0,0));
        resert.setContentAreaFilled(false);
        resert.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                generarPanelJuego();
            }
        });
        
        cabeza.add(volver,BorderLayout.WEST);
        cabeza.add(contador, BorderLayout.CENTER);
        cabeza.add(resert, BorderLayout.EAST);
        
        cabeza.setBackground(Color.decode("#C2F7F0"));
        
        panelJuego.add(cabeza, BorderLayout.NORTH);
        
        JPanel panelJugable = new JPanel(new GridLayout(modelo.getMision().getColumnas(), modelo.getMision().getFilas()));
        Casilla[][] mapa = new Casilla[modelo.getMision().getColumnas()][modelo.getMision().getColumnas()];
        for(int i = 0; i < modelo.getMision().getColumnas(); i++){
            for(int j = 0; j < modelo.getMision().getFilas(); j++){
                Casilla casilla = new Casilla(modelo);
                casilla.addMouseListener(new MouseListener(){
                    public void mousePressed(MouseEvent e){}
                    public void mouseReleased(MouseEvent e){}
                    public void mouseEntered(MouseEvent e){}
                    public void mouseExited(MouseEvent e){}
                    public void mouseClicked(MouseEvent e){
                        Casilla casilla =(Casilla) e.getSource();
                        switch(e.getButton()){
                            case MouseEvent.BUTTON1:
                                if(perdido != true){
                                    if(!iniciado){
                                        modelo.inicio();
                                        colocarMinas(casilla, mapa);
                                        colocarNumeros(mapa);
                                        iniciado = true;
                                    }
                                    
                                    casilla.revelar();
                                    
                                    if (casilla.getMina()){
                                        modelo.parar();
                                        perder(mapa);
                                        perdido = true;
                                        JOptionPane.showMessageDialog(null, modelo.getIdioma().getHasPerdido(), "GAME OVER", JOptionPane.OK_OPTION, modelo.getMision().getImagen());
                                    }
                                    else{
                                        if (casilla.minasAlrededor() == 0){
                                            int[] indices = indicesCasilla(casilla, mapa);
                                            recurRevelar(indices[0], indices[1], mapa);
                                        }
                                        checkGanar(mapa);
                                    }
                                    
                                    if(casilla.getTieneBandera() == true){
                                        modelo.quitarBandera();
                                    }
                                    
                                    if(perdido == true){
                                        generarPanelInicio();
                                    }
                                }
                                break;
                            case MouseEvent.BUTTON3:
                                if(casilla.esOculto()==true){
                                    if(casilla.getTieneBandera() == true){
                                        casilla.quitarBandera();
                                        modelo.quitarBandera();

                                    }
                                    else if(modelo.getNumeroBanderas()>0){
                                        casilla.bandera();
                                        modelo.ponerBandera();
                                    }
                                }
                                break;
                        }
                    }
                });
                mapa[i][j] = casilla;
                panelJugable.add(casilla);
            }
        }
        
        panelJugable.setBackground(Color.decode("#C2F7F0"));
        
        panelJuego.add(panelJugable, BorderLayout.CENTER);
        
        getContentPane().removeAll();
        add(panelJuego);
        pack();
        
    }
    
    public void generarPanelAyuda(){
        
        panelAyuda = new JPanel(new BorderLayout());
        
        panelAyuda.add(verAyuda, BorderLayout.CENTER);
        
        JButton volver = new JButton("Volver");
        volver.setIcon(new ImageIcon("imagenes/volver.png"));
        volver.setContentAreaFilled(false);
        volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                generarPanelInicio();
            }
        });
        panelAyuda.add(volver, BorderLayout.SOUTH);
        
        verAyuda.setBackground(Color.decode("#C2F7F0"));
        panelAyuda.setBackground(Color.decode("#C2F7F0"));
        getContentPane().removeAll();
        add(panelAyuda);
        pack();
    }
    
    public void generarPanelRanking(){
        panelRanking = new JPanel(new BorderLayout());
        
        JPanel cabecera = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        JButton volver = new JButton();
        volver.setIcon(new ImageIcon("imagenes/volver.png"));
        volver.setContentAreaFilled(false);
        cabecera.add(volver);
        volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                modelo.actualizarRanking();
                generarPanelInicio();
            }
        });
        
        JLabel leaderBoard = new JLabel("RANKING");
        Font f = leaderBoard.getFont();
        leaderBoard.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
        cabecera.add(leaderBoard);
        
        
        
        
        JPanel panelMuestraMision = new JPanel();
        Box caja = Box.createVerticalBox();
        JLabel mision = new JLabel("MISION:");
        mision.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
        mision.setAlignmentX(CENTER_ALIGNMENT);
        JLabel nombreMision = new JLabel();
        nombreMision.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
        
        switch(modelo.getMision().getNumMision()){
            case 1:
                nombreMision.setText(modelo.getIdioma().getNombreMision1());
                break;
            case 2:
                nombreMision.setText(modelo.getIdioma().getNombreMision2());
                break;
            case 3:
                nombreMision.setText(modelo.getIdioma().getNombreMision3());
                break;
            case 4:
                nombreMision.setText(modelo.getIdioma().getNombreMision4());
                break;
        }
        
        nombreMision.setAlignmentX(CENTER_ALIGNMENT);
        JButton imagen = new JButton(modelo.getMision().getImagen());
        imagen.setContentAreaFilled(false);
        imagen.setAlignmentX(CENTER_ALIGNMENT);
        caja.add(mision);
        caja.add(caja.createVerticalGlue());
        caja.add(nombreMision);
        caja.add(caja.createVerticalGlue());
        caja.add(imagen);
        panelMuestraMision.add(caja);
        
        verRanking.setBackground(Color.decode("#C2F7F0"));
        
        panelMuestraMision.setBackground(Color.decode("#C2F7F0"));
        cabecera.setBackground(Color.decode("#C2F7F0"));
        
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
    
    private void colocarMinas(Casilla click, Casilla[][] mapa){
        int minas = modelo.getMision().getNumMinas();
        Random r = new Random();
        while (minas>0){
            int i = r.nextInt(modelo.getMision().getFilas());
            int j = r.nextInt(modelo.getMision().getColumnas());
            if (!mapa[i][j].getMina() && espacioLibre(click, mapa, i, j)){
                mapa[i][j].setMina(true);
                minas--;
            }
        }
    }

    private boolean espacioLibre(Casilla casilla, Casilla[][] mapa, int posX, int posY){
	if(casilla.equals(mapa[posX][posY])){
            return false;
	}
	if(posX - 1 >= 0){
            if(casilla.equals(mapa[posX-1][posY])){
                return false;
            }
            if(posY - 1 >= 0){
    		if(casilla.equals(mapa[posX-1][posY-1])){
                    return false;
                }
            }
            if(posY + 1 < modelo.getMision().getColumnas()){
                if(casilla.equals(mapa[posX-1][posY+1])){
                    return false;
                }
            }
	}
	if(posX + 1 < modelo.getMision().getFilas()){
            if(casilla.equals(mapa[posX+1][posY])){
                return false;
            }
            if(posY - 1 >= 0){
                if(casilla.equals(mapa[posX+1][posY-1])){
                    return false;
                }
            }
            if(posY + 1 < modelo.getMision().getColumnas()){
                if(casilla.equals(mapa[posX+1][posY+1])){
                    return false;
                }
            }
	}
	if(posY - 1 >= 0){
            if(casilla.equals(mapa[posX][posY-1])){
                return false;
            }
	}
	if(posY + 1 < modelo.getMision().getColumnas()){
            if(casilla.equals(mapa[posX][posY+1])){
                return false;
            }
	}
	return true;
    }

    private void colocarNumeros(Casilla[][] mapa) {
        for (int i=0; i<modelo.getMision().getColumnas(); i++)
            for (int j=0; j<modelo.getMision().getFilas(); j++)
                if (!mapa[i][j].getMina()){
                    int nminas = 0;
                    for (int k=i-1; k<=i+1; k++)
                        for (int l=j-1; l<=j+1; l++)
                            if (k>=0 && l>=0 && k<modelo.getMision().getFilas() && l<modelo.getMision().getColumnas())
                                if (mapa[k][l].getMina())
                                    nminas = nminas+1;
                    if (nminas > 0)
                        mapa[i][j].setNum(nminas);
                }
    }

    private void perder(Casilla[][] mapa) {
        for (int i=0; i<modelo.getMision().getColumnas(); i++){
            for (int j=0; j<modelo.getMision().getFilas(); j++){
                    mapa[i][j].revelar();
                
            }
        }       
    }
    
    private void recurRevelar(int fila, int columna, Casilla[][] mapa) {
        mapa[fila][columna].revelar();
        if (mapa[fila][columna].minasAlrededor() == 0)
            for (int k=fila-1; k<=fila+1; k++)
                for (int l=columna-1; l<=columna+1; l++)
                    if (k>=0 && l>=0 && k<modelo.getMision().getColumnas() && l<modelo.getMision().getFilas()){
                        if (mapa[k][l].esOculto()){
                            mapa[k][l].revelar();
                            if (mapa[k][l].minasAlrededor() == 0){
                                recurRevelar(k, l, mapa);
                            }
                        }
                    }
    }
    
    private int[] indicesCasilla(Casilla c, Casilla[][] mapa){
        int i=0, j=0;
        for (int k=0; k<modelo.getMision().getColumnas(); k++)
            for (int l=0; l<modelo.getMision().getFilas(); l++)
                if (c.equals(mapa[k][l])){
                    i = k;
                    j = l;
                }
        int[] res = new int[2];
        res[0] = i;
        res[1] = j;
        return res;
    }
    
    private void checkGanar(Casilla[][] mapa) {
        int revelados = 0;
        for (int i=0; i<modelo.getMision().getColumnas(); i++){
            for (int j=0; j<modelo.getMision().getFilas(); j++){
                if (!mapa[i][j].esOculto()){
                    revelados++;
                }
            }
        }
        if (revelados == modelo.getMision().getColumnas()*modelo.getMision().getFilas()-modelo.getMision().getNumMinas()){
            modelo.parar();
            String nombre = (String)JOptionPane.showInputDialog(null, modelo.getIdioma().getIntroduceIniciales(), modelo.getIdioma().getHasGanado(), JOptionPane.INFORMATION_MESSAGE, modelo.getMision().getImagen(),null, null);
            modelo.actualizarRanking(nombre.substring(0, 3), modelo.getSegundos());
            generarPanelRanking();
        }
    }
}
