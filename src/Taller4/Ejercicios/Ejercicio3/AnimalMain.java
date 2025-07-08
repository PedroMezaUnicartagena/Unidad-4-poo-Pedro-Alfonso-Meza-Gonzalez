/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller4.Ejercicios.Ejercicio3;

/**
 *
 * @author HP
 */
public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal tigre = new Animal("Tigre", "Carnivora", "Felino", 4);

        System.out.println("El tigre tiene " + tigre.numeroPatas + " patas");

        // al faltar validaciones se pueden crear estados indeseados como por ejemplo un animal con patas negativas
        tigre.numeroPatas = -10;
        System.out.println("El tigre tiene " + tigre.numeroPatas + " patas");

    }

}
