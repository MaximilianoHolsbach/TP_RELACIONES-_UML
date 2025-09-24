package Ejercicio2;
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;//Asociacion bidireccional
    //Constructor
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    //Metodos
    public void setCelular(Celular celular) {
        this.celular = celular;
        if(celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }
    public Celular getCelular() {
        return celular;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    
}
