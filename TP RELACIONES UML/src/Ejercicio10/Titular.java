package Ejercicio10;
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // Asociación bidireccional
    //Constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    //Metodos
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        if(cuenta != null && cuenta.getTitular() != this){
           cuenta.setTitular(this); // Establece la relación bidireccional 
        }
    }
    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    public CuentaBancaria getCuenta() {
        return cuenta;
    }
}
