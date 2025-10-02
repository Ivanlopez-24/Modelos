/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.actividad3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class EntradaConsola implements Entrada {
    private Scanner sc = new Scanner(System.in);

    @Override
    public String ingresarDato(String mensaje) {
        System.out.print(mensaje + ": ");
        return sc.nextLine();
    }
}