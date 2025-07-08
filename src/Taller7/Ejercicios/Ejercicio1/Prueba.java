/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller7.Ejercicios.Ejercicio1;

/**
 *
 * @author HP
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Lucas", 1500);
        
        System.out.println("Datos empleado");
        empleado.mostrarInformacion();
        
        System.out.println("Modificando datos empleado");
        empleado.nombre= "Felipe";
        empleado.setSalario(300);
        
        empleado.mostrarInformacion();
    }
    
}
