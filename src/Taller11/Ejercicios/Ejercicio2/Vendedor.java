/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejercicios.Ejercicio2;

/**
 *
 * @author HP
 */
public class Vendedor extends Empleado{
    private double comision;

    public Vendedor(double comision, double salario) {
        super(salario);
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salario+comision;
    }
 
    
    
}
