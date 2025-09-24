package Ejercicio3;

public class Principal {
    public static void main(String[]args){
        Autor autor1 = new Autor("Julio Cortázar", "Argentina");
        Editorial editorial1 = new Editorial("Sudamericana", "Av. Santa Fe 1234, Buenos Aires");
        Libro libro1 = new Libro("Rayuela", "978-950-07-1234-5", autor1, editorial1);
        libro1.getAutor_del_Libro();
        System.out.println("");
        libro1.getEditorial_del_Libro();
    }
}