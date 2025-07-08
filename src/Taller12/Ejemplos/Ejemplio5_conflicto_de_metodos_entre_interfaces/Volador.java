/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Taller12.Ejemplos.Ejemplio5_conflicto_de_metodos_entre_interfaces;

/**
 *
 * @author HP
 */
public interface Volador {

    default void despegar() {
        System.out.println("Volador despega.");
    }
}
