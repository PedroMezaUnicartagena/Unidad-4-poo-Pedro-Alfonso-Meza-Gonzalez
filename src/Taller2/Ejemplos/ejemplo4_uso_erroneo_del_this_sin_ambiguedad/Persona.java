/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Ejemplos.ejemplo4_uso_erroneo_del_this_sin_ambiguedad;

/**
 *
 * @author HP
 */
public class Persona {

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre; // Aquí `this` es necesario
// Uso innecesario de `this` dentro de un método sin ambigüedad
        this.mostrarNombre(); // Aunque compila, `this` aquí es innecesario
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre); // `this` no es necesario aquí
    }
}
