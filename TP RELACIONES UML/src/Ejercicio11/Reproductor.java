package Ejercicio11;
public class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() +
                           " - Artista: " + cancion.getArtista().getNombre());
    }
}
