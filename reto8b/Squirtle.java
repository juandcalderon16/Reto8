
package com.mycompany.reto8b;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Squirtle extends Pokemon{
    
    Squirtle(String nombre, int nivel, int salud)throws SaludNegativaException,NivelNegativoException{
        super(nombre,nivel,salud);
    }

    @Override
    public Pokemon evolucionar() throws SaludNegativaException, NivelNegativoException {
        Pokemon p = new Wartortle(nombre,nivel,salud);
        return p;
    }

    @Override
    public String gritar() {
        return "Squirtle!";
    }
    
}
