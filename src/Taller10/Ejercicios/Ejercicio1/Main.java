/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller10.Ejercicios.Ejercicio1;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona profesor = new Profesor();       
       Persona estudiante = new Estudiante();

       profesor.presentarse();
       estudiante.presentarse();
    }
    
}
