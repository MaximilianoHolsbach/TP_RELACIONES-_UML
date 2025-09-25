package Ejercicio7;
public class Principal {
    public static void main(String[]args){
        Motor motor1 = new Motor("V8", "MTR-20250924");
        Conductor conductor1 = new Conductor("Sofía Ramírez", "LIC-445566");
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota Corolla", motor1);
        
        System.out.println("Imprimimos los objetos antes de modificarlos");
        System.out.println("");
        System.out.println(motor1);
        System.out.println("");
        System.out.println("");
        System.out.println(conductor1);
        System.out.println("");
        System.out.println("");
        System.out.println(vehiculo1);
        System.out.println("");
        System.out.println("Vinculamos el conductor con el vehiculo");
        conductor1.setVehiculo(vehiculo1);
        System.out.println("El conductor: "+conductor1.getNombre()+", se le asigna el vehiculo: "+conductor1.getVehiculo().getModelo()+", con el motor numero: "+conductor1.getVehiculo().getMotor().getNumeroSerie());
    }
}
