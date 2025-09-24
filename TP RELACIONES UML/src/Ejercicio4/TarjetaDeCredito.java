package Ejercicio4;
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Asociación bidireccional
    private Banco banco;     // Agregación
    //Constructor
    public TarjetaDeCredito(String numero, String fechaVencimiento,Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    //Metodos
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjeta() != this){
            cliente.setTarjeta(this);// Establece la relación bidireccional
        }
    }
    public String getNumero() {
        return numero;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public Banco getBanco() {
        return banco;
    }
    
}
