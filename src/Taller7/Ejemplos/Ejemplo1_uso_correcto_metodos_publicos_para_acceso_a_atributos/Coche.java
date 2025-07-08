/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7.Ejemplos.Ejemplo1_uso_correcto_metodos_publicos_para_acceso_a_atributos;

/**
 *
 * @author HP
 */
public class Coche {

    private String marca;
    private double velocidadMaxima;

    public Coche(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }


    public String getMarca() {
        return marca;
    }


    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        }
    }


    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}
