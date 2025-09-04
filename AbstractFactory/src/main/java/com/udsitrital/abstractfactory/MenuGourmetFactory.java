/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.abstractfactory;

/**
 *
 * @author ASUS
 */
public class MenuGourmetFactory implements MenuFactory {
    @Override
    public Entrada crearEntrada() {
        return new EntradaGour();
    }

    @Override
    public Plato crearPlato() {
        return new PlatoGour();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaGour();
    }

    @Override
    public Postre crearPostre() {
        return new PostreGour();
    }

}
