/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
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
@Table(name = "UsuarioDelGrupo")
@NoArgsConstructor
public class UsuarioDelGrupo implements Serializable {
        
    @Id 
    @Column(name = "idUsuarioDelGrupo")
    int idUsuarioDelGrupo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "celular")
    private Usuario UsuarioGrupo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDGrupo")
    private Grupo GrupoDeUsuario;

    public UsuarioDelGrupo(int IdUsuarioDelGrupo, Usuario UsuarioGrupo, Grupo GrupoDeUsuario) {
        this.idUsuarioDelGrupo = IdUsuarioDelGrupo;
        this.UsuarioGrupo = UsuarioGrupo;
        this.GrupoDeUsuario = GrupoDeUsuario;
    }

    public int getIdUsuarioDelGrupo() {
        return idUsuarioDelGrupo;
    }

    public void setIdUsuarioDelGrupo(int IdUsuarioDelGrupo) {
        this.idUsuarioDelGrupo = IdUsuarioDelGrupo;
    }

    public Usuario getUsuarioGrupo() {
        return UsuarioGrupo;
    }

    public void setUsuarioGrupo(Usuario UsuarioGrupo) {
        this.UsuarioGrupo = UsuarioGrupo;
    }

    public Grupo getGrupoDeUsuario() {
        return GrupoDeUsuario;
    }

    public void setGrupoDeUsuario(Grupo GrupoDeUsuario) {
        this.GrupoDeUsuario = GrupoDeUsuario;
    }

    @Override
    public String toString() {
        return "UsuarioDelGrupo{" + "IdUsuarioDelGrupo=" + idUsuarioDelGrupo+ ", UsuarioGrupo=" + UsuarioGrupo + ", GrupoDeUsuario=" + GrupoDeUsuario + '}';
    }

    
}
