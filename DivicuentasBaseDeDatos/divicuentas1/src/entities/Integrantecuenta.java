/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "integrantecuenta", catalog = "divicuentas", schema = "")
@NamedQueries({
    @NamedQuery(name = "Integrantecuenta.findAll", query = "SELECT i FROM Integrantecuenta i")})
public class Integrantecuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IntegrantecuentaPK integrantecuentaPK;
    @Basic(optional = false)
    @Column(name = "valorPagar", nullable = false)
    private int valorPagar;
    @Basic(optional = false)
    @Column(name = "abonado", nullable = false)
    private int abonado;
    @JoinColumn(name = "idCuenta", referencedColumnName = "idCuenta", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cuenta cuenta;
    @JoinColumn(name = "celular", referencedColumnName = "celular", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;

    public Integrantecuenta() {
    }

    public Integrantecuenta(IntegrantecuentaPK integrantecuentaPK) {
        this.integrantecuentaPK = integrantecuentaPK;
    }

    public Integrantecuenta(IntegrantecuentaPK integrantecuentaPK, int valorPagar, int abonado) {
        this.integrantecuentaPK = integrantecuentaPK;
        this.valorPagar = valorPagar;
        this.abonado = abonado;
    }

    public Integrantecuenta(int idCuenta, int celular) {
        this.integrantecuentaPK = new IntegrantecuentaPK(idCuenta, celular);
    }

    public IntegrantecuentaPK getIntegrantecuentaPK() {
        return integrantecuentaPK;
    }

    public void setIntegrantecuentaPK(IntegrantecuentaPK integrantecuentaPK) {
        this.integrantecuentaPK = integrantecuentaPK;
    }

    public int getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(int valorPagar) {
        this.valorPagar = valorPagar;
    }

    public int getAbonado() {
        return abonado;
    }

    public void setAbonado(int abonado) {
        this.abonado = abonado;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (integrantecuentaPK != null ? integrantecuentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Integrantecuenta)) {
            return false;
        }
        Integrantecuenta other = (Integrantecuenta) object;
        if ((this.integrantecuentaPK == null && other.integrantecuentaPK != null) || (this.integrantecuentaPK != null && !this.integrantecuentaPK.equals(other.integrantecuentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Integrantecuenta[ integrantecuentaPK=" + integrantecuentaPK + " ]";
    }
    
}
