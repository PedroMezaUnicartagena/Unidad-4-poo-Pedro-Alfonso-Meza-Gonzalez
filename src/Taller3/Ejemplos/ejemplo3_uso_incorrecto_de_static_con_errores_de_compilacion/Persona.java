/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.Ejemplos.ejemplo3_uso_incorrecto_de_static_con_errores_de_compilacion;

/**
 *
 * @author HP
 */
public class Persona {

    private String nombre;

    public static void mostrarNombre() {
    // si descomentamos esta linea tenemos un error por intentar acceder a un atrivuto no estatico en un metodo static        
    //System.out.println("Nombre: " + nombre); 
    }
}
