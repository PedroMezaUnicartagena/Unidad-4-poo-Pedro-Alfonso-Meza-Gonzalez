/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller14.Ejercicios.Ejercicio2;

/**
 *
 * @author HP
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona persona = new Persona();
       Persona estudiante = new Estudiante();
       Persona profesor = new Profesor();
       
       persona.presentarse();
       estudiante.presentarse();
       profesor.presentarse();
    }
    
}
