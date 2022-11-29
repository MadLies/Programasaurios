/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author CrookedSpecs
 */
@Entity
@Table(name = "amigo", catalog = "divicuentas", schema = "")
public class Amigo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id()
    @Column(name = "idAmigo", nullable = false)
    private Integer idAmigo;
    @Column(name = "favorito")
    private Short favorito;
    //@JoinColumn(name = "usuario", referencedColumnName = "celular", nullable = false)
    //@ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;
    //@JoinColumn(name = "amigo", referencedColumnName = "celular", nullable = false)
    //@ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario amigo;

    public Amigo() {
    }

    public Amigo(Integer idAmigo, Short favorito, Usuario usuario, Usuario amigo) {
        this.idAmigo = idAmigo;
        this.favorito = favorito;
        this.usuario = usuario;
        this.amigo = amigo;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdAmigo() {
        return idAmigo;
    }

    public Short getFavorito() {
        return favorito;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Usuario getAmigo() {
        return amigo;
    }

    public void setIdAmigo(Integer idAmigo) {
        this.idAmigo = idAmigo;
    }

    public void setFavorito(Short favorito) {
        this.favorito = favorito;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setAmigo(Usuario amigo) {
        this.amigo = amigo;
    }

    @Override
    public String toString() {
        return "Amigo{" + "idAmigo=" + idAmigo + ", favorito=" + favorito + ", usuario=" + usuario + ", amigo=" + amigo + '}';
    }
    
}
    
