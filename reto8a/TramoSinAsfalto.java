
package com.mycompany.reto8a;

public class TramoSinAsfalto extends Tramo{
    
    private final double ANCHO = 6;
    protected double espesor;
    protected String material;
    
    public TramoSinAsfalto(int xInicial,int yInicial,int xFinal,int yFinal,double espesor, String material) throws EspesorException{
        super(xInicial, yInicial, xFinal, yFinal);
        if(espesor>0){
        this.espesor = espesor;}
        else{
            throw new EspesorException();
        }
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
