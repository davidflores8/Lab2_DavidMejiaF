/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2david_mejia;

/**
 *
 * @author Nadina Mazzoni
 */
public class CasasComp {
    int numerocasa;
    int bloque;
    String color;
    double ancho;
    double largo;
    String comprada;
    String nombre;
    int pisos;
    int baños;
    int cuartos;
    String estado;
    String ingeniero;

    public CasasComp(int numerocasa, int bloque, String color, double ancho, double largo, String comprada, String nombre, int pisos, int baños, int cuartos, String estado, String ingeniero) {
        this.numerocasa = numerocasa;
        this.bloque = bloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.comprada = comprada;
        this.nombre = nombre;
        this.pisos = pisos;
        this.baños = baños;
        this.cuartos = cuartos;
        this.estado = estado;
        this.ingeniero = ingeniero;
    }

    public int getNumerocasa() {
        return numerocasa;
    }

    public void setNumerocasa(int numerocasa) {
        this.numerocasa = numerocasa;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getComprada() {
        return comprada;
    }

    public void setComprada(String comprada) {
        this.comprada = comprada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(String ingeniero) {
        this.ingeniero = ingeniero;
    }
    
    public String toString()
    {
        String s="";
        s+="Numero de casa: "+numerocasa+"\n";
        s+="Numero de bloque: "+bloque+"\n";
        s+="Color de la casa: "+color+"\n";
        s+="Ancho de la casa: "+ancho+"\n";
        s+="Largo de la casa: "+largo+"\n";
        s+="¿Comprada?: "+comprada+"\n";
        s+="Dueño de la casa: "+nombre+"\n";
        s+="Pisos de la casa: "+pisos+"\n";
        s+="Numero de baños de la casa: "+baños+"\n";
        s+="Numero de cuartos de la casa: "+cuartos+"\n";
        s+="Estado de la casa: "+estado+"\n";
        s+="Ingeniero encargado de la casa: "+ingeniero+"\n";
        return s;
    }


    
    
    
}
