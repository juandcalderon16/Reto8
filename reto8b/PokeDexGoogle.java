
package com.mycompany.reto8b;

/**
 * @author yojua
 */
public class PokeDexGoogle implements PokeDex{
    
    BaseDatos libreria = new BaseDatos();
    PokeDex libro = new PokeDexGoogle();

    /**
     *
     * @param p
     * @return
     */
    @Override
    public String consultar(Pokemon p) {
        return libro.getOrigen(p) + ", es de color " + libro.getColor(p) + " estos Pokemon suelen tener Es de tipo" + libro.getTipo(p) + ". " + libro.getDescripcion(p);

    }

    @Override
    public int getNivel(Pokemon p) {
        int nivel = p.getNivel();
        return nivel;
    }

    @Override
    public String getDescripcion(Pokemon p) {
        String descripcion = libreria.getDescripcion(p.getClass().getSimpleName());
        return descripcion;
    }

    @Override
    public String getOrigen(Pokemon p) {
        String origen = libreria.getOrigen(p.getClass().getSimpleName());
        return origen;
    }

    @Override
    public int getAnios(Pokemon p) {
        int anios = libreria.getAnios(p.getClass().getSimpleName());
        return anios;
    }

    @Override
    public int getSalud(Pokemon p) {
        int salud = p.getSalud();
        return salud;
    }

    @Override
    public String getColor(Pokemon p) {
        String color = libreria.getColor(p.getClass().getSimpleName());
        return color;
    }

    @Override
    public String getTipo(Pokemon p) {
        String tipo = libreria.getTipo(p.getClass().getSimpleName());
        return tipo;
    }
    
}
