package Ejercicio14;
public class Principal {
    public static void main(String[]args){
        Proyecto proyecto1 = new Proyecto("Video Educativo ER", 12);
        EditarVideo editor = new EditarVideo();
        editor.exportar("MP4", proyecto1);
    }
}
