/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto8a;

public abstract class Tramo {
    
    
    protected double xInicial;
    protected double xFinal;
    protected double yInicial;
    protected double yFinal;
    
    public abstract double area();
    public abstract double volumen();
    
    public Tramo(int xInicial, int yInicial, int xFinal, int yFinal) {
        this.xInicial = xInicial;
        this.yInicial = yInicial;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
    }
    
    public double longitud(){
        double d;
        d = Math.sqrt(Math.pow(xFinal-xInicial,2)+Math.pow(yFinal-yInicial, 2));
        return d;
    }

    public double getxInicial() {
        return xInicial;
    }

    public void setxInicial(double xInicial) {
        this.xInicial = xInicial;
    }

    public double getxFinal() {
        return xFinal;
    }

    public void setxFinal(double xFinal) {
        this.xFinal = xFinal;
    }

    public double getyFinal() {
        return yFinal;
    }

    public void setyFinal(double yFinal) {
        this.yFinal = yFinal;
    }

    public double getyInicial() {
        return yInicial;
    }

    public void setyInicial(double yInicial) {
        this.yInicial = yInicial;
    }
    
    

}
