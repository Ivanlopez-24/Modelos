/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.basico;

/**
 *
 * @author ASUS
 */
public class While {
    public static void main(String[] args) {
        int vida = 100;
        System.out.println("Tu vida esta al maximo");
        while(vida >0){
            System.out.println("El enemigo ataca");
            vida -= 20;
            System.out.println("Tu vida restante es: "+ vida);
        }
        System.out.println("Te han derrotado");
    }
}
