/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.Ejercicios.Ejercicio1;

/**
 *
 * @author HP
 */
public class Coche {
    private static int contadorCoches;
    private String marca;
    private String modelo;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }
    
    public static void mostrarcuentaCoches(){
        System.out.println("Numero de coches: "+contadorCoches);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
