/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

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

    public Notificacion(Integer idNotificacion, String estado, String mensaje, Cuenta idCuenta, Pago idPago, Usuario usuarioGenera, Usuario usuarioRecibe) {
        this.idNotificacion = idNotificacion;
        this.estado = estado;
        this.mensaje = mensaje;
        this.idCuenta = idCuenta;
        this.idPago = idPago;
        this.usuarioGenera = usuarioGenera;
        this.usuarioRecibe = usuarioRecibe;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdNotificacion() {
        return idNotificacion;
    }

    public String getEstado() {
        return estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Cuenta getIdCuenta() {
        return idCuenta;
    }

    public Pago getIdPago() {
        return idPago;
    }

    public Usuario getUsuarioGenera() {
        return usuarioGenera;
    }

    public Usuario getUsuarioRecibe() {
        return usuarioRecibe;
    }

    public void setIdNotificacion(Integer idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setIdCuenta(Cuenta idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void setIdPago(Pago idPago) {
        this.idPago = idPago;
    }

    public void setUsuarioGenera(Usuario usuarioGenera) {
        this.usuarioGenera = usuarioGenera;
    }

    public void setUsuarioRecibe(Usuario usuarioRecibe) {
        this.usuarioRecibe = usuarioRecibe;
    }

    @Override
    public String toString() {
        return "Notificacion{" + "idNotificacion=" + idNotificacion + ", estado=" + estado + ", mensaje=" + mensaje + ", idCuenta=" + idCuenta + ", idPago=" + idPago + ", usuarioGenera=" + usuarioGenera + ", usuarioRecibe=" + usuarioRecibe + '}';
    }
    
}