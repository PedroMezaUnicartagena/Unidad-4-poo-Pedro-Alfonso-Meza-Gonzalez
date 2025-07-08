/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Ejercicios.Ejercicio2;

/**
 *
 * @author HP
 */
public class Coche {

    private String marca;
    private String modelo;
    private double velocidad;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidad, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.velocidadMaxima = velocidadMaxima;
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

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) 
    {
        if(velocidadMaxima<=0){
            System.out.println("La velocidad debe ser positiva");
            return;
        }
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(double incremento) {
        if (velocidad+incremento>velocidadMaxima) {
            System.out.println("Esa velocidad supera la velocidad maxima");
            return;
        }else if(velocidad<=0){
            System.out.println("La velocidad debe ser positiva");
            return;
        }
        velocidad += incremento;
    }

}
