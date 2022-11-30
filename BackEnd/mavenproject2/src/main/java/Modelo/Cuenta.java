/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
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
@Table(name = "Cuenta")
public class Cuenta implements Serializable{
    
    @Id
    @Column(name = "idCuenta")
    int idCuenta;
    @Column(name = "nombreCuenta")
    String nombreCuenta;
    @Column(name = "fechaCuenta")
    Date fechaCuenta;
    @Column(name = "totalCuenta")
    float totalCuenta;
    @Column(name = "divisaCuenta")
    String divisaCuenta;
    @Column(name = "tipoActividad")
    String tipoActividad;
    
    @OneToMany(mappedBy = "IntegranteCuenta", cascade = CascadeType.ALL)
    private List<IntegranteCuenta> MisCuentas = new ArrayList<>();
    
    @OneToMany(mappedBy = "idTransaccion", cascade = CascadeType.ALL)
    private List<Transaccion> MisGenerados = new ArrayList<>();
    
    @OneToMany(mappedBy = "idTransaccion", cascade = CascadeType.ALL)
    private List<Transaccion> MisRecibidos = new ArrayList<>();
    
    @OneToMany(mappedBy = "idNotificacion", cascade = CascadeType.ALL)
    private List<Notificacion> MisNotificaciones = new ArrayList<>();
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdGrupo")
    private Usuario IdGrupo;

    @Override
    public String toString() {
        return "Cuenta{" + "idCuenta=" + idCuenta + ", nombreCuenta=" + nombreCuenta + ", fechaCuenta=" + fechaCuenta + ", totalCuenta=" + totalCuenta + ", divisaCuenta=" + divisaCuenta + ", tipoActividad=" + tipoActividad + ", IdGrupo=" + IdGrupo + '}';
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public Date getFechaCuenta() {
        return fechaCuenta;
    }

    public void setFechaCuenta(Date fechaCuenta) {
        this.fechaCuenta = fechaCuenta;
    }

    public float getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(float totalCuenta) {
        this.totalCuenta = totalCuenta;
    }

    public String getDivisaCuenta() {
        return divisaCuenta;
    }

    public void setDivisaCuenta(String divisaCuenta) {
        this.divisaCuenta = divisaCuenta;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public Usuario getIdGrupo() {
        return IdGrupo;
    }

    public void setIdGrupo(Usuario IdGrupo) {
        this.IdGrupo = IdGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.idCuenta;
        hash = 23 * hash + Objects.hashCode(this.nombreCuenta);
        hash = 23 * hash + Objects.hashCode(this.fechaCuenta);
        hash = 23 * hash + Float.floatToIntBits(this.totalCuenta);
        hash = 23 * hash + Objects.hashCode(this.divisaCuenta);
        hash = 23 * hash + Objects.hashCode(this.tipoActividad);
        hash = 23 * hash + Objects.hashCode(this.MisCuentas);
        hash = 23 * hash + Objects.hashCode(this.MisGenerados);
        hash = 23 * hash + Objects.hashCode(this.MisRecibidos);
        hash = 23 * hash + Objects.hashCode(this.MisNotificaciones);
        hash = 23 * hash + Objects.hashCode(this.IdGrupo);
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
        final Cuenta other = (Cuenta) obj;
        if (this.idCuenta != other.idCuenta) {
            return false;
        }
        if (Float.floatToIntBits(this.totalCuenta) != Float.floatToIntBits(other.totalCuenta)) {
            return false;
        }
        if (!Objects.equals(this.nombreCuenta, other.nombreCuenta)) {
            return false;
        }
        if (!Objects.equals(this.divisaCuenta, other.divisaCuenta)) {
            return false;
        }
        if (!Objects.equals(this.tipoActividad, other.tipoActividad)) {
            return false;
        }
        if (!Objects.equals(this.fechaCuenta, other.fechaCuenta)) {
            return false;
        }
        if (!Objects.equals(this.MisCuentas, other.MisCuentas)) {
            return false;
        }
        if (!Objects.equals(this.MisGenerados, other.MisGenerados)) {
            return false;
        }
        if (!Objects.equals(this.MisRecibidos, other.MisRecibidos)) {
            return false;
        }
        if (!Objects.equals(this.MisNotificaciones, other.MisNotificaciones)) {
            return false;
        }
        return Objects.equals(this.IdGrupo, other.IdGrupo);
    }

    public Cuenta(int idCuenta, String nombreCuenta, Date fechaCuenta, float totalCuenta, String divisaCuenta, String tipoActividad, Usuario IdGrupo) {
        this.idCuenta = idCuenta;
        this.nombreCuenta = nombreCuenta;
        this.fechaCuenta = fechaCuenta;
        this.totalCuenta = totalCuenta;
        this.divisaCuenta = divisaCuenta;
        this.tipoActividad = tipoActividad;
        this.IdGrupo = IdGrupo;
    }

    
    
    
    
}
