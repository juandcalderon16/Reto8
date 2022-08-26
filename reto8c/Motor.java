
package com.mycompany.reto8c;

public class Motor {
    private String marca;
    private String referencia;
    private double peso;

    public Motor(String marca, String referencia, double peso) throws PesoExecpcion{
        if(peso<0){
            throw new PesoExecpcion();
        }else this.peso = peso;
        this.marca = marca;
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
