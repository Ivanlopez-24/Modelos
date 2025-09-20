/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ivanlopez.taller2;

/**
 *
 * @author ivanl
 */
public class SalidaWeb implements Salida {
    @Override
    public void mostrarDatos(String mensaje) {
        System.out.println("WEB -> " + mensaje + " (simulado)");
    }
}