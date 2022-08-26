
package com.mycompany.reto8a;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juand.calderon
 */
public class Reto8a_1 {

    public static void main(String[] args) {
        
        List<Tramo> via = new ArrayList<>();
        Carretera num = new Carretera(via);
        
         Tramo d;
        try {
            d = new TramoAsfalto(1,1,3,5, "Pedro", 80, true);
            num.getVia().add(d);
            System.out.println("Longitud del tramo d: " + d.longitud());
        } catch (VelocidadMaximaException ex) {
            System.out.println(ex.getMessage());
        }
        Tramo f;
        try {
            f = new TramoSinAsfalto(3,5,5,5, 0.4, "Piedras");
            num.getVia().add(f);
            System.out.println("Volumen del tramo f: " + f.volumen());
        } catch (EspesorException ex) {
            System.out.println(ex.getMessage());
        }
        Tramo e;
        try {
            e = new TramoAsfalto(5,5,5,1, "Juan", 50, false);
            num.getVia().add(e);
            System.out.println("Area del tramo e: " + e.area());
        } catch (VelocidadMaximaException ex) {
            System.out.println(ex.getMessage());
        }
        Tramo g;
        try {
            g = new TramoSinAsfalto(5,1,1,1, 0.18, "Arena");
            num.getVia().add(g);
        } catch (EspesorException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Volumen total: " + num.volumenTotal());
        System.out.println("Area total: " + num.areaTotal());
        System.out.println("Longitud total: " + num.longitudTotal());
        System.out.println("Volumen de tramos con asfalto: " + num.volumenAsfalto());
        System.out.println("Volumen de tramos sin asfalto: " + num.volumenSinAsfalto());
        System.out.println("¿Hay tramos conectados? " + num.conexion());
    }
}
