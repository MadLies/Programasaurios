/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
    public String toString() {
        return "Grupo{" + "IDGrupo=" + IdGrupo + ", NombreDelGrupo=" + NombreDelGrupo + ", DescripcionDelGrupo=" + DescripcionDelGrupo + '}';
    }
    
    
    
}
