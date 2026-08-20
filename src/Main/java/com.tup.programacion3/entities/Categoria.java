package Main.java.com.tup.programacion3.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Categoria extends Base {
    private String nombre;
    private String descripcion;
    private Set<Producto> productos = new HashSet<>();

    //constructor
    public Categoria(String nombre, String descripcion){
        super();
        this.descripcion = descripcion;
        this.nombre = nombre;
    }
     //metodos


    //equals, hash y tostring

    @Override
    public String toString() {
        return "Categoria{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                // si imprimo todos los productos es como que mucho, entonces digo cantidades
                ", cantidad de productos=" + (productos != null ? productos.size() : 0) +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Categoria categoria = (Categoria) obj;
        return Objects.equals(this.nombre, categoria.nombre);
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }
}

