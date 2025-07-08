/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.Ejemplos.Ejemplo4_uso_incorrecto_intentar_acceder_a_atributos_privados_de_la_clase_padre;

/**
 *
 * @author HP
 */
public class Coche extends Vehiculo {

    public void mostrarMarca() {
        // no se puede acceder a marca porque este es privado
        System.out.println(marca); 
    }
}
