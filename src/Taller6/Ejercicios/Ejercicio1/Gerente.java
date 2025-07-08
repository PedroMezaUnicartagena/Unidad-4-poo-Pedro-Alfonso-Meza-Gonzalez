/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.Ejercicios.Ejercicio1;

/**
 *
 * @author HP
 */
public class Gerente extends Empleado{
    private String departramento;

    public Gerente(String departramento, String nombre, double salario) {
        super(nombre, salario);
        this.departramento = departramento;
    }

    @Override
    protected void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("pertenece al departamento "+departramento);
    }

    
    
    
}
