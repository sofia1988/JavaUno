/*Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
package clase10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiciosProductoEjerc6 {

    Scanner leer = new Scanner(System.in);
    Map<String, Double> productos;

    public ServiciosProductoEjerc6() {
        this.productos = new HashMap<>();
    }

    public ProductoEjerc6 crearProducto() {
        System.out.println("ingrese el nombre del producto");
        String nombreProducto = leer.next();
        System.out.println("coloca el precio del producto");
        Double precioProducto = leer.nextDouble();
        ProductoEjerc6 nuevoProducto = new ProductoEjerc6(nombreProducto, precioProducto);
        productos.put(nuevoProducto.getNombreProducto(), nuevoProducto.getPrecioProducto());

        System.out.println("Producto agregado con éxito.");
        return nuevoProducto;
    }

    public void modificarPrecio(ProductoEjerc6 x) {
        System.out.println("ingrese nombre del producto a modificar");
        String nombre = leer.next();
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            if (key.equals(nombre)) {
                System.out.println("ingrese el nuevo precio");
                Double nuevoPrecio = leer.nextDouble();
                //x.setPrecioProducto(nuevoPrecio);
                // productos.replace(key, nuevoPrecio);
                productos.put(key, nuevoPrecio);
                System.out.println("precio del producto modificado con exito");
                break;
            }

        }
        System.out.println("el producto no esta en la lista");
    }

    public void eliminarProducto(ProductoEjerc6 x) {
        boolean valor = false;
        System.out.println("ingrese nombre del producto a eliminar");
        String nombre = leer.next();
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            if (key.equals(nombre)) {
                productos.remove(key);
                valor = true;
                break;
            }
        }
        if (valor) {
            System.out.println("el producto fue eliminado");
        } else {
            System.out.println("el producto no esta en la lista");
        }
    }

    public void mostrarProductos() {
        System.out.println("Lista de productos:");

        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Producto: " + key + " - Precio: " + value);
        }
    }

    public void menuProductos(ProductoEjerc6 x) {
        int opcion;

        do {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos y precios");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    crearProducto();
                    break;
                case 2:
                    modificarPrecio(x);
                    break;
                case 3:
                    eliminarProducto(x);
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 5);
    }
}
