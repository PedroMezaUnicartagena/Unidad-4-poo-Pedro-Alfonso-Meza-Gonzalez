/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejemplos.Ejemplo1_uso_correcto_de_clases_abstractas;

/**
 *
 * @author HP
 */
public class Gerente extends Empleado {

    private double bono;

    public Gerente(String nombre, double bono) {
        super(nombre);
        this.bono = bono;
    }

    @Override
    public void calcularSalario() {
        System.out.println("El salario del gerente incluye un bono de: " + bono);
    }
}
