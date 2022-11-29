/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.persistence.EntityManager;
import Conexion.Conexion;
import entities.Cuenta;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author CrookedSpecs
 */
public class CuentaController {
    
    public void crear(Cuenta c)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.persist(c);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    public void editar(Cuenta c)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.persist(c);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    public void eliminar(Object c)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.remove(c);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    
    
    public List<Cuenta> todosLosCuentas ()
    {
        Query q=entityManager().createQuery("SELECT c FROM Cuenta c");
        return q.getResultList();
    }
    
    private EntityManager entityManager()
    {
        return Conexion.getInstancia().getFabrica().createEntityManager();
    }
}
