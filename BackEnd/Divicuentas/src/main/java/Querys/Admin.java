/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Querys;

import Modelo.Amigo;
import Modelo.Cuenta;
import Modelo.Grupo;
import Modelo.IntegranteCuenta;
import Modelo.Notificacion;
import Modelo.Pago;
import Modelo.Transaccion;
import Modelo.Usuario;
import Modelo.UsuarioDelGrupo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Manuel Martinez
 */
public class Admin {

    public static final String PERSISTENCE_UNIT_NAME = "Divicuentas";

    EntityManagerFactory factory;
    EntityManager manager;

    public Admin() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager manager = factory.createEntityManager();

    }

    public void InsertarObjeto(Object object) {
        manager.getTransaction().begin();
        try {
            manager.persist(object);
            manager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            manager.getTransaction().rollback();
        } finally {
            manager.close();
        }
    }

    public Usuario FindUsuario(double key) {

        Usuario yo = manager.find(Usuario.class, key);
        return yo;

    }

    public Amigo FindAmigo(double key) {

        Amigo yo = manager.find(Amigo.class, key);
        return yo;

    }

    public Cuenta FindcCuenta(double key) {

        Cuenta yo = manager.find(Cuenta.class, key);
        return yo;

    }

    public Grupo FindcGrupo(double key) {

        Grupo yo = manager.find(Grupo.class, key);
        return yo;

    }

    public IntegranteCuenta FindIntegranteCuenta(double key) {

        IntegranteCuenta yo = manager.find(IntegranteCuenta.class, key);
        return yo;

    }

    public Notificacion FindIntegranteNotificacion(double key) {

        Notificacion yo = manager.find(Notificacion.class, key);
        return yo;

    }

    public Pago FindIntegrantePago(double key) {

        Pago yo = manager.find(Pago.class, key);
        return yo;

    }

    public Transaccion FindIntegranteTransaccion(double key) {

        Transaccion yo = manager.find(Transaccion.class, key);
        return yo;

    }

    public UsuarioDelGrupo FindIntegranteUsuarioDelGrupo(double key) {

        UsuarioDelGrupo yo = manager.find(UsuarioDelGrupo.class, key);
        return yo;

    }

    public void RemoveUsuario(double key) {

        try {

            Usuario yo = manager.find(Usuario.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }
    
    public void RemoveAmigo(double key) {

        try {

            Amigo yo = manager.find(Amigo.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }
    
    public void RemoveCuenta(double key) {

        try {

            Cuenta yo = manager.find(Cuenta.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }
    
    public void RemoveGrupo(double key) {

        try {

            Grupo yo = manager.find(Grupo.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }
    
    public void RemoveIntegranteCuenta(double key) {

        try {

            IntegranteCuenta yo = manager.find(IntegranteCuenta.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }
    
    public void RemoveNotificacion(double key) {

        try {

            Notificacion yo = manager.find(Notificacion.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }
    
    public void RemovePago(double key) {

        try {

            Pago yo = manager.find(Pago.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }
    
    public void RemoveTransaccion(double key) {

        try {

            Transaccion yo = manager.find(Transaccion.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }
    
    public void RemoveUsuarioDelGrupo(double key) {

        try {

            Transaccion yo = manager.find(Transaccion.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }

    
}
