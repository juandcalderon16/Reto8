
package com.mycompany.reto8b;

public abstract class Pokemon{

    protected String nombre;
    protected int nivel;
    protected int salud; 

    public Pokemon(String nombre, int nivel, int salud) throws SaludNegativaException,NivelNegativoException{
        this.nombre = nombre;
        if(nivel>0){
        this.nivel = nivel;}
        else{
            throw new NivelNegativoException();
        }
        if(salud>0){
        this.salud = salud;}
        else{
            throw new SaludNegativaException();
        }
    }
   
    public abstract Pokemon evolucionar() throws NoEvolucionExeption,SaludNegativaException,NivelNegativoException;
    public abstract String gritar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) throws NivelNegativoException{
        if(nivel>0){
        this.nivel = nivel;}
        else{
            throw new NivelNegativoException();
        }
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) throws SaludNegativaException{
        this.salud = salud;
    }
    
    
}
