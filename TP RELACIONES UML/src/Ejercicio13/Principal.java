package Ejercicio13;
public class Principal {
    public static void main(String[]args){
        Usuario usuario1 = new Usuario("Andrés López", "andres.lopez@email.com");
        GeneradorQR generador = new GeneradorQR();
        generador.generar("QR-20250926-001", usuario1);
    }
}
