/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udistrital.ejercicios;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int manaPlayer = 0;
        boolean jugando = true;
        while(jugando){
            System.out.println("Menu del jugador");
            System.out.println("1. Subir de nivel");
            System.out.println("2. Atacar");
            System.out.println("3. Usar magia");
            System.out.println("4. Huir");
            int option = scanner.nextInt();
        
            switch (option){
            case 1:
                System.out.println("Subiste un nivel.");
                break;
            case 2:
                System.out.println("Atacaste al enemigo.");
                break;
            case 3:
                if(manaPlayer >=5){
                    System.out.println("Usaste un Hechizo");
                    manaPlayer -= 5;
                    System.out.println("Tu mana es ahora: "+ manaPlayer);
                }else{
                    System.out.println("No tienes suficiente mana");
                }   
            
                break;
            case 4:
                System.out.println("Te alejas rapidamente");
                jugando = false;
                break;
            default:
                System.out.println("Opcion no valida");
            }
            if(option == 1){
                manaPlayer +=5;
                System.out.println("Tu mana es ahora de: "+ manaPlayer);
            }
        }
        System.out.println("El juego ha finalizado.");
    }
}
