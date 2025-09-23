package Ejercicio1;

/**
 *
 * @author Maxi
 */
public class Principal {
    public static void main(String[]args){
        Foto foto_pasaporte = new Foto("Foto_Makoto.jpg","jpg");
        Titular titular1 = new Titular("Makoto Shinkai", "987654321");
        Pasaporte pasaporteA = new Pasaporte("JP-1973-02","2025-09-22",foto_pasaporte,titular1);
        
        System.out.println("Titular del pasaporte: "+titular1.getNombre());
        titular1.setPasaporte(pasaporteA);
        System.out.println("");
        System.out.println("Pasaporte numero: "+titular1.getPasaporte().getNumero()+", asignado al titular: "+titular1.getNombre());
    }
}
