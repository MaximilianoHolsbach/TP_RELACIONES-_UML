package Ejercicio11;
public class Artista {
    private String nombre;
    private String genero;
    //Constructor
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    //Metodos
    public String getNombre() {
        return nombre;
    }
    public String getGenero() {
        return genero;
    }  
}
