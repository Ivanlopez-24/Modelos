/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.actividad3;

/**
 *
 * @author ASUS
 */
public class IOFactory {
    public static Entrada crearEntrada(int opcion) {
        if (opcion == 1) {
            return new EntradaConsola();
        } else {
            return new EntradaGrafica();
        }
    }

    public static Salida crearSalida(int opcion) {
        if (opcion == 1) {
            return new SalidaConsola();
        } else {
            return new SalidaGrafica();
        }
    }
}
