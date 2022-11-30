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
    int valorPagar;
    @Column(name = "abonado")
    int abonado;

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

    public IntegranteCuenta(int IntegranteCuenta, Cuenta cuenta, Usuario usuario, int valorPagar, int abonado) {
        this.IntegranteCuenta = IntegranteCuenta;
        this.cuenta = cuenta;
        this.usuario = usuario;
        this.valorPagar = valorPagar;
        this.abonado = abonado;
    }
    
}
