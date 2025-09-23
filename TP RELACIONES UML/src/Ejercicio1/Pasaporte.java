package Ejercicio1;

/**
 *
 * @author Maxi
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;//Composición
    private Titular titular;//Asociación Bidireccional
    
    //Constructor

    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }
    
    
}
