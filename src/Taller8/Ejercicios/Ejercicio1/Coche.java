/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.Ejercicios.Ejercicio1;

/**
 *
 * @author HP
 */
public class Coche extends Vehiculo{

  
    private int numeroPuertas;

    public Coche(int numeroPuertas, String marca, double velocidadMaxima) {
        super(marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }  

    @Override
    protected void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de Puertas: "+numeroPuertas);
    }
}
