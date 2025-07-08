/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10.Ejemplos.Ejemplo1_uso_correcto_de_sobreescritura_de_metodos;

/**
 *
 * @author HP
 */
public class Gerente extends Empleado {

    @Override
    public void trabajar() {
        System.out.println("El gerente está gestionando el equipo.");
    }
}
