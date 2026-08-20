package Main.java.com.tup.programacion3.entities;

import  Main.java.com.tup.programacion3.enums.Rol;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Usuario extends Base  {
    private String nombre;
    private String apellido;
    private String mail;
    private String celular;
    private String contraseña;
    private Rol rol;
    private Set<Pedido> pedidos = new HashSet<>(); // 1..m


    public Usuario(String nombre, String apellido, String mail, String celular, String contraseña, Rol Rol) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail= mail;
        this.celular= celular;
        this.contraseña = contraseña;
        this.rol = rol;
    }
    //metodos
    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
    //equals, hash y tostring

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mail='" + mail + '\'' +
                ", celular='" + celular + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", rol=" + rol +
                //lo mismo, mucho texto
                ", cantidad de pedidos=" + (pedidos != null ? pedidos.size() : 0) +
                '}'+ super.toString();
    }

    @Override
    public boolean equals(Object o){
        //memoria
        if (this == o) return true;
        //nulo o distinta clase
        if (o == null || getClass() != o.getClass()) return false;
        //padre
        if (!super.equals(o)) return false;
        //caste y comparo
        Usuario usuario = (Usuario) o;
        return Objects.equals(this.mail, usuario.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.mail);
    }

    //getter setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
