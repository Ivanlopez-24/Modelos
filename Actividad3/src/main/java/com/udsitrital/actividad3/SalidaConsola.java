/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.actividad3;

/**
 *
 * @author ASUS
 */
public class SalidaConsola implements Salida {
    @Override
    public void mostrarDato(String mensaje) {
        System.out.println(mensaje);
    }
}