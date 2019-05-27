/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

import javax.swing.ImageIcon;

/**
 *
 * @author GCM
 */
public class Mision {
    
    private int numMision;
    private int filas;
    private int columnas;
    private int numMinas;

   
    private ImageIcon imagen;
    
    private Mision(){
        
    }
    
    public static Mision misionUno(){
        
        Mision mision = new Mision();
        
        mision.setNumMision(1);
        mision.setFilas(8);
        mision.setColumnas(8);
        mision.setNumMinas(8);
        mision.setImagen(new ImageIcon("imagenes/img3.jpg"));
        
        return mision;
    }
    
    public static Mision misionDos(){
        
        Mision mision = new Mision();
        
        mision.setNumMision(2);
        mision.setFilas(10);
        mision.setColumnas(10);
        mision.setNumMinas(10);
        mision.setImagen(new ImageIcon("imagenes/img3.jpg"));
        
        return mision;
    }

    public static Mision misionTres(){
        
        Mision mision = new Mision();
        
        mision.setNumMision(3);
        mision.setFilas(15);
        mision.setColumnas(15);
        mision.setNumMinas(15);
        mision.setImagen(new ImageIcon("imagenes/img3.jpg"));
        
        return mision;
    }
    
    public static Mision misionCuatro(){
        
        Mision mision = new Mision();
        
        mision.setNumMision(4);
        mision.setFilas(20);
        mision.setColumnas(20);
        mision.setNumMinas(20);
        mision.setImagen(new ImageIcon("imagenes/img3.jpg"));
        
        return mision;
    }
    
    public int getNumMision() {
        return numMision;
    }

    public void setNumMision(int numMision) {
        this.numMision = numMision;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getNumMinas() {
        return numMinas;
    }

    public void setNumMinas(int numMinas) {
        this.numMinas = numMinas;
    }
    
    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
    public ImageIcon getImagen() {
        return imagen;
    }
}
