
public class Clientes {
    
    private String nombre;
    private String apellido;
    private String RFC;

    public Clientes(String nombre, String apellido, String RFC) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.RFC = RFC;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

}
