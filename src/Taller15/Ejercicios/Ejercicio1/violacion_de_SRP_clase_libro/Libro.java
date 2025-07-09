/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicios.Ejercicio1.violacion_de_SRP_clase_libro;

/**
 *
 * @author HP
 */
public class Libro {
    private String nombre;

    public Libro(String nombre) {
        this.nombre = nombre;
    }
    
    public void  manejarInformacion(){
        System.out.println("Procesando informacion");
    }

    public void generarReporte(){
        System.out.println("Generando Reporte");
    }
    
    public void guardarEnBaseDeDatos(){
        System.out.println("Guardando libro el la base de datos");
    }
}
