/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller13.Ejercicios.Ejercicio2;

/**
 *
 * @author HP
 */
public class Pato implements Volador , Nadador{

    @Override
    public void volar() {
        System.out.println("El Pato vuela");
    }

    @Override
    public void nadar() {
        System.out.println("El Pato nada");
    }
    
}
