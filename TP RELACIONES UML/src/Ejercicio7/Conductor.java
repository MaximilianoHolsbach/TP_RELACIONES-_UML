package Ejercicio7;
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // Asociación bidireccional
    //Constructor
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    //Metodos
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if(vehiculo != null && vehiculo.getConductor() != this){
            vehiculo.setConductor(this); // Establece la relación bidireccional
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }
    

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", licencia=" + licencia + '}';
    }
    
}
