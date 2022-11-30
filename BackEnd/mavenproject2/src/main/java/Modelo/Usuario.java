/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Manuel Martinez
 */
@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

    private static final long serialVersion = 1L;
    
    @Id
    @Column(name = "celular")
    private long Id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "pais")
    private String pais;
    @Column(name = "divisa")
    private String divisa;
    @Column(name = "email")
    private String email;
    @Column(name = "contraseña")
    private String contrasena;
    

    public Usuario(long Id, String name, String nickname, String pais, String divisa, String email, String contrasena) {
        this.Id = Id;
        this.name = name;
        this.nickname = nickname;
        this.pais = pais;
        this.divisa = divisa;
        this.email = email;
        this.contrasena = contrasena;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
   
    
}
