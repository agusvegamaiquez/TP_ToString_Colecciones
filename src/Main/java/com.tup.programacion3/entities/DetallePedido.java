package Main.java.com.tup.programacion3.entities;

public class DetallePedido extends Base {
    private int cantidad;
    private Double subtotal;
    private Producto producto;

    public DetallePedido(int cantidad , Producto producto){
        super();
        this.cantidad=cantidad;
        this.subtotal=producto.getPrecio()*cantidad;
        this.producto=producto;
    }
    //metodos

    //equals, hash y tostring

    //getter setter


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
