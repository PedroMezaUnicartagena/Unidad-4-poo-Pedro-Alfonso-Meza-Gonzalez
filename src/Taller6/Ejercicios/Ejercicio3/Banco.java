/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.Ejercicios.Ejercicio3;

/**
 *
 * @author HP
 */
public class Banco {

    /*
    esta propiedad no debe ser protected porque contiene datos sensibles
    y las clases hijas podrian alterar el saldo de manera no autorizada
     */
    protected double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

}
