/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller9.Ejemplos.Ejemplo2_uso_incorrecto_intentar_usar_super_fuera_del_contexto_de_la_clase_derivada;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // error no se puede usar super si no es clase derivada
        super.tipo = "Orquídea";
    }
    
}
