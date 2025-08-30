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
public class Switch {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
        System.out.println("Menú");
        System.out.println("1. Atacar");
        System.out.println("2. Defender");
        System.out.println("3. Curar");
        System.out.println("4. Huir");
        
        int option = scanner.nextInt();
        
        switch (option){
            case 1:
                System.out.println("Has lanzado un ataque");
                break;
            case 2:
                System.out.println("Te has protegido");
                break;
            case 3:
                System.out.println("Utilizaste una pocion");
                break;
            case 4:
                System.out.println("Te alejaste rapidamente");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}
