package Main.java;

import Main.java.com.tup.programacion3.entities.Categoria;
import Main.java.com.tup.programacion3.entities.Pedido;
import Main.java.com.tup.programacion3.entities.Producto;
import Main.java.com.tup.programacion3.entities.Usuario;
import Main.java.com.tup.programacion3.enums.FormaPago;
import Main.java.com.tup.programacion3.enums.Rol;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Categoria cat1 = new Categoria("Electrónica", "Artículos tecnológicos");
        Categoria cat2 = new Categoria("Hogar", "Cosas para la casa");
        Categoria cat3 = new Categoria("Librería", "Útiles escolares");

        Producto p1 = new Producto("Notebook", 1500.0, "15 pulgadas", 10, "img1.jpg", true);
        Producto p2 = new Producto("Mouse", 25.0, "Inalámbrico", 50, "img2.jpg", true);
        Producto p3 = new Producto("Teclado", 45.0, "Mecánico", 30, "img3.jpg", true);
        Producto p4 = new Producto("Monitor", 200.0, "24 pulgadas", 15, "img4.jpg", true);
        Producto p5 = new Producto("Silla", 150.0, "Ergonómica", 20, "img5.jpg", true);
        Producto p6 = new Producto("Escritorio", 120.0, "Madera", 10, "img6.jpg", true);
        Producto p7 = new Producto("Cuaderno", 5.0, "A4 rayado", 100, "img7.jpg", true);
        Producto p8 = new Producto("Lapicera", 1.0, "Azul", 200, "img8.jpg", true);
        Producto p9 = new Producto("Mochila", 40.0, "Urbana", 25, "img9.jpg", true);
        Producto p10 = new Producto("Auriculares", 60.0, "Bluetooth", 40, "img10.jpg", true);

        Set<Producto> listaProductos = new HashSet<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));

        Usuario user1 = new Usuario("Ana", "García", "ana@mail.com", "112233", "pass123", Rol.ADMIN);
        Usuario user2 = new Usuario("Juan", "Pérez", "juan@mail.com", "445566", "pass456", Rol.USUARIO);

        Pedido ped1 = new Pedido(FormaPago.TARJETA);
        ped1.addDetallePedido(1, p1);
        ped1.addDetallePedido(2, p2);
        user1.addPedido(ped1);

        Pedido ped2 = new Pedido(FormaPago.EFECTIVO);
        ped2.addDetallePedido(1, p4);
        ped2.addDetallePedido(1, p5);
        user1.addPedido(ped2);

        Pedido ped3 = new Pedido(FormaPago.TRANSFERENCIA);
        ped3.addDetallePedido(5, p7);
        ped3.addDetallePedido(10, p8);
        user2.addPedido(ped3);

        System.out.println("MOSTRANDO UN SOLO PRODUCTO ");
        System.out.println(p1.toString());

        System.out.println("\n LISTADO DE PRODUCTOS CARGADOS");
        for (Producto prod : listaProductos) {
            System.out.println(prod.toString());
        }

        System.out.println("\n PEDIDOS DEL USUARIO CON MÁS PEDIDOS ");
        Usuario usuarioTop = (user1.getPedidos().size() > user2.getPedidos().size()) ? user1 : user2;
        System.out.println("El usuario con más pedidos es: " + usuarioTop.getNombre());
        for (Pedido p : usuarioTop.getPedidos()) {
            System.out.println(p.toString());
        }

        System.out.println("\n PRUEBA DE DUPLICADO EN LA COLECCIÓN ");
        Producto pDuplicado = new Producto("Notebook", 1500.0, "15 pulgadas", 10, "otra_imagen.jpg", false);
        System.out.println("Intentando buscar el producto duplicado en el Set...");

        if (listaProductos.contains(pDuplicado)) {
            System.out.println("Resultado: El producto YA EXISTE en la colección (el método equals funciona).");
        } else {
            System.out.println("Resultado: El producto no se encontró.");
        }
    }
}