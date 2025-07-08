/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller4.Ejercicios.Ejercicio2;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       var coche = new Coche("nissan", "astra", 300,0);
       
      // al intentar acceder diirectamente a las propiedades causa error de compilacion
      // System.out.println("Velocidad maxima: "+coche.velocidadMaxima);
    }
    
}
