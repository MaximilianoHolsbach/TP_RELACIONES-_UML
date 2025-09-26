package Ejercicio11;
public class Cancion {
    private String titulo;
    private Artista artista; // Asociación unidireccional
    //Constructor
    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
    //Metodos
    public String getTitulo() {
        return titulo;
    }
    public Artista getArtista() {
        return artista;
    }
}