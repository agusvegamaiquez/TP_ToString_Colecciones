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





