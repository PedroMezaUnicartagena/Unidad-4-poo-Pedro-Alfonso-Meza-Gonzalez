/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.Ejercicios.Ejercicio1;

/**
 *
 * @author HP
 */
public class Empleado extends Persona{
    private String departamento;

    public Empleado(String departamento, String nombre, int edad) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    protected void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: "+departamento);
    }
    
    
}
