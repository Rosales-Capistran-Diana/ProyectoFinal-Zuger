
public class Automovil extends Vehiculo {

    private String tipoCombustible;

    public Automovil(String marca, String modelo, String ano, String estado, String color, String tDv, String tipoCombustible) {
        super(marca, modelo, ano, estado, color, tDv);
        this.tipoCombustible = tipoCombustible;

    }

    public Automovil() {
        super();
    }

    @Override
    public String obtenerDetallesEspecificos() {
        return "Tipo de Combustible: " + tipoCombustible;
    }


}
