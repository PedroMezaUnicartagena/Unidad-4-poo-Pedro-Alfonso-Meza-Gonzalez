/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller13.Ejercicios.Ejercicio3;

/**
 *
 * @author HP
 */
public abstract class Electrodomestico {
    /*
        no se pueden crear metodos default en clases abstractas
        para tener un comportamiento similar solo se quita el default
    */
    default void funcionar(){
        System.out.println("El electrodomestico funciona");
    }
}
