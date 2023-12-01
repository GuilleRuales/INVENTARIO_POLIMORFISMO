import java.util.ArrayList;
import java.util.List;


import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Producto p1 = new Producto();
        p1.menuPrincipal();*/

        List<Producto>  listaProductos = new ArrayList<>();
        Alimento alimento1 = new Alimento("Alimento","Leche",1.1,"P0001",250,"vita","27/11/2023","27/11/2024");
        Tecnologia tecnologia1 = new Tecnologia("Tecnologia","Laptop",800,"P01",4,"HP",2,"inalambrica","WIFI",250);
        Electrodomestico electro1 = new Electrodomestico("Electrodomestico","Cocina",250,"P003",2,"Riviera",2,"Guayaquil",110,"2 años");

        listaProductos.add(alimento1);
        listaProductos.add(tecnologia1);
        listaProductos.add(electro1);

        Alimento alimento2 =(Alimento)listaProductos.get(0);

        for (Producto producto: listaProductos){
            if(producto.tipo.equals("ALimento")){
                Alimento alimento=(Alimento)producto;
                System.out.println("El alimento "+ alimento.nombre+" se expira el: "+ alimento.getFechaExpiracion());
            } else if (producto.tipo.equals("Tecnologia")) {
                Tecnologia tecnologia =(Tecnologia)producto;
                System.out.println("El producto tecnologia " +tecnologia.nombre+ " cuenta con una red " +tecnologia.getTipoRed());
            } else if (producto.tipo.equals("Electrodomestico")) {
                Electrodomestico electro=(Electrodomestico)producto;
                System.out.println("El electrodomestico "+electro.nombre+ " tiene "+electro.getVidaUtilAnios());
            }
        }

        for (Producto producto: listaProductos){
            if(producto instanceof  Alimento){
                Alimento alimento=(Alimento)producto;
                System.out.println("El alimento "+ alimento.nombre+" se expira el: "+ alimento.getFechaExpiracion());
            } else if (producto instanceof  Tecnologia) {
                Tecnologia tecnologia =(Tecnologia)producto;
                System.out.println("El producto tecnologia " +tecnologia.nombre+ " cuenta con una red " +tecnologia.getTipoRed());
            } else if (producto instanceof  Electrodomestico) {
                Electrodomestico electro=(Electrodomestico)producto;
                System.out.println("El electrodomestico "+electro.nombre+ " tiene "+electro.getVidaUtilAnios());

            }
        }


    }
}

