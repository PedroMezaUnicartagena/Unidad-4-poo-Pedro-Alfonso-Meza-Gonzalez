/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller14.Ejercicios.Ejercicio1;

/**
 *
 * @author HP
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Figura circulo = new Circulo(20);
       Figura rectangulo = new Rectangulo(30,40);
       
       circulo.calcularArea();
       rectangulo.calcularArea();
    }
    
}
