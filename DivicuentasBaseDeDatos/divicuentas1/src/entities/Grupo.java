/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

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

    public Grupo() {
    }

    public Grupo(Integer idGrupo, String nombreGrupo, String descripcionGrupo, List<Usuario> usuarioList, List<Cuenta> cuentaList) {
        this.idGrupo = idGrupo;
        this.nombreGrupo = nombreGrupo;
        this.descripcionGrupo = descripcionGrupo;
        this.usuarioList = usuarioList;
        this.cuentaList = cuentaList;
    }

    public Grupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getDescripcionGrupo() {
        return descripcionGrupo;
    }

    public void setDescripcionGrupo(String descripcionGrupo) {
        this.descripcionGrupo = descripcionGrupo;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public List<Cuenta> getCuentaList() {
        return cuentaList;
    }

    public void setCuentaList(List<Cuenta> cuentaList) {
        this.cuentaList = cuentaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGrupo != null ? idGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupo)) {
            return false;
        }
        Grupo other = (Grupo) object;
        if ((this.idGrupo == null && other.idGrupo != null) || (this.idGrupo != null && !this.idGrupo.equals(other.idGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Grupo[ idGrupo=" + idGrupo + " ]";
    }
    
}
