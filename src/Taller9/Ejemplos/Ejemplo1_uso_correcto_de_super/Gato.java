/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.Ejemplos.Ejemplo1_uso_correcto_de_super;

/**
 *
 * @author HP
 */
public class Gato extends Animal {

    private String color;

    public Gato(String especie, String color) {
        // invocamos al constructor de la clase padre
        super(especie); 
        this.color = color;
    }

    @Override
    public void mostrarEspecie() {
        // llamamos metodo de la clase padre
        super.mostrarEspecie(); 
        System.out.println("Color: " + color);
    }
}
