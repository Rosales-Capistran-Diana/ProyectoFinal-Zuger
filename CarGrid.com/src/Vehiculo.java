
public abstract class Vehiculo implements getdatos{

    private String marca;
    private String modelo;
    private String ano;
    private String estado;
    private String color;
    private String tDv;

    public Vehiculo(String marca, String modelo, String ano, String estado, String color, String tDv) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.estado = estado;
        this.color = color;
        this.tDv = tDv;
    }
    public Vehiculo() {
        this.marca = "";
        this.modelo = "";
        this.ano = "";
        this.estado = "";
        this.color = "";
        this.tDv = "";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String gettDv() {
        return tDv;
    }

    public void settDv(String tDv) {
        this.tDv = tDv;
    }
    
    
    @Override
    public abstract String obtenerDetallesEspecificos();
    
}
