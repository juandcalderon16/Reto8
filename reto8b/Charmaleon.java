
package com.mycompany.reto8b;

public class Charmaleon extends Pokemon{

    public Charmaleon(String nombre, int nivel, int salud) throws SaludNegativaException, NivelNegativoException {
        super(nombre,nivel, salud);
    }


    @Override
    public Pokemon evolucionar() throws SaludNegativaException, NivelNegativoException {
            Pokemon p = new Charizard(nombre,nivel,salud);
            return p;
        
    }

    @Override
    public String gritar() {
        return "Charmaleon!";
    }
    
}
