/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.Ejercicios.Ejercicio3;

/**
 *
 * @author HP
 */
public class Animal {
    private String Tipo;
    private String nombre;

    public Animal(String Tipo, String nombre) {
        this.Tipo = Tipo;
        this.nombre = nombre;
    }
    
    public static void decirTipo(){
        // uso erroneo de static invocar atributo no estatico en metodo static
        //System.out.println("El animal es de tipo: "+tipo);
    }
}
