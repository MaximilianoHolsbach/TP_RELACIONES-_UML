package Ejercicio7;
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;         // Agregación
    private Conductor conductor; // Asociación bidireccional
    //Constructor
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    //Metodos
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if(conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this); // Establece la relación bidireccional
        }
    }
    public Conductor getConductor() {
        return conductor;
    }
    public String getPatente() {
        return patente;
    }
    public String getModelo() {
        return modelo;
    }
    public Motor getMotor() {
        return motor;
    }
    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + '}';
    }
}