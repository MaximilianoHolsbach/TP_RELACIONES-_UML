package Ejercicio3;
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;         // Asociación unidireccional
    private Editorial editorial; // Agregación
    //Constructor
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
    //Metodos
    public void getAutor_del_Libro() {
        System.out.println("El autor del libro: "+this.titulo+", es: "+autor.getNombre());
    }
    public void getEditorial_del_Libro() {
        System.out.println("La editorial del libro: "+this.titulo+", es: "+editorial.getNombre());
    }
    
}

