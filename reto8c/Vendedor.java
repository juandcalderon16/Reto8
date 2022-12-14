
package com.mycompany.reto8c;
import java.time.YearMonth;

public class Vendedor {
    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private int añoDeIngreso;
    private double ventas;

    public Vendedor(String id, String nombre, String apellido, int edad, int añoDeIngreso, double ventas,int anioDeIngreso) throws EdadExcepcion,IngresoExcepcion, VentasException{
        if(edad<18){
            throw new EdadExcepcion();
        }else this.edad = edad;
        if(añoDeIngreso>YearMonth.now().getYear()){
            throw new IngresoExcepcion();
        }else this.añoDeIngreso = añoDeIngreso;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        if(ventas>0){
        this.ventas = ventas;}
        else{
            throw new VentasException();}}
    
    public String calcularCalidad(){
        if(ventas==0){
            return "el vendedor " + nombre + " es novato.";
        }else if(ventas<500000000){
            return "el vendedor " + nombre + " es principiante.";
        }else if(ventas<2000000000){
            return "el vendedor " + nombre + " es intermedio.";
        }
        return "el vendedor " + nombre + " es avanzado.";
    }
    
    public String calcularCategoria(){
    if(ventas/(YearMonth.now().getYear()-añoDeIngreso)<500000000){
        return nombre + " es mal vendedor";
    }else if(ventas/(YearMonth.now().getYear()-añoDeIngreso)<1000000000){
        return nombre + " es un vendedor regular";
    }else if(ventas/(YearMonth.now().getYear()-añoDeIngreso)<2000000000){
        return nombre + " es un vendedor bueno";
    }return nombre + " es un exelente vendedor";
}
}
