/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.abstractfactory;

/**
 *
 * @author ASUS
 */
public class Restaurante {
    private Entrada entrada;
    private Plato plato;
    private Bebida bebida;
    private Postre postre;

    public Restaurante(MenuFactory factory) {
        this.entrada = factory.crearEntrada();
        this.plato = factory.crearPlato();
        this.bebida = factory.crearBebida();
        this.postre = factory.crearPostre();
    }

    // Método para consumir según opción
    public void consumir(int opcion) {
        switch(opcion) {
            case 1 -> entrada.mostrar();
            case 2 -> plato.mostrar();
            case 3 -> bebida.mostrar();
            case 4 -> postre.mostrar();
            default -> System.out.println("Opción inválida.");
        }
    }
}
