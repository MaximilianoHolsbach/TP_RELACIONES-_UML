package Ejercicio9;
public class Paciente {
    private String nombre;
    private String obraSocial;
    //Constructor
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    //Metodos
    public String getNombre() {
        return nombre;
    }
    public String getObraSocial() {
        return obraSocial;
    }
}
