/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller4.Ejercicios.Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("bienvenido al programa");
        System.out.println("----------------------------------------------------------------------------------------------");

        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese nota promedio del estudiante: ");
        double nota = sc.nextDouble();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();

        Estudiante estudiante = new Estudiante(nombre, edad, nota);

        System.out.println(
                "El estudiante: " + estudiante.getNombre()
                + " que tiene " + estudiante.getEdad()
                + " tiene una nota promedio de " + estudiante.getNotaPromedio()
        );

        System.out.println("Cambiando nota");
        estudiante.setNotaPromedio(4.5);
        System.out.println("Nueva nota del estudiante " + estudiante.getNotaPromedio());
    }

}
