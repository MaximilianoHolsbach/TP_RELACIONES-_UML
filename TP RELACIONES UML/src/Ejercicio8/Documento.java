package Ejercicio8;
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición
    //Constructor
    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash,fecha,usuario);
    }
    //Metodos
    public String getTitulo() {
        return titulo;
    }
    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }
    
}