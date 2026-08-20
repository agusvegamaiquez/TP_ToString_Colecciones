package Main.java.com.tup.programacion3.entities;


import java.util.Objects;

public class Producto extends Base{
    private String nombre;
    private Double precio;
    private String descripcion;
    private int stock;
    private String imagen;
    private Boolean disponible;

    public Producto(String nombre, Double precio, String descripcion, int stock, String imagen, Boolean disponible){
        super();
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
        this.imagen = imagen;
        this.disponible = disponible;

    }
    //metodos


    //equals, hash y tostring

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                ", imagen='" + imagen + '\'' +
                ", disponible=" + disponible +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this== obj) return true;
        if(obj== null  || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Producto otra = (Producto) obj;

        return Objects.equals(this.nombre, otra.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.nombre);
    }


    //getter setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
