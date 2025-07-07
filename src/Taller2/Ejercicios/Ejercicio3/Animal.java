/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Ejercicios.Ejercicio3;

/**
 *
 * @author HP
 */
public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public static void correr(){
        // uso incorrecto del this
        //System.out.println("El animal "+this.nombre +" Esta corriendo");
   
        //uso correcto
        System.out.println("El animal esta corriendo");
    
    }
}
