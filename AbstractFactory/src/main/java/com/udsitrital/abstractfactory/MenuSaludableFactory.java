/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.abstractfactory;

/**
 *
 * @author ASUS
 */
public class MenuSaludableFactory implements MenuFactory {
    @Override
    public Entrada crearEntrada() {
        return new EntradaSalud();
    }

    @Override
    public Plato crearPlato() {
        return new PlatoSalud();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaSalud();
    }

    @Override
    public Postre crearPostre() {
        return new PostreSalud();
    }
}
