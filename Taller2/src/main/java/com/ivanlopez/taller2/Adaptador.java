/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ivanlopez.taller2;

/**
 *
 * @author ivanl
 */
public class Adaptador {
    public static String convertir(Object dato) {
        if (dato == null) {
            return "";
        }
        return String.valueOf(dato);
    }
}