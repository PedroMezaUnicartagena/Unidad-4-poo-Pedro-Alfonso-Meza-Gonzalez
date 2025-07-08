/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.Ejercicios.Ejercicio2;

/**
 *
 * @author HP
 */
public class Estudiante extends Persona{
    private String matricula;

    public Estudiante(String matricula, String nombre, int edad) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    protected void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Matricula: "+matricula);
    }
    
    
}
