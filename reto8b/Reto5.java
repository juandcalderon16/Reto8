
package com.mycompany.reto8b;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Reto5 {

    public static void main(String[] args) {
        
        Pokebola poke1 = new Pokebola("grande");
        Pokemon p;
        try {
            p = new Charmander("Antonio",4,40);
            System.out.println(p.gritar());
            
            p = p.evolucionar();
            System.out.println(p.gritar());
            p = p.evolucionar();
        } catch (SaludNegativaException | NivelNegativoException | NoEvolucionExeption ex) {
            System.out.println(ex.getMessage());
        }
        
        
        

        Pokemon d;
        
        try {
            d = new Pikachu("Geronimo",7,200);
            System.out.println(d.gritar());
            poke1.setPokemon(d);
            
            d = d.evolucionar();
            System.out.println(d.gritar());
        } catch (SaludNegativaException | NivelNegativoException | NoEvolucionExeption ex) {
            System.out.println(ex.getMessage());
        }
        
            
            
        
        
        Pokemon f;
        
        try {
            f = new Squirtle("Fabinno",5,50);
            System.out.println(f.gritar());
        
            f = f.evolucionar();
        
        System.out.println(f.gritar());
        
            f = f.evolucionar();
            
            
            System.out.println(f.gritar());
        } catch (SaludNegativaException | NivelNegativoException | NoEvolucionExeption ex) {
            System.out.println(ex.getMessage());
        }
        
}}
