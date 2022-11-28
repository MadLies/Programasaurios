/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divicuentas1;
import Conexion.Conexion;
import controller.UsuarioController;
import entities.Usuario;
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
        UsuarioController us=new UsuarioController();
        List<Usuario> usuarios=us.todosLosUsuarios();
        //Usuario usr=new Usuario(1, "nombre", "nickname", "pais", "divisa", "email", "contraseña");
        //us.crear(usr);
    }
    
}
