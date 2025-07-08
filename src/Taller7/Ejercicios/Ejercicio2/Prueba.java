/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller7.Ejercicios.Ejercicio2;

/**
 *
 * @author HP
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("75F47", 500, "ahorro");
        
        // al intentar acceder al numeroCuenta directamente causa errores de compilacion
        //cuenta.numeroCuenta="AC45G";
        
        // lo mismo pasa con saldo
        //cuenta.saldo=9999;

    }
    
}
