/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.Ejercicios.Ejercicio1;

/**
 *
 * @author HP
 */
public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
            titulo="sin titulo";
            autor="sin autor";
            numeroPaginas=0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    public void mostrarDetalles(){
        System.out.println("Detalles del libro:");
        System.out.println("Titulo: "+this.titulo);        
        System.out.println("Autor: "+this.autor);
        System.out.println("Numero de paginas: "+this.numeroPaginas);

    }
}
