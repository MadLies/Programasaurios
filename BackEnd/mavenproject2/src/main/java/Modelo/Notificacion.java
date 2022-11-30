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
@Table(name = "Notificacion")
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
    
    
    
    
}
