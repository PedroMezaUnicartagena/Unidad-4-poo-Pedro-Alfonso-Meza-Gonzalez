/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Ejemplos.ejemplo1_uso_del_this;

/**
 *
 * @author HP
 */
public class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre);
    }
}
