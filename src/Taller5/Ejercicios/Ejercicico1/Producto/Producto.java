/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5.Ejercicios.Ejercicico1.Producto;

/**
 *
 * @author HP
 */
public class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo(){
        System.out.println("El producto "+ nombre+" cuesta "+ precio+" y hay "+stock+" unidades");
    }
}