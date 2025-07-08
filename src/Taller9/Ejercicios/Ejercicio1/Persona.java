/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.Ejercicios.Ejercicio1;

/**
 *
 * @author HP
 */
public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    protected void mostrarDetalles(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad "+edad);
    }
}
