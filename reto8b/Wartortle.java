
package com.mycompany.reto8b;

public class Wartortle extends Pokemon{
    
    Wartortle(String nombre, int nivel, int salud)throws SaludNegativaException,NivelNegativoException{
        super(nombre,nivel,salud);
    }

    @Override
    public Pokemon evolucionar() throws SaludNegativaException, NivelNegativoException {
        Pokemon p = new Blastoise(nombre,nivel,salud);
        return p;
    }

    @Override
    public String gritar() {
        return "Wartortle!";
    }
    
}
