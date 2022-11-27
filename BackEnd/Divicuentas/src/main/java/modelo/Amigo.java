package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author venus
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Amigo.findAll", query = "SELECT a FROM Amigo a"),
    @NamedQuery(name = "Amigo.findByIdAmigo", query = "SELECT a FROM Amigo a WHERE a.idAmigo = :idAmigo"),
    @NamedQuery(name = "Amigo.findByFavorito", query = "SELECT a FROM Amigo a WHERE a.favorito = :favorito")})
public class Amigo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Integer idAmigo;
    private Short favorito;
    @JoinColumn(name = "usuario", referencedColumnName = "celular")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario usuario;
    @JoinColumn(name = "amigo", referencedColumnName = "celular")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario amigo;

    public Amigo() {
    }

    public Amigo(Integer idAmigo) {
        this.idAmigo = idAmigo;
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
        return "divicuentas.Amigo[ idAmigo=" + idAmigo + " ]";
    }
    
}
