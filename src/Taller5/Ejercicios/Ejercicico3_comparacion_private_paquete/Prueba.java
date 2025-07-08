/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller5.Ejercicios.Ejercicico3_comparacion_private_paquete;

/**
 *
 * @author HP
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("Hugo", 37);
        
        // el atributo privado nombe no es accesible directamente
        //persona.nombre = "Andres";
        
        // el atributo default  edad es accesible directamente
        persona.edad=55;
    }
    
}
