package Ejercicio13;
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario); // Se crea pero no se guarda
        System.out.println("Código QR generado para " + usuario.getNombre() +
                           ": " + codigo.getValor());
    }
}
