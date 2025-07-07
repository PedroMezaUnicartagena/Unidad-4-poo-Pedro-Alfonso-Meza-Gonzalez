/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller3.Ejemplos.ejemplo2_metodo_de_utilidad_static;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = Calculadora.sumar(5, 7); // Llama al método estático sin crear una instancia
        System.out.println("Resultado: " + resultado); // Muestra: Resultado: 12
    }

}
