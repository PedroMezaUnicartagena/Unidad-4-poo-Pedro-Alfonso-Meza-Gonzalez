/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejemplos.Ejemplo1_clase_usuario_con_multiples_responsabilidades;

/**
 *
 * @author HP
 */
public class AutenticacionService {

    public boolean autenticar(Usuario usuario, String contrasena) {
        return usuario.getNombre().equals("admin") && contrasena.equals("1234");
    }
}
