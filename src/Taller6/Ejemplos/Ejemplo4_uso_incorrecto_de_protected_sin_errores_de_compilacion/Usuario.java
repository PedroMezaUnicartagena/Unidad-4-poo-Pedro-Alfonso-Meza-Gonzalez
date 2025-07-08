/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.Ejemplos.Ejemplo4_uso_incorrecto_de_protected_sin_errores_de_compilacion;

/**
 *
 * @author HP
 */
public class Usuario {

    // la contraseña es un dato sensible asi que debe ser privado no protected
    protected String contraseña;

    public Usuario(String contraseña) {
        this.contraseña = contraseña;
    }
}
