package Ejercicio5;
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // Asociación bidireccional
    //Constructor
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    //Metodos
    public void setComputadora(Computadora computadora) {// Establece la relación bidireccional
        this.computadora = computadora;
        if(computadora != null && computadora.getPropietario() != this){
            computadora.setPropietario(this);
        }
    }
    public Computadora getComputadora() {
        return computadora;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni +'}';
    }  
}
