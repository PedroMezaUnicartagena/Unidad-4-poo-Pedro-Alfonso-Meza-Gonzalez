/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller6.Ejemplos.Ejemplo3_uso_incorrecto_de_protected_con_errores_de_compilacion.pauquete2;

import Taller6.Ejemplos.Ejemplo3_uso_incorrecto_de_protected_con_errores_de_compilacion.pauquete1.Persona;

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
        // no se puede acceder directamente al atributo por ser protegido
        //System.out.println(p.nombre);
    }
}
