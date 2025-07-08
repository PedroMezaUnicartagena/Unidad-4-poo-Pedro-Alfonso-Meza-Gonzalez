/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejemplos.Ejemplo1_uso_correcto_de_clases_abstractas;

/**
 *
 * @author HP
 */
public abstract class Empleado {

    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto
    public abstract void calcularSalario(); 

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
