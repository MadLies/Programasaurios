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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "notificacion", catalog = "divicuentas", schema = "")
@NamedQueries({
    @NamedQuery(name = "Notificacion.findAll", query = "SELECT n FROM Notificacion n")})
public class Notificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idNotificacion", nullable = false)
    private Integer idNotificacion;
    @Basic(optional = false)
    @Column(name = "estado", nullable = false, length = 9)
    private String estado;
    @Basic(optional = false)
    @Column(name = "mensaje", nullable = false, length = 255)
    private String mensaje;
    @JoinColumn(name = "idCuenta", referencedColumnName = "idCuenta")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cuenta idCuenta;
    @JoinColumn(name = "idPago", referencedColumnName = "idPago")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pago idPago;
    @JoinColumn(name = "usuarioGenera", referencedColumnName = "celular", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioGenera;
    @JoinColumn(name = "usuarioRecibe", referencedColumnName = "celular", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioRecibe;

    public Notificacion() {
    }

    public Notificacion(Integer idNotificacion, String estado, String mensaje, Cuenta idCuenta, Pago idPago, Usuario usuarioGenera, Usuario usuarioRecibe) {
        this.idNotificacion = idNotificacion;
        this.estado = estado;
        this.mensaje = mensaje;
        this.idCuenta = idCuenta;
        this.idPago = idPago;
        this.usuarioGenera = usuarioGenera;
        this.usuarioRecibe = usuarioRecibe;
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
        return "entities.Notificacion[ idNotificacion=" + idNotificacion + " ]";
    }
    
}
