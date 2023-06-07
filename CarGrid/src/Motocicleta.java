
public class Motocicleta extends Vehiculo {

    private String Cilindraje;

    public Motocicleta(String marca, String modelo, String año, String estado, String color, String tDv, String Cilindraje) {
        super(marca, modelo, año, estado, color, tDv);
        this.Cilindraje = Cilindraje;
    }

    public Motocicleta(String Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    public String getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(String Cilindraje) {
        this.Cilindraje = Cilindraje;
    }
    
    @Override
    public String obtenerDetallesEspecificos() {
        return "Cilindraje: " + Cilindraje;
    }


}
