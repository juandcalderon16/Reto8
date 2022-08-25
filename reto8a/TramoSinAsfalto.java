/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto8a;

public class TramoSinAsfalto extends Tramo{
    
    private final double ANCHO = 6;
    protected double espesor;
    protected String material;
    
    public TramoSinAsfalto(int xInicial,int yInicial,int xFinal,int yFinal,double espesor, String material){
        super(xInicial, yInicial, xFinal, yFinal);
        this.espesor = espesor;
        this.material = material;
    }
    
    
    @Override
    public double area() {
        double d = ANCHO*this.longitud();
        return d;    }

    @Override
    public double volumen() {
        double d= espesor*ANCHO*this.longitud();
        return d;    }
    
}
