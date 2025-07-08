/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.Ejercicios.Ejercicio3;

/**
 *
 * @author HP
 */
public class Licuadora extends Electrodomestico{
    private int numeroLitros;

    public Licuadora(int numeroLitros, String tipoCorriente) {
        super(tipoCorriente);
        this.numeroLitros = numeroLitros;
    }
    
    public void mostrarDetalles(){
        // no se puede acceder a atrubuto de la clase padre debido a que este es privado
        System.out.println("Tipo de coriente "super.tipoCoriente);
    }
}
