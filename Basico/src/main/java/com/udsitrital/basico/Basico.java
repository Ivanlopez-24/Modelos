/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.udsitrital.basico;

/**
 *
 * @author ASUS
 */
public class Basico {

    public static void main(String[] args) {
        int vidaJugador = 100;
        
        if(vidaJugador <= 0){
            System.out.println("Has muerto.");
        }else if(vidaJugador <=50){
            System.out.println("Cuidado, estas a mitad de vida.");
        }else if(vidaJugador <=100){
            System.out.println("Estas en condiciones de atacar.");
        }
    }
}
