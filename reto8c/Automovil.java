
package com.mycompany.reto8c;
import java.time.YearMonth;


public class Automovil {
    private String placa;
    private String marca;
    private final int modelo;
    private double kilometraje;
    private String color;
    private double precio;
    private String descripcion;
    private int anioFabricacion;
    private String vendedor;
    private final int CONSTANTE0 = 0;
    private final int USONUEVO = 1000;
    private final int USOCASINUEVO = 20000;
    private final int USOUSADO = 100000;
    private final int MODELONUEVO = 3;
    private final int MODELOINTERMEDIO = 10;
    
    

    public Automovil(String placa, String marca, int modelo, double kilometraje, String color, double precio, String descripcion, String vendedor, int anioFabricacion) throws KilometrajeExcepcion,ModeloException, PrecioException, AnioFabricacionException {
        if(kilometraje<CONSTANTE0){
            throw new KilometrajeExcepcion();
        } else this.kilometraje = kilometraje;
        this.placa = placa;
        this.marca = marca;
        if(modelo>CONSTANTE0){
        this.modelo = modelo;}
        else{
            throw new ModeloException();
        }
        this.color = color;
        if(precio>0){
        this.precio = precio;}
        else{
            throw new PrecioException();
        }
        this.descripcion = descripcion;
        this.vendedor = vendedor;
        if(anioFabricacion>0){
            this.anioFabricacion = anioFabricacion;
        }
        else{
            throw new AnioFabricacionException();
        }
    }
    
    
    public String calcularUso()
    {
        
        if(kilometraje==CONSTANTE0){
            return "el " + marca + " es 0 Km";
        } else if(kilometraje<USONUEVO){
            return "el " + marca + " es nuevo";
        } else if(kilometraje<USOCASINUEVO){
            return "el " + marca + " es casi nuevo";
        } else if(kilometraje<USOUSADO){
            return "el " + marca + " es usado"; 
        }
        return "el " + marca + " es muy usado";
    }
    
    public String calcularModelo(){
        if(YearMonth.now().getYear()-modelo==CONSTANTE0){
           return "El " + marca + " es ultimo modelo"; 
        } else if(YearMonth.now().getYear()-modelo<MODELONUEVO){
           return "El " + marca + " es modelo nuevo.";
        } else if(YearMonth.now().getYear()-modelo<MODELOINTERMEDIO){
           return "El " + marca + " es modelo intermedio";
        }return "El " + marca + " es modelo antiguo";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public int getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    
    }