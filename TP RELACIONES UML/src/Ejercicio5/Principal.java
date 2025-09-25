package Ejercicio5;
public class Principal {
    public static void main(String[]args){
        PlacaMadre placa1 = new PlacaMadre("ASUS B550", "AMD B550");
        Propietario propietario1 = new Propietario("Carlos Méndez", "44556677");
        Computadora pc1 = new Computadora("HP", "SN-20250924", placa1);
        
        System.out.println("Imprimimos los objetos antes de comenzar a modificarlos");
        System.out.println("");
        System.out.println(placa1);
        System.out.println("");
        System.out.println(propietario1);
        System.out.println("");
        System.out.println(pc1);
        
        System.out.println("Asignamos un propietario a la pc");
        System.out.println("");
        pc1.setPropietario(propietario1);
        System.out.println("Comprobamos que todo este correctamente asignado");
        System.out.println("");
        System.out.println("Al propietario: "+pc1.getPropietario().getNombre()+", se le asigno la pc: "+pc1.getMarca()+", la pc tiene la placa madre: "+pc1.getPlacaMadre());
    }
    
}
