package Ejercicio2;
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;//Agregacion
    private Usuario usuario;//Asociacion bidireccional
    //Constructor
    public Celular(String imei, String marca, String modelo, Bateria bateria){
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }
    public String getModelo() {
        return modelo;
    }
    public String getBateria(){
        return this.bateria.getModelo();
    }
    
}
