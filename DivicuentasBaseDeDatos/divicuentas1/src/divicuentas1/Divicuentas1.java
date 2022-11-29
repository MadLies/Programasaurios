/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divicuentas1;
import Conexion.Conexion;

import controller.AmigoController;
import controller.UsuarioController;
import controller.CuentaController;
import controller.GrupoController;
import controller.IntegranteCuentaController;
import controller.NotificacionController;
import controller.PagoController;

import entities.Usuario;
import entities.Amigo;
import entities.Cuenta;
import entities.Grupo;
import entities.Integrantecuenta;
import entities.Notificacion;
import entities.Pago;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author CrookedSpecs
 */

public class Divicuentas1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //Usuario
        UsuarioController us=new UsuarioController();
        List<Usuario> usuarios=us.todosLosUsuarios();
        //Amigo
        AmigoController am=new AmigoController();
        List<Amigo> Amigos=am.todosLosAmigos();
        //Cuenta
        CuentaController cu=new CuentaController();
        List<Cuenta> Cuentas=cu.todosLosCuentas();
        //Grupo
        GrupoController gr=new GrupoController();
        List<Grupo> Grupos=gr.todosLosGrupos();
        //integranteCuenta
        IntegranteCuentaController ic=new IntegranteCuentaController();
        List<Integrantecuenta> IntegrantesC=ic.todosLosIntCuenta();
        //notificacion
        NotificacionController no=new NotificacionController();
        List<Notificacion> Notificaciones=no.todosLosNotificaciones();
        //pago
        PagoController pa=new PagoController();
        List<Pago> pagos=pa.todosLosPagos();
    }
    
}
