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
        
        idioma.setInfoMision1("\tDificultad: Fácil\n\tAdentrate en el amistodo prado, pero\n \t¡no pises las margaritas!");
        idioma.setInfoMision2("\tDificultad: Media\n\tLocaliza todas las trampas que hay colocadas en\n\t el desierto en el menor tiempo posible.");
        idioma.setInfoMision3("\tDificultad: Difícil\n\tEste misterioso pantano está\n\t repleto de fango venenoso\n\t no te despieste o caerás en él.");
        idioma.setInfoMision4("\tDificultad: Muy difícil\n\tEl volcán activo es el mayor de los desafíos\n\t ¡anda con mucho cuidado si no quieres caer\n en la ardiente lava!");
        idioma.setNombreMision1("El Prado Verdoso");
        idioma.setNombreMision2("El Desierto de la Momia");
        idioma.setNombreMision3("El Pantano Venenoso");
        idioma.setNombreMision4("El Volcán Llameante");
        idioma.setEligeMision("Selecciona la misión que deseas superar: ");
        idioma.setComoJugar("\n\t\t\t\t\tCOMO JUGAR\n"
                + "--------------------------------------------------------------------------------------------\n"
                + "\n OBJETIVO: El juego consiste en despejar todas las casillas que no oculten un obstáculo.\n"
                + "\n METODOLOGIA: Algunas casillas tienen un número, el cual indica la cantidad de obstáculos\n"
                + "              que rodean dicha casilla. Si se descubre una casilla sin número significa\n"
                + "              que a su alrederdo no hay ningun obstáculo\n"
                + "\n CONTROLES:\n"
                + " \tClick derecho   --> Haz click derecho sobre una casilla para ver lo que esta oculta\n"
                + " \tClick izquierdo --> Usa el click izquierdo para colocar una bandera en la casilla si\n"
                + " \t              piensas que oculta un obstáculo\n");
        idioma.setTextoConfirmacion("¿Deseas salir?");
        idioma.setSi("Sí");
        idioma.setNo("No");
        idioma.setHasGanado("¡Has ganado!");
        idioma.setIntroduceIniciales("Introduce tus iniciales");
        idioma.setAceptar("Aceptar");
            
        return idioma;
    }
    
     public static Idioma ingles(){
        
        Idioma idioma = new Idioma();
        
        idioma.setInfoMision1("\tDifficult: Easy\n Enter on the frindly meadow, but\n careful with the daisies!");
        idioma.setInfoMision2("\tDifficult: Medium\nFind all the traps\n which are placed in the desert.");
        idioma.setInfoMision3("\tDifficult: Hard\n\tThis spooky swamp is full of toxic mud\n be careful or you will fall into it.");
        idioma.setInfoMision4("\tDifficult: Very hard\nThe active volcan is the hardest challenge\n walk safely if you don't want \ninto burn with the lava.");
        idioma.setNombreMision1("The Greenish Meadow");
        idioma.setNombreMision2("The Mummy's Desert");
        idioma.setNombreMision3("The Toxic Swamp");
        idioma.setNombreMision4("The Flaming Volcan");
        idioma.setEligeMision("Choose the mission you want to overcome: ");
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
        idioma.setTextoConfirmacion("Are you sure you want to close the game?");
        idioma.setSi("Yes");
        idioma.setNo("No");
        idioma.setHasGanado("You win!");
        idioma.setIntroduceIniciales("Enter your initials");
        idioma.setAceptar("Accept");
            
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
