/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.actividad3;

/**
 *
 * @author ASUS
 */
public class MenuDirector {
    private MenuBuilder builder;

    public void setBuilder(MenuBuilder builder) {
        this.builder = builder;
    }

    public void construirMenu() {
        builder.reset();
        builder.construirEntrada();
        builder.construirPlatoFuerte();
        builder.construirPostre();
    }
}

