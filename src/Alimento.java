import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alimento extends Producto {

    private String fechaCaducidad;
    private String fechaElaboracion;

    public Alimento(String nombre, double precio, String fechaCaducidad, String fechaElaboracion) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
        this.fechaElaboracion = fechaElaboracion;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(String fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }
}


