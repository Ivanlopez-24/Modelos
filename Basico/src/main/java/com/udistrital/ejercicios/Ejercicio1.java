/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udistrital.ejercicios;

/**
 *
 * @author ASUS
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int vidaJugador =  100;
        System.out.println("Tu vida está al maximo");
        while(vidaJugador >0){
            System.out.println("El enemigo te ataca");
            vidaJugador -= 30;
            if(vidaJugador >0 && vidaJugador<=50){
                System.out.println("Cuidado, tienes poca salud (" + vidaJugador +")" );
            }else if(vidaJugador >0){
                System.out.println("Tu vida ahora es de: " + vidaJugador );
            }
        }
        System.out.println("Te han eliminado");
    }
}
