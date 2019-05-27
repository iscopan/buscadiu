/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacosas;

/**
 *
 * @author Juan Blanco
 */
public class Idioma {
    private String infoMision1;
    private String infoMision2;
    private String infoMision3;
    private String infoMision4;
    private String nombreMision1;
    private String nombreMision2;
    private String nombreMision3;
    private String nombreMision4;
    private String eligeMision;
    private String comoJugar;
    private String textoConfirmacion;
    private String si;
    private String no;
    private String hasGanado;
    private String introduceIniciales;
    private String aceptar;

    private Idioma(){      
    }
    
    public static Idioma espannol(){
        
        Idioma idioma = new Idioma();
        
        idioma.setInfoMision1("Aqui va la info de la mision 1");
        idioma.setInfoMision2("Aqui va la info de la mision 2");
        idioma.setInfoMision3("Aqui va la info de la mision 3");
        idioma.setInfoMision4("Aqui va la info de la mision 4");
        idioma.setNombreMision1("dx");
        idioma.setNombreMision2("dx");
        idioma.setNombreMision3("dx");
        idioma.setNombreMision4("dx");
        idioma.setEligeMision("Elige la mision que desees superar");
        idioma.setComoJugar("\n\t\t\t\t\tCOMO JUGAR\n"
                + "--------------------------------------------------------------------------------------------\n"
                + "\n OBJETIVO: El juego consiste en despejar todas las casillas que no oculten un obstáculo.\n"
                + "\n METODOLOGIA: Algunas casillas tienen un número, el cual indica la cantidad de obstáculos\n"
                + "              que rodean dicha casilla. Si se descubre una casilla sin número significa\n"
                + "              que a su alrederdo no hay ningun obstáculo\n"
                + "\n CONTROLES:\n"
                + " \tClick_der --> Haz click derecho sobre una casilla para ver lo que esta oculta\n"
                + " \tClick_izq --> Usa el click izquierdo para colocar una bandera en la casilla si\n"
                + " \t              piensas que oculta un obstáculo\n");
        idioma.setTextoConfirmacion("xd");
        idioma.setSi("xd");
        idioma.setNo("xd");
        idioma.setHasGanado("xd");
        idioma.setIntroduceIniciales("xd");
        idioma.setAceptar("xd");
            
        return idioma;
    }
    
     public static Idioma ingles(){
        
        Idioma idioma = new Idioma();
        
        idioma.setInfoMision1("Theresa May");
        idioma.setInfoMision2("Theresa May 2");
        idioma.setInfoMision3("Theresa May 3");
        idioma.setInfoMision4("Theresa May 4");
        idioma.setNombreMision1("Theresa May");
        idioma.setNombreMision2("Theresa May");
        idioma.setNombreMision3("Theresa May");
        idioma.setNombreMision4("Theresa May");
        idioma.setEligeMision("Choose the mission you want to overcome");
        idioma.setComoJugar("\n\t\t\t\t\tHOW TO PLAY\n"
                + "--------------------------------------------------------------------------------------------\n"
                + "\n OBJECTIVE: The game consists in clearing all the squares that do not hide an obstacle.\n"
                + "\n METHODOLOGY: Some boxes have a number, which indicates the number of obstacles surrounding\n"
                + "              that box. If you discover a box without a number, it means that there is no\n"
                + "              obstacle around you.\n"
                + "\n CONTROLS:\n"
                + " \tRight_Click --> Right click on a box to see what is hidden\n"
                + " \tLeft_ClicK  --> Use the left click to place a flag in the box if si you think it\n"
                + " \t                hides an obstacle\n");
        idioma.setTextoConfirmacion("Theresa May");
        idioma.setSi("Theresa May");
        idioma.setNo("Theresa May");
        idioma.setHasGanado("Theresa May");
        idioma.setIntroduceIniciales("Theresa May");
        idioma.setAceptar("Theresa May");
            
        return idioma;
        
    }

    public void setInfoMision1(String infoMision1) {
        this.infoMision1 = infoMision1;
    }

    public void setInfoMision2(String infoMision2) {
        this.infoMision2 = infoMision2;
    }

    public void setInfoMision3(String infoMision3) {
        this.infoMision3 = infoMision3;
    }

    public void setInfoMision4(String infoMision4) {
        this.infoMision4 = infoMision4;
    }

    public void setNombreMision1(String nombreMision1) {
        this.nombreMision1 = nombreMision1;
    }

    public void setNombreMision2(String nombreMision2) {
        this.nombreMision2 = nombreMision2;
    }

    public void setNombreMision3(String nombreMision3) {
        this.nombreMision3 = nombreMision3;
    }

    public void setNombreMision4(String nombreMision4) {
        this.nombreMision4 = nombreMision4;
    }

    public void setEligeMision(String eligeMision) {
        this.eligeMision = eligeMision;
    }

    public void setComoJugar(String comoJugar) {
        this.comoJugar = comoJugar;
    }

    public void setTextoConfirmacion(String textoConfirmacion) {
        this.textoConfirmacion = textoConfirmacion;
    }

    public void setSi(String si) {
        this.si = si;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setHasGanado(String hasGanado) {
        this.hasGanado = hasGanado;
    }

    public void setIntroduceIniciales(String introduceIniciales) {
        this.introduceIniciales = introduceIniciales;
    }

    public void setAceptar(String aceptar) {
        this.aceptar = aceptar;
    }
    
    public String getInfoMision1() {
        return infoMision1;
    }

    public String getInfoMision2() {
        return infoMision2;
    }

    public String getInfoMision3() {
        return infoMision3;
    }

    public String getInfoMision4() {
        return infoMision4;
    }

    public String getNombreMision1() {
        return nombreMision1;
    }

    public String getNombreMision2() {
        return nombreMision2;
    }

    public String getNombreMision3() {
        return nombreMision3;
    }

    public String getNombreMision4() {
        return nombreMision4;
    }

    public String getEligeMision() {
        return eligeMision;
    }

    public String getComoJugar() {
        return comoJugar;
    }

    public String getTextoConfirmacion() {
        return textoConfirmacion;
    }

    public String getSi() {
        return si;
    }

    public String getNo() {
        return no;
    }

    public String getHasGanado() {
        return hasGanado;
    }

    public String getIntroduceIniciales() {
        return introduceIniciales;
    }

    public String getAceptar() {
        return aceptar;
    }
    
}
