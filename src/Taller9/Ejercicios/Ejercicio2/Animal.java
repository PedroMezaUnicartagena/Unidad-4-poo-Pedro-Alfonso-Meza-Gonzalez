/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.Ejercicios.Ejercicio2;

/**
 *
 * @author HP
 */
public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }
    
    protected void mostrarEspecie(){
        System.out.println("Especie: "+especie);
    }
}
