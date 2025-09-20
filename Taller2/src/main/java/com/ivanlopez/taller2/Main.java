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
public class Main {
    private IOFactory factory;
    private Entrada entrada;
    private Salida salida;

    public Main(IOFactory factory) {
        this.factory = factory;
        this.entrada = factory.crearEntrada();
        this.salida = factory.crearSalida();
    }

    public void ejecutar() {
        String dato = entrada.ingresarDatos("Ingrese un dato");
        // Probamos el adaptador con un entero
        String convertido = Adaptador.convertir(12345);
        
        salida.mostrarDatos("Dato ingresado: " + dato);
        salida.mostrarDatos("Dato convertido desde entero: " + convertido);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione entorno:");
        System.out.println("1. Consola");
        System.out.println("2. Frame (JOptionPane)");
        System.out.println("3. Web (simulado)");
        int opcion = sc.nextInt();

        IOFactory factory;
        switch (opcion) {
            case 1:
                factory = new ConsolaFactory();
                break;
            case 2:
                factory = new FrameFactory();
                break;
            case 3:
                factory = new WebFactory();
                break;
            default:
                System.out.println("Opción no válida, se usará Consola.");
                factory = new ConsolaFactory();
        }

        Main app = new Main(factory);
        app.ejecutar();
    }
}