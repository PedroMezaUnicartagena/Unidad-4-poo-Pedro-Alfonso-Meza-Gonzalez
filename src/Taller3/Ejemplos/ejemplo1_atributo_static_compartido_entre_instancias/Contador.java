/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.Ejemplos.ejemplo1_atributo_static_compartido_entre_instancias;

/**
 *
 * @author HP
 */
public class Contador {

    static int contadorGlobal = 0; // Atributo estático

    public Contador() {
        contadorGlobal++; // Incrementa el contador global cada vez que se crea un objeto
    }

    public static void mostrarContador() {
        System.out.println("Contador global: " + contadorGlobal);
    }
}
