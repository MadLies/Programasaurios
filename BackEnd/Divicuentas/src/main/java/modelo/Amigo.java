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
import lombok.Data;

/**
 *
 * @author venus
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Amigo.findAll", query = "SELECT a FROM Amigo a"),
    @NamedQuery(name = "Amigo.findByIdAmigo", query = "SELECT a FROM Amigo a WHERE a.idAmigo = :idAmigo"),
    @NamedQuery(name = "Amigo.findByFavorito", query = "SELECT a FROM Amigo a WHERE a.favorito = :favorito")})
@Data
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
    
}
