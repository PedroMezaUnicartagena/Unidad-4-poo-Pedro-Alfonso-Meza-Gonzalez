/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10.Ejercicios.Ejercicio3;

/**
 *
 * @author HP
 */
public class Helicoptero extends Aereonave{

    // causa errores de compilacion porque cambia la firma
    @Override
    public void volar(int velocidadAspas) {
        System.out.println("El helicoptero vuela movendo las aspas a "+velocidadAspas);
    }
    
}
