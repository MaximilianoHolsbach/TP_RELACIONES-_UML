package Ejercicio14;
public class EditarVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); // Se crea pero no se guarda
        System.out.println("Exportando proyecto '" + proyecto.getNombre() +
                           "' en formato " + render.getFormato() +
                           " (" + proyecto.getDuracionMin() + " min)");
    }
}
