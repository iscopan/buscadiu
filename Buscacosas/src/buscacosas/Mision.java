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

    private ImageIcon volver;
    private ImageIcon reiniciar;
    private ImageIcon bandera;
    private ImageIcon mina;
    private ImageIcon pisado;
    private ImageIcon sinPisar;
    private ImageIcon reloj;

    
    
    private ImageIcon imagen;
    
    private Mision(){
        
    }
    
    public static Mision misionUno(){
        
        Mision mision = new Mision();
        
        mision.setNumMision(1);
        mision.setFilas(8);
        mision.setColumnas(8);
        mision.setNumMinas(8);
        mision.setImagen(new ImageIcon("imagenes/Prado.png"));
        mision.setVolver(new ImageIcon("imagenes/Prado-Volver.png"));
        mision.setReiniciar(new ImageIcon("imagenes/Prado-Reiniciar.png"));
        mision.setBandera(new ImageIcon("imagenes/Prado-Bandera.png"));
        mision.setMina(new ImageIcon("imagenes/Prado-Mina.png"));
        mision.setPisado(new ImageIcon("imagenes/Prado-Pisado.png"));
        mision.setSinPisar(new ImageIcon("imagenes/Prado-SinPisar.png"));
        mision.setReloj(new ImageIcon("imagenes/Prado-Reloj.png"));
  
        return mision;
    }
    
    public static Mision misionDos(){
        
        Mision mision = new Mision();
        
        mision.setNumMision(2);
        mision.setFilas(10);
        mision.setColumnas(10);
        mision.setNumMinas(10);
        mision.setImagen(new ImageIcon("imagenes/Desierto.png"));  
        mision.setVolver(new ImageIcon("imagenes/Desierto-Volver.png"));
        mision.setReiniciar(new ImageIcon("imagenes/Desierto-Reiniciar.png"));
        mision.setBandera(new ImageIcon("imagenes/Desierto-Bandera.png"));
        mision.setMina(new ImageIcon("imagenes/Desierto-Mina.png"));
        mision.setPisado(new ImageIcon("imagenes/Desierto-Pisado.png"));
        mision.setSinPisar(new ImageIcon("imagenes/Desierto-SinPisar.png"));
        mision.setReloj(new ImageIcon("imagenes/Desierto-Reloj.png"));
        
        return mision;
    }

    public static Mision misionTres(){
        
        Mision mision = new Mision();
        
        mision.setNumMision(3);
        mision.setFilas(15);
        mision.setColumnas(15);
        mision.setNumMinas(15);
        mision.setImagen(new ImageIcon("imagenes/Pantano.png"));
        mision.setVolver(new ImageIcon("imagenes/Pantano-Volver.png"));
        mision.setReiniciar(new ImageIcon("imagenes/Pantano-Reiniciar.png"));
        mision.setBandera(new ImageIcon("imagenes/Pantano-Bandera.png"));
        mision.setMina(new ImageIcon("imagenes/Pantano-Mina.png"));
        mision.setPisado(new ImageIcon("imagenes/Pantano-Pisado.png"));
        mision.setSinPisar(new ImageIcon("imagenes/Pantano-SinPisar.png"));
        mision.setReloj(new ImageIcon("imagenes/Pantano-Reloj.png"));
        
        return mision;
    }
    
    public static Mision misionCuatro(){
        
        Mision mision = new Mision();
        
        mision.setNumMision(4);
        mision.setFilas(20);
        mision.setColumnas(20);
        mision.setNumMinas(20);
        mision.setImagen(new ImageIcon("imagenes/Volcan.png"));
        mision.setVolver(new ImageIcon("imagenes/Volcan-Volver.png"));
        mision.setReiniciar(new ImageIcon("imagenes/Volcan-Reiniciar.png"));
        mision.setBandera(new ImageIcon("imagenes/Volcan-Bandera.png"));
        mision.setMina(new ImageIcon("imagenes/Volcan-Mina.png"));
        mision.setPisado(new ImageIcon("imagenes/Volcan-Pisado.png"));
        mision.setSinPisar(new ImageIcon("imagenes/Volcan-SinPisar.png"));
        mision.setReloj(new ImageIcon("imagenes/Volcan-Reloj.png"));
        
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
    
    public ImageIcon getVolver() {
        return volver;
    }

    public ImageIcon getReiniciar() {
        return reiniciar;
    }

    public ImageIcon getBandera() {
        return bandera;
    }

    public ImageIcon getMina() {
        return mina;
    }

    public ImageIcon getPisado() {
        return pisado;
    }

    public ImageIcon getSinPisar() {
        return sinPisar;
    }

    public ImageIcon getReloj() {
        return reloj;
    }
    
    public void setVolver(ImageIcon volver) {
        this.volver = volver;
    }

    public void setReiniciar(ImageIcon reiniciar) {
        this.reiniciar = reiniciar;
    }

    public void setBandera(ImageIcon bandera) {
        this.bandera = bandera;
    }

    public void setMina(ImageIcon mina) {
        this.mina = mina;
    }

    public void setPisado(ImageIcon pisado) {
        this.pisado = pisado;
    }

    public void setSinPisar(ImageIcon sinPisar) {
        this.sinPisar = sinPisar;
    }

    public void setReloj(ImageIcon reloj) {
        this.reloj = reloj;
    }

}
    
