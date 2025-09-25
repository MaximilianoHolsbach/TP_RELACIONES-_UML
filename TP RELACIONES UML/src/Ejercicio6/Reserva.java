package Ejercicio6;
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; // Asociación unidireccional
    private Mesa mesa;       // Agregación
    //Constructor
    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
    //Metodos
    public void getReservante(){
        System.out.println("El cliente que realiza la reserva es: "+cliente.getNombre()+", se le asigna la mesa: "+mesa.getNumero());
    }
}
