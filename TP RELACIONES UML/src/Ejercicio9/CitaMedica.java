package Ejercicio9;
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;         // Asociación unidireccional
    private Profesional profesional;   // Asociación unidireccional
    //Constructor
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
    //Metodos
    public void getAgenda(){
        System.out.println("El Dr: "+profesional.getNombre()+"\nTiene cita con el paciente: "+paciente.getNombre()+"\nEl dia: "+this.fecha+", hora: "+this.hora);
    }
}
