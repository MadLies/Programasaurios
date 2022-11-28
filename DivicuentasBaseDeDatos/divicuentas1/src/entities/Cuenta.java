/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "cuenta", catalog = "divicuentas", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c")})
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCuenta", nullable = false)
    private Integer idCuenta;
    @Basic(optional = false)
    @Column(name = "nombreCuenta", nullable = false, length = 45)
    private String nombreCuenta;
    @Basic(optional = false)
    @Column(name = "fechaCuenta", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCuenta;
    @Basic(optional = false)
    @Column(name = "totalCuenta", nullable = false)
    private float totalCuenta;
    @Column(name = "divisaCuenta", length = 45)
    private String divisaCuenta;
    @Column(name = "tipoActividad", length = 8)
    private String tipoActividad;
    @Lob
    @Column(name = "adjuntos", length = 1073741824)
    private String adjuntos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuenta", fetch = FetchType.LAZY)
    private List<Integrantecuenta> integrantecuentaList;
    @OneToMany(mappedBy = "idCuenta", fetch = FetchType.LAZY)
    private List<Transaccion> transaccionList;
    @JoinColumn(name = "idGrupo", referencedColumnName = "idGrupo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Grupo idGrupo;
    @OneToMany(mappedBy = "idCuenta", fetch = FetchType.LAZY)
    private List<Notificacion> notificacionList;

    public Cuenta() {
    }

    public Cuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Cuenta(Integer idCuenta, String nombreCuenta, Date fechaCuenta, float totalCuenta) {
        this.idCuenta = idCuenta;
        this.nombreCuenta = nombreCuenta;
        this.fechaCuenta = fechaCuenta;
        this.totalCuenta = totalCuenta;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public Date getFechaCuenta() {
        return fechaCuenta;
    }

    public void setFechaCuenta(Date fechaCuenta) {
        this.fechaCuenta = fechaCuenta;
    }

    public float getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(float totalCuenta) {
        this.totalCuenta = totalCuenta;
    }

    public String getDivisaCuenta() {
        return divisaCuenta;
    }

    public void setDivisaCuenta(String divisaCuenta) {
        this.divisaCuenta = divisaCuenta;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public String getAdjuntos() {
        return adjuntos;
    }

    public void setAdjuntos(String adjuntos) {
        this.adjuntos = adjuntos;
    }

    public List<Integrantecuenta> getIntegrantecuentaList() {
        return integrantecuentaList;
    }

    public void setIntegrantecuentaList(List<Integrantecuenta> integrantecuentaList) {
        this.integrantecuentaList = integrantecuentaList;
    }

    public List<Transaccion> getTransaccionList() {
        return transaccionList;
    }

    public void setTransaccionList(List<Transaccion> transaccionList) {
        this.transaccionList = transaccionList;
    }

    public Grupo getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Grupo idGrupo) {
        this.idGrupo = idGrupo;
    }

    public List<Notificacion> getNotificacionList() {
        return notificacionList;
    }

    public void setNotificacionList(List<Notificacion> notificacionList) {
        this.notificacionList = notificacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCuenta != null ? idCuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.idCuenta == null && other.idCuenta != null) || (this.idCuenta != null && !this.idCuenta.equals(other.idCuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cuenta[ idCuenta=" + idCuenta + " ]";
    }
    
}
