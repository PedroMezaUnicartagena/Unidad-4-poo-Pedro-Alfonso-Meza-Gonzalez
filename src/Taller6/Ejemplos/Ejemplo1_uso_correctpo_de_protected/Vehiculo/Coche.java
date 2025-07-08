/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.Ejemplos.Ejemplo1_uso_correctpo_de_protected.Vehiculo;

/**
 *
 * @author HP
 */
public class Coche extends Vehiculo {

    private int puertas;

    public Coche(String marca, double velocidad, int puertas) {
        super(marca, velocidad);
        this.puertas = puertas;
    }

    public void mostrarInformacion() {
        mostrarDetalles(); // Accede al método protegido de la clase base
        System.out.println("Número de puertas: " + puertas);
    }
}
