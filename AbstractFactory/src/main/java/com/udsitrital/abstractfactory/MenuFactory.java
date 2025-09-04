/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.abstractfactory;

/**
 *
 * @author ASUS
 */
public interface MenuFactory {
    Entrada crearEntrada();
    Plato crearPlato();
    Bebida crearBebida();
    Postre crearPostre();
}
