
package com.mycompany.reto8b;

public class Pokebola {

    public Pokebola(String tamaño) {
        this.tamaño = tamaño;
    }

    protected String tamaño;
    protected Pokemon pokemon;

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    
}
