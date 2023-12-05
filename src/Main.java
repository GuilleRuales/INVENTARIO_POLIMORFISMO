import java.util.ArrayList;
import java.util.List;


import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();
        Producto producto = new Producto("Producto Generico 1",2.3);

        Alimento alimento = new Alimento("Leche", 0.5,"30/12/2023", "23/11/2023");

        Producto producto1 = (Producto)alimento;

        /*String numero = "0.2";
        Double numero2 = (double)numero;*/

        //Es inconvertible

        String numero = "0.2";
        Double numero2 = Double.parseDouble(numero);

        //Es convertible gracias al metodo parseDouble()


        listaProductos.add(producto);
        listaProductos.add(alimento);

    }
}

