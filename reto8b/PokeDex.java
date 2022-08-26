
package com.mycompany.reto8b;

/**
 *
 * @author juand.calderon
 */
public interface PokeDex {
    String consultar(Pokemon p);
    int getNivel(Pokemon p);
    String getDescripcion(Pokemon p);
    String getOrigen(Pokemon p);
    int getAnios(Pokemon p);
    int getSalud(Pokemon p);
    String getColor(Pokemon p);
    String getTipo(Pokemon p);
}

