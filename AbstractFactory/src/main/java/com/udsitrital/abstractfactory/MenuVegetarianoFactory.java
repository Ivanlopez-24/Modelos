/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.abstractfactory;

/**
 *
 * @author ASUS
 */
public class MenuVegetarianoFactory implements MenuFactory {
    @Override
    public Entrada crearEntrada() {
        return new EntradaVegan();
    }

    @Override
    public Plato crearPlato() {
        return new PlatoVegan();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaVegan();
    }

    @Override
    public Postre crearPostre() {
        return new PostreVegan();
    }
}
