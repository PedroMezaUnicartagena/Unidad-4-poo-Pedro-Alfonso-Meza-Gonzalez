/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller4.Ejemplos.Ejemplo3_uso_incorrecto_con_errores_de_compilacion;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        // si descomentamos esta linea tiene un error de compilacion al intentar acceder directamente a un atributo privado
        //System.out.println(p.nombre); 
    }

}
