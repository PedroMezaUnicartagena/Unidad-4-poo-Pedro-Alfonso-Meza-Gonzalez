/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12.Ejercicios.Ejercicio1;

/**
 *
 * @author HP
 */
public class Ave implements Cantante, Volador{

    @Override
    public void cantar() {
        System.out.println("El ave canta");
    }

    @Override
    public void volar() {
        System.out.println("El ave vuela");
    }
    
}
