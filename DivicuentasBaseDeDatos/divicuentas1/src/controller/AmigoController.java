/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.persistence.EntityManager;
import Conexion.Conexion;
import entities.Amigo;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author CrookedSpecs
 */
public class AmigoController {
    
    public void crear(Amigo a)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.persist(a);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    public void editar(Amigo a)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.persist(a);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    public void eliminar(Object a)
    {
        EntityManager en=entityManager();
        try {
            en.getTransaction().begin(); //iniciar transaccion        
            en.remove(a);
            en.getTransaction().commit(); //inserta la transaccion
        }
        catch (Exception e)
        {
            en.getTransaction().rollback();
        }
        
    }
    
    
    public List<Amigo> todosLosAmigos ()
    {
        Query q=entityManager().createQuery("SELECT a FROM Amigo a");
        return q.getResultList();
    }
    
    private EntityManager entityManager()
    {
        return Conexion.getInstancia().getFabrica().createEntityManager();
    }
}
