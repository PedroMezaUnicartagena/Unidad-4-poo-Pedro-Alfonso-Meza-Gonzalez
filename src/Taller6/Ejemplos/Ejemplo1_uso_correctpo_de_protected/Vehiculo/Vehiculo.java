/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.Ejemplos.Ejemplo1_uso_correctpo_de_protected.Vehiculo;

/**
 *
 * @author HP
 */
public class Vehiculo {

    protected String marca;
    protected double velocidad;

    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    protected void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Velocidad: " + velocidad + " km/h");
    }
}
