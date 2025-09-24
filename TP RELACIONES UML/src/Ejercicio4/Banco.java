package Ejercicio4;
public class Banco {
    private String nombre;
    private String cuit;
    //Constructor
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }
    
}
