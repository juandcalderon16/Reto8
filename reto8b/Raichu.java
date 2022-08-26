
package com.mycompany.reto8b;

public class Raichu extends Pokemon{
    
    Raichu(String nombre, int nivel, int salud)throws SaludNegativaException,NivelNegativoException{
        super(nombre,nivel,salud);
    }

    @Override
    public Pokemon evolucionar() throws NoEvolucionExeption{
        throw new NoEvolucionExeption();
    }

    @Override
    public String gritar() {
        return "Raichu!";
    }
    
}
