package Main.java.com.tup.programacion3.entities;

import Main.java.com.tup.programacion3.enums.Estado;
import Main.java.com.tup.programacion3.enums.FormaPago;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


public class Pedido extends Base implements Calculable{
    private LocalDate fecha;
    private Estado estado;
    private Double total;
    private FormaPago formaPago;
    private Set<DetallePedido> detallePedido = new HashSet<>();

    public Pedido (FormaPago formaPago,int cantidad,Producto producto){
        super();
        this.fecha = LocalDate.now();
        this.estado = Estado.PENDIENTE;
        this.formaPago = formaPago;
        this.total=0.0;
    }
    //metodos
    public void addDetallePedido(int cantidad, Producto producto) {
        DetallePedido detalle = new DetallePedido(cantidad, producto);
        this.detallePedido.add(detalle);
        calcularTotal();
    }

    public DetallePedido findeDetallePedidoByProducto(Producto producto) {
        for (DetallePedido detalle : detallePedido) {
            if (detalle.getProducto().equals(producto)) {
                return detalle;
            }
        }
        return null;
    }

    public void deleteDetallePedidoByProducto(Producto producto) {
        DetallePedido detalle = findeDetallePedidoByProducto(producto);
        if (detalle != null) {
            detallePedido.remove(detalle);
            calcularTotal(); // Recalculamos el total porque sacamos un producto
        }
    }

    @Override
    public void calcularTotal() {
        Double nuevoTotal = 0.0;
        for (DetallePedido detalle : detallePedido) {
            nuevoTotal += detalle.getSubtotal();
        }
        this.total = nuevoTotal;
    }

    //equals, hash y tostring

    @Override
    public String toString() {
        return "Pedido{" +
                "fecha=" + fecha +
                ", estado=" + estado +
                ", total=" + total +
                ", formaPago=" + formaPago +
                //mucho
                ", cantidad de detalles=" + (detallePedido != null ? detallePedido.size() : 0) +
                '}' + super.toString();
    }


    //getter setter

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public Set<DetallePedido> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(Set<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }
}
