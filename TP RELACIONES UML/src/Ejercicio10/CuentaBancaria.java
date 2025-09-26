package Ejercicio10;
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // Composición
    private Titular titular;      // Asociación bidireccional
    //Constructor
    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
        this.titular = titular;
    }
    //Metodos
    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getCuenta() != this){
           titular.setCuenta(this); // Establece la relación bidireccional 
        }
    }
    public String getCbu() {
        return cbu;
    }
    public double getSaldo() {
        return saldo;
    }
    public ClaveSeguridad getClave() {
        return clave;
    }
    public Titular getTitular() {
        return titular;
    }
    public void getDatosDeCuenta(){
        System.out.println("La cuenta: "+this.cbu+"\nPerteneciente al titular: "+titular.getNombre()+"\nTiene el saldo: "+this.saldo);
    }
    public void getDatosDeClave(){
        System.out.println("La cuenta: "+this.cbu+"\nModifico su clave por ultima vez: "+clave.getUltimaModificacion());
    }
}
