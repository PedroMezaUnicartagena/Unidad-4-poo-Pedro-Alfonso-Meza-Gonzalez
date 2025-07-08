/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7.Ejercicios.Ejercicio1;

/**
 *
 * @author HP
 */
public class Empleado {

    public String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }
    
    public void mostrarInformacion(){
        System.out.println("El empleado "+nombre+" tiene un salario de "+salario);
    }
}
