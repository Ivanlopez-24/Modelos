/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ivanlopez.taller2;
import javax.swing.JOptionPane;
/**
 *
 * @author ivanl
 */
public class SalidaFrame implements Salida {
    @Override
    public void mostrarDatos(String mensaje) {
        JOptionPane.showMessageDialog(null, "Frame -> " + mensaje);
    }
}
