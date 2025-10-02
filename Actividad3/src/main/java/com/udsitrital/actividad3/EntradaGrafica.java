/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.actividad3;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class EntradaGrafica implements Entrada {
    @Override
    public String ingresarDato(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }
}