/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.abstractfactory;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuFactory factory = null;

        System.out.println("=== BIENVENIDO AL RESTAURANTE ===");
        System.out.println("Seleccione el tipo de menú:");
        System.out.println("1. Vegetariano");
        System.out.println("2. Saludable");
        System.out.println("3. Gourmet");
        System.out.print("Opción: ");
        int tipoMenu = scanner.nextInt();

        switch (tipoMenu) {
            case 1 -> factory = new MenuVegetarianoFactory();
            case 2 -> factory = new MenuSaludableFactory();
            case 3 -> factory = new MenuGourmetFactory();
            default -> {
                System.out.println("Opción inválida. Se asignará menú saludable por defecto.");
                factory = new MenuSaludableFactory();
            }
        }

        Restaurante restaurante = new Restaurante(factory);

        int opcion;
        do {
            System.out.println("\n--- Menú de opciones ---");
            System.out.println("1. Consumir Entrada");
            System.out.println("2. Consumir Plato Principal");
            System.out.println("3. Consumir Bebida");
            System.out.println("4. Consumir Postre");
            System.out.println("5. Salir");
            System.out.print("Seleccione: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                restaurante.consumir(opcion);
            } else if (opcion != 5) {
                System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        System.out.println("Gracias por visitarnos. ¡Buen provecho!");
        scanner.close();
    }
}
