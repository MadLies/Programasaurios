/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author venus
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c"),
    @NamedQuery(name = "Cuenta.findByIdCuenta", query = "SELECT c FROM Cuenta c WHERE c.idCuenta = :idCuenta"),
    @NamedQuery(name = "Cuenta.findByNombreCuenta", query = "SELECT c FROM Cuenta c WHERE c.nombreCuenta = :nombreCuenta"),
    @NamedQuery(name = "Cuenta.findByFechaCuenta", query = "SELECT c FROM Cuenta c WHERE c.fechaCuenta = :fechaCuenta"),
    @NamedQuery(name = "Cuenta.findByTotalCuenta", query = "SELECT c FROM Cuenta c WHERE c.totalCuenta = :totalCuenta"),
    @NamedQuery(name = "Cuenta.findByDivisaCuenta", query = "SELECT c FROM Cuenta c WHERE c.divisaCuenta = :divisaCuenta"),
    @NamedQuery(name = "Cuenta.findByTipoActividad", query = "SELECT c FROM Cuenta c WHERE c.tipoActividad = :tipoActividad")})
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idCuenta;
    @Basic(optional = false)
    private String nombreCuenta;
    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCuenta;
    @Basic(optional = false)
    private float totalCuenta;
    private String divisaCuenta;
    private String tipoActividad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuenta", fetch = FetchType.EAGER)
    private Collection<Integrantecuenta> integrantecuentaCollection;
    @OneToMany(mappedBy = "idCuenta", fetch = FetchType.EAGER)
    private Collection<Transaccion> transaccionCollection;
    @JoinColumn(name = "idGrupo", referencedColumnName = "idGrupo")
    @ManyToOne(fetch = FetchType.EAGER)
    private Grupo idGrupo;
    @OneToMany(mappedBy = "idCuenta", fetch = FetchType.EAGER)
    private Collection<Notificacion> notificacionCollection;

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

    public Collection<Integrantecuenta> getIntegrantecuentaCollection() {
        return integrantecuentaCollection;
    }

    public void setIntegrantecuentaCollection(Collection<Integrantecuenta> integrantecuentaCollection) {
        this.integrantecuentaCollection = integrantecuentaCollection;
    }

    public Collection<Transaccion> getTransaccionCollection() {
        return transaccionCollection;
    }

    public void setTransaccionCollection(Collection<Transaccion> transaccionCollection) {
        this.transaccionCollection = transaccionCollection;
    }

    public Grupo getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Grupo idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Collection<Notificacion> getNotificacionCollection() {
        return notificacionCollection;
    }

    public void setNotificacionCollection(Collection<Notificacion> notificacionCollection) {
        this.notificacionCollection = notificacionCollection;
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
        return "divicuentas.Cuenta[ idCuenta=" + idCuenta + " ]";
    }
    
}
