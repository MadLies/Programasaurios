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

    public Transaccion(Integer idTransaccion, int valorTransaccion, Cuenta idCuenta, Pago idPago, Usuario usuarioSalida, Usuario usuarioLlegada) {
        this.idTransaccion = idTransaccion;
        this.valorTransaccion = valorTransaccion;
        this.idCuenta = idCuenta;
        this.idPago = idPago;
        this.usuarioSalida = usuarioSalida;
        this.usuarioLlegada = usuarioLlegada;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    public int getValorTransaccion() {
        return valorTransaccion;
    }

    public Cuenta getIdCuenta() {
        return idCuenta;
    }

    public Pago getIdPago() {
        return idPago;
    }

    public Usuario getUsuarioSalida() {
        return usuarioSalida;
    }

    public Usuario getUsuarioLlegada() {
        return usuarioLlegada;
    }

    public void setIdTransaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public void setValorTransaccion(int valorTransaccion) {
        this.valorTransaccion = valorTransaccion;
    }

    public void setIdCuenta(Cuenta idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void setIdPago(Pago idPago) {
        this.idPago = idPago;
    }

    public void setUsuarioSalida(Usuario usuarioSalida) {
        this.usuarioSalida = usuarioSalida;
    }

    public void setUsuarioLlegada(Usuario usuarioLlegada) {
        this.usuarioLlegada = usuarioLlegada;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "idTransaccion=" + idTransaccion + ", valorTransaccion=" + valorTransaccion + ", idCuenta=" + idCuenta + ", idPago=" + idPago + ", usuarioSalida=" + usuarioSalida + ", usuarioLlegada=" + usuarioLlegada + '}';
    }

}