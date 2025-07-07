/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Ejemplos.ejemplo3_uso_incorrecto_del_this_en_contexto_estatico;

/**
 *
 * @author HP
 */
public class Persona {

    private String nombre;

    public static void mostrarNombre() {
        /* si descomentamos esta linea causa un error de compilacion
            por el mal uso del this en un contexto estatico
         */
        //   System.out.println(this.nombre); 
    }
}
