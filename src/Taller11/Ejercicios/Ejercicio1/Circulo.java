/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejercicios.Ejercicio1;

/**
 *
 * @author HP
 */
public class Circulo extends Figura{
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return 3.14159*(radio*radio);
    }
    
}
