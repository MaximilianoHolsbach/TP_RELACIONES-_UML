package Ejercicio14;
public class Render {
    private String formato;
    private Proyecto proyecto; // Asociación unidireccional
    //Constructor
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }
    //Metodos
    public String getFormato() {
        return formato;
    }
    public Proyecto getProyecto() {
        return proyecto;
    }
}
