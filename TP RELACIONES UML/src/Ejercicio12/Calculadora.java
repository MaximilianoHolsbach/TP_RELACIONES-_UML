package Ejercicio12;
public class Calculadora {

    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de $" + impuesto.getMonto() +
                           " para " + impuesto.getContribuyente().getNombre());
        // Aquí podrías agregar lógica de cálculo, por ejemplo:
        double resultado = impuesto.getMonto() * 0.21; // ejemplo de IVA
        System.out.println("Resultado del cálculo: $" + resultado);
    }
}
