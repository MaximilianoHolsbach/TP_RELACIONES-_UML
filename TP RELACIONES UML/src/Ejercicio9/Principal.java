package Ejercicio9;
public class Principal {
    public static void main(String[]args){
        Paciente paciente1 = new Paciente("Lucía Benítez", "OSDE");
        Profesional profesional1 = new Profesional("Dr. Juan Pérez", "Cardiología");
        CitaMedica cita1 = new CitaMedica("2025-10-02", "10:30", paciente1, profesional1);
        System.out.println("Imprimimos la agenda del Doctor");
        cita1.getAgenda();
    }
}
