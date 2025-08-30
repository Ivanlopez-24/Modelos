/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.basico;

/**
 *
 * @author ASUS
 */
public class BreakContinue {
    public static void main(String[] args) {
        String[] items = {"Espada", "Anillo", "LLave secreta", "Basura"};
        for(String item: items){
            if(item.equals("Nada")){
                continue;
            }
            System.out.println("Has encontrado: " + item);
            if(item.equals("LLave secreta")){
                System.out.println("Has abierto el cofre con la llave secreta");
                break;
            }
        }
    }
}
