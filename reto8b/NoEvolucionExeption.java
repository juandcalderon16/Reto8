/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto8b;

/**
 *
 * @author juand.calderon
 */
public class NoEvolucionExeption extends Exception{
    public NoEvolucionExeption(){
        super("Este pokemon no puede evolucionar");
    }
}
