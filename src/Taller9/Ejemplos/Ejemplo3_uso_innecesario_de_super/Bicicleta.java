/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.Ejemplos.Ejemplo3_uso_innecesario_de_super;

/**
 *
 * @author HP
 */
public class Bicicleta extends Vehiculo {

    @Override
    public void mostrarTipo() {
        // el uso de super aqui es innecesario si el metodo no estuviera sobreescrito
        super.mostrarTipo();
        System.out.println("Este es un tipo de bicicleta.");
    }
}
