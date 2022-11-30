/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.idTransaccion;
        hash = 83 * hash + this.valorTransaccion;
        hash = 83 * hash + Objects.hashCode(this.cuenta);
        hash = 83 * hash + Objects.hashCode(this.pago);
        hash = 83 * hash + Objects.hashCode(this.UsuarioSalida);
        hash = 83 * hash + Objects.hashCode(this.usuarioLlegada);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transaccion other = (Transaccion) obj;
        if (this.idTransaccion != other.idTransaccion) {
            return false;
        }
        if (this.valorTransaccion != other.valorTransaccion) {
            return false;
        }
        if (!Objects.equals(this.cuenta, other.cuenta)) {
            return false;
        }
        if (!Objects.equals(this.pago, other.pago)) {
            return false;
        }
        if (!Objects.equals(this.UsuarioSalida, other.UsuarioSalida)) {
            return false;
        }
        return Objects.equals(this.usuarioLlegada, other.usuarioLlegada);
    }
    
    
    
    
}
