/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.Ejemplos.Ejemplo3_uso_inecesario_de_polimorfismo;

/**
 *
 * @author HP
 */
public class Moto extends Vehiculo {

    @Override
    public void mover() {
        // uso inecesario porque el comportamiento no se modifica
        super.mover(); 
    }
}
