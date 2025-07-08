/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Ejercicios.Ejercicio3;

/**
 *
 * @author HP
 */
public class Animal {
    public String nombre;
    public String tipoAlimentacion;
    public String especie;
    public int numeroPatas;

    public Animal(String nombre, String tipoAlimentacion, String especie, int numeroPatas) {
        this.nombre = nombre;
        this.tipoAlimentacion = tipoAlimentacion;
        this.especie = especie;
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", tipoAlimentacion=" + tipoAlimentacion + ", especie=" + especie + ", numeroPatas=" + numeroPatas + '}';
    }
    
    
}
