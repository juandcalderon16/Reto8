/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto8c;

/**
 *
 * @author juand.calderon
 */
public class KilometrajeExcepcion extends Exception{
    public KilometrajeExcepcion(){
        super("Ingrese un kilometraje positivo.");
    }
}
