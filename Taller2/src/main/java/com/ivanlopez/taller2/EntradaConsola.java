/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ivanlopez.taller2;
import java.util.Scanner;
/**
 *
 * @author ivanl
 */
public class EntradaConsola implements Entrada{
    private Scanner scanner = new Scanner(System.in);
    
    @Override
    public String ingresarDatos(String mensaje){
        System.out.print(mensaje + ": ");
        return scanner.nextLine();
    }
}
