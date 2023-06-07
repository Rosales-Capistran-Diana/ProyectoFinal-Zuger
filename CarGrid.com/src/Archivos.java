
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {

    public static void guardarArchivo(Vehiculo auto, String rutaArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            writer.write("Marca: " + auto.getMarca() + "\n");
            writer.write("Modelo: " + auto.getModelo() + "\n");
            writer.write("Año: " + auto.getAno() + "\n");
            writer.write("Estado: " + auto.getEstado() + "\n");
            writer.write("Color: " + auto.getColor() + "\n");
            writer.write("Tipo de vehículo: " + auto.gettDv() + "\n");

            String detallesEspecificos = auto.obtenerDetallesEspecificos();
            writer.write(detallesEspecificos + "\n");

            System.out.println("Archivo .ccv creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo .ccv: " + e.getMessage());
        }
    }
    
    public static void guardarArchivo(Pieza pieza, String rutaArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            writer.write("Marca: " + pieza.getMarca() + "\n");
            writer.write("Nombre de Pieza: " + pieza.getNombrePieza() + "\n");
            writer.write("Estado: " + pieza.getEstado() + "\n");
            writer.write("Tipo de vehículo: " + pieza.gettDv() + "\n");

            System.out.println("Archivo .ccv creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo .ccv: " + e.getMessage());
        }
    }

    public static void guardarCliente(Clientes cliente, String rutaArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            writer.write("Nombre: " + cliente.getNombre() + "\n");
            writer.write("Apellido: " + cliente.getApellido() + "\n");
            writer.write("RFC: " + cliente.getRFC() + "\n");

            System.out.println("Archivo de clientes creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo de clientes: " + e.getMessage());
        }
    }

    public static Pieza leerArchivoPieza(String rutaArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String marca = null;
            String nombrePieza = null;
            String estado = null;
            String tDv = null;

            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("Marca: ")) {
                    marca = linea.substring(7);
                } else if (linea.startsWith("Nombre de Pieza: ")) {
                    nombrePieza = linea.substring(17);
                } else if (linea.startsWith("Estado: ")) {
                    estado = linea.substring(8);
                } else if (linea.startsWith("Tipo de vehículo: ")) {
                    tDv = linea.substring(18);
                }
            }

            return new Pieza(marca, nombrePieza, estado, tDv);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo .ccv: " + e.getMessage());
        }

        return null;
    }

    public static Clientes leerCliente(String rutaArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String nombre = null;
            String apellido = null;
            String RFC = null;

            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("Nombre: ")) {
                    nombre = linea.substring(8);
                } else if (linea.startsWith("Apellido: ")) {
                    apellido = linea.substring(10);
                } else if (linea.startsWith("RFC: ")) {
                    RFC = linea.substring(5);
                }
            }

            return new Clientes(nombre, apellido, RFC);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de clientes: " + e.getMessage());
        }

        return null;
    }

    public static Vehiculo leerVehiculoCCV(String rutaArchivo) {
        class VehiculoGeneral extends Vehiculo {

            private String detallesEspecificos;

            public VehiculoGeneral(String marca, String modelo, String ano, String estado, String color, String tDv, String detallesEspecificos) {
                super(marca, modelo, ano, estado, color, tDv);
                this.detallesEspecificos = detallesEspecificos;
            }

            @Override
            public String obtenerDetallesEspecificos() {
                return detallesEspecificos;
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String marca = null;
            String modelo = null;
            String ano = null;
            String estado = null;
            String color = null;
            String tDv = null;
            String detallesEspecificos = null;

            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("Marca: ")) {
                    marca = linea.substring(7);
                } else if (linea.startsWith("Modelo: ")) {
                    modelo = linea.substring(8);
                } else if (linea.startsWith("Año: ")) {
                    ano = linea.substring(5);
                } else if (linea.startsWith("Estado: ")) {
                    estado = linea.substring(8);
                } else if (linea.startsWith("Color: ")) {
                    color = linea.substring(7);
                } else if (linea.startsWith("Tipo de vehículo: ")) {
                    tDv = linea.substring(18);
                } else if (linea.startsWith("Cilindraje: ")) {
                    detallesEspecificos = linea.substring(12);
                } else if (linea.startsWith("Tipo de Combustible: ")) {
                    detallesEspecificos = linea.substring(21);
                }
            }

            Vehiculo vehiculo;
            if (tDv.equals("Motocicleta")) {
                vehiculo = new Motocicleta(marca, modelo, ano, estado, color, tDv, detallesEspecificos);
            } else if (tDv.equals("Automóvil")) {
                vehiculo = new Automovil(marca, modelo, ano, estado, color, tDv, detallesEspecificos);
            } else {
                vehiculo = new VehiculoGeneral(marca, modelo, ano, estado, color, tDv, detallesEspecificos);
            }

            return vehiculo;
        } catch (IOException e) {
            System.out.println("Error al leer el archivo .ccv: " + e.getMessage());
        }

        return null;
    }
    
    
}
