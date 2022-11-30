/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Manuel Martinez
 */

@Entity
@Table(name = "Transaccion")
public class Transaccion implements Serializable{
    
    @Id
    @Column(name = "idTransaccion")
    int idTransaccion;
    
    @Column(name = "valorTransaccion")
    int valorTransaccion; 
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCuenta")
    private Cuenta cuenta;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPago")
    private Pago pago;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "celular")
    private Usuario UsuarioSalida;
    
    private Usuario usuarioLlegada;

    public Transaccion(int idTransaccion, int valorTransaccion, Cuenta cuenta, Pago pago, Usuario UsuarioSalida, Usuario usuarioLlegada) {
        this.idTransaccion = idTransaccion;
        this.valorTransaccion = valorTransaccion;
        this.cuenta = cuenta;
        this.pago = pago;
        this.UsuarioSalida = UsuarioSalida;
        this.usuarioLlegada = usuarioLlegada;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getValorTransaccion() {
        return valorTransaccion;
    }

    public void setValorTransaccion(int valorTransaccion) {
        this.valorTransaccion = valorTransaccion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Usuario getUsuarioSalida() {
        return UsuarioSalida;
    }

    public void setUsuarioSalida(Usuario UsuarioSalida) {
        this.UsuarioSalida = UsuarioSalida;
    }

    public Usuario getUsuarioLlegada() {
        return usuarioLlegada;
    }

    public void setUsuarioLlegada(Usuario usuarioLlegada) {
        this.usuarioLlegada = usuarioLlegada;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "idTransaccion=" + idTransaccion + ", valorTransaccion=" + valorTransaccion + ", cuenta=" + cuenta + ", pago=" + pago + ", UsuarioSalida=" + UsuarioSalida + ", usuarioLlegada=" + usuarioLlegada + '}';
    }
    
    
    
    
}
