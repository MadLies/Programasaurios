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
@Table(name = "transaccion", catalog = "divicuentas", schema = "")
@NamedQueries({
    @NamedQuery(name = "Transaccion.findAll", query = "SELECT t FROM Transaccion t")})
public class Transaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTransaccion", nullable = false)
    private Integer idTransaccion;
    @Basic(optional = false)
    @Column(name = "valorTransaccion", nullable = false)
    private int valorTransaccion;
    @JoinColumn(name = "idCuenta", referencedColumnName = "idCuenta")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cuenta idCuenta;
    @JoinColumn(name = "idPago", referencedColumnName = "idPago")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pago idPago;
    @JoinColumn(name = "usuarioSalida", referencedColumnName = "celular", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioSalida;
    @JoinColumn(name = "usuarioLlegada", referencedColumnName = "celular", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioLlegada;

    public Transaccion() {
    }

    public Transaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Transaccion(Integer idTransaccion, int valorTransaccion) {
        this.idTransaccion = idTransaccion;
        this.valorTransaccion = valorTransaccion;
    }

    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getValorTransaccion() {
        return valorTransaccion;
    }

    public void setValorTransaccion(int valorTransaccion) {
        this.valorTransaccion = valorTransaccion;
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

    public Usuario getUsuarioSalida() {
        return usuarioSalida;
    }

    public void setUsuarioSalida(Usuario usuarioSalida) {
        this.usuarioSalida = usuarioSalida;
    }

    public Usuario getUsuarioLlegada() {
        return usuarioLlegada;
    }

    public void setUsuarioLlegada(Usuario usuarioLlegada) {
        this.usuarioLlegada = usuarioLlegada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransaccion != null ? idTransaccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaccion)) {
            return false;
        }
        Transaccion other = (Transaccion) object;
        if ((this.idTransaccion == null && other.idTransaccion != null) || (this.idTransaccion != null && !this.idTransaccion.equals(other.idTransaccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Transaccion[ idTransaccion=" + idTransaccion + " ]";
    }
    
}
