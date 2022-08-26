 
package com.mycompany.reto8b;
/**
 *
 * @author yojua
 */
public class BaseDatos {
    public String getOrigen(String p){
        String origen = "";
        switch(p){
            case "Charizard":
            case "Charmander":
            case "Charmaleon":
                origen = "Este Pokemon pertenece a pueblo Paleta";
                break;
            case "Raichu":
            case "Pikachu":
                origen = "Este pokemon es de la ruta 2";
                break;
            case "Squirtle":
            case "Wartortle":
            case "Blastoise":
                origen = "Este pokemon pertenece a Kanto";
        }
        return origen;
    }
    
    public String getColor(String p){
        String color = "";
        switch(p){
            case "Charizard":
            case "Charmander":
            case "Charmaleon":
                color = "rojo";
        break;
            case "Raichu":
            case "Pikachu":
                color = "amarillo";
                break;
            case "Squirtle":
            case "Wartortle":
            case "Blastoise":
                color = "azul";
        }
        return color;
    }
    
    public int getAnios(String p){
        int anios = 0;
        switch(p){
            case "Charizard":
            case "Charmander":
            case "Charmaleon":
                anios = 6;
                break;
            case "Raichu":
            case "Pikachu":
                anios = 8;
                break;
            case "Squirtle":
            case "Wartortle":
            case "Blastoise":
                anios = 12;
        }
        return anios;
    }
    
    public String getTipo(String p){
        String tipo = "";
        switch(p){
            case "Charizard":
            case "Charmander":
            case "Charmaleon":
                tipo = "Fuego";
                break;
            case "Raichu":
            case "Pikachu":
                tipo = "Rayo";
                break;
            case "Squirtle":
            case "Wartortle":
            case "Blastoise":
                tipo = "Agua";
        }
        return tipo;
    }
    
    public String getDescripcion(String p){
        String descripcion = "";
        switch(p){
            case "Charizard":
            case "Charmander":
            case "Charmaleon":
                descripcion = " Es un dragon que parece inofensivo pero a medida que evoluciona puede ser de los pokemones mas fuertes";
                break;
            case "Raichu":
            case "Pikachu":
                descripcion = " Es una especie de conejo amarillo que puede controlar la electricidad";
                break;
            case "Squirtle":
            case "Wartortle":
            case "Blastoise":
                descripcion = " Es una tortuga que escupe fuertes chorros de agua";
        }
        return descripcion;
    }
}
