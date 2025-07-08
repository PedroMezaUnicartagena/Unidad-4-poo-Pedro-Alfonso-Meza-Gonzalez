/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.Ejercicios.Ejercicio1;

/**
 *
 * @author HP
 */
public class Vehiculo {
    protected String marca;
    protected double velocidadMaxima;

    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    protected void mostrarInformacion(){
        System.out.println("Marca: "+marca);
        System.out.println("Velocidad maxima: "+velocidadMaxima);
    }
}
