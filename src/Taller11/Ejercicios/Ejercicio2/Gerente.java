/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejercicios.Ejercicio2;

/**
 *
 * @author HP
 */
public class Gerente extends Empleado{

    public Gerente(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalario() {
       return salario;
    }
    
}
