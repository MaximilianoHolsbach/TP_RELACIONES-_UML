package Ejercicio1;

/**
 *
 * @author Maxi
 * 
 * Composición unidireccional, la foto es parte integral del pasaporte, se
 * destruye con el.
 */
public class Foto {
    private String imagen;
    private String formato;
    
    //Constructor
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    
}
