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
@Table(name = "IntegranteCuenta")
public class IntegranteCuenta implements Serializable{
    
    @Id
    @Column(name = "IntegranteCuenta")
    int IntegranteCuenta;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCuenta")
    private Cuenta cuenta;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "celular")
    private Usuario usuario;

    @Column(name = "valorPagar")
    double valorPagar;
    @Column(name = "abonado")
    double abonado;

    @Override
    public String toString() {
        return "IntegranteCuenta{" + "IntegranteCuenta=" + IntegranteCuenta + ", cuenta=" + cuenta + ", usuario=" + usuario + ", valorPagar=" + valorPagar + ", abonado=" + abonado + '}';
    }

    public int getIntegranteCuenta() {
        return IntegranteCuenta;
    }

    public void setIntegranteCuenta(int IntegranteCuenta) {
        this.IntegranteCuenta = IntegranteCuenta;
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

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public double getAbonado() {
        return abonado;
    }

    public void setAbonado(int abonado) {
        this.abonado = abonado;
    }

    public IntegranteCuenta(int IntegranteCuenta, Cuenta cuenta, Usuario usuario, double valorPagar, double abonado) {
        this.IntegranteCuenta = IntegranteCuenta;
        this.cuenta = cuenta;
        this.usuario = usuario;
        this.valorPagar = valorPagar;
        this.abonado = abonado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.IntegranteCuenta;
        hash = 53 * hash + Objects.hashCode(this.cuenta);
        hash = 53 * hash + Objects.hashCode(this.usuario);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.valorPagar) ^ (Double.doubleToLongBits(this.valorPagar) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.abonado) ^ (Double.doubleToLongBits(this.abonado) >>> 32));
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
        final IntegranteCuenta other = (IntegranteCuenta) obj;
        if (this.IntegranteCuenta != other.IntegranteCuenta) {
            return false;
        }
        if (this.valorPagar != other.valorPagar) {
            return false;
        }
        if (this.abonado != other.abonado) {
            return false;
        }
        if (!Objects.equals(this.cuenta, other.cuenta)) {
            return false;
        }
        return Objects.equals(this.usuario, other.usuario);
    }
    
}
