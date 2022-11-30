/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
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
    private Integer idAmigo;
    @Column(name = "favorito")
    private Short favorito;

    
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

    public Integer getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(Integer idAmigo) {
        this.idAmigo = idAmigo;
    }

    public Short getFavorito() {
        return favorito;
    }

    public void setFavorito(Short favorito) {
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

    public Amigo(Integer idAmigo, Short favorito, Usuario usuario, Usuario amigo) {
        this.idAmigo = idAmigo;
        this.favorito = favorito;
        this.usuario = usuario;
        this.amigo = amigo;
    }

    
}
    
