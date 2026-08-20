package Main.java.com.tup.programacion3.entities;

import java.util.Objects;

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
    @Override
    public String toString() {
        return "DetallePedido{" +
                "cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                ", producto=" + (this.producto != null ? this.producto.getNombre() : "Ninguno") + super.toString();
    }
    @Override
    public boolean equals (Object obj){
        if (this== obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        DetallePedido detalle = (DetallePedido) obj;
        return Objects.equals(this.producto, detalle.producto);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.producto);
    }

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
