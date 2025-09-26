package Ejercicio8;
public class Principal {
    public static void main(String[]args){
        String codigoHash, fecha;
        codigoHash = "ABC123XYZ";
        fecha = "2025-09-24";
        Usuario usuario1 = new Usuario("María López", "maria.lopez@email.com");
        Documento documento1 = new Documento("Contrato de Servicios", "Contenido legal del contrato...", codigoHash, fecha, usuario1);
        
        System.out.println("El documento: "+documento1.getTitulo()+", con la firma: "+documento1.getFirma().getCodigoHash()+", que representa al usuario: "+documento1.getFirma().getUsuario().getNombre());
    }
}
