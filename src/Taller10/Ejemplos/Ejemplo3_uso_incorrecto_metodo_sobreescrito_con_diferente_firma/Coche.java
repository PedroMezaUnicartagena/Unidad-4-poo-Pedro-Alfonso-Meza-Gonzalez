/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10.Ejemplos.Ejemplo3_uso_incorrecto_metodo_sobreescrito_con_diferente_firma;

/**
 *
 * @author HP
 */
public class Coche extends Vehiculo {
    
    //causa un error porque la firma es diferente
    @Override
    public void acelerar() {
        System.out.println("El coche acelera.");
    }
}
