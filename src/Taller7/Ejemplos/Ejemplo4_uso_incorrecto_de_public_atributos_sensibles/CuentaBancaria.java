/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7.Ejemplos.Ejemplo4_uso_incorrecto_de_public_atributos_sensibles;

/**
 *
 * @author HP
 */
public class CuentaBancaria {
    
    // este atributo es sensible y por lo tanto debe ser private para evitar el mal acceso al saldo
    public double saldo;

    public CuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }
}
