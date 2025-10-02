/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udsitrital.actividad3;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class Menu implements ComponenteMenu {
    private String nombre;
    private List<ComponenteMenu> items = new ArrayList<>();

    public Menu(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteMenu item) {
        items.add(item);
    }

    public void remover(ComponenteMenu item) {
        items.remove(item);
    }

    @Override
    public void mostrar() {
        System.out.println("Menú: " + nombre);
        for (ComponenteMenu item : items) {
            item.mostrar();
        }
    }

    @Override
    public ComponenteMenu clonar() {
        Menu clon = new Menu(this.nombre + " (copia)");
        for (ComponenteMenu item : items) {
            clon.agregar(item.clonar());
        }
        return clon;
    }
}
