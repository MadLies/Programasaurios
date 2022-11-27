/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author venus
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByCelular", query = "SELECT u FROM Usuario u WHERE u.celular = :celular"),
    @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuario.findByNickname", query = "SELECT u FROM Usuario u WHERE u.nickname = :nickname"),
    @NamedQuery(name = "Usuario.findByPais", query = "SELECT u FROM Usuario u WHERE u.pais = :pais"),
    @NamedQuery(name = "Usuario.findByDivisa", query = "SELECT u FROM Usuario u WHERE u.divisa = :divisa"),
    @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email"),
    @NamedQuery(name = "Usuario.findByContrase\u00f1a", query = "SELECT u FROM Usuario u WHERE u.contrase\u00f1a = :contrase\u00f1a")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Integer celular;
    private String nombre;
    private String nickname;
    private String pais;
    private String divisa;
    private String email;
    private String contraseña;
    @ManyToMany(mappedBy = "usuarioCollection", fetch = FetchType.EAGER)
    private Collection<Grupo> grupoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario", fetch = FetchType.EAGER)
    private Collection<Integrantecuenta> integrantecuentaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioSalida", fetch = FetchType.EAGER)
    private Collection<Transaccion> transaccionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioLlegada", fetch = FetchType.EAGER)
    private Collection<Transaccion> transaccionCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioGenera", fetch = FetchType.EAGER)
    private Collection<Notificacion> notificacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioRecibe", fetch = FetchType.EAGER)
    private Collection<Notificacion> notificacionCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario", fetch = FetchType.EAGER)
    private Collection<Amigo> amigoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "amigo", fetch = FetchType.EAGER)
    private Collection<Amigo> amigoCollection1;

    public Usuario() {
    }

    public Usuario(Integer celular) {
        this.celular = celular;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Collection<Grupo> getGrupoCollection() {
        return grupoCollection;
    }

    public void setGrupoCollection(Collection<Grupo> grupoCollection) {
        this.grupoCollection = grupoCollection;
    }

    public Collection<Integrantecuenta> getIntegrantecuentaCollection() {
        return integrantecuentaCollection;
    }

    public void setIntegrantecuentaCollection(Collection<Integrantecuenta> integrantecuentaCollection) {
        this.integrantecuentaCollection = integrantecuentaCollection;
    }

    public Collection<Transaccion> getTransaccionCollection() {
        return transaccionCollection;
    }

    public void setTransaccionCollection(Collection<Transaccion> transaccionCollection) {
        this.transaccionCollection = transaccionCollection;
    }

    public Collection<Transaccion> getTransaccionCollection1() {
        return transaccionCollection1;
    }

    public void setTransaccionCollection1(Collection<Transaccion> transaccionCollection1) {
        this.transaccionCollection1 = transaccionCollection1;
    }

    public Collection<Notificacion> getNotificacionCollection() {
        return notificacionCollection;
    }

    public void setNotificacionCollection(Collection<Notificacion> notificacionCollection) {
        this.notificacionCollection = notificacionCollection;
    }

    public Collection<Notificacion> getNotificacionCollection1() {
        return notificacionCollection1;
    }

    public void setNotificacionCollection1(Collection<Notificacion> notificacionCollection1) {
        this.notificacionCollection1 = notificacionCollection1;
    }

    public Collection<Amigo> getAmigoCollection() {
        return amigoCollection;
    }

    public void setAmigoCollection(Collection<Amigo> amigoCollection) {
        this.amigoCollection = amigoCollection;
    }

    public Collection<Amigo> getAmigoCollection1() {
        return amigoCollection1;
    }

    public void setAmigoCollection1(Collection<Amigo> amigoCollection1) {
        this.amigoCollection1 = amigoCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (celular != null ? celular.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.celular == null && other.celular != null) || (this.celular != null && !this.celular.equals(other.celular))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "divicuentas.Usuario[ celular=" + celular + " ]";
    }
    
}
