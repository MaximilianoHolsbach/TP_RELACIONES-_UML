package Ejercicio9;
public class Profesional {
    private String nombre;
    private String especialidad;
    //Constructor
    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    //Metodos
    public String getNombre() {
        return nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
}
