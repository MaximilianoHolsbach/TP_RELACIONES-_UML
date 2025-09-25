package Ejercicio5;
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;     // Composición
    private Propietario propietario;   // Asociación bidireccional
    //Constructor
    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;      
    }
    //Metodos
    public void setPropietario(Propietario propietario) {// Establece la relación bidireccional
        this.propietario = propietario;
        if(propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }
    public Propietario getPropietario() {
        return propietario;
    }
    public String getMarca(){
        return marca;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + '}';
    }   
}
