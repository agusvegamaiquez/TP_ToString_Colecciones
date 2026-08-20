package Main.java.com.tup.programacion3.entities;
import java.time.LocalDateTime;
import java.util.Objects;

public class Base {
    private Long id;
    private boolean eliminado;
    private LocalDateTime createdAt;

    //constructor
    public Base(){
        this.eliminado = false;
        this.createdAt = LocalDateTime.now();
    }
    //metodos

    //equals, hash y tostring

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", eliminado=" + eliminado +
                ", createdAt=" + createdAt +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Base base = (Base) obj;
        return Objects.equals(this.id, base.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //getter setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}





