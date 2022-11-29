/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author CrookedSpecs
 */
@Entity
@Table(name = "pago", catalog = "divicuentas", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pago.findAll", query = "SELECT p FROM Pago p")})
public class Pago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPago", nullable = false)
    private Integer idPago;
    @Basic(optional = false)
    @Column(name = "fechaPago", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    @OneToMany(mappedBy = "idPago", fetch = FetchType.LAZY)
    private List<Transaccion> transaccionList;
    @OneToMany(mappedBy = "idPago", fetch = FetchType.LAZY)
    private List<Notificacion> notificacionList;

    public Pago(Integer idPago, Date fechaPago, List<Transaccion> transaccionList, List<Notificacion> notificacionList) {
        this.idPago = idPago;
        this.fechaPago = fechaPago;
        this.transaccionList = transaccionList;
        this.notificacionList = notificacionList;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdPago() {
        return idPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public List<Transaccion> getTransaccionList() {
        return transaccionList;
    }

    public List<Notificacion> getNotificacionList() {
        return notificacionList;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setTransaccionList(List<Transaccion> transaccionList) {
        this.transaccionList = transaccionList;
    }

    public void setNotificacionList(List<Notificacion> notificacionList) {
        this.notificacionList = notificacionList;
    }

    @Override
    public String toString() {
        return "Pago{" + "idPago=" + idPago + ", fechaPago=" + fechaPago + ", transaccionList=" + transaccionList + ", notificacionList=" + notificacionList + '}';
    }
    
}