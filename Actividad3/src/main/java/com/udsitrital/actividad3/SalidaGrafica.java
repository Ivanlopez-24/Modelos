/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.udsitrital.actividad3;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class SalidaGrafica implements Salida {
    @Override
    public void mostrarDato(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}