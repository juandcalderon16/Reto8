/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto8a;

public class TramoAsfalto extends Tramo{
    
    private final double ANCHO = 8;
    private final double ESPESOR = 0.25;
    protected String proveedor;
    protected int velocidadMaxima;
    protected boolean prohibidoAdelantar;
    
    public TramoAsfalto(int xInicial,int yInicial,int xFinal,int yFinal, String proveedor, int velocidadMaxima, boolean prohibidoAdelantar){
        super(xInicial, yInicial, xFinal, yFinal);
        this.proveedor = proveedor;
        this.velocidadMaxima = velocidadMaxima;
        this.prohibidoAdelantar = prohibidoAdelantar;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public boolean isProhibidoAdelantar() {
        return prohibidoAdelantar;
    }

    public void setProhibidoAdelantar(boolean prohibidoAdelantar) {
        this.prohibidoAdelantar = prohibidoAdelantar;
    }
    
    @Override
    public double area() {
        double d = ANCHO*this.longitud();
        return d;    }

    @Override
    public double volumen() {
        double d= ESPESOR*ANCHO*this.longitud();
        return d;    }
    
    
}