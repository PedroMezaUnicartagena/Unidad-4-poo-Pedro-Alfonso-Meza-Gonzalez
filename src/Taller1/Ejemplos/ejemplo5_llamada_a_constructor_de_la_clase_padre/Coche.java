/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.Ejemplos.ejemplo5_llamada_a_constructor_de_la_clase_padre;

/**
 *
 * @author HP
 */
public class Coche extends Vehiculo {

    String marca;

    public Coche(String tipo, String marca) {
        super(tipo);
        this.marca = marca;
    }
}