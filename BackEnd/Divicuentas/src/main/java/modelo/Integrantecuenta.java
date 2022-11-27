/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
    @NamedQuery(name = "Integrantecuenta.findAll", query = "SELECT i FROM Integrantecuenta i"),
    @NamedQuery(name = "Integrantecuenta.findByIdCuenta", query = "SELECT i FROM Integrantecuenta i WHERE i.integrantecuentaPK.idCuenta = :idCuenta"),
    @NamedQuery(name = "Integrantecuenta.findByCelular", query = "SELECT i FROM Integrantecuenta i WHERE i.integrantecuentaPK.celular = :celular"),
    @NamedQuery(name = "Integrantecuenta.findByValorPagar", query = "SELECT i FROM Integrantecuenta i WHERE i.valorPagar = :valorPagar"),
    @NamedQuery(name = "Integrantecuenta.findByAbonado", query = "SELECT i FROM Integrantecuenta i WHERE i.abonado = :abonado")})
public class Integrantecuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IntegrantecuentaPK integrantecuentaPK;
    @Basic(optional = false)
    private int valorPagar;
    @Basic(optional = false)
    private int abonado;
    @JoinColumn(name = "idCuenta", referencedColumnName = "idCuenta", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Cuenta cuenta;
    @JoinColumn(name = "celular", referencedColumnName = "celular", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
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
        return "divicuentas.Integrantecuenta[ integrantecuentaPK=" + integrantecuentaPK + " ]";
    }
    
}
