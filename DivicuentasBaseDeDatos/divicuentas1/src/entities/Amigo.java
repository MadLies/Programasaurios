/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author CrookedSpecs
 */
@Entity
@Table(name = "amigo", catalog = "divicuentas", schema = "")
@NamedQueries({
    @NamedQuery(name = "Amigo.findAll", query = "SELECT a FROM Amigo a")})
public class Amigo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idAmigo", nullable = false)
    private Integer idAmigo;
    @Column(name = "favorito")
    private Short favorito;
    @JoinColumn(name = "usuario", referencedColumnName = "celular", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;
    @JoinColumn(name = "amigo", referencedColumnName = "celular", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario amigo;

    public Amigo() {
    }

    public Amigo(Integer idAmigo, Short favorito, Usuario usuario, Usuario amigo) {
        this.idAmigo = idAmigo;
        this.favorito = favorito;
        this.usuario = usuario;
        this.amigo = amigo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAmigo != null ? idAmigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Amigo)) {
            return false;
        }
        Amigo other = (Amigo) object;
        if ((this.idAmigo == null && other.idAmigo != null) || (this.idAmigo != null && !this.idAmigo.equals(other.idAmigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Amigo[ idAmigo=" + idAmigo + " ]";
    }
    
}
