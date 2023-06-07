public class Pieza {
    private String marca;
    private String nombrePieza;
    private String estado;
    private String tDv;

    public Pieza(String marca, String nombrePieza, String estado, String tDv) {
        this.marca = marca;
        this.nombrePieza = nombrePieza;
        this.estado = estado;
        this.tDv = tDv;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombrePieza() {
        return nombrePieza;
    }

    public void setNombrePieza(String nombrePieza) {
        this.nombrePieza = nombrePieza;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String gettDv() {
        return tDv;
    }

    public void settDv(String tDv) {
        this.tDv = tDv;
    }

}
