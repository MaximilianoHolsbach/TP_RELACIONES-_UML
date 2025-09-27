package Ejercicio13;
public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación unidireccional
    //Constructor
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
    //Metodos
    public String getValor() {
        return valor;
    }
    public Usuario getUsuario() {
        return usuario;
    }
}