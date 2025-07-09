/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.Ejercicios.Ejercicio3;

/**
 *
 * @author HP
 */
public class Licuadora extends Electrodomestico {

    // no cambia la funcionalidad de la clase padre lo cual es una mala practica
    @Override
    public void funcionar() {
        super.funcionar(); 
    }
    
    public void licuar(){
        System.out.println("La licuadora esta licuando");
    }
}
