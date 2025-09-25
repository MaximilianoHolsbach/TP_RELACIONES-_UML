package Ejercicio5;
public class PlacaMadre {
    private String modelo;
    private String chipset;
    //Constructor
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
    //Metodos
    public String getModelo() {
        return modelo;
    }
    public String getChipset() {
        return chipset;
    }
    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo + ", chipset=" + chipset + '}';
    }
    
}
