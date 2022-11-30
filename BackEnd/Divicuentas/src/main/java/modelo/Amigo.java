/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author CrookedSpecs
 */
@Entity
@Table(name = "amigo")
public class Amigo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "idAmigo")
    private double idAmigo;
    @Column(name = "favorito")
    private int favorito;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "celular")
    private Usuario usuario;
    
    @Column(name = "amigo")
    private Usuario amigo;

    
    @Override
    public String toString() {
        return "Amigo{" + "idAmigo=" + idAmigo + ", favorito=" + favorito + ", usuario=" + usuario + ", amigo=" + amigo + '}';
    }
    
    public Amigo() {
    }

    public double getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(double idAmigo) {
        this.idAmigo = idAmigo;
    }

    public int getFavorito() {
        return favorito;
    }

    public void setFavorito(int favorito) {
        this.favorito = favorito;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getAmigo() {
        return amigo;
    }

    public void setAmigo(Usuario amigo) {
        this.amigo = amigo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.idAmigo) ^ (Double.doubleToLongBits(this.idAmigo) >>> 32));
        hash = 37 * hash + this.favorito;
        hash = 37 * hash + Objects.hashCode(this.usuario);
        hash = 37 * hash + Objects.hashCode(this.amigo);
        return hash;
    }

//   
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Amigo other = (Amigo) obj;
        if (!Objects.equals(this.idAmigo, other.idAmigo)) {
            return false;
        }
        if (!Objects.equals(this.favorito, other.favorito)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return Objects.equals(this.amigo, other.amigo);
    }

    public Amigo(double idAmigo, int favorito, Usuario usuario, Usuario amigo) {
        this.idAmigo = idAmigo;
        this.favorito = favorito;
        this.usuario = usuario;
        this.amigo = amigo;
    }

    
}
    
