/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller1.Ejercicios.Ejercicio4_Ejercicio_Integrador;

import Taller1.Ejercicios.Ejercicio1.Libro;
import Taller1.Ejercicios.Ejercicio2.CuentaBancaria;
import Taller1.Ejercicios.Ejercicio3.Estudiante;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class EjercicioIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Bienvenido al programa");
        System.out.println("-------------------------------------------------------------------------------");

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7
        System.out.println("Datos del libro");
        System.out.print("Ingrese titulo del libro: ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese autor del libro: ");
        String autor = sc.nextLine();
        System.out.print("Ingrese numerode paginas: ");
        int numeroPaginas = sc.nextInt();
        sc.nextLine();
        System.out.println("Datos Libro constructor por defecto");
        var libro = new Libro();
        System.out.println(libro + "\n");

        System.out.println("Datos libro Constructor parametrizado");
        var libro2 = new Libro(titulo, autor, numeroPaginas);
        System.out.println(libro2+"\n");
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Datos Cuenta bancaria");
        System.out.print("Ingrese Numero de cuenta: ");
        String numeroCuenta = sc.nextLine();
        System.out.print("Ingrese saldo de la cuenta: ");
        double saldo=sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingrese tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();
        
        System.out.println("Datos cuenta constructor por defecto");
        var cuenta = new CuentaBancaria();
        System.out.println(cuenta+"\n");
        
        System.out.println("Datos cuenta constructor parametrizado");
        var cuenta2 = new CuentaBancaria(numeroCuenta, tipoCuenta);
        System.out.println(cuenta2+"\n");
        
        System.out.println("Datos cuenta constructor sobrecargado");
        var cuenta3= new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        System.out.println(cuenta3+"\n");
        
        
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        
        System.out.println("Datos del Estudiante");
        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.print("ingrese curso del estudiante: ");
        String curso = sc.nextLine();
        System.out.print("Ingrese edad del estudiante: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Datos estudiante constructor por defecto:");
        Estudiante estudiante1 = new Estudiante();
        System.out.println(estudiante1 + "\n");

        System.out.println("Datos Estudiante Constructor con dos parametros");
        Estudiante estudiante2 = new Estudiante(nombre, edad);
        System.out.println(estudiante2 + "\n");

        System.out.println("Datos Estudiante constructor con todos los parametros");
        Estudiante estudiante3 = new Estudiante(nombre, edad, curso);
        System.out.println(estudiante3 + "\n");

    }
}
