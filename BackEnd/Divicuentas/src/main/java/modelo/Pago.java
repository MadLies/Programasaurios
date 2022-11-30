/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.NoArgsConstructor;

/**
 *
 * @author Manuel Martinez
 */

@Entity
@Table(name = "Pago")
@NoArgsConstructor
public class Pago implements Serializable{
    
    @Id
    @Column(name = "idPago")
    int idPago;
    @Column(name = "idFechaPago")
    Date fechaPago;
    
    @OneToMany(mappedBy = "idTransaccion", cascade = CascadeType.ALL)
    private List<Transaccion> Transacciones = new ArrayList<>();
        
    @OneToMany(mappedBy = "idNotificacion", cascade = CascadeType.ALL)
    private List<Notificacion> Notificaciones = new ArrayList<>();

    public Pago(int idPago, Date fechaPago) {
        this.idPago = idPago;
        this.fechaPago = fechaPago;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.idPago;
        hash = 79 * hash + Objects.hashCode(this.fechaPago);
        hash = 79 * hash + Objects.hashCode(this.Transacciones);
        hash = 79 * hash + Objects.hashCode(this.Notificaciones);
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
        final Pago other = (Pago) obj;
        if (this.idPago != other.idPago) {
            return false;
        }
        if (!Objects.equals(this.fechaPago, other.fechaPago)) {
            return false;
        }
        if (!Objects.equals(this.Transacciones, other.Transacciones)) {
            return false;
        }
        return Objects.equals(this.Notificaciones, other.Notificaciones);
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public List<Transaccion> getTransacciones() {
        return Transacciones;
    }

    public void setTransacciones(List<Transaccion> Transacciones) {
        this.Transacciones = Transacciones;
    }

    public List<Notificacion> getNotificaciones() {
        return Notificaciones;
    }

    public void setNotificaciones(List<Notificacion> Notificaciones) {
        this.Notificaciones = Notificaciones;
    }

    @Override
    public String toString() {
        return "Pago{" + "idPago=" + idPago + ", fechaPago=" + fechaPago + ", Transacciones=" + Transacciones + ", Notificaciones=" + Notificaciones + '}';
    }
    
    
    
}
