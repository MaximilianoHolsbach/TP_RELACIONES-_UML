package Ejercicio12;
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // Asociación unidireccional
    //Constructor
    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
    //Metodos

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }
    
}
