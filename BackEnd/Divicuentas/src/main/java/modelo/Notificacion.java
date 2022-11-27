/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @NamedQuery(name = "Notificacion.findAll", query = "SELECT n FROM Notificacion n"),
    @NamedQuery(name = "Notificacion.findByIdNotificacion", query = "SELECT n FROM Notificacion n WHERE n.idNotificacion = :idNotificacion"),
    @NamedQuery(name = "Notificacion.findByEstado", query = "SELECT n FROM Notificacion n WHERE n.estado = :estado"),
    @NamedQuery(name = "Notificacion.findByMensaje", query = "SELECT n FROM Notificacion n WHERE n.mensaje = :mensaje")})
public class Notificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idNotificacion;
    @Basic(optional = false)
    private String estado;
    @Basic(optional = false)
    private String mensaje;
    @JoinColumn(name = "idCuenta", referencedColumnName = "idCuenta")
    @ManyToOne(fetch = FetchType.EAGER)
    private Cuenta idCuenta;
    @JoinColumn(name = "idPago", referencedColumnName = "idPago")
    @ManyToOne(fetch = FetchType.EAGER)
    private Pago idPago;
    @JoinColumn(name = "usuarioGenera", referencedColumnName = "celular")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario usuarioGenera;
    @JoinColumn(name = "usuarioRecibe", referencedColumnName = "celular")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario usuarioRecibe;

    public Notificacion() {
    }

    public Notificacion(Integer idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Notificacion(Integer idNotificacion, String estado, String mensaje) {
        this.idNotificacion = idNotificacion;
        this.estado = estado;
        this.mensaje = mensaje;
    }

    public Integer getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(Integer idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Cuenta getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Cuenta idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Pago getIdPago() {
        return idPago;
    }

    public void setIdPago(Pago idPago) {
        this.idPago = idPago;
    }

    public Usuario getUsuarioGenera() {
        return usuarioGenera;
    }

    public void setUsuarioGenera(Usuario usuarioGenera) {
        this.usuarioGenera = usuarioGenera;
    }

    public Usuario getUsuarioRecibe() {
        return usuarioRecibe;
    }

    public void setUsuarioRecibe(Usuario usuarioRecibe) {
        this.usuarioRecibe = usuarioRecibe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNotificacion != null ? idNotificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notificacion)) {
            return false;
        }
        Notificacion other = (Notificacion) object;
        if ((this.idNotificacion == null && other.idNotificacion != null) || (this.idNotificacion != null && !this.idNotificacion.equals(other.idNotificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "divicuentas.Notificacion[ idNotificacion=" + idNotificacion + " ]";
    }
    
}
