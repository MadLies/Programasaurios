/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author CrookedSpecs
 */
@Entity
@Table(name = "grupo", catalog = "divicuentas", schema = "")
@NamedQueries({
    @NamedQuery(name = "Grupo.findAll", query = "SELECT g FROM Grupo g")})
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idGrupo", nullable = false)
    private Integer idGrupo;
    @Column(name = "nombreGrupo", length = 45)
    private String nombreGrupo;
    @Column(name = "descripcionGrupo", length = 45)
    private String descripcionGrupo;
    @JoinTable(name = "usuariodelgrupo", joinColumns = {
        @JoinColumn(name = "idGrupo", referencedColumnName = "idGrupo", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "celular", referencedColumnName = "celular", nullable = false)})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Usuario> usuarioList;
    @OneToMany(mappedBy = "idGrupo", fetch = FetchType.LAZY)
    private List<Cuenta> cuentaList;

    public Grupo(Integer idGrupo, String nombreGrupo, String descripcionGrupo, List<Usuario> usuarioList, List<Cuenta> cuentaList) {
        this.idGrupo = idGrupo;
        this.nombreGrupo = nombreGrupo;
        this.descripcionGrupo = descripcionGrupo;
        this.usuarioList = usuarioList;
        this.cuentaList = cuentaList;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public String getDescripcionGrupo() {
        return descripcionGrupo;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public List<Cuenta> getCuentaList() {
        return cuentaList;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public void setDescripcionGrupo(String descripcionGrupo) {
        this.descripcionGrupo = descripcionGrupo;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public void setCuentaList(List<Cuenta> cuentaList) {
        this.cuentaList = cuentaList;
    }

    @Override
    public String toString() {
        return "Grupo{" + "idGrupo=" + idGrupo + ", nombreGrupo=" + nombreGrupo + ", descripcionGrupo=" + descripcionGrupo + ", usuarioList=" + usuarioList + ", cuentaList=" + cuentaList + '}';
    }
    

}
