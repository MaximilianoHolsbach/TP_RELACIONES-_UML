package Ejercicio2;
public class Principal {
    public static void main(String[]args){
        Bateria bateria1 = new Bateria("BTX-500", 4000);
        Usuario usuario1 = new Usuario("Martín Pérez", "98765432");
        Celular celular1 = new Celular("356789012345678", "Samsung", "Galaxy A52", bateria1);
        
        usuario1.setCelular(celular1);
        System.out.println("El usuario: "+usuario1.getNombre()+", se le asigno el celular: "+usuario1.getCelular().getModelo()+", este modelo tiene la bateria: "+celular1.getBateria());

    }
}
