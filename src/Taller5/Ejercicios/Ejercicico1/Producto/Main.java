/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller5.Ejercicios.Ejercicico1.Producto;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto = new Producto("computadora Acer", 500, 73);
        
        // al acceder directamente a los atrubutos dentro del mismo paquete funciona correctamente
        System.out.println("datos del producto "+ producto.nombre);
       
        // tambien se puede acceder a los metodos dentro del paquete
        producto.mostrarInfo();
        
    }
    
}
