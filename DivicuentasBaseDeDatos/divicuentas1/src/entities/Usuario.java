/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author CrookedSpecs
 */
@Entity
@Table(name = "usuario", catalog = "divicuentas", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"email"}),
    @UniqueConstraint(columnNames = {"celular"}),
    @UniqueConstraint(columnNames = {"nickname"})})
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "celular", nullable = false)
    private Integer celular;
    @Column(name = "nombre", length = 45)
    private String nombre;
    @Column(name = "nickname", length = 45)
    private String nickname;
    @Column(name = "pais", length = 45)
    private String pais;
    @Column(name = "divisa", length = 3)
    private String divisa;
    @Column(name = "email", length = 255)
    private String email;
    @Column(name = "contrase\u00f1a", length = 45)
    private String contraseña;

    public Usuario() {
    }

    public Usuario(Integer celular, String nombre, String nickname, String pais, String divisa, String email, String contraseña) {
        this.celular = celular;
        this.nombre = nombre;
        this.nickname = nickname;
        this.pais = pais;
        this.divisa = divisa;
        this.email = email;
        this.contraseña = contraseña;
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
        return "entities.Usuario[ celular=" + celular + " ]";
    }
    
}
