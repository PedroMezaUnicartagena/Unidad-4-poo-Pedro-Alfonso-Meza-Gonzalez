/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Ejemplos.Ejemplo4_uso_incorrecto_sin_errores_de_compilacion;

/**
 *
 * @author HP
 */
public class Producto {

    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        // se actualiza el precio directamen sin conprovacion lo cual es erroneo
        precio = nuevoPrecio;
    }
}
