package Ejercicio1;

/**
 *
 * @author Maxi
 * 
 * Asociación bidireccional, el pasaporte conoce al titular y viceversa
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;//Asociación bidireccional.
    
    //Constructor

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    //Metodos

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
}
