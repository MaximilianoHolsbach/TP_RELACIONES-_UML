package Ejercicio12;
public class Contribuyente {
    private String nombre;
    private String cuil;
    //Constructor
    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }
    //Metodos
    public String getNombre() {
        return nombre;
    }
    public String getCuil() {
        return cuil;
    }
}
