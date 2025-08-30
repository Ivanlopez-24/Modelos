/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.basico;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class DoWile {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int numeroSecreto = 8;
        int intento;
        do{
            System.out.println("Adivina un numero del 1 -10: ");
            intento = scanner.nextInt();
            if (intento != numeroSecreto){
            System.out.println("Fallaste, vuelve a intentar: ");
            }
        }while (intento != numeroSecreto); 
        System.out.println("El numero es correcto.");
    }     
}
