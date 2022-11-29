/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.persistence.EntityManager;
import Conexion.Conexion;
import entities.Grupo;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author CrookedSpecs
 */
public class GrupoController {
    
    public void crear(Grupo g)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.persist(g);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    public void editar(Grupo g)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.persist(g);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    public void eliminar(Object g)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.remove(g);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    
    
    public List<Grupo> todosLosGrupos ()
    {
        Query q=entityManager().createQuery("SELECT g FROM Grupo g");
        return q.getResultList();
    }
    
    private EntityManager entityManager()
    {
        return Conexion.getInstancia().getFabrica().createEntityManager();
    }
}
