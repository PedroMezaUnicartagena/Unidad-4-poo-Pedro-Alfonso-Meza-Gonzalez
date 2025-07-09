/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller14.Ejemplos.Ejemplo2_uso_incorrecto_del_polimorfismo;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal miAnimal = new Perro();
       // causa un error de compilacion porque animal no tiene el metodo correr
       miAnimal.correr();
    }
    
}
