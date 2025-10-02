/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.actividad3;

/**
 *
 * @author ASUS
 */
public class MenuVegetarianoBuilder implements MenuBuilder {
    private Menu menu;

    @Override
    public void reset() {
        menu = new Menu("Menú Vegetariano");
    }

    @Override
    public void construirEntrada() {
        menu.agregar(new Plato("Ensalada fresca"));
    }

    @Override
    public void construirPlatoFuerte() {
        menu.agregar(new Plato("Hamburguesa vegetariana"));
    }

    @Override
    public void construirPostre() {
        menu.agregar(new Plato("Fruta de temporada"));
    }

    @Override
    public Menu getResultado() {
        return menu;
    }
}

