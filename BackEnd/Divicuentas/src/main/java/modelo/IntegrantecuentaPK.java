/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;

/**
 *
 * @author venus
 */
@Embeddable
public class IntegrantecuentaPK implements Serializable {

    @Basic(optional = false)
    private int idCuenta;
    @Basic(optional = false)
    private int celular;

    public IntegrantecuentaPK() {
    }

    public IntegrantecuentaPK(int idCuenta, int celular) {
        this.idCuenta = idCuenta;
        this.celular = celular;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCuenta;
        hash += (int) celular;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IntegrantecuentaPK)) {
            return false;
        }
        IntegrantecuentaPK other = (IntegrantecuentaPK) object;
        if (this.idCuenta != other.idCuenta) {
            return false;
        }
        if (this.celular != other.celular) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "divicuentas.IntegrantecuentaPK[ idCuenta=" + idCuenta + ", celular=" + celular + " ]";
    }
    
}
