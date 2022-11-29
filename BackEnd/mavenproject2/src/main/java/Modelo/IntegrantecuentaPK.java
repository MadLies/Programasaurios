/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author CrookedSpecs
 */
@Embeddable
public class IntegrantecuentaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idCuenta", nullable = false)
    private int idCuenta;
    @Basic(optional = false)
    @Column(name = "celular", nullable = false)
    private int celular;

    public IntegrantecuentaPK(int idCuenta, int celular) {
        this.idCuenta = idCuenta;
        this.celular = celular;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public int getCelular() {
        return celular;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "IntegrantecuentaPK{" + "idCuenta=" + idCuenta + ", celular=" + celular + '}';
    }

}
