/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Taller12.Ejemplos.Ejemplio3_uso_de_metodos_predeterminados_en_interfaces;

/**
 *
 * @author HP
 */
public interface Vehiculo {

    void acelerar();

    default void encender() {
        System.out.println("El vehículo está encendido.");
    }
}
