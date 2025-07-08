/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.Ejemplos.Ejemplo1_ejemplo_uso_correcto_de_herencia_simple;

/**
 *
 * @author HP
 */
public class Animal {

    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}
