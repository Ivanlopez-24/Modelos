/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.actividad3;

/**
 *
 * @author ASUS
 */
public class MenuGourmetBuilder implements MenuBuilder {
    private Menu menu;

    @Override
    public void reset() {
        menu = new Menu("Menú Gourmet");
    }

    @Override
    public void construirEntrada() {
        menu.agregar(new Plato("Carpaccio de res"));
    }

    @Override
    public void construirPlatoFuerte() {
        menu.agregar(new Plato("Filete mignon con salsa de vino"));
    }

    @Override
    public void construirPostre() {
        menu.agregar(new Plato("Tiramisú"));
    }

    @Override
    public Menu getResultado() {
        return menu;
    }
}
