/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7.Ejercicios.Ejercicio2;

/**
 *
 * @author HP
 */
public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public void mostrarDetallescuenta(){
        System.out.println("Numero de cuenta: "+numeroCuenta);
        System.out.println("saldo: "+saldo);
        System.out.println("tipo de cuenta: "+tipoCuenta);
;
    }
}
