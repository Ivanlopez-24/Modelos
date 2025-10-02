/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.actividad3;

/**
 *
 * @author ASUS
 */
public class Plato implements ComponenteMenu {
    private String nombre;

    public Plato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        System.out.println("Platillo: " + nombre);
    }

    @Override
    public ComponenteMenu clonar() {
        return new Plato(this.nombre);
    }
}
