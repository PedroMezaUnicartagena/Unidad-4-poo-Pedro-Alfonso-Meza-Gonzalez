/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12.Ejemplos.Ejemplio6_uso_innecesario_de_interfaces;

/**
 *
 * @author HP
 */
public class Arbol implements Corredor {

    @Override
    public void correr() {
        // El árbol no corre por lo que no deberia implementar la interfaz
        System.out.println("Los árboles no pueden correr.");
    }
}
