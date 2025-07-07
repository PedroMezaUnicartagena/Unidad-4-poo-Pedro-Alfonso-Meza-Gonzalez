/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Ejemplos.ejemplo2_llamar_otro_constructor;

/**
 *
 * @author HP
 */
public class Coche {

    private String marca;
    private int velocidadMaxima;

    public Coche() {
        this("Desconocida", 0); 
    }

    public Coche(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca + ", Velocidad máxima: " + this.velocidadMaxima);
    }
}
