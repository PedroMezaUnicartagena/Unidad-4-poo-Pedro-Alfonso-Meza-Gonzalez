/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5.Ejemplos.Ejemplo3_uso_de_encapsulamiento_inadecuado;

/**
 *
 * @author HP
 */
class Producto {
    
    // atributos con paquetes default que puede llevar a comportamiento indeseado dentro del paquete
    String nombre; 
    double precio; 

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio);
    }
}
