/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

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

    public Integrantecuenta(IntegrantecuentaPK integrantecuentaPK, int valorPagar, int abonado, Cuenta cuenta, Usuario usuario) {
        this.integrantecuentaPK = integrantecuentaPK;
        this.valorPagar = valorPagar;
        this.abonado = abonado;
        this.cuenta = cuenta;
        this.usuario = usuario;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public IntegrantecuentaPK getIntegrantecuentaPK() {
        return integrantecuentaPK;
    }

    public int getValorPagar() {
        return valorPagar;
    }

    public int getAbonado() {
        return abonado;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIntegrantecuentaPK(IntegrantecuentaPK integrantecuentaPK) {
        this.integrantecuentaPK = integrantecuentaPK;
    }

    public void setValorPagar(int valorPagar) {
        this.valorPagar = valorPagar;
    }

    public void setAbonado(int abonado) {
        this.abonado = abonado;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Integrantecuenta{" + "integrantecuentaPK=" + integrantecuentaPK + ", valorPagar=" + valorPagar + ", abonado=" + abonado + ", cuenta=" + cuenta + ", usuario=" + usuario + '}';
    }
    
}