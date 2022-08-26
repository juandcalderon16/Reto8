
package com.mycompany.reto8b;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Charmander extends Pokemon{
    

    Charmander(String nombre, int nivel, int salud) throws SaludNegativaException,NivelNegativoException{
        super(nombre,nivel,salud);
    }
    

    @Override
    public Pokemon evolucionar() throws SaludNegativaException, NivelNegativoException {
        Pokemon p = new Charmaleon(nombre,nivel,salud);
        return p;
    }

    @Override
    public String gritar() {
        return "Charmander!";
    }
    
    
}
