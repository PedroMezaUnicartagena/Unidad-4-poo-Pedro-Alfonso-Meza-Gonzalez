/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller3.Ejemplos.ejemplo1_atributo_static_compartido_entre_instancias;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
    // Se accede al método estático usando el nombre de la clase
        Contador.mostrarContador(); // Muestra: Contador global: 3
    }

}
