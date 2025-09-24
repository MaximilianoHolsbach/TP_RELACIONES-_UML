package Ejercicio4;
public class Principal {
    public static void main(String[]args){
        Banco banco1 = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente1 = new Cliente("Ana Gómez", "11223344");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("4567-8901-2345-6789", "12/28", banco1);
        
        tarjeta1.setCliente(cliente1);
        System.out.println("El cliente: "+tarjeta1.getCliente().getNombre()+", tiene la tarjeta numero: "+tarjeta1.getNumero()+", entregada por el banco: "+tarjeta1.getBanco().getNombre());
    }
}
