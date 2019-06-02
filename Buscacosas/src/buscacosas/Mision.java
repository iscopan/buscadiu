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
    private ImageIcon pisado1;
    private ImageIcon pisado2;
    private ImageIcon pisado3;
    private ImageIcon pisado4;
    private ImageIcon pisado5;
    private ImageIcon pisado6;
    private ImageIcon pisado7;
    private ImageIcon pisado8;

    private ImageIcon sinPisar;
    private ImageIcon reloj;

    private ImageIcon imagen;
    
    
   
    private Mision() {

    }

    public static Mision misionUno() {

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
        mision.setPisado1(new ImageIcon("imagenes/Prado-Pisado-1.png"));
        mision.setPisado2(new ImageIcon("imagenes/Prado-Pisado-2.png"));
        mision.setPisado3(new ImageIcon("imagenes/Prado-Pisado-3.png"));
        mision.setPisado4(new ImageIcon("imagenes/Prado-Pisado-4.png"));
        mision.setPisado5(new ImageIcon("imagenes/Prado-Pisado-5.png"));
        mision.setPisado6(new ImageIcon("imagenes/Prado-Pisado-6.png"));
        mision.setPisado7(new ImageIcon("imagenes/Prado-Pisado-7.png"));
        mision.setPisado8(new ImageIcon("imagenes/Prado-Pisado-8.png"));
        mision.setSinPisar(new ImageIcon("imagenes/Prado-SinPisar.png"));
        mision.setReloj(new ImageIcon("imagenes/Prado-Reloj.png"));

        return mision;
    }

    public static Mision misionDos() {

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
        mision.setPisado1(new ImageIcon("imagenes/Desierto-Pisado-1.png"));
        mision.setPisado2(new ImageIcon("imagenes/Desierto-Pisado-2.png"));
        mision.setPisado3(new ImageIcon("imagenes/Desierto-Pisado-3.png"));
        mision.setPisado4(new ImageIcon("imagenes/Desierto-Pisado-4.png"));
        mision.setPisado5(new ImageIcon("imagenes/Desierto-Pisado-5.png"));
        mision.setPisado6(new ImageIcon("imagenes/Desierto-Pisado-6.png"));
        mision.setPisado7(new ImageIcon("imagenes/Desierto-Pisado-7.png"));
        mision.setPisado8(new ImageIcon("imagenes/Desierto-Pisado-8.png"));
        mision.setSinPisar(new ImageIcon("imagenes/Desierto-SinPisar.png"));
        mision.setReloj(new ImageIcon("imagenes/Desierto-Reloj.png"));

        return mision;
    }

    public static Mision misionTres() {

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
        mision.setPisado1(new ImageIcon("imagenes/Pantano-Pisado-1.png"));
        mision.setPisado2(new ImageIcon("imagenes/Pantano-Pisado-2.png"));
        mision.setPisado3(new ImageIcon("imagenes/Pantano-Pisado-3.png"));
        mision.setPisado4(new ImageIcon("imagenes/Pantano-Pisado-4.png"));
        mision.setPisado5(new ImageIcon("imagenes/Pantano-Pisado-5.png"));
        mision.setPisado6(new ImageIcon("imagenes/Pantano-Pisado-6.png"));
        mision.setPisado7(new ImageIcon("imagenes/Pantano-Pisado-7.png"));
        mision.setPisado8(new ImageIcon("imagenes/Pantano-Pisado-8.png"));
        mision.setSinPisar(new ImageIcon("imagenes/Pantano-SinPisar.png"));
        mision.setReloj(new ImageIcon("imagenes/Pantano-Reloj.png"));

        return mision;
    }

    public static Mision misionCuatro() {

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
        mision.setPisado1(new ImageIcon("imagenes/Volcan-Pisado-1.png"));
        mision.setPisado2(new ImageIcon("imagenes/Volcan-Pisado-2.png"));
        mision.setPisado3(new ImageIcon("imagenes/Volcan-Pisado-3.png"));
        mision.setPisado4(new ImageIcon("imagenes/Volcan-Pisado-4.png"));
        mision.setPisado5(new ImageIcon("imagenes/Volcan-Pisado-5.png"));
        mision.setPisado6(new ImageIcon("imagenes/Volcan-Pisado-6.png"));
        mision.setPisado7(new ImageIcon("imagenes/Volcan-Pisado-7.png"));
        mision.setPisado8(new ImageIcon("imagenes/Volcan-Pisado-8.png"));
        mision.setSinPisar(new ImageIcon("imagenes/Volcan-SinPisar.png"));
        mision.setReloj(new ImageIcon("imagenes/Volcan-Reloj.png"));

        return mision;
    }

    
    public ImageIcon getPisado1() {
        return pisado1;
    }

    public void setPisado1(ImageIcon pisado1) {
        this.pisado1 = pisado1;
    }

    public ImageIcon getPisado2() {
        return pisado2;
    }

    public void setPisado2(ImageIcon pisado2) {
        this.pisado2 = pisado2;
    }

    public ImageIcon getPisado3() {
        return pisado3;
    }

    public void setPisado3(ImageIcon pisado3) {
        this.pisado3 = pisado3;
    }

    public ImageIcon getPisado4() {
        return pisado4;
    }

    public void setPisado4(ImageIcon pisado4) {
        this.pisado4 = pisado4;
    }

    public ImageIcon getPisado5() {
        return pisado5;
    }

    public void setPisado5(ImageIcon pisado5) {
        this.pisado5 = pisado5;
    }

    public ImageIcon getPisado6() {
        return pisado6;
    }

    public void setPisado6(ImageIcon pisado6) {
        this.pisado6 = pisado6;
    }

    public ImageIcon getPisado7() {
        return pisado7;
    }

    public void setPisado7(ImageIcon pisado7) {
        this.pisado7 = pisado7;
    }

    public ImageIcon getPisado8() {
        return pisado8;
    }

    public void setPisado8(ImageIcon pisado8) {
        this.pisado8 = pisado8;
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
