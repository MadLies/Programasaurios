/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Manuel Martinez
 */

@Entity
@Table(name = "Grupo")
public class Grupo implements Serializable{
    
    @Id
    @Column(name = "IdGrupo")
    int IdGrupo;
    @Column(name = "nombreGrupo")
    String NombreDelGrupo;
    @Column(name = "descripcionGrupo")
    String DescripcionDelGrupo;
    
    @OneToMany(mappedBy = "idUsuarioDelGrupo", cascade = CascadeType.ALL)
    private List<UsuarioDelGrupo> Integrantes = new ArrayList<>();
    
    @OneToMany(mappedBy = "idCuenta", cascade = CascadeType.ALL)
    private List<Cuenta> Cuentas = new ArrayList<>();
   
    public Grupo(int IDGrupo, String NombreDelGrupo, String DescripcionDelGrupo) {
        this.IdGrupo= IDGrupo;
        this.NombreDelGrupo = NombreDelGrupo;
        this.DescripcionDelGrupo = DescripcionDelGrupo;
    }

    public int getIDGrupo() {
        return IdGrupo;
    }

    public void setIDGrupo(int IDGrupo) {
        this.IdGrupo = IDGrupo;
    }

    public int getIdGrupo() {
        return IdGrupo;
    }

    public void setIdGrupo(int IdGrupo) {
        this.IdGrupo = IdGrupo;
    }

    public List<UsuarioDelGrupo> getIntegrantes() {
        return Integrantes;
    }

    public void setIntegrantes(List<UsuarioDelGrupo> Integrantes) {
        this.Integrantes = Integrantes;
    }

    public List<Cuenta> getCuentas() {
        return Cuentas;
    }

    public void setCuentas(List<Cuenta> Cuentas) {
        this.Cuentas = Cuentas;
    }

    public String getNombreDelGrupo() {
        return NombreDelGrupo;
    }

    public void setNombreDelGrupo(String NombreDelGrupo) {
        this.NombreDelGrupo = NombreDelGrupo;
    }

    public String getDescripcionDelGrupo() {
        return DescripcionDelGrupo;
    }

    public void setDescripcionDelGrupo(String DescripcionDelGrupo) {
        this.DescripcionDelGrupo = DescripcionDelGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.IdGrupo;
        hash = 29 * hash + Objects.hashCode(this.NombreDelGrupo);
        hash = 29 * hash + Objects.hashCode(this.DescripcionDelGrupo);
        hash = 29 * hash + Objects.hashCode(this.Integrantes);
        hash = 29 * hash + Objects.hashCode(this.Cuentas);
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
        final Grupo other = (Grupo) obj;
        if (this.IdGrupo != other.IdGrupo) {
            return false;
        }
        if (!Objects.equals(this.NombreDelGrupo, other.NombreDelGrupo)) {
            return false;
        }
        if (!Objects.equals(this.DescripcionDelGrupo, other.DescripcionDelGrupo)) {
            return false;
        }
        if (!Objects.equals(this.Integrantes, other.Integrantes)) {
            return false;
        }
        return Objects.equals(this.Cuentas, other.Cuentas);
    }

    @Override
    public String toString() {
        return "Grupo{" + "IDGrupo=" + IdGrupo + ", NombreDelGrupo=" + NombreDelGrupo + ", DescripcionDelGrupo=" + DescripcionDelGrupo + '}';
    }
    
    
    
}
