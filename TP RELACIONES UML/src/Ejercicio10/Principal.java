package Ejercicio10;
public class Principal {
    public static void main(String[]args){
        String codigo, ultimaModificacion;
        codigo = "X9A7B2";
        ultimaModificacion = "2025-09-25";
        Titular titular1 = new Titular("Valeria Gómez", "30111222");
        CuentaBancaria cuenta1 = new CuentaBancaria("0170123456789012345678", 150000.0, codigo, ultimaModificacion, titular1);
        
        cuenta1.getDatosDeCuenta();
        System.out.println("");
        cuenta1.getDatosDeClave();
    }
}
