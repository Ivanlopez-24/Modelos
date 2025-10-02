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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el tipo de interfaz:");
        System.out.println("1. Consola");
        System.out.println("2. Gráfica");
        int tipoIO = sc.nextInt();

        Entrada entrada = IOFactory.crearEntrada(tipoIO);
        Salida salida = IOFactory.crearSalida(tipoIO);

        String opcionStr = entrada.ingresarDato("Seleccione el tipo de menú:\n1. Vegetariano\n2. Gourmet");
        int opcion = Integer.parseInt(opcionStr);

        MenuDirector director = new MenuDirector();
        MenuBuilder builder;

        if (opcion == 1) {
            builder = new MenuVegetarianoBuilder();
        } else {
            builder = new MenuGourmetBuilder();
        }

        director.setBuilder(builder);
        director.construirMenu();
        Menu menu = builder.getResultado();

        salida.mostrarDato("\n=== Menú Construido ===");
        menu.mostrar();

        salida.mostrarDato("\n=== Clon del Menú ===");
        ComponenteMenu clon = menu.clonar();
        clon.mostrar();
    }
}
