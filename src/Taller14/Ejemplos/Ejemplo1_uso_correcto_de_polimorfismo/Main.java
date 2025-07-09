/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller14.Ejemplos.Ejemplo1_uso_correcto_de_polimorfismo;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Gerente();
        Empleado empleado2 = new Ingeniero();
        empleado1.trabajar(); // Muestra: El gerente está gestionando el equipo.
        empleado2.trabajar(); // Muestra: El ingeniero está diseñando.
    }
}
