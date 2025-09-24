package Ejercicio2;
public class Bateria {
    private String modelo;
    private int capacidad;
    //Constructor
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    //Metodos
    public String getModelo(){
        return modelo;
    }
}
