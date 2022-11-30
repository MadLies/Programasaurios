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
import lombok.NoArgsConstructor;

/**
 *
 * @author Manuel Martinez
 */
@Entity
@Table(name = "Notificacion")
@NoArgsConstructor
public class Notificacion implements Serializable{
    
    
    
    @Id
    @Column(name = "idNotificacion")
    private int idNotificacion;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCuenta")
    private Cuenta cuenta;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPago")
    private Pago pago;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "celular")
    private Usuario UsuarioGenera;
    
    private Usuario usuarioRecibe;
   
    @Column(name = "estado")
    private String estado;
 
    @Column(name = "mensaje")
    private String mensaje;

    public Notificacion(int idNotificacion, Cuenta cuenta, Pago pago, Usuario UsuarioGenera, Usuario usuarioRecibe, String estado, String mensaje) {
        this.idNotificacion = idNotificacion;
        this.cuenta = cuenta;
        this.pago = pago;
        this.UsuarioGenera = UsuarioGenera;
        this.usuarioRecibe = usuarioRecibe;
        this.estado = estado;
        this.mensaje = mensaje;
    }

    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
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

    public Usuario getUsuarioGenera() {
        return UsuarioGenera;
    }

    public void setUsuarioGenera(Usuario UsuarioGenera) {
        this.UsuarioGenera = UsuarioGenera;
    }

    public Usuario getUsuarioRecibe() {
        return usuarioRecibe;
    }

    public void setUsuarioRecibe(Usuario usuarioRecibe) {
        this.usuarioRecibe = usuarioRecibe;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Notificacion{" + "idNotificacion=" + idNotificacion + ", cuenta=" + cuenta + ", pago=" + pago + ", UsuarioGenera=" + UsuarioGenera + ", usuarioRecibe=" + usuarioRecibe + ", estado=" + estado + ", mensaje=" + mensaje + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.idNotificacion;
        hash = 17 * hash + Objects.hashCode(this.cuenta);
        hash = 17 * hash + Objects.hashCode(this.pago);
        hash = 17 * hash + Objects.hashCode(this.UsuarioGenera);
        hash = 17 * hash + Objects.hashCode(this.usuarioRecibe);
        hash = 17 * hash + Objects.hashCode(this.estado);
        hash = 17 * hash + Objects.hashCode(this.mensaje);
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
        final Notificacion other = (Notificacion) obj;
        if (this.idNotificacion != other.idNotificacion) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.mensaje, other.mensaje)) {
            return false;
        }
        if (!Objects.equals(this.cuenta, other.cuenta)) {
            return false;
        }
        if (!Objects.equals(this.pago, other.pago)) {
            return false;
        }
        if (!Objects.equals(this.UsuarioGenera, other.UsuarioGenera)) {
            return false;
        }
        return Objects.equals(this.usuarioRecibe, other.usuarioRecibe);
    }
    
    
    
    
}
