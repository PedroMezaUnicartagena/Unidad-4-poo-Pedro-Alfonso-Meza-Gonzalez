/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10.Ejemplos.Ejemplo4_uso_incorrecto_el_no_usar_override_puede_causar_errores_dificiles_de_detectar;

/**
 *
 * @author HP
 */
public class Gato extends Animal {

    // el no usar override puede causar errores dificiles de detectar
    public void hacerSonido() {
        System.out.println("El gato maúlla.");
    }
}
