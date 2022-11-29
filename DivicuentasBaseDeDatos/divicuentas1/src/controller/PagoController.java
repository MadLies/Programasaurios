/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.persistence.EntityManager;
import Conexion.Conexion;
import entities.Pago;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author CrookedSpecs
 */
public class PagoController {
    
    public void crear(Pago p)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.persist(p);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    public void editar(Pago p)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.persist(p);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    public void eliminar(Object p)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.remove(p);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    
    
    public List<Pago> todosLosPagos ()
    {
        Query q=entityManager().createQuery("SELECT p FROM Pago p");
        return q.getResultList();
    }
    
    private EntityManager entityManager()
    {
        return Conexion.getInstancia().getFabrica().createEntityManager();
    }
}
