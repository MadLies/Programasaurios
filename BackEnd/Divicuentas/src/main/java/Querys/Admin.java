/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Querys;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Amigo;
import modelo.Cuenta;
import modelo.Grupo;
import modelo.IntegranteCuenta;
import modelo.Notificacion;
import modelo.Pago;
import modelo.Transaccion;
import modelo.Usuario;
import modelo.UsuarioDelGrupo;

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

    public Amigo FindAmigo(int key) {

        Amigo yo = manager.find(Amigo.class, key);
        return yo;

    }

    public Cuenta FindcCuenta(int key) {

        Cuenta yo = manager.find(Cuenta.class, key);
        return yo;

    }

    public Grupo FindcGrupo(int key) {

        Grupo yo = manager.find(Grupo.class, key);
        return yo;

    }

    public IntegranteCuenta FindIntegranteCuenta(int key) {

        IntegranteCuenta yo = manager.find(IntegranteCuenta.class, key);
        return yo;

    }

    public Notificacion FindIntegranteNotificacion(int key) {

        Notificacion yo = manager.find(Notificacion.class, key);
        return yo;

    }

    public Pago FindIntegrantePago(int key) {

        Pago yo = manager.find(Pago.class, key);
        return yo;

    }

    public Transaccion FindIntegranteTransaccion(int key) {

        Transaccion yo = manager.find(Transaccion.class, key);
        return yo;

    }

    public UsuarioDelGrupo FindIntegranteUsuarioDelGrupo(int key) {

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

    public void RemoveAmigo(int key) {

        try {

            Amigo yo = manager.find(Amigo.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }

    public void RemoveCuenta(int key) {

        try {

            Cuenta yo = manager.find(Cuenta.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }

    public void RemoveGrupo(int key) {

        try {

            Grupo yo = manager.find(Grupo.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }

    public void RemoveIntegranteCuenta(int key) {

        try {

            IntegranteCuenta yo = manager.find(IntegranteCuenta.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }

    public void RemoveNotificacion(int key) {

        try {

            Notificacion yo = manager.find(Notificacion.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }

    public void RemovePago(int key) {

        try {

            Pago yo = manager.find(Pago.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }

    public void RemoveTransaccion(int key) {

        try {

            Transaccion yo = manager.find(Transaccion.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }

    public void RemoveUsuarioDelGrupo(int key) {

        try {

            Transaccion yo = manager.find(Transaccion.class, key);
            manager.getTransaction().begin();
            manager.remove(yo);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.close();
        }

    }

    public List<Amigo> ObtenerListaAmigos(double key) {

        Usuario user = FindUsuario(key);
        return user.getMisAmigos();

    }

    public boolean VerificarInicioSesion(double key, String password) {

        Usuario user = FindUsuario(key);
        if (user.getContrasena().equals(password)) {
            return true;
        } else {
            return false;
        }

    }

    public List<Transaccion> transaccionsUsuarioToUsuario(double key, double key2, String password) {

        Usuario user = FindUsuario(key);
        List<Transaccion> lista_Transaccion = user.getMisSalidas();
        List<Transaccion> lista_cruzada = new ArrayList<>();

        for (Transaccion trans : lista_Transaccion) {

            if (trans.getUsuarioSalida().getId() == key2 || trans.getUsuarioLlegada().getId() == key2) {
                lista_cruzada.add(trans);
            }

        }

        return lista_cruzada;

    }

    public List<Transaccion> SalidaUsuarioToUsuario(double key, double key2, String password) {

        Usuario user = FindUsuario(key);
        List<Transaccion> lista_Transaccion = user.getMisSalidas();
        List<Transaccion> lista_cruzada = new ArrayList<>();

        for (Transaccion trans : lista_Transaccion) {

            if (trans.getUsuarioSalida().getId() == key2) {
                lista_cruzada.add(trans);
            }

        }

        return lista_cruzada;

    }

    public List<Transaccion> LlegadaUsuarioToUsuario(double key, double key2, String password) {

        Usuario user = FindUsuario(key);
        List<Transaccion> lista_Transaccion = user.getMisSalidas();
        List<Transaccion> lista_cruzada = new ArrayList<>();

        for (Transaccion trans : lista_Transaccion) {

            if (trans.getUsuarioLlegada().getId() == key2) {
                lista_cruzada.add(trans);
            }

        }

        return lista_cruzada;

    }

    public void GenerarUusario(double Id, String name, String nickname, String pais, String divisa, String email, String contrasena) {

        Usuario user = new Usuario(Id, name, nickname, pais, divisa, email, contrasena);
        InsertarObjeto(user);

    }

    public List<IntegranteCuenta> GenerarHistorialDeGatos(double key) {

        Usuario user = FindUsuario(key);
        List<IntegranteCuenta> lista_cuentas = user.getMisCuentas();
        return lista_cuentas;

    }

    public List<Transaccion> GenerarHistorialSalidas(double key) {

        Usuario user = FindUsuario(key);
        List<Transaccion> lista_Salidas = user.getMisSalidas();
        return lista_Salidas;

    }

    public double TotalGastos(double key) {

        double gastos = 0;

        List<Transaccion> lista_salidas = GenerarHistorialSalidas(key);
        List<IntegranteCuenta> lista_cuentas = GenerarHistorialDeGatos(key);

        for (IntegranteCuenta cuenta : lista_cuentas) {

            gastos = gastos + cuenta.getAbonado();

        }

        for (Transaccion trans : lista_salidas) {

            gastos = gastos + trans.getValorTransaccion();

        }

        return gastos;
    }

    public void DividirCuenta(int key) {

        Cuenta cuenta = FindcCuenta(key);
        Grupo grupo = cuenta.getIdGrupo();

        List<UsuarioDelGrupo> usuarios = grupo.getIntegrantes();

        double Total_Pagar = cuenta.getTotalCuenta();
        int cantidad_usuarios = usuarios.size();
        float PagoXusuario = (float) (Total_Pagar / cantidad_usuarios);

        List<IntegranteCuenta> integrantes = cuenta.getMisIntegranteCuentas();

        for (IntegranteCuenta integrante : integrantes) {

            integrante.setValorPagar(PagoXusuario);

        }

    }

}
