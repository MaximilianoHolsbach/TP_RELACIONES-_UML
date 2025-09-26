package Ejercicio8;
public class Usuario {
    private String nombre;
    private String email;
    //Constructor
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    //Metodos
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }   
}
