/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejercicios.Ejercicio2;

/**
 *
 * @author HP
 */
public abstract class Empleado {
    protected double salario;

    public Empleado(double salario) {
        this.salario = salario;
    }
    
    
    public abstract double calcularSalario();
    
    public void mostrarDetalles(){
        System.out.println("El empleado tiene un salario de "+calcularSalario());
    }
}
