package Ejercicio11;

public class Principal {
    public static void main(String[]args){
        Artista artista1 = new Artista("Charly García", "Rock Nacional");
        Cancion cancion1 = new Cancion("Demoliendo hoteles", artista1);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion1);
    }
}
