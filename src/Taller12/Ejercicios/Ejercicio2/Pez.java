/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12.Ejercicios.Ejercicio2;

/**
 *
 * @author HP
 */
public class  Pez implements Nadador, Respirador {

    @Override
    public void nadar() {
        System.out.println("El Pez esta nadando");
    }

    @Override
    public void respirar() {
        System.out.println("El Pez respira bajo el agua");
    }
    
}
