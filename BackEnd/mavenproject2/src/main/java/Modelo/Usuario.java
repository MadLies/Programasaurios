/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;
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
    private double Id;
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
    
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Amigo> MisAmigos = new ArrayList<>();
    
    @OneToMany(mappedBy = "UsuarioGrupo", cascade = CascadeType.ALL)
    private List<UsuarioDelGrupo> MisGrupos = new ArrayList<>();
    
    @OneToMany(mappedBy = "IntegranteCuenta", cascade = CascadeType.ALL)
    private List<IntegranteCuenta> MisCuentas = new ArrayList<>();
    
    @OneToMany(mappedBy = "idTransaccion", cascade = CascadeType.ALL)
    private List<Transaccion> MisSalidas = new ArrayList<>();
    
    @OneToMany(mappedBy = "idTransaccion", cascade = CascadeType.ALL)
    private List<Transaccion> MisEntradas = new ArrayList<>();
    
    @OneToMany(mappedBy = "idNotificacion", cascade = CascadeType.ALL)
    private List<Notificacion> MisGenerados = new ArrayList<>();
    
    @OneToMany(mappedBy = "idNotificacion", cascade = CascadeType.ALL)
    private List<Notificacion> MisRecibidos = new ArrayList<>();
    
    

    public Usuario(int Id, String name, String nickname, String pais, String divisa, String email, String contrasena) {
        this.Id = Id;
        this.name = name;
        this.nickname = nickname;
        this.pais = pais;
        this.divisa = divisa;
        this.email = email;
        this.contrasena = contrasena;
    }

    public double getId() {
        return Id;
    }

    public void setId(double Id) {
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



    public List<Amigo> getMisAmigos() {
        return MisAmigos;
    }

    public void setMisAmigos(List<Amigo> MisAmigos) {
        this.MisAmigos = MisAmigos;
    }

    public List<UsuarioDelGrupo> getMisGrupos() {
        return MisGrupos;
    }

    public void setMisGrupos(List<UsuarioDelGrupo> MisGrupos) {
        this.MisGrupos = MisGrupos;
    }

    public List<IntegranteCuenta> getMisCuentas() {
        return MisCuentas;
    }

    public void setMisCuentas(List<IntegranteCuenta> MisCuentas) {
        this.MisCuentas = MisCuentas;
    }

    public List<Transaccion> getMisSalidas() {
        return MisSalidas;
    }

    public void setMisSalidas(List<Transaccion> MisSalidas) {
        this.MisSalidas = MisSalidas;
    }

    public List<Transaccion> getMisEntradas() {
        return MisEntradas;
    }

    public void setMisEntradas(List<Transaccion> MisEntradas) {
        this.MisEntradas = MisEntradas;
    }

    public List<Notificacion> getMisGenerados() {
        return MisGenerados;
    }

    public void setMisGenerados(List<Notificacion> MisGenerados) {
        this.MisGenerados = MisGenerados;
    }

    public List<Notificacion> getMisRecibidos() {
        return MisRecibidos;
    }

    public void setMisRecibidos(List<Notificacion> MisRecibidos) {
        this.MisRecibidos = MisRecibidos;
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
        final Usuario other = (Usuario) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.divisa, other.divisa)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.contrasena, other.contrasena)) {
            return false;
        }
        if (!Objects.equals(this.MisAmigos, other.MisAmigos)) {
            return false;
        }
        if (!Objects.equals(this.MisGrupos, other.MisGrupos)) {
            return false;
        }
        if (!Objects.equals(this.MisCuentas, other.MisCuentas)) {
            return false;
        }
        if (!Objects.equals(this.MisSalidas, other.MisSalidas)) {
            return false;
        }
        if (!Objects.equals(this.MisEntradas, other.MisEntradas)) {
            return false;
        }
        if (!Objects.equals(this.MisGenerados, other.MisGenerados)) {
            return false;
        }
        return Objects.equals(this.MisRecibidos, other.MisRecibidos);
    }

    @Override
    public String toString() {
        return "Usuario{" + "Id=" + Id + ", name=" + name + ", nickname=" + nickname + ", pais=" + pais + ", divisa=" + divisa + ", email=" + email + ", contrasena=" + contrasena + ", MisAmigos=" + MisAmigos + ", MisGrupos=" + MisGrupos + ", MisCuentas=" + MisCuentas + ", MisSalidas=" + MisSalidas + ", MisEntradas=" + MisEntradas + ", MisGenerados=" + MisGenerados + ", MisRecibidos=" + MisRecibidos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.Id) ^ (Double.doubleToLongBits(this.Id) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.nickname);
        hash = 23 * hash + Objects.hashCode(this.pais);
        hash = 23 * hash + Objects.hashCode(this.divisa);
        hash = 23 * hash + Objects.hashCode(this.email);
        hash = 23 * hash + Objects.hashCode(this.contrasena);
        hash = 23 * hash + Objects.hashCode(this.MisAmigos);
        hash = 23 * hash + Objects.hashCode(this.MisGrupos);
        hash = 23 * hash + Objects.hashCode(this.MisCuentas);
        hash = 23 * hash + Objects.hashCode(this.MisSalidas);
        hash = 23 * hash + Objects.hashCode(this.MisEntradas);
        hash = 23 * hash + Objects.hashCode(this.MisGenerados);
        hash = 23 * hash + Objects.hashCode(this.MisRecibidos);
        return hash;
    }

    
   
    
}
