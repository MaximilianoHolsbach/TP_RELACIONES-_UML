package Ejercicio10;
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    //Constructor
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    //Metodos
    public String getCodigo() {
        return codigo;
    }
    public String getUltimaModificacion() {
        return ultimaModificacion;
    }
}
