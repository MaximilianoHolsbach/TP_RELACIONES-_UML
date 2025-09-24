package Ejercicio4;
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // Asociación bidireccional
    //Constructor
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    //Metodos
    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if(tarjeta != null && tarjeta.getCliente() != this){
            tarjeta.setCliente(this);
        }
    }
    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    
}
