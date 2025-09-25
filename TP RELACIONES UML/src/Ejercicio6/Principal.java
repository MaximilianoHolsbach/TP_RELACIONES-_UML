package Ejercicio6;
public class Principal {
    public static void main(String[]args){
        Cliente cliente1 = new Cliente("Laura Benítez", "3624123456");
        Mesa mesa1 = new Mesa(5, 4);
        Reserva reserva1 = new Reserva("2025-09-25", "21:00", cliente1, mesa1);
        
        reserva1.getReservante();

    }
}
