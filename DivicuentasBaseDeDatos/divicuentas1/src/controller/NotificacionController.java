/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.persistence.EntityManager;
import Conexion.Conexion;
import entities.Notificacion;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author CrookedSpecs
 */
public class NotificacionController {
    
    public void crear(Notificacion n)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.persist(n);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    public void editar(Notificacion n)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.persist(n);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    public void eliminar(Object n)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.remove(n);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    
    
    public List<Notificacion> todosLosNotificaciones ()
    {
        Query q=entityManager().createQuery("SELECT n FROM Notificacion n");
        return q.getResultList();
    }
    
    private EntityManager entityManager()
    {
        return Conexion.getInstancia().getFabrica().createEntityManager();
    }
}
