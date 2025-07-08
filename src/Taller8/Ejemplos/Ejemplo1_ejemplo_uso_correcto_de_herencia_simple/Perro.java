/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.Ejemplos.Ejemplo1_ejemplo_uso_correcto_de_herencia_simple;

/**
 *
 * @author HP
 */
public class Perro extends Animal {

    private String raza;

    public Perro(String especie, String raza) {
        super(especie);
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("El perro ladra.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro ladra.");
    }
}
