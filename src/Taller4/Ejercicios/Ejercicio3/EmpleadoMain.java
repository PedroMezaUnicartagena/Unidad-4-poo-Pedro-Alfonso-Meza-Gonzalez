/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller4.Ejercicios.Ejercicio3;

/**
 *
 * @author HP
 */
public class EmpleadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Jorge", "UKV-234", "marketing");
        
        // uso incorecto de private intentar acceder directamente
        //System.out.println("Codigo de empleado: "+ empleado.codigo);
        
        //uso correcto de private usar los metodos accesores
        System.out.println("Codigo de empleado: "+ empleado.getCodigo());

    }
    
}
