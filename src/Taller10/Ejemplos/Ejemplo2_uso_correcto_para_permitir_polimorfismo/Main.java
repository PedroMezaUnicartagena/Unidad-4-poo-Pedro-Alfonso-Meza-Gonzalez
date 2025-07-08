/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller10.Ejemplos.Ejemplo2_uso_correcto_para_permitir_polimorfismo;

import Taller10.Ejemplos.Ejemplo1_uso_correcto_de_sobreescritura_de_metodos.Empleado;
import Taller10.Ejemplos.Ejemplo1_uso_correcto_de_sobreescritura_de_metodos.Gerente;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Empleado gerente = new Gerente();

        empleado.trabajar();
        gerente.trabajar();
    }
}
