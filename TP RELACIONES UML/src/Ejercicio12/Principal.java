package Ejercicio12;
public class Principal {
    public static void main(String[]args){
        Contribuyente contribuyente1 = new Contribuyente("Andrés López", "20-12345678-9");
        Impuesto impuesto1 = new Impuesto(100000.0, contribuyente1);
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto1);
    }
}